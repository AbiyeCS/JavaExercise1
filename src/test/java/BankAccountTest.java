import org.example.BankAccount;

// Test your class:
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000.0,"John Doe" );

        System.out.println("Initial: " + account);

        // Test valid operations
        account.deposit(500);    // Should work
        account.withdraw(200);   // Should work

        // Test edge cases
        account.withdraw(2000);  // Should fail - insufficient funds
        account.deposit(-100);   // Should fail - negative amount
        account.withdraw(0);     // Should fail - zero amount

        System.out.println("Final: " + account);
    }
}
