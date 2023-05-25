package com.example.demo.resp;

import lombok.Data;

@Data
public class CommonResp<T> {
    private Boolean success = true;
    private String message;
    private T content;
}
