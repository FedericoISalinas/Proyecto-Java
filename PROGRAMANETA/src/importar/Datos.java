package importar;

import java.util.Scanner;

public class Datos { //Definimos las variables que usamos en el inicio del programa como privados
       
    private String nombre;
    private String apellido;
    private String domicilio;
    private int dni;
    private int telefono;

    public Datos(){

    }
    
    public Datos(String nombre, String apellido, String domicilio, int dni, int telefono){ //Definimos las variables que usamos en el inicio del programa
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
    }

    //Getter and Setter de las variables de Datos
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
  
    public void Menu(){
        
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDomicilio(domicilio);
        this.setDni(dni);
        this.setTelefono(telefono);
    
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println(""); // no hay forma directa de borrar la consola en Java
            System.out.println("Ya estas por ser parte del club");
            System.out.println("=============================================");
            System.out.println("");
            System.out.println("Presione Enter para continuar");

            System.out.println(""); // no hay forma directa de borrar la consola en Java
            System.out.println("Digite su nombre");
            nombre = entrada.nextLine();
            System.out.println("Digite su apellido");
            apellido = entrada.nextLine();
            System.out.println("Digite su domicilio");
            domicilio = entrada.nextLine();
            System.out.println("Digite su DNI");
            dni = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite su numero de teléfono");
            telefono = Integer.parseInt(entrada.nextLine());
            System.out.println(""); // no hay forma directa de borrar la consola en Java
            System.out.println("Enter para continuar");
            entrada.nextLine(); // a diferencia del pseudocodigo, espera un Enter, no cualquier tecla
        } 
    

        System.out.println("Cargando");
        System.out.println(""); // no hay forma directa de borrar la consola en Java
        System.out.println("GRACIAS POR UNIRTE A LA PROGRAMANETA");
        System.out.println("===========================================");
    }

    public void datos() {
    }
}


