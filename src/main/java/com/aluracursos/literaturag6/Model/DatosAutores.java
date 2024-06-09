package com.aluracursos.literaturag6.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutores(
        @JsonAlias("name") String nombres,
        @JsonAlias("birth_year") Integer nacimiento,
        @JsonAlias("death_year") Integer muerte
) {
}
