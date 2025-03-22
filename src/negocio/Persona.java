package negocio;

//SUPER CLASE PARA APLICAR HERENCIA
public class Persona {

    private String rut;

    public Persona(String rut) {
        this.rut = rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRut() {
        return rut;
    }
    

    public boolean verificarRut(String rut) {
        return this.rut.equals(rut);
    }
}
