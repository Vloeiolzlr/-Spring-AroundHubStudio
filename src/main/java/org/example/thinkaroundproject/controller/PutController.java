package org.example.thinkaroundproject.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.example.thinkaroundproject.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put.api")
public class PutController {

    @PutMapping("/default")
    public String putMethod() {
        return "Hello World !";
    }

    @PutMapping("/member")
    public String postMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PutMapping("/member1")
    public String postMemberDto1(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

    @PutMapping("/member2")
    public MemberDTO postMemberDto2(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }

    @PutMapping("/member3")
    public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }

}
