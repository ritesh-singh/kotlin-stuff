package interoperability;

import classes.CustomerKotlin;
import classes.Status;

import java.io.IOException;

public class TalkingToKotlin {

    public void loadStatus(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStatistics("fileName");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Max", "max@gmail.com");
        System.out.println(customerKotlin.getId());
        System.out.println(customerKotlin.getName());
        System.out.println(customerKotlin.getEmail());


        System.out.println(customerKotlin.somProperty);

        customerKotlin.changeStatus(Status.Current);

        customerKotlin.changeStatus();

        customerKotlin.preferential();

    }
}
