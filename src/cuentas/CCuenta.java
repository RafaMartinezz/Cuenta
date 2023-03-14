package cuentas;

public class CCuenta {
    /**
     * Nombre de la cuenta.
     */
    private String nombre;
    /**
     * Identificacion de la cuenta.
     */
    private String cuenta;
    /**
     * Saldo de la cuenta disponible
     */
    private double saldo;
    /**
     * Tipo de interes ante un posible prestamo.
     */
    private double tipoInterés;

    public CCuenta() {
    }
    
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public double getSaldo() {
        return saldo;
    }

    public double estado() {
        return saldo;
    }
    /**
     * Ingresar una cantidad de dinero en la cuenta.
     * @param cantidad Cantidad de dinero que se ingresa en la cuenta.
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        this.saldo = this.saldo + cantidad;
    }

    /**
     * Retirar una cantidad de dinero en la cuenta
     * @param cantidad Cantidad de dinero que se quiere retirar de la cuenta.
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        this.saldo = this.saldo - cantidad;
    }
}
