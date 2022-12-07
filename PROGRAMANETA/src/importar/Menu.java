package importar;

public class Menu{ //Definimos las variables que usamos en Menu como privadas

    private String alias;
    private String apellido1;
    private String clave;
    private String contraseña;
    private String nombre1;
    private String titular;

    private int cantmes;
    private int dni1;
    private int nume;
    private int opcion;

    private double credito;
    private double efectivo;
    private double debito;
    private double totalmes;
    private double valormes;
    
  public Menu(){

    }
    
    public Menu(String alias, String apellido1, String clave, String contraseña, String nombre1, String titular, int cantmes, int dni1, int nume, int opcion, double credito, double efectivo, double debito, double totalmes, double valormes){

        //String
        this.alias = alias;
        this.apellido1 = apellido1;
        this.clave = clave;
        this.contraseña = contraseña;
        this.nombre1 = nombre1;
        this.titular = titular;

        //int
        this.cantmes = cantmes;
        this.dni1 = dni1;
        this.nume = nume;
        this.opcion = opcion;

        //bouble
        this.credito = credito;
        this.efectivo = efectivo;
        this.debito = debito;
        this.totalmes = totalmes;
        this.valormes = valormes;
    }
    
    //Getter and Setter de las variables de MENU

    //String
    public String getAlias(){
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getApellido1(){
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getClave(){
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getContraseña(){
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getNombre1(){
        return nombre1;
    }
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitula(String titular) {
        this.alias = titular;
    }

    //int
    public int getCantmes(){
        return cantmes;
    }
    public void setCantmes(int cantmes) {
        this.cantmes = cantmes;
    }
    public int getDni1(){
        return dni1;
    }
    public void setDni1(int dni1) {
        this.dni1 = dni1;
    }
     public int getNume(){
        return nume;
    }
    public void setNume(int nume) {
        this.nume = nume;
    }
    public int getOpcion(){
        return opcion;
    }
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    //double
     public double getCredito(){
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }
    public Double getEfectivo(){
        return efectivo;
    }
    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }
    public double getDebito(){
        return debito;
    }
    public void setDebito(double debito) {
        this.debito = debito;
    }
     public double getTotalmes(){
        return totalmes;
    }
    public void setTotalmes(double totalmes) {
        this.totalmes = totalmes;
    }
    public double getValormes(){
        return valormes;
    }
    public void setValormes(double valormes) {
        this.valormes = valormes;
    }

    public void menu() {
    }
    
}