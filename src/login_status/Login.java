package login_status;

import main.Menu;
import manage.AccountManager;
import model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    AccountManager managerAccount = new AccountManager();
    ArrayList<Account> accounts = managerAccount.readManagerAccountData();

    public Login() {
    }

    public void loginManager() {
        int choice;
        do {
            System.out.println("MENU ĐĂNG NHẬP");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Thêm tài khoản"); // Phục vụ cho việc khác
            System.out.println("3. Xóa tài khoản"); // Phục vụ cho việc khác
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Username: ");
                    String userName = sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();
                    boolean check = false;
                    for (Account account : accounts) {
                        if (account.getUserName().equals(userName) && account.getPassword().equals(password)) {
                            check = true;
                            Menu display = new Menu();
                            display.start();
                        }
                    }
                    if (!check) {
                        System.out.println("Sai mật khẩu hoặc tên đăng nhập");
                    }
                    break;
                case 2:
                    System.out.print("User Name mới: ");
                    String newUserName = sc.nextLine();
                    System.out.print("Password: ");
                    String newPassword = sc.nextLine();
                    managerAccount.addManagerAccount(newUserName,newPassword);
                    break;
                case 3:
                    System.out.print("Nhập user cần xóa: ");
                    String userDelete = sc.nextLine();
                    managerAccount.deleteManagerAccount(userDelete);
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại <3");
                    break;
                default:
                    System.out.println("Sai lựa chọn");
                    break;
            }
        } while (choice != 0);
    }
}
