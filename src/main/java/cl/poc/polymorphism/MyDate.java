package cl.poc.polymorphism;

import java.io.Serializable;
import java.util.Objects;

public class MyDate implements Serializable {

    private int day;

    private int month;

    private int year;


    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day &&
                month == myDate.month &&
                year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MyDate{");
        sb.append("day=").append(day);
        sb.append(", month=").append(month);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
