package it.nextdevs.EsercizioS3G2.DTO;

import it.nextdevs.EsercizioS3G2.enums.StatoDispositivo;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DispositivoDTO {
    @Size(max =50)
    @NotNull
    private String model;
    @Size(max =30)
    @NotNull
    private String tipoDispositivo;
    @NotNull
    private StatoDispositivo statoDispositivo;

    private Integer dipendenteId;
}
