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
public class bicycle extends Vehicle{
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public bicycle() {
    }

    public bicycle(String type, String ma, String ten, String hang, int gia, String mauSac, String bienSo, String trangThai, int odo) {
        super(ma, ten, hang, gia, mauSac, bienSo, trangThai, odo);
        this.type = type;
    }
     @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
         System.out.println("Loai xe dap: ");
         this.type = sc.nextLine();
    }
        @Override
   public void xuat(){
       String xe = "Bicycle";
        System.out.printf("%-20s %-20s %-20s %-20d %-20s %-20s %-20s %-20s %-20s"+'\n',ma, ten, hang, gia, mauSac, bienSo,getTrangThai(),xe,type);
    }
}
