package com.example.amasapp;

public class recetas {

    private String nombre;
    private String receta;
    private String ingredientes;
    private int imagen;

    public recetas(String Nombre, String Receta, String Ingredientes, int Imagen){
        nombre = Nombre;
        receta = Receta;
        ingredientes = Ingredientes;
        imagen = Imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReceta() {
        return receta;
    }


    public String getIngredientes() {
        return ingredientes;
    }

    public int getImagen() {
        return imagen;
    }

}
