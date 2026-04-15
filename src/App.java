
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidadEstudiante = 30_000_000;
        int cantidad = 1_000_000;

        List<Estudiante> estudiantes = Generador.generarListado(cantidadEstudiante);        
        //for(Estudiante est : estudiantes) {
          //  System.out.println(est.nombre);
        //}
        String nombreBuscar = "Estudiante_29000111";

        int intentos = 0;

        for(Estudiante est : estudiantes) 
            
            // equals para buscar textos
            {
            if(est.nombre.equals(nombreBuscar)) {
                System.out.println("Existe");
                break;
            
            }  
            else {
                intentos++;
            }
        }
        System.out.println(intentos);
        System.out.println("FIN");
    }

}
