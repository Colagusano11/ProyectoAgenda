package Main;

import java.util.List;

public class Agenda{

    private List<Contacto> contactos;

    public Agenda(List<Contacto>contactos){
        this.contactos=contactos;
    }

    //Metodo busqueda
    public Contacto buscarContacto(String nombreBuscado){
        for(Contacto c: contactos){
            if(c.getName().equalsIgnoreCase(nombreBuscado)){
                return c;
            }
        }
        return null;
    }

    //Metodo de agregar contacto
    public void agregarContacto(Contacto c){
        contactos.add(c);
        System.out.println("Main.Contacto añadido " + c.getName());
    }

    //Metodo eliminar contacto

    public void eliminarContacto(String name){
        Contacto encontrado = buscarContacto(name);
        if(encontrado != null){
            contactos.remove(encontrado);
            System.out.println("Main.Contacto eliminado: "+name);
        }else{
            System.out.println("Main.Contacto no encontrado: "+ name);
        }

            }


    public void mostrarInfo(){
        for(Contacto c :contactos){
            c.mostrarInfo();
        }

    }



}
