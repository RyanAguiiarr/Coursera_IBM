# Design do Esquema de Banco de Dados

### Tabela: Doctor

| Campo                | Tipo         | Descrição                                                          |
| -------------------- | ------------ | ------------------------------------------------------------------ |
| id                   | BIGINT (PK)  | Chave Primária Auto-incremento                                     |
| name                 | VARCHAR(100) | Nome completo do médico                                            |
| specialization       | VARCHAR(50)  | Especialidade médica                                               |
| **Relacionamentos**: |              | Um médico pode ter várias consultas (One-to-Many com Appointment). |

### Tabela: Patient

| Campo                | Tipo         | Descrição                                                            |
| -------------------- | ------------ | -------------------------------------------------------------------- |
| id                   | BIGINT (PK)  | Chave Primária Auto-incremento                                       |
| name                 | VARCHAR(100) | Nome completo do paciente                                            |
| email                | VARCHAR(100) | Email único do paciente                                              |
| phone                | VARCHAR(20)  | Telefone de contato                                                  |
| **Relacionamentos**: |              | Um paciente pode ter várias consultas (One-to-Many com Appointment). |

### Tabela: Appointment

| Campo                | Tipo        | Descrição                                   |
| -------------------- | ----------- | ------------------------------------------- |
| id                   | BIGINT (PK) | Chave Primária                              |
| doctor_id            | BIGINT (FK) | Chave Estrangeira referenciando Doctor(id)  |
| patient_id           | BIGINT (FK) | Chave Estrangeira referenciando Patient(id) |
| appointment_time     | TIMESTAMP   | Data e hora da consulta                     |
| **Relacionamentos**: |             | Pertence a um Médico e a um Paciente.       |
