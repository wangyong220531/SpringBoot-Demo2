package com.example.demo.req.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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
    public Map<String, Object> getHeader(@RequestHeader("Authorization") String authorization,
                                         @RequestHeader Map<String, String> headers) {
        Map<String, Object> map = new HashMap<>();
        map.put("authorization", authorization);
        map.put("headers", headers);
        return map;
    }

    @GetMapping("/getParams")
    public Map<String, Object> getParams(@RequestParam("name") String paramName,
                                         @RequestParam Map<String, String> params) {
        Map<String, Object> map = new HashMap<>();
        map.put("paramName", paramName);
        map.put("params", params);
        return map;
    }

    @GetMapping("/getCookie")
    public Map<String, Object> getCookie(@CookieValue("_ga") String _ga) {
        Map<String, Object> map = new HashMap<>();
        map.put("_ga", _ga);
        return map;
    }

    @PostMapping("/getBody")
    public Map getBody(@RequestBody String content) {
        Map<String, Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }

    @GetMapping("/cars/{path}")
    public Map carsCell(@MatrixVariable("low") Integer low, @MatrixVariable("brand") List<String> brand, @PathVariable("path") String path) {
        Map<String, Object> map = new HashMap<>();

        map.put("low", low);
        map.put("brand", brand);
        map.put("path", path);
        return map;
    }

    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age", pathVar = "bossId") Integer bossAge, @MatrixVariable("age") Integer empAge) {
        Map<String, Object> map = new HashMap<>();

        map.put("bossAge", bossAge);
        map.put("empAge", empAge);
        return map;
    }
}
