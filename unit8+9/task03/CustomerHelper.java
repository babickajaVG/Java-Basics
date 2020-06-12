package unit08;

import java.util.ArrayList;
import java.util.List;

public final class CustomerHelper {

    static Customers createTestCustomers() {
        Customers customers = new Customers();
        List<Customer> customerList = new ArrayList<>();
        Customer customerOne = new Customer(1, "Ivanov", "Ivan", "Ivanovich", "Minsk", 111, 1);
        customerList.add(customerOne);
        Customer customerTwo = new Customer(2, "Petrov", "Petr", "Petrovich", "Orsha", 222, 2);
        customerList.add(customerTwo);
        Customer customerThree = new Customer(3, "Sidorov", "Andrey", "Andreevich", "Grodno", 333, 3);
        customerList.add(customerThree);
        Customer customerFour = new Customer(4, "Kozlov", "Ivan", "Ivanovich", "Brest", 444, 4);
        customerList.add(customerFour);
        Customer customerFive = new Customer(5, "Ivanov", "Stanislav", "Sergeevich", "Vitebsk", 555, 5);
        customerList.add(customerFive);
        Customer customerSix = new Customer(6, "Ivanova", "Anastasia", "Ivanovna", "Gomel", 666, 6);
        customerList.add(customerSix);
        Customer customerSeven = new Customer(7, "Tishkevich", "Tatyana", "Pavlovna", "Baranovichi", 777, 7);
        customerList.add(customerSeven);
        Customer customerEight = new Customer(8, "Antonovich", "Darya", "Aleksandrovna", "Mogilev", 888, 8);
        customerList.add(customerEight);
        Customer customerNine = new Customer(9, "Laptev", "Eduard", "Alekseevich", "Minsk", 999, 9);
        customerList.add(customerNine);
        customers.setCustomers(customerList);
        return customers;
    }

}
