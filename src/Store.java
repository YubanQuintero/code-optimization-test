public class Store {
    // Constantes de precios y cantidades
    static final int PRODUCT_COUNT = 3;
    static final int[] PRICES = {10, 15, 5};
    static final int[] QUANTITIES = {2, 3, 4};
    static final int SALES_TARGET = 50;
    
    public static void main(String[] args) {
        int totalSales = 0;
        // Calcular ventas totales
        for (int i = 0; i < PRODUCT_COUNT; i++) {
            totalSales += PRICES[i] * QUANTITIES[i];
        }

        if (totalSales > SALES_TARGET) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
