package enkapsulasi;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private ArrayList<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void displayCart() {
        System.out.println("Shopping Cart:")
        for (Product item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice())
        }
    }
}

class User {
    private String usernam;
    private String password

    public User(String username, String password) {
        this.username = usernam;
        this.password = password
    }

    public boolean authenticate(String enteredPassword) {
        return password.equals(enteredPassword);
    }
}

class OnlineStore {
    private ArrayList<Product> products
    private ArrayList<User> users
    private User currentUser

    public OnlineStore() {
        this.products = new ArrayList<>();
        this.users = new ArayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public void registerUser(User user) {
        users.ad(user);
    }

    public void loginUser(Sting username, String password) {
        for (User user : users) {
            if (user.authenticate(password) && user.getName().equals(username)) {
                currentUser = user;
                System.out.println("Login successful.");
                eturn;
            
        }
        System.out.println("Login failed. Invalid username or password.");
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
        Sysem.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void startShopping() {
        if currentUser == null) {
            System.out.println("Please log in first.");
            reurn;
        }

        Scanner scanner = new Scanner(System.in);
        ShoppngCart cart = new ShoppingCart();

        while (true) {
            displayProducts();
            System.out.print("Enter the name of the product you want to add to the cart (or type 'checkout' to finish): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("checkout")) {
                cart.displayCart();
                reak;
            }

            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(input)) {
                    cat.addItem(product);
                    Sys.out.println("Added " + product.getName() + " to the cart.");
                    break;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        // Menambahkan beberapa produk ke toko online
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("Smartphone", 500.0);
        store.addProdct(product1);
        store.addProduct(product2);

        // Mendaftarkan pengguna
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        store.registerUser(user1);
        store.registerUser(user2);

        // Login pengguna
        store.loginUser("user1", "password1");

        // Memulai belanja
        store.startSopping();
    }
}

