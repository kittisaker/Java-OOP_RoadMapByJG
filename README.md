# Java-OOP_RoadMapByJG : Chapter 12 Aggregation in Java with Example

## Overview
Aggregation is an association that represents a part of a whole relationship where a part can exist without a whole. It has a weaker relationship.

## Intent/Definition
It is a specialized form of Association where all object has their own lifecycle but there is ownership. This represents a “whole-part or a-part-of” relationship.

### Key Points
- It is a specialized form of Association where all object has their own lifecycle but there is ownership. This represents a “whole-part or a-part-of” relationship.
- It is a unidirectional association i.e. a one-way relationship. For example, the department can have students but vice versa is not possible and thus unidirectional in nature.
- In Aggregation, both the entries can survive individually which means ending one entity will not affect the other entity.

## Implementation
```java
class Product {
    private int id;
    private String name;
    private String description;

    public Product(int id, String name, String description) {
         super();
         this.id = id;
         this.name = name;
         this.description = description;
    }
    public int getId() {
         return id;
    }
    public void setId(int id) {
         this.id = id;
    }
    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
         this.description = description;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}
```

```java
class LineItem {
    private int id;
    private int quantity;
    private Product p;

    public LineItem(int id, int quantity, Product p) {
         super();
         this.id = id;
         this.quantity = quantity;
         this.p = p;
    }
    public int getId() {
         return id;
    }
    public void setId(int id) {
         this.id = id;
    }
    public int getQuantity() {
         return quantity;
    }
    public void setQuantity(int quantity) {
         this.quantity = quantity;
    }
    public Product getP() {
         return p;
    }
    public void setP(Product p) {
         this.p = p;
    }
    @Override
    public String toString() {
         return "LineItem [id=" + id + ", quantity=" + quantity + ", p=" + p + "]";
    }
}
```

```java
public class Aggregation {
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product(1, "Pen", "This is red pen");
        Product p2 = new Product(2, "Pencil", "This is pencil");
        Product p3 = new Product(3, "ColorBox", "This is color box");

        // Create lineItem and add quntity of the products
        LineItem item1 = new LineItem(1, 2, p1);
        LineItem item2 = new LineItem(1, 2, p2);
        LineItem item3 = new LineItem(1, 2, p3);
  
        // Before deleting line item 1 
        System.out.println(item1.getId());
        System.out.println(item1.getQuantity());
        System.out.println(item1.getP());
        item1 = null;

        // Still product exist and not deleted
        System.out.println(p1);
    }
}
```

## Aggregation vs Composition

<table>
  <tr>
    <th>Aggregation</th>
    <th>Composition</th>
  </tr>
  <tr>
    <td>Aggregation is a weak Association.</td>
    <td>Composition is a strong Association.</td>
  </tr>
  <tr>
    <td>Class can exits independently without owner.</td>
    <td>Class can not meaningfully exist without owner.</td>
  </tr>
  <tr>
    <td>Have their own Life Time.</td>
    <td>Life Time depends on the Owner.</td>
  </tr>
  <tr>
    <td>A uses B</td>
    <td>A owns B</td>
  </tr>
  <tr>
    <td>Child is not owned by 1 owner</td>
    <td>Child can have only 1 owner.</td>
  </tr>
  <tr>
    <td>Has-A relationship. A has B.</td>
    <td>Part-Of relationship. B is part of A</td>
  </tr>
  <tr>
    <td>Denoted by empty diamond in UML.</td>
    <td>Denoted by a filled diamond in UML.</td>
  </tr>
  <tr>
    <td>We do not use "final" keyword for Aggregation.</td>
    <td>"final" keyword is used to represent Composition.</td>
  </tr>
</table>

---