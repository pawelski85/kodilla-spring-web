package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac vos=new Bigmac("Sezam",3,"DF","F");
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .bun("Sezam")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient("Cheese")
                .ingredient("Mushrooms")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(3, howManyIngredients);
    }
}