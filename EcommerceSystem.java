import java.util.Scanner;

public class EcommerceSystem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Product electronicProduct = new ElectronicProduct(1, "Laptop", 1200, "HP", 12);
        Product clothingProduct = new ClothingProduct(2, "T-shirt", 20, "M", "Cotton");
        Product bookProduct = new BookProduct(3, "Java Programming", 45, "John Doe", "ABC Publications");

        Customer customer = new Customer(23011555, "Makrious", "Mohram Bek");

        Product[] products = {electronicProduct, clothingProduct, bookProduct};
        Order order = new Order(customer.getCustomerId(), 1, products);

        order.printOrderInfo();

        Cart cart = new Cart(customer.getCustomerId(), 5);
        cart.addProduct(electronicProduct);
        cart.addProduct(clothingProduct);
        cart.addProduct(bookProduct);

        System.out.println("Current products in cart:");
        for (Product product : cart.getProducts()) {
            if (product != null) {
                System.out.println("- " + product.getName());
            }

            cart.removeProduct(clothingProduct);

            System.out.println("Updated products in cart:");
                System.out.println("Current products in cart:");
                for (Product product8 : cart.getProducts()) {
                    if (product != null) {
                        System.out.println("- " + product.getName());
                    }
                cart.placeOrder();
    }
}}}
