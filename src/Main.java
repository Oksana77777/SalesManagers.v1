public class Main {
    public static void main(String[] args) {
        long[] sales = new long[] {7, 70, 700, 777};
        SalesManager salesManager = new SalesManager(sales);

        long max = salesManager.max();

        System.out.println(max);


    }
}
