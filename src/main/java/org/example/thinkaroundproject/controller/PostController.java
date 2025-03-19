package org.example.thinkaroundproject.controller;

import org.example.thinkaroundproject.dto.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PostController {

    @PostMapping("/default")
    public String postMethod() {
        return "Hello World";
    }
    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.forEach((key, value) -> sb.append(key + " : " + value + "\n"));
        return sb.toString();
    }

    @PostMapping("/member2")
    public String postMemberDto(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }


}

