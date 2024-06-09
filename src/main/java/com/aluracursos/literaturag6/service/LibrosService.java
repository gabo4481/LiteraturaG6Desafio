package com.aluracursos.literaturag6.service;

import com.aluracursos.literaturag6.Model.Autores;
import com.aluracursos.literaturag6.Model.Idioma;
import com.aluracursos.literaturag6.Model.Libros;
import com.aluracursos.literaturag6.Repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

@Service
public class LibrosService {

    @Autowired
    private LibrosRepository librosRepository;

    public List<Libros> mostrarTodosLibrosIdioma(String idioma){
        return librosRepository.mostrarListaPorIdioma(idioma);
    }

    public List<Libros> mostrarTodosLibros() {
        return librosRepository.findAll();
    }

    public Optional<Libros> comprobarExistenciaLibro(String nombre){
        return librosRepository.comprobarExistenciaLibro(nombre);
    }

    public void guardarLibro(Libros libro){
        librosRepository.save(libro);
    }


}
