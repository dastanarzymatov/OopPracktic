package service.serviceimpll;

import Model.Kurs;
import service.KursInterfice;

import java.util.List;
import java.util.Scanner;

public class KursServiceImpl implements KursInterfice {
    @Override
    public void baarychyksyn(List<Kurs> kurs) {
kurs.forEach(System.out::println);
    }

    @Override
    public void idMethod(List<Kurs> kurs) {
        kurs.stream().map(Kurs::getName).forEach(System.out::println);
        Scanner scanner= new Scanner(System.in);
        String st=scanner.nextLine();
        kurs.stream().filter(x->x.getName().equals(st)).forEach(System.out::println);

    }

    @Override
    public void companyDelete(List<Kurs> kurs) {
        kurs.stream().map(Kurs::getName).forEach(System.out::println);
        Scanner scanner=new Scanner(System.in);
        String sr=scanner.nextLine();
       kurs.removeIf(x -> x.getName().equals(sr));
        kurs.forEach(System.out::println);

    }
}
