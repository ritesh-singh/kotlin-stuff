package interoperability;

import classes.CustomerKotlin;
import classes.CustomerKotlinKt;
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

        // Invoking top level functions from kotlin
//        TopLevelFunctionsKt.prefix("some", "value");
//
//        TopLevelFunctionsKt.getCopyRightYear();
//
//        int copyRightMonth = TopLevelFunctionsKt.copyRightMonth;

        // Annotation in the file does the below trick, changing of name
        UtilityClass.prefix("some", "value");

        UtilityClass.getCopyRightYear();

        int copyRightMonth = UtilityClass.copyRightMonth;


        // Calling extensions function
        CustomerKotlinKt.extension(customerKotlin);

    }
}
