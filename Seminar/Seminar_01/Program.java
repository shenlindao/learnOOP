package Seminar.Seminar_01;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import Seminar.Seminar_02.Ex_02.Actor;
import Seminar.Seminar_02.Ex_02.Human;
import Seminar.Seminar_02.Ex_02.Order;

public class Program {

  public static void main(String[] args) {

    Product product1 = new Food("Twix", 1.6, 80, 0, new GregorianCalendar(2023, 10, 10, 0, 0));
    Product product2 = new Food("Mars", 1.8, 90, 0, new GregorianCalendar(2023, 10, 19, 0, 0));
    Product product3 = new Food("Snicers", 2.5, 60, 15, new GregorianCalendar(2023, 10, 29, 0, 0));
    Product product4 = new Beverage("Coca-Cola", 0.3, 100, 0, new GregorianCalendar(2023, 11, 05, 0, 0));
    Product product5 = new Beverage("Fanta", 0.5, 110, 5, new GregorianCalendar(2023, 12, 07, 0, 0));
    Product product6 = new HotBeverage("Coffee", 0.4, 90, 200, 20, new GregorianCalendar(2023, 8, 01, 0, 0));
    Product product7 = new HotBeverage("Tea", 1.2, 85, 500, 1, new GregorianCalendar(2023, 8, 01, 0, 0));

    HotBeverageAutomat list = new HotBeverageAutomat();
    List<Product> myList = new ArrayList<>();

    myList.add(product1);
    myList.add(product2);
    myList.add(product3);
    myList.add(product4);
    myList.add(product5);
    myList.add(product6);
    myList.add(product7);
    list.initProduct(myList);

    String name;
    double volume;
    int temperature;

    name = "Mars";
    System.out.println(list.getProduct(name).toString());

    name = "Twix";
    System.out.println(list.getProduct(name).toString());

    name = "Coca-Cola";
    System.out.println(list.getProduct(name).toString());

    name = "Fanta";
    System.out.println(list.getProduct(name).toString());

    name = "Coffee";
    volume = 0.4;
    temperature = 90;
    System.out.println(list.getProduct(name, volume, temperature).toString());

    name = "Tea";
    volume = 1.2;
    temperature = 85;
    System.out.println(list.getProduct(name, volume, temperature).toString());


    List<String> orderList = new ArrayList<>();
    orderList.add(list.getProduct(name).toString());
    Human human = new Human("Ivan", true, true, 500.5);
    human.findNearestAutomat();
    human.makeOrder(orderList);
  }
}
