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
public class Vehicle {
    protected String ma;
    protected String ten;
    protected String hang;
    protected int gia;
    protected String mauSac;
    protected String bienSo;
    protected String trangThai;
    protected int odo;

    public String getTrangThai() {
        return trangThai = checkStatus();
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getOdo() {
        return odo;
    }

    public void setOdo(int odo) {
        this.odo = odo;
    }

    public Vehicle(String ma, String ten, String hang, int gia, String mauSac, String bienSo, String trangThai, int odo) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.mauSac = mauSac;
        this.bienSo = bienSo;
        this.trangThai = trangThai;
        this.odo = odo;
    }



    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma");
        this.ma = sc.nextLine();
        System.out.println("Nhap Ten");
        this.ten = sc.nextLine();
        System.out.println("Nhap Hang");
        this.hang = sc.nextLine();
        System.out.println("Nhap Gia");
        this.gia = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap mau sac");
        this.mauSac = sc.nextLine();
        System.out.println("Nhap bien so xe");
        this.bienSo = sc.nextLine();
        System.out.println("Nhap quang duong da di");
        this.odo = sc.nextInt();
        sc.nextLine();
    }
    public String checkStatus(){
        if (this.odo == 0) {
            return "Moi";
        }else{
            return "Cu";
        }
    }
    public void xuat(){
        System.out.printf("%-20s %-20s %-20s %-20d %-20s %-20s %-20s"+'\n',ma, ten, hang, gia, mauSac, bienSo,getTrangThai());
    }

    public Vehicle() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

}
