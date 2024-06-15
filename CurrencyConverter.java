import java.util.Scanner; 
public class CurrencyConverter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Select currency to convert: "); System.out.println("1. USD to BDT"); System.out.println("2. EUR to BDT"); System.out.println("3. INR to BDT");
int choice = scanner.nextInt();
double exchangeRate = 0.0;
switch (choice) { case 1:

exchangeRate = 114.50; // Example exchange rate for USD to BDT
break; case 2:
exchangeRate = 33.25; // Example exchange rate for EUR to BDT
break; case 3:
exchangeRate = 1.15; // Example exchange rate for INR to BDT
break; default:
System.out.println("Invalid choice!");
return; }
System.out.println("Enter amount to convert: "); double amount = scanner.nextDouble();

double convertedAmount = amount * exchangeRate;
System.out.println("Converted amount: " + convertedAmount + " BDT");
scanner.close(); }
}