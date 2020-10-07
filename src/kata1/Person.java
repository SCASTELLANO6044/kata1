
package kata1;

import java.time.LocalDate;

/**
 *
 * @author Sergio Castellano
 */
public class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate BirthDate) {
        this.name = name;
        this.birthDate = BirthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    public int getAge(){
        return toYears(LocalDate.now().toEpochDay()- birthDate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) ((int) days/365.25);
    }
}
