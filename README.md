# Bank Account Management System

This project is a simple **Bank Account Management System** in Java, demonstrating basic bank account operations such as checking balance, making deposits, and performing withdrawals.

## Project Structure

- **Main.java**: Entry point of the application where an account is created and various operations are performed.
- **CCuenta.java**: Contains the `CCuenta` class, which represents a bank account and provides methods to manage balance, deposit, and withdraw funds.

## Classes and Methods

### `CCuenta` Class

The `CCuenta` class simulates a bank account and provides the following functionalities:

- **Attributes**
  - `nombre`: Account holder's name.
  - `cuenta`: Account identification number.
  - `saldo`: Current available balance in the account.
  - `tipoInterés`: Interest rate for potential loans.

- **Methods**
  - `estado()`: Returns the current balance.
  - `ingresar(double cantidad)`: Deposits a specified amount into the account.
  - `retirar(double cantidad)`: Withdraws a specified amount from the account, checking that the amount is valid and that sufficient funds are available.
  
### `Main` Class

The `Main` class initializes the program and performs basic operations on an instance of `CCuenta`, such as checking the balance, attempting a withdrawal, and making a deposit.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE such as IntelliJ IDEA, Eclipse, or any Java-compatible text editor

### Installation

1. Clone this repository to your local machine:

   `git clone https://github.com/yourusername/bank-account-management.git`

2. Navigate to the project directory:

   `cd bank-account-management`

3. Compile the Java files:

   `javac cuentas/*.java`

4. Run the program:

   `java cuentas.Main`

## Usage

In the `Main` class, the program initializes a new account with a starting balance, displays the balance, attempts a withdrawal, and makes a deposit. Example output:

"The current balance is 2500.0 Failed to withdraw Depositing into account"

To modify the initial values (account holder, balance, etc.), edit the `Main.java` file in the following section:

`cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);`

## Error Handling

The `ingresar` and `retirar` methods in `CCuenta` include basic error handling:

- `ingresar` throws an exception if a negative amount is deposited.
- `retirar` throws an exception if the withdrawal amount is negative or if the balance is insufficient.
