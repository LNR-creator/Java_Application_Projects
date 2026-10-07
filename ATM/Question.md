# 🏧 Java Project Challenge — ATM Management System

Develop a **dynamic ATM Management System** using Java OOP concepts.

## 1. Create an `Account` class

Members:

```text
accountNo      - int
accountHolder  - String
balance        - double
pin            - String
```

Use appropriate access specifiers.

Create a **parameterized constructor** to initialize all members.

### PIN Rule 🔐

The PIN must contain **exactly 4 digits**.

Examples:

```text
1234 → Valid
0001 → Valid
123  → Invalid
12345 → Invalid
12A4 → Invalid
```

---

# 2. Create the following methods in `Account`

### `validatePin()`

```java
public boolean validatePin(String enteredPin)
```

Rules:

- If the entered PIN matches the account PIN → `true`
- Otherwise → `false`

---

### `deposit()`

```java
public boolean deposit(double amount)
```

Rules:

- Amount must be greater than `0`.
- Add the amount to the balance.
- Return `true` if successful.
- Otherwise return `false`.

---

### `withdraw()`

```java
public boolean withdraw(double amount)
```

Rules:

- Amount must be greater than `0`.
- Amount must not be greater than the current balance.
- Deduct the amount from the balance.
- Return `true` if successful.
- Otherwise return `false`.

Example:

```text
Balance = ₹5000
Withdraw = ₹2000

New Balance = ₹3000
```

But:

```text
Balance = ₹5000
Withdraw = ₹6000

Insufficient Balance
```

---

### `checkBalance()`

```java
public double checkBalance()
```

Return the current balance.

---

# 3. Create an `ATM` class

The ATM should **HAS-A Account**.

```text
ATM
 ↓
Account
```

Do **not** use:

```java
class ATM extends Account
```

Instead:

```java
class ATM {
    private Account account;
}
```

Create a constructor that receives an `Account` object.

---

## ATM Methods

### `login()`

```java
public boolean login(String enteredPin)
```

The ATM should use the `Account` object's `validatePin()` method.

---

### `depositMoney()`

```java
public void depositMoney(double amount)
```

Use the `Account` object's `deposit()` method.

---

### `withdrawMoney()`

```java
public void withdrawMoney(double amount)
```

Use the `Account` object's `withdraw()` method.

---

### `displayBalance()`

```java
public void displayBalance()
```

Display:

```text
Account Number :
Account Holder :
Current Balance :
```

Use appropriate getter methods from `Account`.

---

# 4. Create `TestATM` class

The `main()` method should be inside:

```java
TestATM
```

Use:

```java
Scanner
```

to make the application **fully dynamic**.

---

## Account Creation

Ask the user:

```text
Enter Account Number:
Enter Account Holder Name:
Enter Initial Balance:
Create a 4-digit PIN:
```

Validate the PIN.

If the PIN is invalid:

```text
❌ PIN must contain exactly 4 digits.
```

Keep asking until the user enters a valid PIN.

---

# 5. Login

After creating the account:

```text
Enter PIN to Login:
```

If correct:

```text
✅ Successfully Logged In
```

If incorrect:

```text
❌ Invalid PIN
```

---

# 6. ATM Menu

After successful login:

```text
========== ATM ==========
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
==========================

Enter Your Choice:
```

The menu should continue until the user selects **4**.

---

## Option 1 — Check Balance

Example:

```text
Account Number : 101
Account Holder : Raju
Current Balance: ₹5000
```

---

## Option 2 — Deposit

Ask:

```text
Enter Deposit Amount:
```

Example:

```text
Enter Deposit Amount: 2000

✅ Deposit Successful
Current Balance: ₹7000
```

---

## Option 3 — Withdraw

Ask:

```text
Enter Withdrawal Amount:
```

Example:

```text
Enter Withdrawal Amount: 3000

✅ Withdrawal Successful
Current Balance: ₹4000
```

If insufficient:

```text
❌ Insufficient Balance
```

---

## Option 4 — Exit

Display:

```text
Thank you for using the ATM!
```

Then terminate the menu loop.

---

# 🎯 Expected Program Flow

```text
          Start
            ↓
     Create Account
            ↓
       Validate PIN
            ↓
         Login
            ↓
      ┌─────────────┐
      │ ATM MENU    │
      └─────────────┘
       ↓    ↓    ↓    ↓
      1     2    3    4
      ↓     ↓    ↓    ↓
   Balance Deposit Withdraw Exit
      │     │      │
      └─────┴──────┘
             ↓
        Back to Menu
```

### Concepts this project should teach you

**Encapsulation → Constructor → Object composition (HAS-A) → Getter methods → Scanner → Validation → `if/else` → `do-while`/`while` → Method delegation → Object state changes.**

For your practice, **don't write all three classes at once**. Build `Account → ATM → TestATM` in that order and test each stage.