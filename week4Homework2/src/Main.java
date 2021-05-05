import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(1,"Muratcan","Karaca",2000,"132345312");

        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(customer);
        //************************************************************************************************************\\
        StarbucksCustomerManager starbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
        starbucks.save(customer);
        starbucks.coffeeOrder(customer);
        starbucks.coffeeOrder(customer);
        starbucks.coffeeOrder(customer);
        
    }
    
    
    
}