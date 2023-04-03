public class Main {
    public static void main(String[] args) {
        int InitialAmount = 100;
        int RefillAmount = 3100;
        boolean IsMore = RefillAmount > 1000;

        /* int BonusAmount;
        if (IsMore) {
            BonusAmount = RefillAmount / 100;
        } else {
            BonusAmount = 0;
        } */

        int BonusAmount = IsMore ? RefillAmount / 100 : 0;
        int TotalAmount = InitialAmount + RefillAmount + BonusAmount;
        System.out.println("Сумма пополнения = " + TotalAmount);
    }
}