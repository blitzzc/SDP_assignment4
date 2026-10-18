# Banking System

A simple Java console application that demonstrates the **Facade design pattern**. The project uses basic Java classes and methods without external libraries.

## Features

- Deposit money into an account
- Withdraw money from an account
- Verify a PIN before processing a transaction
- Display the current balance
- Reject zero or negative transaction amounts
- Prevent withdrawals when the balance is insufficient
- Display notifications after successful transactions

## Project Structure

| File | Purpose |
|------|---------|
| `Account.java` | Stores the balance and updates it |
| `Security.java` | Checks the entered PIN |
| `Transaction.java` | Validates and processes deposits and withdrawals |
| `Notification.java` | Displays transaction messages |
| `BankingFacade.java` | Provides simple access to the banking operations |
| `Main.java` | Demonstrates how the system works |

## Facade Pattern

`BankingFacade` coordinates the account, security, transaction, and notification classes. The main program calls methods such as `depositMoney()` and `withdrawMoney()` through the facade.

This keeps `Main` simple because it does not need to manage each subsystem separately.

## How to Run

Install a Java JDK, open a terminal in the project folder, and run:

```bash
javac *.java
java Main
```

Alternatively, open the project in IntelliJ IDEA and run `Main.java`.

## Example Scenario

The account starts with a balance of **1000** and PIN **1234**. The program deposits **500**, withdraws **200**, and demonstrates rejected operations. The final balance is **1300**.

This is an educational demonstration. PIN checking and notifications are simplified for learning purposes.
