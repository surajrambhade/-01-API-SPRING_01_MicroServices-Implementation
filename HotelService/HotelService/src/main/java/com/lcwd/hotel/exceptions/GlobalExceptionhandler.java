package com.lcwd.hotel.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionhandler {


    @ExceptionHandler(ResourceNotFoundExcepaction.class)
    public ResponseEntity<Map<String , Object>>  notFoundHandler(ResourceNotFoundExcepaction excepaction){
        Map map= new HashMap();
        map.put("message", excepaction.getMessage());
        map.put("success", false);
        map.put("status", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);

    }
}
