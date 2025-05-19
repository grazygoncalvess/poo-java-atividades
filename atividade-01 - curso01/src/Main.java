import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = input.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = input.next().charAt(0);
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Price: ");
            Double price = input.nextDouble();

            if(type == 'c'){
                Product product  = new Product(name, price);
                products.add(product);
            } else if (type == 'u') {
                System.out.print("Manufacture date: ");
                Date manufactureDate = sdf.parse(input.next());
                Product usedProduct = new UsedProduct(name, price, manufactureDate);
                products.add(usedProduct);
            } else {
                System.out.print("Custom fee: ");
                Double customFee = input.nextDouble();
                Product importedProduct = new ImportedProduct(name, price, customFee);
                products.add(importedProduct);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
    }
}
