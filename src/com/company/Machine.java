package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Machine {

    public final List<Product> products=new ArrayList<>();
    private int money=0;
    private int choose;
    private boolean program = true;
    Random random=new Random();
    Scanner scanner=new Scanner(System.in);

    public Machine() {
        products.add(new Product(Assortment.COLA));
        products.add(new Product(Assortment.SODA));
        products.add(new Product(Assortment.SPRITE));
        products.add(new Product(Assortment.WATER));
        products.add(new Product(Assortment.MARS));
    }

    public void startProgram() {
        getRndAutomat();
        printProducts();
        System.out.println("Select an action...");
        System.out.println("1. Pay!!!");
        System.out.println("2. Exit program!!!");

        choose=scanner.nextInt();

        switch (choose) {
            case 1:
                addMoney();
            case 2:
                program=false;
                System.out.println("Exit program");
        }


        while (program) {

            System.out.println("Amount entered: " + money);
        }

    }

    public void addMoney() {
        System.out.println("Enter the amount you want to deposit...");
        int paymentMade=scanner.nextInt();
        money=money + paymentMade;
        chooseProduct();


    }


    public void chooseProduct() {

        System.out.println("***   Buy product #1   ***");
        System.out.println("***   Buy product #2   ***");
        System.out.println("***   Buy product #3   ***");
        System.out.println("***   Buy product #4   ***");
        System.out.println("***   Buy product #5   ***");

        choose=scanner.nextInt();
        while (true) {
            if (choose >= 1 && choose <= 5) break;

        }

        if (choose == 1) {
            buyCola();
        } else if (choose == 2) {
            buySoda();
        } else if (choose == 3) {
            buySprite();
        } else if (choose == 4) {
            buyWater();
        } else {
            buyMars();
        }
    }


    public void buyCola() {
        for (Product product : products) {
            if (product.getType() == Assortment.COLA) {

                if (product.getCount() > 0) {

                    if (product.getCost() <= money) {
                        System.out.println("You bought...cola");
                        System.out.println("Your change was...: " + (money - product.getCost()));
                        money=0;
                        product.setCount(product.getCount() - 1);
                        return;

                    } else {
                        System.out.println("The amount paid is not enough. Add more!");
                        return;
                    }

                } else {
                    System.out.println("This product is out of stock!");
                    return;
                }
            }
        }
    }

    public void buySoda() {
        for (Product product : products) {
            if (product.getType() == Assortment.SODA) {

                if (product.getCount() > 0) {

                    if (product.getCost() <= money) {
                        System.out.println("You bought...soda");
                        System.out.println("Your change was...: " + (money - product.getCost()));
                        money=0;
                        product.setCount(product.getCount() - 1);
                        return;

                    } else {
                        System.out.println("The amount paid is not enough. Add more!");
                        return;
                    }

                } else {
                    System.out.println("This product is out of stock!");
                    return;
                }
            }
        }
    }

    public void buySprite() {
        for (Product product : products) {
            if (product.getType() == Assortment.SPRITE) {

                if (product.getCount() > 0) {

                    if (product.getCost() <= money) {
                        System.out.println("You bought...Sprite");
                        System.out.println("Your change was...: " + (money - product.getCost()));
                        money=0;
                        product.setCount(product.getCount() - 1);
                        return;

                    } else {
                        System.out.println("The amount paid is not enough. Add more!");
                        return;
                    }

                } else {
                    System.out.println("This product is out of stock!");
                    return;
                }
            }
        }
    }

    public void buyWater() {
        for (Product product : products) {
            if (product.getType() == Assortment.WATER) {

                if (product.getCount() > 0) {

                    if (product.getCost() <= money) {
                        System.out.println("You bought...Water");
                        System.out.println("Your change was...: " + (money - product.getCost()));
                        money=0;
                        product.setCount(product.getCount() - 1);
                        return;

                    } else {
                        System.out.println("The amount paid is not enough. Add more!");
                        return;
                    }

                } else {
                    System.out.println("This product is out of stock!");
                    return;
                }
            }
        }
    }

    public void buyMars() {
        for (Product product : products) {
            if (product.getType() == Assortment.MARS) {

                if (product.getCount() > 0) {

                    if (product.getCost() <= money) {
                        System.out.println("You bought...Mars");
                        System.out.println("Your change was...: " + (money - product.getCost()));
                        money=0;
                        product.setCount(product.getCount() - 1);
                        return;

                    } else {
                        System.out.println("The amount paid is not enough. Add more!");
                        return;
                    }

                } else {
                    System.out.println("This product is out of stock!");
                    return;
                }
            }
        }
    }


    public void getRndAutomat() {

        for (Product product : products) {
            product.setCount(random.nextInt(5) + 15);
        }
    }

    public void printProducts() {

        System.out.println("|--------------------------------------------------|");
        System.out.println("| # | Product name | Product count | Product price |");
        System.out.println("|---+--------------+---------------+---------------|");

        for (int i=0; i < products.size(); i++) {

            System.out.printf("| %s | %-12s |      [%s]     | %-13s |\n",
                    i + 1,
                    products.get(i).getType(),
                    products.get(i).getCount(),
                    products.get(i).getCost());

        }
        System.out.println("|---+--------------+---------------+---------------|");
    }

}

