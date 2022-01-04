package manage;

import model.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
    public static final String PATH_ACCOUNT = "src/database/dataBaseLoginAccount.csv";
    ArrayList<Account> accounts = readManagerAccountData();
    Scanner sc = new Scanner(System.in);

    public AccountManager() {
    }

    public void addManagerAccount(String userName,String password) {
        boolean check = false;
        for (Account account : accounts) {
            if (account.getUserName().equals(userName)) {
                check = true;
                break;
            }
        }
        if (!check) {
            accounts.add(new Account(userName, password));
            System.out.println("Thêm thành công!");
            writeManagerAccountData(accounts);
        } else {
            System.out.println("Tài khoản đã tồn tại!");
        }

    }

    public void deleteManagerAccount(String userName) {
        boolean check = false;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName)){
                accounts.remove(i);
                check = true;
                System.out.println("Xóa thành công!");
            }
        }
        if (!check){
            System.out.println("Không tồn tại tên tài khoản này!");
        }
        writeManagerAccountData(accounts);
    }

    public ArrayList<Account> displayManagerAccount() {
        return accounts;
    }

    public void writeManagerAccountData(ArrayList<Account> accounts) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_ACCOUNT));
            for (Account account : accounts) {
                bufferedWriter.write(account.getUserName() + "," + account.getPassword());
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Account> readManagerAccountData() {
        ArrayList<Account> accounts = new ArrayList<>();

        File file = new File(PATH_ACCOUNT);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }
        } else {
            try {

                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    String[] output = line.split(",");
                    accounts.add(new Account(output[0], output[1]));
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        return accounts;
    }
}
