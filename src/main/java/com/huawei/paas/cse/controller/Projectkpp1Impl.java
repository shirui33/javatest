package com.huawei.paas.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2021-01-14T14:05:08.610Z")

@RestSchema(schemaId = "projectkpp1")
@RequestMapping(path = "/controller", produces = MediaType.APPLICATION_JSON)
public class Projectkpp1Impl {

    @Autowired
    private Projectkpp1Delegate userProjectkpp1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectkpp1Delegate.helloworld(name);
    }

}
