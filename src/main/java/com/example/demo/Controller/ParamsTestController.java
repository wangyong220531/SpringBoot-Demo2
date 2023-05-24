package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ParamsTestController {

    @GetMapping("/getVariable")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String, String> pv) {

        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("pv", pv);
        return map;
    }

    @GetMapping("/getHeader")
    public Map<String, Object> getHeader(
            @RequestHeader("Authorization") String authorization,
            @RequestHeader Map<String, String> headers) {
        Map<String, Object> map = new HashMap<>();
        map.put("authorization", authorization);
        map.put("headers", headers);
        return map;
    }

    @GetMapping("/getVariable")
    public Map<String, Object> getVariable(
            @RequestParam("name") String paramName,
            @RequestParam Map<String, String> params
    ) {
        Map<String, Object> map = new HashMap<>();
        map.put("paramName", paramName);
        map.put("params", params);
        return map;
    }
}
