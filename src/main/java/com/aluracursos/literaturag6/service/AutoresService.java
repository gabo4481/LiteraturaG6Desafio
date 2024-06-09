package com.aluracursos.literaturag6.service;

import com.aluracursos.literaturag6.Model.Autores;
import com.aluracursos.literaturag6.Model.Libros;
import com.aluracursos.literaturag6.Repository.AutoresRepository;
import com.aluracursos.literaturag6.Repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoresService {
    @Autowired
    private AutoresRepository autoresRepository;

    public void guardarAutores(Autores autores){
        autoresRepository.save(autores);
    }

    public List<Autores> mostrarAutores() {
        return autoresRepository.findAll();
    }

    public List<Autores> buscarAutoresPorAnio(Integer anio) {
        return autoresRepository.buscarAutoresVivosEnAnio(anio);
    }

    public Optional<Autores> comprobarExistenciaDeAutor(String nombre){
        return autoresRepository.comprobarExistenciaAutor(nombre);
    }
}
