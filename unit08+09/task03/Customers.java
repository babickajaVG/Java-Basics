package unit08;

import java.util.List;

public class Customers {// старайтесь классы множественным числом не называть

    private List<Customer> customers;

    public Customers() {
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customers=" + customers +
                '}';
    }
}
