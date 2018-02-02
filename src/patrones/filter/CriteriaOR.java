package patrones.filter;

import java.util.List;

public class CriteriaOR implements ICriteria {

    private ICriteria firstCriteria;
    private ICriteria secondCriteria;

    public CriteriaOR(ICriteria firstCriteria, ICriteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> persons) {
        List<Employee> firstCriteriaItems  = firstCriteria.meetCriteria(persons);
        List<Employee> secondCriteriaItems = secondCriteria.meetCriteria(persons);

        for(Employee person : secondCriteriaItems) {
            if(!firstCriteriaItems.contains(person))
                firstCriteriaItems.add(person);
        }

        return firstCriteriaItems;
    }
}
