/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Main {

    ArrayList<Vehicle> ds = new ArrayList<>();

    public void yc1() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Moi ban nhap so xe: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin xe " + (i + 1) + " : ");
            System.out.println("1-Car 2-Bus 3-MotorBike 4-Truck 5-Bicycle");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    Car xe = new Car();
                    xe.nhap();
                    ds.add(xe);
                    break;
                case 2:
                    Bus xe1 = new Bus();
                    xe1.nhap();
                    ds.add(xe1);
                    break;
                case 3:
                    Motorbike xe2 = new Motorbike();
                    xe2.nhap();
                    ds.add(xe2);
                    break;
                case 4:
                    Truck xe4 = new Truck();
                    xe4.nhap();
                    ds.add(xe4);
                    break;
                case 5:
                    bicycle xe5 = new bicycle();
                    xe5.nhap();
                    ds.add(xe5);
                    break;
                default:
                    System.out.println("Chon 1 trong 5 loai xe");
            }
        }
    }

    public void yc2() {
        for (Vehicle d : ds) {
            d.xuat();
        }
    }

    public void y3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma xe: ");
        String ma = sc.nextLine();
        for (Vehicle d : ds) {
            if (d.getMa().equals(ma)) {
                d.xuat();
                break;
            }
        }
    }

    public void y4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma xe: ");
        String ma = sc.nextLine();
        ds.removeIf(d -> d.getMa().equals(ma));
    }

    public void y5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma xe: ");
        String ma = sc.nextLine();
        for (Vehicle d : ds) {
            if (d.getMa().equals(ma)) {
                d.nhap();
            }
        }
    }

    public void y6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tien thap nhat");
        int min = sc.nextInt();
        System.out.println("Nhap gia tien cao nhat");
        int max = sc.nextInt();
        for (Vehicle d : ds) {
            if (d.getGia() > min && d.getGia() < max) {
                d.xuat();
            }
        }

    }

    public void y7() {
        Comparator<Vehicle> xe = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        };
        Collections.sort(ds, xe);
        yc2();
    }

    public void y8() {
        Comparator<Vehicle> xe = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return Integer.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(ds, xe);
        yc2();
    }

    public void y8a() {
        Comparator<Vehicle> xe = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return Integer.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(ds, xe);
    }

    public void y9() {
        y8a();
        Collections.reverse(ds);
        if (ds.size() <= 5) {
            for (Vehicle d : ds) {
                d.xuat();
            }

        } else {
            for (int i = 0; i < 5; i++) {
                ds.get(i).xuat();
            }
        }
    }
    public void y10(){
        Collections.shuffle(ds);
        yc2();
    }

    public static void main(String[] args) {
        int choice;
        Main th = new Main();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println('\n' + "-------------------------------");
            System.out.println("1. Nhap cac xe");
            System.out.println("2. Xuat cac xe");
            System.out.println("3. Tim kiem theo ma xe");
            System.out.println("4. Xoa xe theo ma nhap");
            System.out.println("5. Tim kiem ma xe theo ma nhap vao va cap nhap thong tin");
            System.out.println("6. Tim xe theo khoang gia");
            System.out.println("7. Xap xep xe theo ten");
            System.out.println("8. Xap xep xe theo gia");
            System.out.println("9. 5 xe co gia cao nhat");
            System.out.println("10. Ngau nhien");
            System.out.println("0. Thoat");
            System.out.println("-------------------------------");
            System.out.println("Chon chuc nang: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    th.yc1();
                    break;
                case 2:
                    th.yc2();
                    break;
                case 3:
                    th.y3();
                    break;
                case 4:
                    th.y4();
                    break;
                case 5:
                    th.y5();
                    break;
                case 6:
                    th.y6();
                    break;
                case 7:
                    th.y7();
                    break;
                case 8:
                    th.y8();
                    break;
                case 9:
                    th.y9();
                    break;
                case 10:
                    th.y10();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh");
                    break;
                default:
                    System.out.println("Moi ban chon 0-9");
            }

        } while (choice != 0);
    }
}
