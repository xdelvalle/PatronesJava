package patrones.filter;

import java.util.List;

public class CriteriaAND implements ICriteria {

    private ICriteria firstCriteria;
    private ICriteria secondCriteria;

    public CriteriaAND(ICriteria firstCriteria, ICriteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> persons) {
        List<Employee> firstCriteriaPersons = firstCriteria.meetCriteria(persons);
        return secondCriteria.meetCriteria(firstCriteriaPersons);
    }
}
