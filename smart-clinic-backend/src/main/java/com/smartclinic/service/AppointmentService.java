// Adicionar este método dentro da classe AppointmentService
public List<Appointment> getAppointmentsForDoctor(Long doctorId, LocalDate date) {
    // Lógica simulada para atender ao requisito
    return appointmentRepository.findAll().stream()
        .filter(a -> a.getDoctor().getId().equals(doctorId))
        .filter(a -> a.getAppointmentTime().toLocalDate().equals(date))
        .collect(Collectors.toList());
}