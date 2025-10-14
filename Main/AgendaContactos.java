package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AgendaContactos {

    public static void main(String[] args) {

        List<Contacto> contactos = new ArrayList<>(Arrays.asList(

                 new Contacto("Alvaro","amarlo8@hotmail.com", 50995181),
                 new Contacto("Guadalupe","guada-lupita@hotmail.com", 76252974),
                 new Contacto("Gonzalo","gonzalomartinez@hotmail.com",6534298)

        ));
        Agenda agenda = new Agenda(contactos);
        agenda.agregarContacto(new Contacto("Pedro","esePedro@hotmail.com", 5643267));

        Scanner sc = new Scanner(System.in);
        System.out.println("Que contacto desea buscar");
        String nombreBuscado= sc.nextLine();

        Contacto encontrado = agenda.buscarContacto(nombreBuscado);
        encontrado.mostrarInfo();

        System.out.println("Que contacto desea eliminar");
        String nombreEliminado = sc.nextLine();


        agenda.eliminarContacto(nombreEliminado);

        System.out.println("Esta es la lista actualizada");
       agenda.mostrarInfo();

    }
}
