package patrones.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaRetire implements ICriteria {

    @Override
    public List<Employee> meetCriteria(List<Employee> persons) {
        List<Employee> singlePersons = new ArrayList<Employee>();

        for(Employee person : persons) {
            if(person.getRetireStatus().equalsIgnoreCase("YES"))
                singlePersons.add(person);
        }

        return singlePersons;
    }
}
