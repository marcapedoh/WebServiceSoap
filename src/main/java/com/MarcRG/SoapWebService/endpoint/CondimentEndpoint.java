package com.MarcRG.SoapWebService.endpoint;

import allapis.springbootsoap.com.*;
import com.MarcRG.SoapWebService.services.CondimentServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;

@Endpoint
public class CondimentEndpoint {
    private static final String NAMESPACE_URI="http://com.springbootsoap.allapis";
    @Autowired
    private CondimentServices condimentServices;

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "addCondimentRequest")
    @ResponsePayload
    public AddCondimentResponse addCondiment(@RequestPayload AddCondimentRequest request){
        AddCondimentResponse Response= new AddCondimentResponse();
        HttpResult httpResult=new HttpResult();
        com.MarcRG.SoapWebService.model.Condiment condiment=new com.MarcRG.SoapWebService.model.Condiment();
        BeanUtils.copyProperties(request.getCondiment(),condiment);
        condimentServices.addCondiment(condiment);
        httpResult.setStatut("SUCCESS");
        httpResult.setMessage("Condiment Added successfully");
        Response.setHttpResult(httpResult);
        return Response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getCondimentByIdRequest")
    @ResponsePayload
    public GetCondimentByIdResponse getCondimentById(@RequestPayload GetCondimentByIdRequest request){
        GetCondimentByIdResponse response=new GetCondimentByIdResponse();
        allapis.springbootsoap.com.Condiment condiment= new allapis.springbootsoap.com.Condiment();
        BeanUtils.copyProperties(condimentServices.getCondimentById( request.getCondimentId()),condiment);
        response.setCondiment(condiment);
        return  response;
    }

    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getCondimentByNomRequest")
    public GetCondimentByNomResponse getCondimentByNom(@RequestPayload GetCondimentByNomRequest request){
        GetCondimentByNomResponse response= new GetCondimentByNomResponse();
        Condiment condiment=new Condiment();
        BeanUtils.copyProperties(condimentServices.getCondimentByNom(request.getCondimentNom()),condiment);
        response.setCondiment(condiment);
        return response;
    }

    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "updateCondimentRequest")
    public UpdateCondimentResponse updateCondiment(@RequestPayload UpdateCondimentRequest request){
        com.MarcRG.SoapWebService.model.Condiment condiment= new com.MarcRG.SoapWebService.model.Condiment();
        BeanUtils.copyProperties(request.getCondiment(),condiment);
        condimentServices.updateCondiment(condiment);
        HttpResult httpResult=new HttpResult();
        httpResult.setStatut("SUCCESS");
        httpResult.setMessage("Condinment Updated Successfully");
        UpdateCondimentResponse response= new UpdateCondimentResponse();
        response.setHttpResult(httpResult);
        return response;
    }
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "deleteCondimentRequest")
    public DeleteCondimentByIdResponse deleteCondimentById(@RequestPayload DeleteCondimentByIdRequest request){
        DeleteCondimentByIdResponse response=new DeleteCondimentByIdResponse();
        HttpResult httpResult=new HttpResult();
        httpResult.setStatut("SUCCESS");
        httpResult.setMessage("Condiment Deleted Successfullly");
        response.setHttpResult(httpResult);
        return response;
    }

}
