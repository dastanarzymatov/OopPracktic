package service.serviceimpll;

import Model.Student;
import service.StudentInterfice;

import java.util.List;
import java.util.Scanner;

public class StutentServiceImpl implements StudentInterfice {
    Scanner scanner= new Scanner( System.in);

    @Override
    public void baarychyksyn(List<Student> studentList) {
studentList.forEach(System.out::println);
    }

    @Override
    public void idMethod(List<Student> studentList) {
        studentList.stream().map(Student::getAge).forEach(System.out::println);
        int a= scanner.nextInt();
        studentList.stream().filter(x->x.getAge()==a).forEach(System.out::println);

    }

    @Override
    public void companyDelete(List<Student> studentList) {
        studentList.stream().map(Student::getName).forEach(System.out::println);
        String a= scanner.nextLine();
       studentList.removeIf(x -> x.getName().equals(a));
        studentList.forEach(System.out::println);

    }
}
