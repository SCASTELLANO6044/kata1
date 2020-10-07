
package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author scast
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Sergio Castellano",LocalDate.of(2000, Month.FEBRUARY, 10));
        System.out.println(person.getName()+" "+person.getAge());
    }
    
}
