package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Bigmac {

    private final String bun;
    public static final String SEZAM = "Sezam";
    public static final String NOSEZAM = "No sezam";
    public static final String ROLL = "Roll";
    private final int burgers;
    private final String sauce;
    public static final String STANDARD = "Standard";
    public static final String KISLANDS = "1000 islands";
    public static final String BARBECUE = "Barbecue";
    private List<String> ingredients = new ArrayList<>();
    public static final String LETTUCE = "Lettuice";
    public static final String ONION = "Onion";
    public static final String BACON = "Bacon";
    public static final String CUECUMBER = "Cuecumber";
    public static final String CHILLIPEPPER = "Chilli pepper";
    public static final String MUSHROOMS = "Mushrooms";
    public static final String PRAWNS = "Prawns";
    public static final String CHEESE = "Cheese";


    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals(SEZAM) || bun.equals(NOSEZAM)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("bun with sezam or not or roll!");
            }
            return this;
        }

        public BigmacBuilder bun() {
            this.bun = ROLL;
            return this;
        }


        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD) || sauce.equals(KISLANDS) || sauce.equals(BARBECUE)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Souces should be standard, 1000 islands or barbecue!");
            }
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(BACON) || ingredient.equals(CUECUMBER) || ingredient.equals(CHILLIPEPPER) || ingredient.equals(MUSHROOMS) || ingredient.equals(PRAWNS) || ingredient.equals(CHEESE)) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Ingredient should lettuce,onion,bacon,cuecumer,chillipepper,nushrooms,prawns,cheese!");
            }
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bigmac(final String bun, final int burgers, final String sauce, final String... ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
