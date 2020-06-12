package unit08;

import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Customers customers = CustomerHelper.createTestCustomers();
        CustomerUtil customersUtil = new CustomerUtil();

        System.out.println("Get all :");
        customersUtil.println(customers.getCustomers());

        Comparator<Customer> customerComparator = new CustomerSurnameComparator().thenComparing(new CustomerNameComparator()).thenComparing(new CustomerPatronymicComparator());
        customers.getCustomers().sort(customerComparator);
        System.out.println("Get all with sort by FIO :");
        customersUtil.println(customers.getCustomers());

        System.out.println("Get all where card between :");
        List<Customer> result = customersUtil.findAllBetween(customers.getCustomers(), 0, 443);
        customersUtil.println(result);

    }
}
