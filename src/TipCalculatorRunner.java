import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your total bill: ");
        double totalBill = Double.parseDouble(scanner.nextLine());

        System.out.print("Please enter your tip percentage: ");
        double tipPercent = Double.parseDouble(scanner.nextLine());

        System.out.print("Please enter your party size: ");
        int partySize = Integer.parseInt(scanner.nextLine());

        TipCalculator calculator = new TipCalculator(totalBill, tipPercent, partySize);

        System.out.println("----------------");
        System.out.println("Total Bill: $" + calculator.calculateFinalBill());
        System.out.println("----------------");
        System.out.println("Total Tip: $" + calculator.calculateTotalTip());
        System.out.println("----------------");
        System.out.println("Total Bill Per Person: $" + calculator.calculateBillPerPerson());
        System.out.println("----------------");
        System.out.println("Total Tip Per Person: $" + calculator.calculateTipPerPerson());

        scanner.close();
    }
}
