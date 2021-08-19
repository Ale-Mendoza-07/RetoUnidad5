package Modelo;

public class Requerimiento_1 {
    private String fecha;
    private String constructora;
    private String ciudad;
    private String banco;
    private String acabados;  
    private String serial;

    public Requerimiento_1() {

    }

    public Requerimiento_1(String fecha, String constructora, String ciudad, String banco, String acabados, String serial) {
        this.fecha = fecha;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.banco = banco;
        this.acabados = acabados;
        this.serial = serial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }

    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }  
    
}
