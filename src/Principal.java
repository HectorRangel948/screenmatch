import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.5);
        miPelicula.evalua(7.8);
        miPelicula.evalua(9.2);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.setDirector("Hermanos wachowski");
        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(9.5);
        otraPelicula.evalua(8.8);
        otraPelicula.evalua(9.7);

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        System.out.println("Encanto media: "+miPelicula.calculaMedia());
        filtroRecomendacion.filtra(miPelicula);
        filtroRecomendacion.filtra(otraPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Trailer");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(100);
        filtroRecomendacion.filtra(episodio);

    }
}
