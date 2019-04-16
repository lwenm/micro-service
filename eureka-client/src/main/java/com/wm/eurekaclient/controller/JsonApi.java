package com.wm.eurekaclient.controller;


import com.wm.eurekaclient.service.GetJsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonApi {


 @Autowired

 GetJsonData getJsonData;

@GetMapping("/getdevices")
    public  String  getDevicesList(){

    return getJsonData.createJSONObject().toString();

}

}
