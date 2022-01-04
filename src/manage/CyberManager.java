package manage;

import model.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class CyberManager {
    ArrayList<Computer> computerCyber = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public CyberManager() {
    }

    public void creatNewCom() {
        computerCyber.add(new Computer());
    }

    public ArrayList<Computer> displayComputers(){
        return computerCyber;
    }

//    public Computer displayComputerByID(int id){
//
//    }

}
