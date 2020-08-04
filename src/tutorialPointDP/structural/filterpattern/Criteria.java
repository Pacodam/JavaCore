package tutorialPointDP.structural.filterpattern;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
