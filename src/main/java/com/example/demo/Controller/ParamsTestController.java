package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ParamsTestController {

    @GetMapping("/getCar")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader("Authorization") String authorization,
                                      @RequestHeader Map<String, String> headers,
                                      @RequestParam("name") String paramName,
                                      @RequestParam Map<String, String> params) {

        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("pv", pv);
        map.put("authorization", authorization);
        map.put("headers", headers);
        map.put("paramName", paramName);
        map.put("params", params);
        return map;
    }
}
