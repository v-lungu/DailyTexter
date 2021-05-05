package org.example;

import org.w3c.dom.CDATASection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DailyText {

    public static void main (String[] args) {
        System.out.println(new DailyText().getTodayText());
    }

    private String getTodayText() {
        LocalDate today = LocalDate.now(Config.MY_TIMEZONE);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd");

        String todayDate = today.format(dateFormatter);

        return String.format("Good Morning! It's " + todayDate);
    }
}
