package com.company;
import java.time.LocalDate;

/**
 * Created by Andrew on 23/06/2017.
 */
public class Calender {

    /**
     * Gets day of the week according to the current date.
     * Day of week to converted into a string and a comparison done to check if the current day is Wednesday.
     * If current day is wednesday returns true, if not wednesday then returns false.
     */
    protected boolean CheckDiscountValid(){
        LocalDate currentDate = LocalDate.now();
        java.time.DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        if(dayOfWeek.toString() == "WEDNESDAY"){
            return true;
        }else
            return false;
    }

}
