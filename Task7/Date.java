package exercise7;

public class Date {
    private Byte day;
    private Byte month;
    private  Short year;

    public Date (Byte day, Byte month, Short year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Byte getDay() {
        return day;
    }

    public Byte getMonth() {
        return month;
    }

    public Short getYear() {
        return year;
    }

    public void setDay(Byte day) {
        this.day = day;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public String toString () {
        String Day = Integer.toString(day);
        String Month = Integer.toString(month);
        String Year = Integer.toString(year);

        if (day == 1) {
            Day = "0" + Day;
        }
        if (month == 1) {
            Month = "0" + Month;
        }
            Year = "21" + Year;
        return Day + "/" + Month + "/" + Year;
    }
}
