package Main;

public class Contacto{

    private String name;
    private String email;
    private int id;

    public Contacto(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }
    public String getName() {return name;}
    public int getId() {return id;}
    public String getEmail() {return email;}


    public void mostrarInfo() {
        System.out.println( "Nombre: "+name+
                " Email: "+ email+
                " DNI: "+ id);


    }
}





