package com.itFactory.cosCumparaturi.Main;

import com.itFactory.cosCumparaturi.dataBase.Basket;
import com.itFactory.cosCumparaturi.modal.Product;
import com.itFactory.cosCumparaturi.modal.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a product into the basket! ");
        System.out.println("If you don't need anything type exit! ");
        while (true) {
            System.out.println("Pick a command:\n"
                    + " Type -add- if you want to add a product to the basket\n"
                    + " Type -meat- to check the list with the meat you've put into the basket!\n"
                    + " Type -dairyProduct- to check the list with the Dairy Product you've put into the basket!\n"
                    + " Type -vegan- to check the list with the Dairy Product you've put into the basket!\n"
                    + " Type -allmeatprice- to check how much do you have to pay for meat products\n"
                    + " Type -allveganprice- to check how much do you have to pay for vegan products \n"
                    + " Type -alldairyprice- to check how much do you have to pay for dairy products\n"
                    + " Type -total- to check how much do you have to pay \n"
                    + " exit\n");
            String comanda = scanner.nextLine();

            switch (comanda.toLowerCase().trim()) {
                case "add":

                    System.out.println("Insert name, price, quantity and Product Type(VEGAN, DAIRYPRODUCT, MEAT)");
                    String str[] = scanner.nextLine().split(" ");

                    Product product = new Product();
                    product.setNume(str[0]);
                    product.setPret(Double.parseDouble(str[1]));
                    product.setCantitate(Integer.parseInt(str[2]));
                    product.setTipProdus(Type.valueOf(str[3].toUpperCase()));
                    System.out.println("I've added to the basket " + product.getNume() + " which costs " + product.getPret() + " lei per kg"
                            + ", having a quantity of  " + product.getCantitate() + "kg" + ", total price being " + calcul(product) + " lei"
                            + " which is belonging to " + product.getTipProdus());
                    productList = Basket.addProduct(productList, product);
                    System.out.println("The list with all the products is: " + productList);
                    break;
                case "meat":
                    List<Product> filteredListMeat = Basket.filtrTheProducts(productList, Type.MEAT);
                    System.out.println("The filtered List for meat is " + filteredListMeat);
                    break;
                case "dairyproduct":
                    List<Product> filteredListDairyProd = Basket.filtrTheProducts(productList, Type.DAIRYPRODUCT);
                    System.out.println("The filtered List for meat is " + filteredListDairyProd);
                    break;
                case "vegan":
                    List<Product> filteredListVegan = Basket.filtrTheProducts(productList, Type.VEGAN);
                    System.out.println("The filtered List for meat is " + filteredListVegan);
                    break;
                case "allmeatprice":
                    Type meat = Type.MEAT;
                    double sum = calculateSumMeat(productList, meat);
                    System.out.println("The total price for Meat products is  " + sum + " lei");
                    break;
                case "allveganprice":
                    Type vegan = Type.VEGAN;
                    double sumVegan = calculateSumMeat(productList, vegan);
                    System.out.println("The total price for Vegan products is  " + sumVegan + " lei");
                    break;
                case "alldairyprice":
                    Type dairy = Type.DAIRYPRODUCT;
                    double sumDairy = calculateSumMeat(productList, dairy);
                    System.out.println("The total price for Dairy products is  " + sumDairy + " lei");
                    break;
                case "total":
                    double totalSum = calculateTotalSum(productList);
                    System.out.println("You have to pay " + totalSum);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong command");

            }
        }
    }

    public static double calcul(Product product) {
        double cantitate = product.getCantitate() * product.getPret();
        return cantitate;
    }
    private static double calculateSumMeat(List<Product> productList, Type tipProdus) {
        double sum = 0.0;
        for (Product product : productList) {
            if (product.getTipProdus() == tipProdus) {
                sum += product.getTotalPrice();
            }
        }
        return sum;
    }
   public static double calculateTotalSum (List<Product> productList){
        double totalSum = 0.0;
        for (Product product : productList){
            totalSum += product.getTotalPrice();
        }
        return totalSum;
   }
}
