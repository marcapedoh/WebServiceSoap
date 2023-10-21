package com.MarcRG.SoapWebService.endpoint;

import allapis.springbootsoap.com.*;
import com.MarcRG.SoapWebService.model.Plat;
import com.MarcRG.SoapWebService.services.PlatServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PlatEndpoint {
    private static final String NAMESPACE_URI="http://com.springbootsoap.allapis";
    @Autowired
    private PlatServices platServices;
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "addPlatRequest")
    public AddPlatResponse addCondiment(@RequestPayload AddPlatRequest request){
        AddPlatResponse response= new AddPlatResponse();
        HttpResult httpResult= new HttpResult();
        com.MarcRG.SoapWebService.model.Plat plat=new Plat();
        BeanUtils.copyProperties(request.getPlat(),plat);
        platServices.addPlat(plat);
        httpResult.setStatut("SUCCESS");
        httpResult.setMessage("Plat added Successfully");
        response.setHttpResult(httpResult);
        return response;
    }
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getPlatByIdRequest")
    public GetPlatByIdResponse getPlatById(@RequestPayload GetPlatByIdRequest request){
        GetPlatByIdResponse response=new GetPlatByIdResponse();
        allapis.springbootsoap.com.Plat plat=new allapis.springbootsoap.com.Plat();
        BeanUtils.copyProperties(platServices.getPlatById(request.getPlatId()),plat);
        response.setPlat(plat);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getPlatByNomRequest")
    @ResponsePayload
    public GetPlatByNomResponse getPlatByNom(@RequestPayload GetPlatByNomRequest request){
        GetPlatByNomResponse response= new GetPlatByNomResponse();
        allapis.springbootsoap.com.Plat plat=new allapis.springbootsoap.com.Plat();
        BeanUtils.copyProperties(platServices.getPlatByNom(request.getPlatNom()),plat);
        response.setPlat(plat);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "updatePlatRequest")
    public UpdatePlatResponse updatePlat(@RequestPayload UpdatePlatRequest request){
        UpdatePlatResponse response=new UpdatePlatResponse();
        HttpResult httpResult=new HttpResult();
        Plat plat=new Plat();
        platServices.updatePlat(plat);
        BeanUtils.copyProperties(request.getPlat(),plat);
        httpResult.setStatut("SUCCESS");
        httpResult.setMessage("Plat Updated Successfully");
        response.setHttpResult(httpResult);
        return response;
    }
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "deletePlatRequest")
    public DeletePlatByIdResponse deletePlatById(@RequestPayload DeletePlatByIdRequest request){
        DeletePlatByIdResponse response=new DeletePlatByIdResponse();
        HttpResult httpResult=new HttpResult();
        httpResult.setStatut("SUCCESS");
        httpResult.setMessage("Plat Deleted Successfullly");
        response.setHttpResult(httpResult);
        return response;
    }
}
