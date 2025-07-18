# Java Practice Exercises

## 🏗️ OOP Four Pillars Exercises

### 1. Encapsulation Exercise
Create a `BankAccount` class that properly encapsulates data:

```java
public class BankAccount {
    // TODO: Add private fields for accountNumber, balance, and ownerName
    
    // TODO: Create constructor
    
    // TODO: Add getter methods (no setter for accountNumber!)
    
    // TODO: Add deposit method (validate amount > 0)
    
    // TODO: Add withdraw method (validate amount > 0 and <= balance)
    
    // TODO: Add getBalance method
}

// Test your class:
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe", 1000.0);
        
        // Try these operations:
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance());
        
        // These should fail gracefully:
        account.withdraw(2000);  // Insufficient funds
        account.deposit(-100);   // Negative amount
    }
}
```

### 2. Inheritance Exercise
Create a vehicle hierarchy:

```java
// TODO: Create abstract Vehicle class
public abstract class Vehicle {
    // TODO: Add protected fields: brand, year, price
    
    // TODO: Add constructor
    
    // TODO: Add concrete methods: start(), stop()
    
    // TODO: Add abstract method: calculateInsurance()
}

// TODO: Create Car class that extends Vehicle
public class Car extends Vehicle {
    // TODO: Add field: numberOfDoors
    
    // TODO: Override calculateInsurance() - return price * 0.05
    
    // TODO: Add method: honk()
}

// TODO: Create Motorcycle class that extends Vehicle
public class Motorcycle extends Vehicle {
    // TODO: Add field: hasWindshield
    
    // TODO: Override calculateInsurance() - return price * 0.08 (higher risk)
    
    // TODO: Add method: revEngine()
}

// Test it:
public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2023, 25000, 4);
        Motorcycle bike = new Motorcycle("Honda", 2022, 8000, true);
        
        car.start();
        car.honk();
        System.out.println("Car insurance: $" + car.calculateInsurance());
        
        bike.start();
        bike.revEngine();
        System.out.println("Bike insurance: $" + bike.calculateInsurance());
    }
}
```

### 3. Polymorphism Exercise
Use the vehicles from exercise 2:
```java
public class PolymorphismTest {
    public static void main(String[] args) {
        // TODO: Create an array of different Vehicle types
        Vehicle[] vehicles = {
            new Car("BMW", 2023, 40000, 2),
            new Motorcycle("Yamaha", 2022, 12000, false),
            new Car("Honda", 2024, 30000, 4)
        };
        
        // TODO: Loop through vehicles and call start() and calculateInsurance()
        // Notice how each vehicle behaves differently!
        
        // TODO: Create a method that accepts any Vehicle and services it
        for (Vehicle vehicle : vehicles) {
            serviceVehicle(vehicle);
        }
    }
    
    // TODO: Write this method
    public static void serviceVehicle(Vehicle vehicle) {
        // Should work with any vehicle type
        System.out.println("Servicing " + vehicle.getBrand());
        vehicle.stop();
        // Perform maintenance
        vehicle.start();
    }
}
```

### 4. Abstraction Exercise
Create a payment system:

```java
// TODO: Create PaymentProcessor interface
public interface PaymentProcessor {
    boolean processPayment(double amount);
    void sendReceipt(String email);
    String getPaymentMethod();
}

// TODO: Implement CreditCardProcessor
public class CreditCardProcessor implements PaymentProcessor {
    private String cardNumber;
    
    // TODO: Implement all methods
    // processPayment should validate card and process
    // sendReceipt should send email receipt
    // getPaymentMethod should return "Credit Card"
}

// TODO: Implement PayPalProcessor
public class PayPalProcessor implements PaymentProcessor {
    private String email;
    
    // TODO: Implement all methods with PayPal-specific logic
}

// TODO: Create ShoppingCart that uses abstraction
public class ShoppingCart {
    private PaymentProcessor paymentProcessor;
    
    // TODO: Add constructor that accepts any PaymentProcessor
    
    // TODO: Add checkout method that uses the payment processor
    public void checkout(double amount, String customerEmail) {
        // Use the payment processor without knowing which type it is
    }
}
```

## 🔧 Essential Java Concepts Exercises
### 5. Collections Exercise

```java
public class CollectionsExercise {
    public static void main(String[] args) {
        // TODO: Create a List of student names
        List<String> students = new ArrayList<>();
        // Add: "Alice", "Bob", "Charlie", "Alice", "David"
        
        // TODO: Print the list size and check if "Alice" exists
        
        // TODO: Create a Set from the list to remove duplicates
        Set<String> uniqueStudents = new HashSet<>(students);
        
        // TODO: Create a Map to store student grades
        Map<String, Integer> grades = new HashMap<>();
        // Add grades: Alice=90, Bob=85, Charlie=92, David=78
        
        // TODO: Print all students and their grades
        
        // TODO: Find the student with the highest grade
    }
}
```

### 6. Streams Exercise

```java
import java.util.*;
import java.util.stream.Collectors;

public class StreamsExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // TODO: Use streams to find all even numbers
        List<Integer> evenNumbers = numbers.stream()
            // Your code here
            .collect(Collectors.toList());
        
        // TODO: Use streams to find all numbers greater than 5 and multiply by 2
        List<Integer> processed = numbers.stream()
            // Your code here
            .collect(Collectors.toList());
        
        // TODO: Use streams to find the sum of all numbers
        int sum = numbers.stream()
            // Your code here
            
        // TODO: Use streams to find if any number is greater than 8
        boolean hasLargeNumber = numbers.stream()
            // Your code here
            
        // TODO: Use streams to find the first number greater than 5
        Optional<Integer> firstLarge = numbers.stream()
            // Your code here
            
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Processed: " + processed);
        System.out.println("Sum: " + sum);
        System.out.println("Has large number: " + hasLargeNumber);
        System.out.println("First large: " + firstLarge);
    }
}
```

### 7. Optional Exercise

```java
import java.util.Optional;

public class OptionalExercise {
    
    // TODO: Create a method that returns Optional<String>
    public static Optional<String> findUserById(int id) {
        // Return Optional.of("User" + id) if id > 0
        // Return Optional.empty() if id <= 0
    }
    
    public static void main(String[] args) {
        // TODO: Test findUserById with valid and invalid IDs
        
        // TODO: Use ifPresent to print user if found
        
        // TODO: Use orElse to provide default value
        
        // TODO: Use orElseThrow to throw exception if not found
        
        // TODO: Use map to transform the user name to uppercase
        
        // Example tests:
        Optional<String> user1 = findUserById(1);
        Optional<String> user2 = findUserById(-1);
        
        // Handle each case properly
    }
}
```

### 8. Exception Handling Exercise

```java
public class ExceptionExercise {
    
    // TODO: Create a method that might throw exceptions
    public static double divide(double a, double b) throws IllegalArgumentException {
        // Throw IllegalArgumentException if b is 0
        // Return a / b otherwise
    }
    
    // TODO: Create a method that handles exceptions
    public static void safeDivide(double a, double b) {
        try {
            double result = divide(a, b);
            System.out.println(a + " / " + b + " = " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
    
    // TODO: Create a custom exception
    public static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }
    
    // TODO: Create a method that uses the custom exception
    public static double squareRoot(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Cannot calculate square root of negative number: " + number);
        }
        return Math.sqrt(number);
    }
    
    public static void main(String[] args) {
        // TODO: Test safeDivide with valid and invalid inputs
        
        // TODO: Test squareRoot with try-catch
        
        // Test cases:
        safeDivide(10, 2);
        safeDivide(10, 0);
        
        try {
            double result = squareRoot(16);
            System.out.println("Square root: " + result);
            
            result = squareRoot(-4);  // This should throw exception
        } catch (NegativeNumberException e) {
            System.err.println("Custom error: " + e.getMessage());
        }
    }
}
```

### 9. Lambda Expressions Exercise

```java
import java.util.*;
import java.util.stream.Collectors;

public class LambdaExercise {
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        
        // TODO: Use lambda to print each name
        names.forEach(/* Your lambda here */);
        
        // TODO: Use lambda to filter names with length > 4
        List<String> longNames = names.stream()
            .filter(/* Your lambda here */)
            .collect(Collectors.toList());
        
        // TODO: Use lambda to convert all names to uppercase
        List<String> upperNames = names.stream()
            .map(/* Your lambda here */)
            .collect(Collectors.toList());
        
        // TODO: Use lambda to sort names by length
        List<String> sortedByLength = names.stream()
            .sorted(/* Your lambda here */)
            .collect(Collectors.toList());
        
        // TODO: Use lambda to find first name starting with 'C'
        Optional<String> nameWithC = names.stream()
            .filter(/* Your lambda here */)
            .findFirst();
        
        System.out.println("Long names: " + longNames);
        System.out.println("Upper names: " + upperNames);
        System.out.println("Sorted by length: " + sortedByLength);
        System.out.println("Name with C: " + nameWithC);
    }
}
```

## 🎯 Challenge Exercise: Putting It All Together
### 10. Student Management System
Create a complete system using all concepts:

```java
// TODO: Create Student class with proper encapsulation
public class Student {
    // Fields: id, name, email, grade, courses (List<String>)
    // Proper constructor, getters, setters with validation
    // Override toString()
}

// TODO: Create custom exception
public class StudentNotFoundException extends Exception {
    // Constructor with message
}

// TODO: Create StudentService class
public class StudentService {
    private List<Student> students = new ArrayList<>();
    
    // TODO: Add student (check for duplicates)
    public void addStudent(Student student) throws IllegalArgumentException {
        // Validate student data
        // Check if student already exists
        // Add to list
    }
    
    // TODO: Find student by ID (return Optional)
    public Optional<Student> findStudentById(int id) {
        // Use streams to find student
    }
    
    // TODO: Get all students with grade above threshold
    public List<Student> getStudentsWithGradeAbove(double threshold) {
        // Use streams with lambda
    }
    
    // TODO: Get students grouped by grade range
    public Map<String, List<Student>> getStudentsByGradeRange() {
        // Use streams to group: A (90-100), B (80-89), C (70-79), etc.
    }
    
    // TODO: Get top N students by grade
    public List<Student> getTopStudents(int n) {
        // Use streams with sorting and limiting
    }
}

// TODO: Create test class
public class StudentManagementTest {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        
        // TODO: Add some test students
        // TODO: Test all methods
        // TODO: Handle exceptions properly
        // TODO: Use Optional methods safely
    }
}
```

## 🏆 Solutions Check
After completing each exercise, check if you:
### OOP Pillars:

- ✅ Encapsulation: Made fields private, added validation in methods
- ✅ Inheritance: Created parent-child relationships, used super
- ✅ Polymorphism: Same method calls work on different object types
- ✅ Abstraction: Used interfaces/abstract classes to hide complexity

### Essential Concepts:

- ✅ Collections: Used List, Set, Map appropriately
- ✅ Streams: Used filter(), map(), collect() with lambdas
- ✅ Optional: Handled null safely with ifPresent(), orElse()
- ✅ Exceptions: Created custom exceptions, used try-catch
- ✅ Lambdas: Replaced loops with concise functional code

### Bonus Points:

1. Used method references (User::getName)
2. Chained stream operations
3. Used Collectors.groupingBy()
4. Created fluent interfaces
5. Added proper logging/error messages
