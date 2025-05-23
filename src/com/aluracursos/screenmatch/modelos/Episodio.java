package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    private Serie serie;

    private int totalVisualizaciones;

    public int getTotalVisualizaciones(){
        return this.totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones){
        this.totalVisualizaciones=totalVisualizaciones;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setSerie(Serie serie){
        this.serie=serie;
    }

    public Serie getSerie(){
        return this.serie;
    }

    @Override
    public int getClasificacion() {
        if(totalVisualizaciones>100){
            return 4;
        }else{
            return 2;
        }
    }
}
