public class Main {
    public static void main(String[] args) {
        int items = 50;
        float itemsPrice = 7.80f;
        int totalPrice = items * itemsPrice;
        char currency = "$";
        System.out.println("Numbers of items :" + items);
        System.out.println("Price for each item :" + itemsPrice + currency);
        System.out.println("Total cost of all the items : " + totalPrice + currency);
    }
}