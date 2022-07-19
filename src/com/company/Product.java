package com.company;


public class Product {

    private Assortment type;
    private int cost;
    private int count;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count=count;
    }

    public Product(Assortment type) {
        this.type=type;
        if (type == Assortment.WATER) {
            this.cost=50;
        } else if (type == Assortment.SPRITE) {
            this.cost=70;
        } else if (type == Assortment.SODA) {
            this.cost = 60;
        } else if (type == Assortment.MARS) {
            this.cost = 80;
        } else {
            this.cost = 40;
        }
    }

    public Assortment getType() {
        return type;
    }

    public void setType(Assortment type) {
        this.type=type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", cost=" + cost +
                ", count=" + count +
                '}';
    }
}
