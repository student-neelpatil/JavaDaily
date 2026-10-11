
public class Date {

    public int day;
    private int month;
    private int year;

    public Date(int day) {
        this(day, 1);
        System.out.println("Single Para Ctor");
    }

    public Date(int day, int month) {
        this(day, month, 2026);
        System.out.println("Dual Para Ctor");
    }

    public Date(int day, int month, int year) {
        System.out.println("Three Para Ctor");
        setDate(day, month, year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int day, int month, int year) {

        this.year = year;

        if (month < 1 || month > 12)
            this.month = 1;
        else
            this.month = month;

        int maxDays = getMaxDays(year, this.month);

        if (day < 1 || day > maxDays)
            this.day = 1;
        else
            this.day = day;
    }

    public int getMaxDays(int y, int m) {

        if (m == 4 || m == 6 || m == 9 || m == 11)
            return 30;

        if (m == 2) {

            if (y % 400 == 0 ||
                (y % 4 == 0 && y % 100 != 0))
                return 29;

            return 28;
        }

        return 31;
    }

    public void addDays(int daysToAdd) {

        while (daysToAdd > 0) {

            day++;

            if (day > getMaxDays(year, month)) {

                day = 1;
                month++;

                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

            daysToAdd--;
        }
    }

    public void addMonth(int monthsToAdd) {

        while (monthsToAdd > 0) {

            int currentMaxDays = getMaxDays(year, month);

            boolean isEndOfMonth = (day == currentMaxDays);

            month++;

            if (month > 12) {
                month = 1;
                year++;
            }

            int newMaxDays = getMaxDays(year, month);

            if (isEndOfMonth || day > newMaxDays)
                day = newMaxDays;

            monthsToAdd--;
        }
    }

    public void addYear(int yearsToAdd) {

        year = year + yearsToAdd;

        if (month == 2 && day == 29) {

            if (!(year % 400 == 0 ||
                  (year % 4 == 0 && year % 100 != 0))) {

                day = 28;
            }
        }
    
}
}