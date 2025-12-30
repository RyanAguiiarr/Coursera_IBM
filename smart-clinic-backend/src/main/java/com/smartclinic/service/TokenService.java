package com.smartclinic.service;
import org.springframework.stereotype.Service;
import java.util.Base64;
@Service
public class TokenService {
    public String generateToken(String email) { return "dummy-token"; }
    public boolean validateToken(String token) { return token != null; }
}