package org.koreait.restcontrollers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestCommonController {

    public ResponseEntity<JSONResult<Object>> errorHandler(Exception e){
        JSONResult<Object> jsonResult = new JSONResult<>();
        jsonResult.setSuccess(false);
        jsonResult.setMessage(e.getMessage());

        return ResponseEntity
                .internalServerError()
                .body(jsonResult);
    }

}
