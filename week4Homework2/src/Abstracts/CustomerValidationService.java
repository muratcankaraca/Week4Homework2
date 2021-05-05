package Abstracts;

import Entities.Customer;

public interface CustomerValidationService {
    public boolean isRealCustomer(Customer customer);
}