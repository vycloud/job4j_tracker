package ru.job4j.pojo;

import java.time.LocalDate;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Nickolay Vasilievich");
        student.setGroup("J2023");
        student.setAdmissionDate(LocalDate.of(2023, 9, 1));
        System.out.printf("Student %s studies in group %s, admission date is %s.",
                student.getFullName(), student.getGroup(), student.getAdmissionDate());
    }
}
