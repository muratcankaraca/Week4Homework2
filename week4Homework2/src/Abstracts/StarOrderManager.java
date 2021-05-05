package Abstracts;

import Entities.Customer;

public class StarOrderManager implements OrderService{
    public static int starCounter=0;
    @Override
    public void coffeeOrder(Customer customer) {
        System.out.println("Sold to : "+customer.getFirstName()+" You earned 1 star for your order.");
        starCounter++;
        System.out.println("Your stars : "+starCounter);
    }
}