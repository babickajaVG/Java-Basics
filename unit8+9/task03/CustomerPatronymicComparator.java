package unit08;

import java.util.Comparator;

public class CustomerPatronymicComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getPatronymic().compareTo(o2.getPatronymic());
    }

}
