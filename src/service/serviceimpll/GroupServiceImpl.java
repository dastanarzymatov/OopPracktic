package service.serviceimpll;

import Model.Company;
import Model.Group;
import service.GroupInterfice;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class GroupServiceImpl implements GroupInterfice {
    @Override
    public void baarychyksyn(List<Group> groupList) {
        groupList.forEach(System.out::println);
    }

    @Override
    public void idMethod(List<Group> groupList) {
        groupList.stream().map(Group::getName).forEach(System.out::println);
        Scanner scanner=new Scanner(System.in);

        String a= scanner.nextLine();
        groupList.stream().filter(x->x.getName().equals(a)).forEach(System.out::println);
    }

    @Override
    public void companyDelete(List<Group> groupList) {
        groupList.stream().map(Group::getName).forEach(System.out::println);
        Scanner scanner= new Scanner( System.in);
        String b=scanner.nextLine();
        for (Group gr:groupList) {
            if (b.equals(gr.getName())){
                groupList.remove(gr);
            }

        }
       groupList.forEach(System.out::println);
    }
}
