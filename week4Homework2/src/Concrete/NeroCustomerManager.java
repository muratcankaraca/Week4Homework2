package Concrete;

import Abstracts.BaseCustomerManager;
import Abstracts.OrderService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager implements OrderService {

    @Override
    public void save(Customer customer) {
        System.out.println("Saved to Nero db. : "+customer.getFirstName());
    }


    @Override
    public void coffeeOrder(Customer customer) {
        System.out.println("Sold to : "+customer.getFirstName());
    }
}