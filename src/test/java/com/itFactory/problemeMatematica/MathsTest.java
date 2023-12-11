package com.itFactory.problemeMatematica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathsTest {

   Maths underTest = new Maths();

    @Test
    @DisplayName("Trebuie sa ne calculeze pretul total")
    void shouldReturnPret(){
        //given
        User user = new User();
        user.setKg(4);
        user.setPret(6);
        user.setFructe("mere");

        //when
        double actual = underTest.calculeazaPret(user);
        //then
        Assertions.assertEquals(24, actual);
    }

    @Test
    @DisplayName("Trebuie sa ne calculeze pretul total")
    void shouldReturnPret1(){
        //given
        User user = new User();
        user.setKg(0);
        user.setPret(6);
        user.setFructe("mere");

        //when
        double actual = underTest.calculeazaPret(user);
        //then
        Assertions.assertEquals(0, actual);
    }


    @Test
    @DisplayName("Daca pretul este mai mare de 50 ar trebui sa returneze kaki")
    void shouldReturnKaki(){
        //given
        double pret = 60;
        double kg = 2;
        //when
        User actual = underTest.getUser(pret, kg);
        //then
        Assertions.assertNotNull(actual);
        Assertions.assertEquals("KAKI", actual.getFructe());
        Assertions.assertEquals(2, actual.getKg());
        Assertions.assertEquals(60, actual.getPret());
        Assertions.assertEquals(120, actual.getTotal());
    }

    @Test
    @DisplayName("Vindem sau nu vindem")
    void shouldReturnDaSauNU(){
        //given
        User user = new User("mere", 2, 5, 10);
        //when
        String actual = underTest.vindem(user);
        //then
        Assertions.assertEquals("vindem ceva", actual);
    }

    @Test
    @DisplayName("Vindem sau nu vindem")
    void shouldReturnDaSauNU1(){
        //given
        User user = new User("mere", 0, 0, 0);
        //when
        String actual = underTest.vindem(user);
        //then
        Assertions.assertEquals("nu vindem nimic", actual);
    }

    @Test
    @DisplayName("Trebuie sa aflam pretul PerKg")
    void shouldReturnPretPerKg () {
        //given
        User user = new User();
        user.setKg(3);
        user.setTotal(15);
        user.setFructe("pere");
        //when
        double pretPerKg = underTest.careEstePretul(user);
        //then
        Assertions.assertEquals(5, pretPerKg);
    }
    @Test
    @DisplayName("Trebuie sa returneze catitatea")
    void shouldReturnCantiate (){
        //given
        User user = new User();
        user.setPret(10);
        user.setTotal(30);
        user.setFructe("clementine");
        //when
        double cantitateProdus = underTest.cateKgAvem(user);
        //then
        Assertions.assertEquals(3, cantitateProdus);
    }
}