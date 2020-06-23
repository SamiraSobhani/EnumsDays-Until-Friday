package com.EnumsDaysUntilFriday.EnumsDaysUntilFriday;

public class daysUntilFriday {

    weekDays day;

    public int calcDaysUntilFriday(weekDays day) {

        switch (day) {
            case MONDAY:
                return 4;
            case TUESDAY:
                return 3;
            case WEDNESDAY:
                return 2;
            case THURSDAY:
                return 1;
            case FRIDAY:
                return 0;
            case SATURDAY:
                return 6;
            case SUNDAY:
                return 5;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
