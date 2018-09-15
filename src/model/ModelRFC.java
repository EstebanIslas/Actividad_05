package model;

import javax.swing.JOptionPane;

public class ModelRFC {

    private String apellido_paterno;
    private String apellido_materno;
    private String nombre;
    private String mes;
    private String dia;
    private String anio;

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String Nombre() {
        String nombres = "";
        nombres += nombre.charAt(0);
        return nombres;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getAnio() {
        String gur_anio;
        gur_anio= anio.substring(2, 4);
        return gur_anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String Ape_Pat() {
        String apellido = "";
        apellido += apellido_paterno.charAt(0);

        for (int i = 1; i <= apellido_paterno.length() - 1; i++) { //Recorre cada caracter del apellido paterno hasta que el numero de letras del ape termine
            if (esVocal(apellido_paterno.charAt(i))) { //Si el caracter es vocal
                apellido += apellido_paterno.charAt(i); //Concatena el valor al apellido paterno
                break;
            }
        }
        return apellido;
    }

    public static boolean esVocal(char voc) {
        if (voc == 'a' || voc == 'e' || voc == 'i' || voc == 'o' || voc == 'u' || voc == 'A' || voc == 'E' || voc == 'I' || voc == 'O' || voc == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public String Ape_Mat() {
        String apellido = "";
        apellido += apellido_materno.charAt(0);
        return apellido;
    }

}
