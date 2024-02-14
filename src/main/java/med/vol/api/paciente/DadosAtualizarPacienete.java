package med.vol.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.vol.api.endereco.DadosEndereco;

public record DadosAtualizarPacienete(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
