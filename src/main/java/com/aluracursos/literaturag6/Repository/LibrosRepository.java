package com.aluracursos.literaturag6.Repository;

import com.aluracursos.literaturag6.Model.Idioma;
import com.aluracursos.literaturag6.Model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LibrosRepository extends JpaRepository<Libros,Long> {
    @Query("SELECT a FROM Libros a WHERE LOWER(a.titulo) LIKE LOWER(concat('%', :nombre, '%'))")
    Optional<Libros> comprobarExistenciaLibro(String nombre);

    @Query("SELECT l FROM Libros l WHERE UPPER(l.idioma) = UPPER(:idioma)")
    List<Libros> mostrarListaPorIdioma(@Param("idioma") String idioma);





}
