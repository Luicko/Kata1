package kata1;

import java.util.Date;

public class KATA1 {

    public static void main(String[] args) {
        Person person = new Person("Nayara", new Date(96,8,16));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
