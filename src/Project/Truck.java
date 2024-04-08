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
public class Truck extends Vehicle{
      protected String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Truck(String engineType, String ma, String ten, String hang, int gia, String mauSac, String bienSo, String trangThai, int odo) {
        super(ma, ten, hang, gia, mauSac, bienSo, trangThai, odo);
        this.engineType = engineType;
    }

    public Truck() {
    }
   @Override
   public void nhap(){
       Scanner sc = new Scanner(System.in);
       super.nhap();
       System.out.println("Nhap loai nhien lieu");
       this.engineType = sc.nextLine();
   }
     @Override
   public void xuat(){
       String xe = "Truck";
         System.out.printf("%-20s %-20s %-20s %-20d %-20s %-20s %-20s %-20s %-20s"+'\n',ma, ten, hang, gia, mauSac, bienSo,getTrangThai(),xe,engineType);
    }
}
