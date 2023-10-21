package com.MarcRG.SoapWebService.endpoint;

import allapis.springbootsoap.com.*;
import com.MarcRG.SoapWebService.model.Plat;
import com.MarcRG.SoapWebService.repository.ClientRepository;
import com.MarcRG.SoapWebService.services.ClientServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ClientEndpoint {
    private static final String NAMESPACE_URI="http://com.springbootsoap.allapis";
    @Autowired
    private ClientServices clientServices;

    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "addClientRequest")
    public AddClientResponse addClient(@RequestPayload AddClientRequest request){
        AddClientResponse response= new AddClientResponse();
        HttpResult httpResult= new HttpResult();
        com.MarcRG.SoapWebService.model.Client client=new com.MarcRG.SoapWebService.model.Client();
        BeanUtils.copyProperties(request.getClient(),client);
        clientServices.addClient(client);
        httpResult.setStatut("SUCCESS");
        httpResult.setMessage("Client added Successfully");
        response.setHttpResult(httpResult);
        return response;
    }
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getClientByIdRequest")
    public GetClientByIdResponse getClientById(@RequestPayload GetClientByIdRequest request){
        GetClientByIdResponse response=new GetClientByIdResponse();
        allapis.springbootsoap.com.Client client=new allapis.springbootsoap.com.Client();
        BeanUtils.copyProperties(clientServices.getClientById(request.getClientId()),client);
        response.setClient(client);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getClientByNomRequest")
    @ResponsePayload
    public GetClientByNomResponse getClientByNom(@RequestPayload GetClientByNomRequest request){
        GetClientByNomResponse response= new GetClientByNomResponse();
        allapis.springbootsoap.com.Client client=new allapis.springbootsoap.com.Client();
        BeanUtils.copyProperties(clientServices.getClientByNom(request.getNomclient()),client);
        response.setClient(client);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "updateClientRequest")
    public UpdateClientResponse updateClient(@RequestPayload UpdateClientRequest request){
        UpdateClientResponse response=new UpdateClientResponse();
        HttpResult httpResult=new HttpResult();
        com.MarcRG.SoapWebService.model.Client client=new com.MarcRG.SoapWebService.model.Client();
        clientServices.updateClient(client);
        BeanUtils.copyProperties(request.getClient(),client);
        httpResult.setStatut("SUCCESS");
        httpResult.setMessage("Client Updated Successfully");
        response.setHttpResult(httpResult);
        return response;
    }
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "deleteClientByIdRequest")
    public DeleteClientByIdResponse deleteClientById(@RequestPayload DeleteClientByIdRequest request){
        DeleteClientByIdResponse response=new DeleteClientByIdResponse();
        HttpResult httpResult=new HttpResult();
        httpResult.setStatut("SUCCESS");
        httpResult.setMessage("Plat Deleted Successfullly");
        response.setHttpResult(httpResult);
        return response;
    }
}
