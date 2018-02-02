package patrones.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements ICriteria {

    @Override
    public List<Employee> meetCriteria(List<Employee> persons) {
        List<Employee> femalePersons = new ArrayList<Employee>();

        for(Employee person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE"))
                femalePersons.add(person);
        }

        return femalePersons;
    }
}
