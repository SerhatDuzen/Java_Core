package day34_Inheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Student {
String name;
static int count;
    public Student(String name) {
        this.name = name;
    }

    public static void displayMsg () {

        count++;     // line n1
        System.out.println("Welcome "+"Visit Count: "+count); // line n2
    }
    public static void main(String[] args) {

        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb); /// AB C C
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
