package introduction.interoperability;

import introduction.classes.CustomerJava;

import java.util.List;

public interface CustomerRepository {
    CustomerJava getById(int id);

    List<CustomerJava> getAll();
}
