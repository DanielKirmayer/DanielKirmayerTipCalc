public class TipCalculator {

    private double totalBill;
    private double tipPercent;
    private int partySize;

    public TipCalculator(double totalBill, double tipPercent, int partySize) {
        this.totalBill = totalBill;
        this.tipPercent = tipPercent / 100 + 1;
        this.partySize = partySize;
    }

    public double calculateFinalBill() {
        return Math.round(totalBill * tipPercent * 100) / 100.0;
    }

    public double calculateTotalTip() {
        return Math.round((calculateFinalBill() - totalBill) * 100) / 100.0;
    }

    public double calculateTipPerPerson() {
        return Math.round((calculateTotalTip() / partySize) * 100) / 100.0;
    }

    public double calculateBillPerPerson() {
        return Math.round((calculateFinalBill() / partySize) * 100) / 100.0;
    }
}
