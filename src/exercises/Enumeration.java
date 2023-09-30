package exercises;

public class Enumeration {

    // Enumeration with months
    enum Months{
        JANUARY, FEBRUARY, MARCH, APRIL,
        MAY, JUNE, JULY, AUGUST, SEPTEMBER,
        OCTOBER, NOVEMBER, DECEMBER
    }

    public void enumeration() {

        for(Months months: Months.values()) {
            System.out.println(months.name());
        }
    }
}
