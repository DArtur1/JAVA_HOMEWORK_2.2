public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int refillAmount = 3100;
        boolean isMore = refillAmount > 1000;

        /* int bonusAmount;
        if (isMore) {
            bonusAmount = refillAmount / 100;
        } else {
            bonusAmount = 0;
        } */

        int bonusAmount = isMore ? refillAmount / 100 : 0;
        int totalAmount = initialAmount + refillAmount + bonusAmount;
        System.out.println("Сумма пополнения = " + totalAmount);
    }
}