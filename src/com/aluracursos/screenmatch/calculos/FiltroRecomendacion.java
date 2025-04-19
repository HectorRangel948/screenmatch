package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion()>=4){
            System.out.println("Bien evaluado");
        }else if(clasificacion.getClasificacion()>=2){
            System.out.println("popular");
        }else{
            System.out.println("Recomendado");
        }
    }
}
