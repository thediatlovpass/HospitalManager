public class Hospital {

    private final int MAXAMOUNTOFWORKERS = 3;
    Person[] people = new Person[MAXAMOUNTOFWORKERS];
    private int currentWorkers;

    public void add(Person person) {
        if (currentWorkers < MAXAMOUNTOFWORKERS) {
            people[currentWorkers] = person;
            currentWorkers++;
        } else
            System.out.println("Osiągnięto maksymalną liczbę pracowników !!!");
    }

    public void getInfo() {
        for (Person person : people) {
            if (person != null) {
                String info = person.getInfo();
                System.out.println(info);
            }
        }
    }
}
