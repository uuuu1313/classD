package org.koreait.restcontrollers;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class JSONResult<T> {

    private boolean success;
    private String message;
    private T data;

}
