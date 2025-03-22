package negocio;

import accesodatos.CuentaDA;
import java.sql.ResultSet;

public class Cuenta extends Persona {

    private NumeroSocio numeroSocio;
    private int valorCuota;
    private int cantidadAportada;

    public Cuenta(String rut, NumeroSocio numeroSocio, int valorCuota, int cantidadAportada) {
        super(rut);
        this.numeroSocio = numeroSocio;
        this.valorCuota = valorCuota;
        this.cantidadAportada = cantidadAportada;
    }

    public Cuenta(String rut) {
        super(rut);
    }

    public NumeroSocio getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(NumeroSocio numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public int getCantidadAportada() {
        return cantidadAportada;
    }

    public void setCantidadAportada(int cantidadAportada) {
        this.cantidadAportada = cantidadAportada;
    }

    public boolean verificarRut(String rut) {
        return this.getRut().equals(rut);
    }

    public boolean pagoCuota(int monto) {
        if (monto > 0) {
            this.valorCuota = monto;
            this.cantidadAportada += monto;
            return true;
        }
        return false;
    }

    public Cuenta obtener(String rut) {
        ResultSet rs = new CuentaDA().get(rut);
        if (rs != null) {
            try {
                if (rs.next()) {
                    this.cantidadAportada = rs.getInt("total_aportado");
                    return this;
                } else {
                    return null;
                }
            } catch (Exception ex) {
                System.out.println("Error al recuperar cuenta " + ex.getMessage());
                return null;
            }
        } else {
            return null;
        }
    }

    public boolean añadir(Cuenta cuenta) {

        String rut = cuenta.getRut();
        int numeroSocio = cuenta.getNumeroSocio().getNumero();
        int valorCuota = cuenta.getValorCuota();
        int cantidadAportada = cuenta.getCantidadAportada();

        int reg = new CuentaDA().add(rut, numeroSocio, valorCuota, cantidadAportada);

        if (reg == 1) {
            System.out.print("cuenta creada");
            return true;
        } else {
            System.out.print("cuenta no creada");
            return false;
        }
    }

    public boolean actualizar(String rut, int valorCuota) {

        int reg = new CuentaDA().update(rut, valorCuota);

        if (reg == 1) {
            return true;
        } else {
            return false;
        }
    }

}
