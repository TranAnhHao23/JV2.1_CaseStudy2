package manage;

import model.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class CyberManager {
    ArrayList<Computer> computerCyber = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public CyberManager() {
    }


    public ArrayList<Computer> displayComputers() {
        return computerCyber;
    }

    // Tạo 1 exception cho cái này.
    public Computer displayComputerByID(int id) {
//        Computer computer = new Computer();
        for (int i = 0; i < computerCyber.size(); i++) {
            if (computerCyber.get(i).getId() == id) {
                return computerCyber.get(i);
            }
        }
        return null;
    }

    public void displayComputersID() {
        System.out.println("Các máy hiện có trong quán");
        for (Computer computer : computerCyber) {
            System.out.println(computer.getId() + " ");
        }
    }

    public void addComputer() {
        computerCyber.add(new Computer());
        System.out.println("Thêm vào thành công!");
    }

    // tạo 1 exception ở đây nữa, check ghi đè?
    public void editComputer(int id, int idNew) {
        for (Computer computer : computerCyber) {
            if (computer.getId() == id) {
                computer.setId(idNew);
                System.out.println("Sửa thành công!");
            }
        }
    }

    public void deleteComputer() {
        displayComputersID();
        System.out.print("Nhập ID máy muốn xóa: ");
        int id = sc.nextInt();
        for (Computer computer : computerCyber) {
            if (computer.getId() == id) {
                System.out.println("Bạn có muốn xóa: nhấn 1 để xóa - nhấn 0 để hủy");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        computerCyber.remove(computer);
                        System.out.println("Xóa thành công!");
                        break;
                    case 0:
                        System.out.println("Hủy xóa!");
                        break;
                }
            }
        }
    }

    public void addService(){

    }

}
