import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sentimiento {


    // Sentimientos:
    //Alegria (1)
    //Tristeza(2)

    //Umbrales
    //Positivo: >0.3
    //Negativo : <
    //Neutral : =5;
    public String analizarSentimiento(String texto){
        double sentimiento =0.0;
        if(texto.contains("Feliz")){
            sentimiento=0.8;
        }
        else if(texto.contains("Triste")){
            sentimiento=0.2;
        }
        else{
            sentimiento=0.5;
        }
        double umbralPositivo =0.6;
        double umbralNegativo =0.4;
        if (sentimiento > umbralPositivo) {
            return "positivo";
        }
        else if(sentimiento < umbralNegativo){
            return "negativo";
        }
        else{
            return "neutral";
        }

    }

    public class SistemaRecomendacion {

        public static void main(String[] args) {
            // Datos de ejemplo: libros interesantes y calificaciones por usuario
            HashMap<String, ArrayList<String>> librosInteresantesPorUsuario = new HashMap<>();
            librosInteresantesPorUsuario.put("usuario1", new ArrayList<>(List.of("Libro1", "Libro2", "Libro3")));
            librosInteresantesPorUsuario.put("usuario2", new ArrayList<>(List.of("Libro2", "Libro4")));
            librosInteresantesPorUsuario.put("usuario3", new ArrayList<>(List.of("Libro1", "Libro3", "Libro5")));

            HashMap<String, ArrayList<String>> calificacionesPorUsuario = new HashMap<>();
            calificacionesPorUsuario.put("usuario1", new ArrayList<>(List.of("Libro1", "Libro3")));
            calificacionesPorUsuario.put("usuario2", new ArrayList<>(List.of("Libro2")));
            calificacionesPorUsuario.put("usuario3", new ArrayList<>(List.of("Libro5")));

            // Usuario actual
            String usuarioActual = "usuario1";

            // Recomendar libros para el usuario actual
            ArrayList<String> recomendaciones = recomendarLibros(librosInteresantesPorUsuario.get(usuarioActual), calificacionesPorUsuario.get(usuarioActual));

            // Imprimir recomendaciones
            System.out.println("Recomendaciones para " + usuarioActual + ": " + recomendaciones);
        }

        // Función para recomendar libros basados en los intereses previos del usuario
        public static ArrayList<String> recomendarLibros(ArrayList<String> librosInteresantes, ArrayList<String> calificaciones) {
            ArrayList<String> recomendaciones = new ArrayList<>();

            for (String libro : librosInteresantes) {
                if (!calificaciones.contains(libro)) {
                    recomendaciones.add(libro);
                }
            }

            return recomendaciones;
        }
    }


}
