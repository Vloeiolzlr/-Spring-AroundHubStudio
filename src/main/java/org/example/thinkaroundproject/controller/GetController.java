package org.example.thinkaroundproject.controller;

import org.example.thinkaroundproject.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GetController {
    @GetMapping("/name")
    public String getName() {
        return "Vloeiolzlr";
    }

    @GetMapping("/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    @GetMapping("/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    @GetMapping("/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    @GetMapping("/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.forEach((key, value) -> sb.append(key + " : " + value + "\n"));
        return sb.toString();
    }

    @GetMapping("/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }
}
