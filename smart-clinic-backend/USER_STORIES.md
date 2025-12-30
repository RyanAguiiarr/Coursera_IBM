# Histórias de Usuário - Smart Clinic

## 1. Cadastro de Médicos (Admin)

- **História**: Como administrador, quero cadastrar novos médicos com suas especialidades para expandir o corpo clínico.
- **Prioridade**: Alta
- **Estimativa**: 3 Pontos
- **Critérios de Aceite**:
  - O sistema deve solicitar Nome, CRM e Especialidade.
  - O sistema deve validar se o CRM é único.
  - Ao salvar, deve retornar uma mensagem de sucesso.

## 2. Definição de Agenda (Médico)

- **História**: Como médico, quero definir meus horários disponíveis para que o sistema organize minha agenda.
- **Prioridade**: Alta
- **Estimativa**: 5 Pontos
- **Critérios de Aceite**:
  - O médico deve poder selecionar datas futuras.
  - O sistema não deve permitir horários duplicados.

## 3. Agendamento (Paciente)

- **História**: Como paciente, quero buscar médicos e agendar um horário disponível.
- **Prioridade**: Média
- **Estimativa**: 8 Pontos
- **Critérios de Aceite**:
  - O paciente deve visualizar apenas horários livres.
  - O sistema deve enviar uma confirmação após o agendamento.
