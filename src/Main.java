public class Main {
    public static void main(String[] args) {
        int[] sales = new int[] {7, 70, 700, 777};
        SalesManager salesManager = new SalesManager(sales);

        int max = salesManager.max();

        System.out.println(max);


    }
}
