package cuentas;

/**
 * Main class that manages bank account operations.
 */
public class Main {

    /**
     * Main method that initializes the application.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Declare a variable to store the account
        CCuenta cuenta1;

        // Declare a variable to store the current balance of the account
        double saldoActual;

        // Initialize the account with the account holder's name, account number, initial balance, and interest rate
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        // Call the function to perform operations on the account with an initial balance
        operativa_cuenta(cuenta1, 0);
    }

    /**
     * Performs operations on a bank account, including checking the balance,
     * attempting a withdrawal, and making a deposit.
     *
     * @param cuenta1  The account on which the operations are performed.
     * @param cantidad Amount that can be used for operations (not used in this case).
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        // Variable to store the current balance of the account
        double saldoActual;

        // Retrieve and display the current balance of the account
        saldoActual = cuenta1.estado();
        System.out.println("The current balance is " + saldoActual);

        try {
            // Attempt to withdraw 2300 monetary units
            cuenta1.retirar(2300);
        } catch (Exception e) {
            // Message in case of an error during withdrawal
            System.out.print("Failed to withdraw");
        }

        try {
            // Message indicating an upcoming deposit
            System.out.println("Depositing into account");
            // Deposit of 695 monetary units into the account
            cuenta1.ingresar(695);
        } catch (Exception e) {
            // Message in case of an error during deposit
            System.out.print("Failed to deposit");
        }
    }
}
