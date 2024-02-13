package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.paciente.DadosCadastroPaciente;
import med.vol.api.paciente.Paciente;
import med.vol.api.paciente.PacienteRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    PacienteRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }
}
