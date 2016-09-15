package com.sapient.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rarcot on 8/11/2016.
 */
@Controller
public class AppMonitorController {

    @RequestMapping(value = "/healthcheck",method = RequestMethod.GET)
    public HttpEntity<? extends Object> health(){
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
