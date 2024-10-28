package com.secure.oauth2.controller;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthorizationCodeAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecureController {

    @GetMapping("/secure")
    public String securePage(Authentication authentication) {
        if(authentication instanceof UsernamePasswordAuthenticationToken) {
            System.out.println("username password");
        } else if (authentication instanceof OAuth2AuthorizationCodeAuthenticationToken) {
            System.out.println("authentication login");
        }
        return "secure.html";
    }
}
