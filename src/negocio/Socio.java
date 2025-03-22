package negocio;

import negocio.Persona;
import negocio.NumeroSocio;
import java.sql.ResultSet;
import accesodatos.SocioDA;

public class Socio extends Persona {

    private NumeroSocio numSocio;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private String correo;
    private String domicilio;
    private String region;
    private String ciudad;
    private String comuna;
    private String telefono;

    public Socio(String rut, NumeroSocio numSocio, String nombre, String appaterno, String apmaterno, String correo, String domicilio, String region, String ciudad, String comuna, String telefono) {
        super(rut);
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.correo = correo;
        this.domicilio = domicilio;
        this.region = region;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.telefono = telefono;
    }

    public Socio(String rut) {
        super(rut);
    }

    ;

    // Getters y Setters
    public NumeroSocio getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(NumeroSocio numSocio) {
        this.numSocio = numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para mostrar los datos del socio
    public void verDatosSocio() {
        System.out.println("Número de Socio: " + numSocio);
        System.out.println("RUT: " + getRut()); // Método heredado de Persona
        System.out.println("Nombre Completo: " + nombre + " " + appaterno + " " + apmaterno);
        System.out.println("Correo: " + correo);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Región: " + region);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Comuna: " + comuna);
        System.out.println("Teléfono: " + telefono);
    }

    public Socio obtener(String rut) {
        ResultSet rs = new SocioDA().get(rut);
        if (rs != null) {
            try {
                if (rs.next()) {
                    this.numSocio = new NumeroSocio(rs.getInt("numero_socio")); // Crear una instancia de NumeroSocio
                    this.nombre = rs.getString("nombre");
                    this.appaterno = rs.getString("appaterno");
                    this.apmaterno = rs.getString("apmaterno");
                    this.correo = rs.getString("correo");
                    this.domicilio = rs.getString("domicilio");
                    this.region = rs.getString("region");
                    this.ciudad = rs.getString("ciudad");
                    this.comuna = rs.getString("comuna");
                    this.telefono = rs.getString("telefono");
                    return this;
                } else {
                    return null;
                }
            } catch (Exception ex) {
                System.out.println("Error al recuperar el producto: " + ex.getMessage());
                return null;
            }
        } else {
            return null;
        }
    }

    public boolean añadir(Socio socio) {
        
        this.setRut(socio.getRut());
        this.setNumSocio(socio.getNumSocio());
        this.setNombre(nombre);
        this.setAppaterno(appaterno);
        this.setApmaterno(apmaterno);
        this.setCorreo(correo);
        this.setDomicilio(domicilio);
        this.setRegion(region);
        this.setCiudad(ciudad);
        this.setComuna(comuna);
        this.setTelefono(telefono);
        
        String rut = socio.getRut();
        int numSocio = socio.getNumSocio().getNumero();
        String nombre = socio.getNombre();
        String apmaterno = socio.getApmaterno();
        String appaterno = socio.getAppaterno();
        String correo = socio.getCorreo();
        String domicilio = socio.getDomicilio();
        String region = socio.getRegion();
        String ciudad = socio.getCiudad();
        String comuna = socio.getComuna();
        String telefono = socio.getTelefono();

        int reg = new SocioDA().add(rut, numSocio , nombre, appaterno, apmaterno, correo, domicilio, region, ciudad, comuna, telefono);

        if (reg == 1) {
            return true;
        } else {
            return false;
        }
    }
}
