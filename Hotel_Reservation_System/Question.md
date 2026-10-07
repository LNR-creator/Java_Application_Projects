# 🏨 Java Project Challenge 2 — Hotel Reservation System

Develop a **Hotel Reservation System** using Java OOP concepts.

## 1. Create a `Room` class

Members:

```text
roomNo       - int
roomType     - String
pricePerDay  - double
isAvailable  - boolean
```

Create a **parameterized constructor** to initialize all members.

Create appropriate methods to:

```text
Get room price
Check room availability
Change room availability
```

---

## 2. Create a `Customer` class

Members:

```text
customerId    - int
customerName  - String
phoneNumber   - String
```

Create a **parameterized constructor** to initialize all members.

---

## 3. Create a `Reservation` class

Members:

```text
reservationId  - int
customer       - Customer
room           - Room
days           - int
totalAmount    - double
```

### Constructor

Create a parameterized constructor.

The `reservationId` should be **automatically generated**.

Example:

```text
First reservation  → 1001
Second reservation → 1002
Third reservation  → 1003
```

The `totalAmount` should **not be received from the user**. It must be calculated by the program.

---

# 4. `bookRoom()` method

Create:

```java
public boolean bookRoom()
```

### Rules:

1. Number of days must be greater than `0`.
2. Room must be available.
3. Calculate:

```text
totalAmount = days × pricePerDay
```

4. After successful booking:

```text
isAvailable = false
```

5. Return:

```text
true  → booking successful
false → booking failed
```

---

# 5. `cancelReservation()` method

Create:

```java
public boolean cancelReservation()
```

### Rules:

- Cancel the reservation.
- Make the room available again.
- Return `true` when cancellation is successful.
- Return `false` if cancellation is not possible.

---

# 6. `displayReservation()` method

Display:

```text
========== RESERVATION ==========

Reservation ID :
Customer ID    :
Customer Name  :
Phone Number   :

Room Number    :
Room Type      :
Price Per Day  :
Days           :
Total Amount   :

=================================
```

---

# 7. Create `TestHotel` class

Use `Scanner` to make the application **dynamic**.

Take input from the user:

```text
Enter Customer ID:
Enter Customer Name:
Enter Phone Number:

Enter Room Number:
Enter Room Type:
Enter Price Per Day:
Enter Number of Days:
```

Create the required objects.

---

# 8. Create a dynamic menu

After creating the reservation, display:

```text
========== HOTEL RESERVATION ==========
1. Book Room
2. Display Reservation
3. Cancel Reservation
4. Exit
========================================

Enter Your Choice:
```

The menu should continue until the user selects **4. Exit**.

---

## Example

### Input

```text
Customer ID: 101
Customer Name: Raju
Phone Number: 9876543210

Room Number: 205
Room Type: Deluxe
Price Per Day: 2500
Days: 3
```

### Booking result

```text
Booking Successful!

========== RESERVATION ==========

Reservation ID : 1001
Customer ID    : 101
Customer Name  : Raju
Phone Number   : 9876543210

Room Number    : 205
Room Type      : Deluxe
Price Per Day  : 2500
Days           : 3
Total Amount   : 7500

=================================
```

### 🎯 Concepts you should practice

```text
Classes
   ↓
Objects
   ↓
Constructors
   ↓
HAS-A relationship
   ↓
Encapsulation
   ↓
Getters/Setters
   ↓
Validation
   ↓
Dynamic Scanner input
   ↓
Loops + Menu
   ↓
Object state changes
```

**Important:** Don't use inheritance for this project. `Reservation HAS-A Customer` and `Reservation HAS-A Room`; neither relationship is `IS-A`.
