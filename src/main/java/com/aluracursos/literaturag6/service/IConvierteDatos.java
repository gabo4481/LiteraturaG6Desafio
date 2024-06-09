package com.aluracursos.literaturag6.service;

public interface IConvierteDatos {
    <T> T convertirDatos(String json, Class<T> clase);
}
