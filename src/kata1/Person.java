/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;

/**
 *
 * @author scast
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
