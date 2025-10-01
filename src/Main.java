import java.util.ArrayList;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro(
                "Papelucho",
                "Marcela Paz",
                "978-956-349-568-3",
                1990,
                5 );
        Libro libro2 =  new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                "9780307474728",
                1967,
                10);


        System.out.println(libro1);
        System.out.println(libro2);


        Usuario usuario1 = new Usuario(
                "12.3456.678-9",
                "Sofía",
                "Rojas",
                "sofia@correogmai.com");

        Date fechaPrestamo = new Date(2025,10,01);
        Prestamo prestamo1 = new Prestamo(
                fechaPrestamo,
                Estado.ACTIVO,
                usuario1,
                libro1);


        ArrayList<Libro>listaLibros=new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);
    }
}