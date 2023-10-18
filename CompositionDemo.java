public class CompositionDemo {
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product(1, "Pen", "This is red pen");
        Product p2 = new Product(1, "Pencil", "This is red pencil");
        Product p3 = new Product(1, "ColorBox", "This is red box");

        // Create Order and Add Line Items
        Order o = new Order(1, "ORD#1");
        o.addItem(1, 2, p1);
        o.addItem(2, 1, p2);
        o.addItem(3, 5, p3);

        // Print Order detail before deleting
        System.out.println("Order ---------");
        System.out.println(o);
        // Deleting order would also delete associated LineItems   
        o = null; 
    }
}
// Order ---------
// Order [id=1, name=ORD#1, lineItems=[LineItem [id=1, quantity=2, p=Product [id=1, name=Pen, description=This is red pen]], LineItem [id=2, quantity=1, p=Product [id=1, name=Pencil, description=This is red pencil]], LineItem [id=3, quantity=5, p=Product [id=1, name=ColorBox, description=This is red box]]]]