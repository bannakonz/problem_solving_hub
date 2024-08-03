public class Main {
    public static void main(String[] args) {
        double price = 50;
        double vat = price * 7 /100;

        double totalPrice = price + vat;

        System.out.println("Price include VAT is =  " + totalPrice);
    }
}