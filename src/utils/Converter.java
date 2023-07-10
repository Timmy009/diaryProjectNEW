package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Converter {
    public static String convertDate (LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy").format(localDateTime);
    }


    public static String convertTime (LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("hh/mm/ss a").format(localDateTime);
    }
}
