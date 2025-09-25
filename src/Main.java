//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Libro libro1=new Libro(1L,"Papelucho", "Marcela Paz", "243-234-876-654-3","2008-05-12",5);
    Libro libro2=new Libro(2L,"como awa para chocolate", "Mariela Mistral", "653-974-876-654-9","1983-10-24",9);
    Libro libro3=new Libro();

    libro1.aumentarStock();
    libro1.mostrarInformacion();
    libro1.disminuirStock();
    libro1.mostrarInformacion();

    libro2.aumentarStock();
    libro2.mostrarInformacion();
    libro2.disminuirStock();
    libro2.mostrarInformacion();
    }
}