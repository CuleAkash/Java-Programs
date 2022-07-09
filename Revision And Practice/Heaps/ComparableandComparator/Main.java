package Heaps.ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Akash", 100));
        students.add(new Student("Kuki", 100));
        students.add(new Student("Amit", 80));
        students.add(new Student("Danish", 70));

        Collections.sort(students, new Comaparator1());//if comparator is declared instead of comparable
        //The list objects passed to the method must implement comparable interface

        students.forEach(System.out::println);

        PriorityQueue<Student> pq = new PriorityQueue<>(new Comaparator1());
        pq.add(new Student("Akash", 50));
        pq.add(new Student("Kuki", 90));
        pq.add(new Student("Amit", 80));
        pq.add(new Student("Danish", 70));

        System.out.println(pq);
    }
}
class Comaparator1 implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {// o1>o2=> +ve => inc.
        // o1>o2 => -ve => dec.
        if(o1.marks==o2.marks)
            return o1.name.compareTo(o2.name);
        else
            return o1.marks - o2.marks;
    }
    
}