package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex1 {
  public static void main(String[] args) {
    String s = "Hello";

    System.out.println("before " + s);
    String s1 = s.concat(" world!");
    System.out.println("after " + s);
    System.out.println("after " + s1);

    LocalDate today = LocalDate.now();
    System.out.println("before " + today);
    LocalDate yesterday = today.minusDays(1);
    System.out.println("after " + today);
    System.out.println("after " + yesterday);

    // cannot ask about non-existent fields!!!
//    long x = today.get(ChronoField.HOUR_OF_DAY);

//    DateTimeFormatter form = DateTimeFormatter.ISO_DATE;
    DateTimeFormatter form = DateTimeFormatter.ofPattern(
        "' today is    'dd/MMMM/yyyyy");
//    System.out.println(form); formatter converts
    System.out.println(form.format(today));
    System.out.println(form.format(yesterday));
  }
}
