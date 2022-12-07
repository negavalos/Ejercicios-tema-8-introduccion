public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(23);
        persona.setNombre("Nelson");
        persona.setTelefono(345678975);

        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
        System.out.print(persona.getNombre());


    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}
