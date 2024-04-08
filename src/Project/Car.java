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
public class Car extends Vehicle{
   protected String engineType;
   protected int seats;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car(String engineType, int seats, String ma, String ten, String hang, int gia, String mauSac, String bienSo, String trangThai, int odo) {
        super(ma, ten, hang, gia, mauSac, bienSo, trangThai, odo);
        this.engineType = engineType;
        this.seats = seats;
    }

    public Car() {
    }
   @Override
   public void nhap(){
       Scanner sc = new Scanner(System.in);
       super.nhap();
       System.out.println("Nhap loai nhien lieu");
       this.engineType = sc.nextLine();
       System.out.println("Nhap so luong cho ngoi");
       this.seats = sc.nextInt();
   }
   @Override
   public void xuat(){
       String xe = "Car";
         System.out.printf("%-20s %-20s %-20s %-20d %-20s %-20s %-20s %-20s %-20s %-20s"+'\n',ma, ten, hang, gia, mauSac, bienSo,getTrangThai(),xe,engineType,seats);
    }
   
}
