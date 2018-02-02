package patrones.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements ICriteria {

    @Override
    public List<Employee> meetCriteria(List<Employee> persons) {
        List<Employee> malePersons = new ArrayList<Employee>();

        for(Employee person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE"))
                malePersons.add(person);
        }

        return malePersons;
    }
}
