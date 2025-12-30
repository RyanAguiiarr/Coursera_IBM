@PostMapping
public ResponseEntity<?> savePrescription(
        @RequestBody Map<String, Object> prescriptionData, // Aceita JSON agora
        @RequestHeader("Authorization") String token) {
    
    if (!tokenService.validateToken(token)) {
        return ResponseEntity.status(401).body(Map.of("status", "error", "message", "Invalid Token"));
    }
    return ResponseEntity.ok(Map.of("status", "success", "message", "Prescription saved"));
}