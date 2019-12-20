package com.stackroute.pe5;

import java.util.*;

public class StudentSorter implements Comparator<Student> {
    public int compare(Student stu1, Student stu2) {
        int ageCompare = stu2.getAge() - stu1.getAge();
        int idCompare = stu1.getId() - stu2.getId();
        int nameCompare = stu1.getName().compareTo(stu2.getName());
        if (ageCompare == 0) {
            if (nameCompare == 0) {
                return idCompare;
            } else {
                return nameCompare;
            }
        } else {
            return ageCompare;
        }
    }

    public List<Student> getSortedList(List<Student> myList) {
        List<Student> ls = new ArrayList<>();
        ls = myList;
        Collections.sort(ls, new StudentSorter());
        return ls;
    }
}
