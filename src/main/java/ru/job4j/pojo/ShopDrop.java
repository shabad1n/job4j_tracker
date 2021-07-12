package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        for(int i = 0; i < products.length; i++) {
            if (i == index && i != products.length - 1) {
                while (i != products.length - 1) {
                    products[i] = products[i + 1];
                    i++;
                    if(i == products.length - 1) {
                        products[i] = null;
                    }
                }
            } else if(i == products.length - 1) {
                products[i] = null;
            }
        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(products[i].getName());
        }
        products[1] = products[2];
        products[2] = null;
        ShopDrop.delete(products, 1);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
