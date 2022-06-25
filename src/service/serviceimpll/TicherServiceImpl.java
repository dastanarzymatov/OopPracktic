package service.serviceimpll;

import Model.Ticher;
import service.TicherInterfice;

import java.util.List;
import java.util.Scanner;

public class TicherServiceImpl implements TicherInterfice {
    Scanner scanner=new Scanner(System.in)
;    @Override
    public void baarychyksyn(List<Ticher> ticherList) {
ticherList.forEach(System.out::println);
    }

    @Override
    public void idMethod(List<Ticher> ticherList) {
    ticherList.stream().map(Ticher::getAge).forEach(System.out::println);
    int a= scanner.nextInt();
        ticherList.stream().filter(x->x.getAge()==a).forEach(System.out::println);

    }

    @Override
    public void companyDelete(List<Ticher> ticherList) {
    ticherList.stream().map(Ticher::getName).forEach(System.out::println);
    String a=scanner.nextLine();
        ticherList.removeIf(x -> x.getName().equals(a));
        ticherList.forEach(System.out::println);

    }
}
