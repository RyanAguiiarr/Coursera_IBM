package com.smartclinic.controller;
// ... imports ...
import java.util.Map;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    // ... autowired ...

    @GetMapping("/availability/{doctorId}")
    public ResponseEntity<?> getAvailability(
            @PathVariable Long doctorId,
            @RequestParam(required = false) String user, // Adicionado conforme feedback
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestHeader("Authorization") String token) {
        
        if (!tokenService.validateToken(token)) {
            return ResponseEntity.status(401).body(Map.of("error", "Unauthorized"));
        }
        return ResponseEntity.ok(Map.of(
            "doctorId", doctorId,
            "availableTimes", doctorService.getAvailableTimes(doctorId, date)
        ));
    }
}