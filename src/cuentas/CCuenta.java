package cuentas;

/**
 * Represents a bank account with basic operations such as deposit and withdrawal.
 */
public class CCuenta {
    /**
     * Account holder's name.
     */
    private String nombre;
    /**
     * Account identification number.
     */
    private String cuenta;
    /**
     * Available balance in the account.
     */
    private double saldo;
    /**
     * Interest rate for potential loans.
     */
    private double tipoInterés;

    /**
     * Default constructor.
     */
    public CCuenta() {
    }
    
    /**
     * Constructor to initialize an account with the holder's name, account number,
     * initial balance, and interest rate.
     *
     * @param nom  Account holder's name.
     * @param cue  Account number.
     * @param sal  Initial balance of the account.
     * @param tipo Interest rate.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }
    
    /**
     * Gets the account holder's name.
     * @return The account holder's name.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the account holder's name.
     * @param nombre The name to set.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the account number.
     * @return The account number.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the account number.
     * @param cuenta The account number to set.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Sets the account balance.
     * @param saldo The balance to set.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Gets the interest rate.
     * @return The interest rate.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Sets the interest rate.
     * @param tipoInterés The interest rate to set.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Gets the current account balance.
     * @return The current account balance.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Returns the current balance of the account.
     * @return The account balance.
     */
    public double estado() {
        return saldo;
    }
    
    /**
     * Deposits an amount into the account.
     *
     * @param cantidad Amount to deposit.
     * @throws Exception if the deposit amount is negative.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("Cannot deposit a negative amount");
        }
        // Add the deposit amount to the balance
        this.saldo = this.saldo + cantidad;
    }

    /**
     * Withdraws an amount from the account.
     *
     * @param cantidad Amount to withdraw.
     * @throws Exception if the withdrawal amount is negative or if insufficient balance.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("Cannot withdraw a negative amount");
        }
        if (estado() < cantidad) {
            throw new Exception("Insufficient balance");
        }
        // Subtract the withdrawal amount from the balance
        this.saldo = this.saldo - cantidad;
    }
}
