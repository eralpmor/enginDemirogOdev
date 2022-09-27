
public class Main {
    public static void main(String[] args) {
        
    
    Product product = new Product(1, "Laptop", "Asus", 5000, 3, "Siyah", "L1" );
       
        /*
        product.setName("Laptop"); 
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setColor("Siyah");
        product.setCode("L1");
        */
        
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getPrice());
    
}
}