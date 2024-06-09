package com.aluracursos.literaturag6.Configuracion;

import com.aluracursos.literaturag6.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private final Principal principal;

    public AppRunner(Principal principal) {
        this.principal = principal;
    }

    @Override
    public void run(String... args) throws Exception {
        principal.mostrarMenu();
    }
}

