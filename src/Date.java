import java.time.LocalDate;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year, 1, 1);
        boolean isLeapYear = localDate.isLeapYear();

        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            System.out.println("Invalid date! Using default: 1/1/2000");
            this.day = 1;
            this.month = 1;
            this.year = 2000;
            return;
        }

        int monthDays;
        switch (month) {
            case 2:
                monthDays = isLeapYear ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                monthDays = 30;
                break;
            default:
                monthDays = 31;
        }

        if (day < 1 || day > monthDays) {
            System.out.println("Invalid date! Using default: 1/1/2000");
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        } else {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Date {" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

    public boolean isLeapYear() {
        return LocalDate.of(year, day, month).isLeapYear();
    }
}
