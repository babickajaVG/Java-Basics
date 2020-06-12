package unit08;

import java.util.ArrayList;
import java.util.List;

public class CustomerUtil {

    List<Customer> findAllBetween(List<Customer> customers, int from, int to) {
        if (customers == null || customers.isEmpty()) {
            return null;
        } else {
            List<Customer> result = new ArrayList<>();
            for (Customer customer : customers) {
                int cardId = customer.getCardId();
                if (from < cardId && to > cardId) {
                    result.add(customer);
                }
            }
            return result;
        }
    }

    void println(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
