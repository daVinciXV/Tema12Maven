package com.itFactory.cosCumparaturi.Main;

import com.itFactory.cosCumparaturi.modal.Product;
import com.itFactory.cosCumparaturi.modal.Type;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTest {
    Main underTest = new Main();
    @Test
    void main() {
    }

    @Test
    void calcul(){
        //given
        Product product = new Product("A" , 3, 4, Type.VEGAN);
        //when
        double actual = underTest.calcul(product);
        //then
        Assertions.assertEquals(12, actual);
    }

    @Test
    void shouldCalculateTotalSum() {
        //given
        List<Product> productList = new ArrayList<>();
        Product product3 = new Product("mar", 2, 3 , Type.VEGAN);
        Product product1 = new Product("lapte", 2, 3 , Type.DAIRYPRODUCT);
        Product product2 = new Product("ceafa", 2, 4 , Type.MEAT);
        productList.add(product3);
        productList.add(product1);
        productList.add(product2);
        //when
        double actual = underTest.calculateTotalSum(productList);
        //then
        Assertions.assertEquals(20, actual);
    }
}