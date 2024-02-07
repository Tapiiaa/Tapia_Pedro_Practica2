import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SistemaRecomendación {

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
