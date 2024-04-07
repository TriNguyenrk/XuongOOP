/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.xuongoop;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class View_Main {

    public static void main(String[] args) {
        SinhVien_Service svs = new SinhVien_Service();
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("\n\n----------------MENU-----------");
            System.out.println("0. Thoat");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Tim SV theo ma");
            System.out.println("4. Cap nhat thong tin sinh vien");
            System.out.println("5. Xoa sinh vien theo ma");
            System.out.println("6. Tim SV theo khoang diem");
            System.out.println("7. Sap xep theo diem TB");
            System.out.println("8. So luong sinh vien");
            System.out.println("9. Tinh diem TB cua cac sinh vien");
            System.out.println("10. Sinh vien co diem cao nhat");
            System.out.println("11. Sinh vien co diem thap nhat");
            System.out.println("12. Xoa toan bo sinh vien");
            System.out.println("-----------------------------------");
            System.out.println("\n\n");
            System.out.println("Moi chon chuong trinh");
            menu = Integer.parseInt(sc.nextLine());
            try {
                switch (menu) {
                    
                    case 0:
                        System.out.println("Tam biet");
                        break;
                    
                    case 1:
                        svs.nhapDanhSach();
                        break;

                    case 2:
                        svs.xuatDanhSach();
                        break;

                    case 3:
                        svs.timSV();
                        break;

                    case 4:
                        svs.capNhat();
                        break;

                    case 5:
                        svs.xoaSV();
                        break;

                    case 6:
                        svs.timDiem();
                        break;

                    case 7:
                        svs.sapxepDiemTB();
                        break;

                    case 8:
                        svs.soLuong();
                        break;
                      
                    case 9:
                        svs.tinhDiemTB();
                        break;  
                        
                    case 10:
                        svs.SVDiemCaoNhat();
                        break;
                       
                    case 11:
                        svs.SVDiemThapNhat();
                        break;
                        
                    case 12:
                        svs.clear();
                        break;
                        
                    default:
                        System.out.println("Sai vui long nhap lai!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Vui long nhap so tu 0 den 6");
                sc.nextLine();
            }
        } while (menu != 0);
        sc.close();
    }
}
