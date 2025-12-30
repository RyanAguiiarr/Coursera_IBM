package com.smartclinic.controller;
import com.smartclinic.service.DoctorService;
import com.smartclinic.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @Autowired private DoctorService doctorService;
    @Autowired private TokenService tokenService;

    @GetMapping("/availability/{id}")
    public ResponseEntity<?> getAvailability(@PathVariable Long id, @RequestHeader("Authorization") String token) {
        if (!tokenService.validateToken(token)) return ResponseEntity.status(401).build();
        return ResponseEntity.ok(doctorService.getAvailableTimes(id));
    }
}