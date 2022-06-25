package com.company;

import Model.*;
import service.serviceimpll.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" BAARYN KORGUN KELSE 1 BASS ");
        System.out.println(" ID MENEN KORGUN KELSE 2 BAS  ");
        System.out.println(" UDALIT KYLGYN KELSE 3 BASS ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" GRUPPANYN BAARYN KORUSH UZHUN 4 BASS");
        System.out.println("GRUPPANY ATY MN KORUSH UCHUN 5 BASS");
        System.out.println(" GRUPPANY OSHURUSH UCHUN 6 BASS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("KURSTUN BAARYN KORUSH UCHUN 7 BASS");
        System.out.println(" KURSTU ATY MN KORUSH UCHUN 8 BASS");
        System.out.println(" KURSTU UDALIT KYLYSH YCHYN 9 BASS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" STUDENNTERDI BAARYN KORUSH UCHUN 10 BASS ");
        System.out.println(" STUDENNTERDI JASHY MN KORUSH UCHUN 11 BASS ");
        System.out.println("STUDENNTI UDALIT KYLYSH UCHUN 12 BASS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" BARDYK MUGALIMDERDI KORUSH UCHUN 13 BASS");
        System.out.println(" MUGALIMDERDI JASHY BOIUNCHA KORUSH UCHUN 14 BASS");
        System.out.println(" MUGALIMDI OCHURUSH UCHUN 15 BASS  ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        List<Student> student5 = new ArrayList<>(List.of(                   //Group english
                new Student("Bekbol", 33),
                new Student("Jalyn", 20),
                new Student("Rahim", 19)));
        List<Ticher> ticher5 = new ArrayList<>(List.of(
                new Ticher("Aizada", 22),
                new Ticher("Nurbolot", 27)));
        List<Group> group5 = new ArrayList<>(List.of(new Group("English", student5)));
        List<Kurs> list5 = new ArrayList<>(List.of(new Kurs("Til Aakademia", ticher5, group5)));


        List<Student> studentList = new ArrayList<>(List.of(                   // JAVA 6 GROUP
                new Student("Dastan", 20),
                new Student("Nurdin", 20),
                new Student("Jaulan", 22)));
        List<Student> students = new ArrayList<>(List.of(                   // JAVA 5 GROUP
                new Student("Ulan", 25),
                new Student("Kuba", 23)));
        List<Student> students1 = new ArrayList<>(List.of(                     //JS GROUP
                new Student("Kamchy", 18),
                new Student("Asan", 19)));

        List<Ticher> ticherList = new ArrayList<>(List.of(               // java 6 mentor
                new Ticher("Aijamal", 26),
                new Ticher("Maksat", 30),
                new Ticher("Muhamed", 23)));
        List<Ticher> ticherList1 = new ArrayList<>(List.of(               // java 5 mentor
                new Ticher("Aijan", 28),
                new Ticher("Beksultan", 19)));
        List<Ticher> ticherList2 = new ArrayList<>(List.of(
                new Ticher("Nursultan", 24),
                new Ticher("Shamsy", 24)));


        List<Group> groupList = new ArrayList<>(List.of(
                new Group("Java 6", studentList),
                new Group("JavaSkript 6", students1),
                new Group("Java 5", students)));


        List<Kurs> kursList = new ArrayList<>(List.of(
                new Kurs(" Java  ", ticherList, groupList),
                new Kurs(" Java Skript ", ticherList2, groupList)));

        List<Company> companyList = new ArrayList<>(List.of(
                new Company(1, "Peaksoft", kursList),
                new Company(2, "English", list5)));

        CompanyServiceImpl companyService = new CompanyServiceImpl();

        GroupServiceImpl groupService = new GroupServiceImpl();

        KursServiceImpl kursService = new KursServiceImpl();

        StutentServiceImpl stutentService = new StutentServiceImpl();
        TicherServiceImpl ticherService = new TicherServiceImpl();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();

            switch (a) {
                case 1:

                    companyService.baarychyksyn(companyList);
                    break;
                case 2:

                    companyService.idMethod(companyList);
                    break;
                case 3:
                    companyService.companyDelete(companyList);
                    break;
                case 4:
                    groupService.baarychyksyn(groupList);
                    break;
                case 5:
                    groupService.idMethod(groupList);
                    break;
                case 6:
                    groupService.companyDelete(groupList);
                    break;
                case 7:
                    kursService.baarychyksyn(kursList);
                    break;
                case 8:
                    kursService.idMethod(kursList);
                    break;
                case 9:
                    kursService.companyDelete(kursList);
                    break;
                case 10:
                    stutentService.baarychyksyn(studentList);
                    break;
                case 11:
                    stutentService.idMethod(studentList);

                    break;
                case 12:
                    stutentService.companyDelete(studentList);
                    break;
                case 13:
                    ticherService.baarychyksyn(ticherList);
                    break;
                case 14:
                    ticherService.idMethod(ticherList);
                    break;
                case 15:
                    ticherService.companyDelete(ticherList);

                    break;
                default:
                    System.out.println(" BAR NERSENI SURASAN EI ");

            }
        }
    }
}