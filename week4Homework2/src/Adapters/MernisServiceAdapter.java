package Adapters;

import Abstracts.CustomerValidationService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerValidationService {
    @Override
    public boolean isRealCustomer(Customer customer) {
        return true;
    }
}