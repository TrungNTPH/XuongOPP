/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Motorbike extends Vehicle{
    protected String engineType;
    protected String power;

    public Motorbike() {
    }

    public Motorbike(String engineType, String power, String ma, String ten, String hang, int gia, String mauSac, String bienSo, String trangThai, int odo) {
        super(ma, ten, hang, gia, mauSac, bienSo, trangThai, odo);
        this.engineType = engineType;
        this.power = power;
    }
       @Override
   public void nhap(){
       Scanner sc = new Scanner(System.in);
       super.nhap();
       System.out.println("Nhap loai nhien lieu");
       this.engineType = sc.nextLine();
       System.out.println("Nhap ma luc");
       this.power = sc.nextLine();
   }
       @Override
   public void xuat(){
       String xe = "Mortobike";
         System.out.printf("%-20s %-20s %-20s %-20d %-20s %-20s %-20s %-20s %-20s %-20s"+'\n',ma, ten, hang, gia, mauSac, bienSo,getTrangThai(),xe,engineType,power);
    }
}
