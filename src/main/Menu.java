package main;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public Menu() {
    }

    public void start() {

        int choice;
        do {
            System.out.println("             CHÀO MỪNG QUAY LẠI");
            System.out.println("----------PHẦN MỀM QUẢN LÝ PHÒNG MÁY----------");
            System.out.println("1. Hiển thị danh sách máy có trong quán");
            System.out.println("2. Thêm một máy mới vào danh sách");
            System.out.println("3. Sửa thông tin một máy trong danh sách");
            System.out.println("4. Xóa một máy trong danh sách");
            System.out.println("5. Thêm dịch vụ");
            System.out.println("6. Chỉnh sửa tính tiền theo giờ");
            System.out.println("7. Tính tiền máy");
            System.out.println("8. Quản lý tài khoản đăng nhập");
            System.out.println("9. Doanh thu");
            System.out.println("10. Về menu đăng nhập");
            System.out.println("0. Thoát ứng dụng");
            System.out.println("-----------------------------------------------");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại <3");
                    System.exit(1);
                default:
                    System.out.println("Sai lựa chọn. Chọn lại!!!");
                    break;
            }
        } while (choice != 10);

    }
}
