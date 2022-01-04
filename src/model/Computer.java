package model;

public class Computer {
    public static int ID = 1;
    private int id;
    private boolean status;
    private double timeUse;


    public Computer() {
        this.id = ID++;
        this.status = false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTimeUse() {
        return timeUse;
    }

    public void setTimeUse(double timeUse) {
        this.timeUse = timeUse;
    }


    @Override
    public String toString() {
        String online = "Available";
        if (!status){
            online = "Disable";
        }
        return "Computer {" +
                "id = " + id +
                ", status = " + online +
                '}';
    }
}
