package patrones.filter;

import java.util.List;

public interface ICriteria {
    public List<Employee> meetCriteria(List<Employee> persons);
}
