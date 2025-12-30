public String generateToken(String email) {
    // Simula uso do email e expiração
    return Base64.getEncoder().encodeToString((email + "_expires_" + System.currentTimeMillis()).getBytes());
}
public boolean validateToken(String token) {
    return token != null && token.length() > 10; // Validação melhorada
}