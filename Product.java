public class Product {

    int productId;
    String name;
    int price ;
    
    public Product(int productId, String name, int price) {
        this.productId = Math.abs(productId);
        this.name = name;
        this.price = Math.abs(price); 
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
