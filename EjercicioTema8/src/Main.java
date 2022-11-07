public class Main {
    public static void main(String[] args) {

        Persona persona= new Persona();
        persona.setEdad(22);
        persona.setNombre("Edison");
        persona.setTelefono("+593 123456");
        System.out.println("EL nombre de la persona es: "+persona.getNombre()+"\n"+
                "La edad que tiene es de: " + persona.getEdad()+"\n"+
                "Su telefono es: "+ persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}