package patrones.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Patrón Filter: Filtra objetos usando diferentes criterios
 *
 * http://www.java2s.com/Tutorials/Java/Java_Design_Patterns/0080__Java_Filter_Pattern.htm
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> persons = new ArrayList<Employee>();

        persons.add(new Employee("Tom", "Male", "YES"));
        persons.add(new Employee("Jack", "Male", "NO"));
        persons.add(new Employee("Jane", "Female", "NO"));
        persons.add(new Employee("Diana", "Female", "YES"));
        persons.add(new Employee("Mike", "Male", "NO"));
        persons.add(new Employee("Bob", "Male", "YES"));

        ICriteria male = new CriteriaMale();
        ICriteria female = new CriteriaFemale();
        ICriteria retire = new CriteriaRetire();
        ICriteria retireMale = new CriteriaAND(retire, male);
        ICriteria retireOrFemale = new CriteriaOR(retire, female);
        ICriteria retireOrMale = new CriteriaOR(retire, male);


        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));
        System.out.println();

        System.out.println("Females:");
        printPersons(female.meetCriteria(persons));
        System.out.println();

        System.out.println("Retire:");
        printPersons(retire.meetCriteria(persons));
        System.out.println();


        System.out.println("Retire Males:");
        printPersons(retireMale.meetCriteria(persons));
        System.out.println();

        System.out.println("Retire or Females:");
        printPersons(retireOrFemale.meetCriteria(persons));
        System.out.println();

        System.out.println("Retire or Males:");
        printPersons(retireOrMale.meetCriteria(persons));
        System.out.println();
    }

    public static void printPersons(List<Employee> persons) {
        for (Employee person : persons) {
            System.out.println(person);
        }
    }
}


