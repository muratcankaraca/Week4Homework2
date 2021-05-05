  
package Concrete;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerValidationService;
import Abstracts.OrderService;
import Abstracts.StarOrderManager;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements OrderService{

    CustomerValidationService customerValidationService;
    StarOrderManager starOrderManager = new StarOrderManager() ;

    public StarbucksCustomerManager(CustomerValidationService customerValidationService){
        this.customerValidationService = customerValidationService;
    }

    @Override
    public void save(Customer customer) {
        if (customerValidationService.isRealCustomer(customer)){
            System.out.println("Saved to Starbucks db : "+customer.getFirstName());
        }
        else{
            System.out.println("Invalid person. Registration failed.");
        }
    }


    @Override
    public void coffeeOrder(Customer customer) {
        starOrderManager.coffeeOrder(customer);
    }
}