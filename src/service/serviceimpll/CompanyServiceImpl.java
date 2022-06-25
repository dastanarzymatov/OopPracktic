package service.serviceimpll;

import Model.Company;
import service.CompanyInterfice;

import java.util.List;
import java.util.Scanner;

public class CompanyServiceImpl implements CompanyInterfice {

    @Override
    public void baarychyksyn(List<Company> companyList) {

                companyList.forEach(System.out::println);


    }

    @Override
    public void idMethod(List<Company> companyList) {
        companyList.stream().map(Company::getId).forEach(System.out::println);
        Scanner scanner=new Scanner(System.in);

        int a= scanner.nextInt();
       companyList.stream().filter(x->x.getId()==a).forEach(System.out::println);

    }

    @Override
    public void companyDelete(List<Company> companyList) {
        companyList.stream().map(Company::getName).forEach(System.out::println);
        Scanner scanner= new Scanner( System.in);

        String b=scanner.nextLine();
        for (Company com:companyList) {
            if (b.equals(com.getName())){
                companyList.remove(com);
            }

        }
        companyList.forEach(System.out::println);

    }
}
