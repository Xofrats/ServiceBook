import java.util.ArrayList;
import java.util.Arrays;

public class GaryGarage {

    public static void main(String[] args){
        Date one = new Date(5, 8, 2018);
        Date two = new Date(17, 3, 2017);
        Date three = new Date(21, 11, 2016);

        Service first = new Service(10000, one);
        Service second = new Service(5000, two);

        ArrayList<Service> fordServices = new ArrayList<>();
        fordServices.add(second);
        fordServices.add(first);

        ServiceBook ford = new ServiceBook(fordServices);
        System.out.println(ford.getService(0));
        System.out.println(ford.getNumberOfServices());
        System.out.println(ford.hasServiceOnDate(one));
        System.out.println(ford.hasServiceOnDate(three));
        System.out.println(ford.getDateOfLastService());
        int[] test = ford.getAllServiceMileages();

     String listString = Arrays.toString(test);
        System.out.println(listString);
        System.out.println(fordServices);
    }
}
