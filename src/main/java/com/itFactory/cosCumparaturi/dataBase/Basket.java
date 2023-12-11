package com.itFactory.cosCumparaturi.dataBase;

import com.itFactory.cosCumparaturi.modal.Product;
import com.itFactory.cosCumparaturi.modal.Type;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    public static List<Product> filtrTheProducts(List<Product> listProducts, Type tipProduct) {

        List<Product> filtratedList = new ArrayList<>();

        for (Product product : listProducts) {
            if (product.getTipProdus().equals(tipProduct)) {
                filtratedList.add(product);
            }
        }

        return filtratedList;
    }

    public static List<Product> addProduct(List<Product> productList, Product product) {

//        List<Product> carne = filtrTheProducts(productList, Type.MEAT);
//        List<Product> lactate = filtrTheProducts(productList, Type.DAIRYPRODUCT);
//        List<Product> vegan = filtrTheProducts(productList, Type.VEGAN);


        if (product.getTipProdus().equals(Type.MEAT)) {

            productList.add(product);
        }

        if (product.getTipProdus().equals(Type.DAIRYPRODUCT)) {
            productList.add(product);
        }

        if (product.getTipProdus().equals(Type.VEGAN)) {
            productList.add(product);
        }

        return productList;
    }
}
