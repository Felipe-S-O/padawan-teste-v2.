package com.padwan.test.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
	

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> health() {
    	JSONObject jsons = new JSONObject();
        jsons.put("kenobi", "Hello there!");
        jsons.put("grievous", "general Kenobi!");
        return new ResponseEntity<Object>(jsons.toString(), HttpStatus.OK);
    }

}
