package com.aluracursos.literaturag6.Repository;

import com.aluracursos.literaturag6.Model.Autores;
import com.aluracursos.literaturag6.Model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutoresRepository extends JpaRepository<Autores,Long> {
    @Query("SELECT DISTINCT a FROM Autores a WHERE a.nacimiento <= :anio AND (a.muerte IS NULL OR a.muerte >= :anio)")
    List<Autores> buscarAutoresVivosEnAnio(Integer anio);

    @Query("SELECT a FROM Autores a WHERE LOWER(a.nombres) LIKE LOWER(concat('%', :nombre, '%'))")
    Optional<Autores> comprobarExistenciaAutor(String nombre);
}
