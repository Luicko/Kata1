package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KATA1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949, 9, 24);
        
        Person person = new Person("Vlad", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
