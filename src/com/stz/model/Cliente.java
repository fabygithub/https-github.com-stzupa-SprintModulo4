package com.stz.model;

/**
 * com.stz.model
 * @version 1.0
 * @author Sergio Teran
 * @author Dami�n Mart�nez
 * @author Fabiola Diaz
 * @author Fabian Cornejo
 * @author German Espinoza  on 05-07-2022
 */
public class Cliente extends Usuario{

    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }

    public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public Cliente(String nombre, String fechaNacimiento, int run, int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaSalud='" + sistemaSalud + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }

    /**
     * Retorna un String con el nombre completo del cliente (nombres + apellidos)
     * @return String
     */
    public String obtenerNombre(){

        return "Nombre completo del Cliente: " + getNombres() + " " + getApellidos();
    }

    /**
     * de acuerdo al valor registrado en el objeto despliega el tipo de sistema de salud
     */
    public void obtenerSistemaSalud(){
        if (sistemaSalud==1) {
            System.out.println("Fonasa");
        } else if (sistemaSalud==2) {
            System.out.println("Isapre");
        }else{
            System.out.println("invalido");
        }
    }

    /**
     * Debe desplegar los datos del m�todo del mismo nombre correspondiente a la clase padre y
     * la direcci�n del cliente junto con la comuna
     */
    @Override
    public int analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Direcci�n: " + getDireccion() + ", Comuna: " + getComuna());
        return getRut();
    }
}
