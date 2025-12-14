//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package BusReservation;

public class BusDetails {
    private int busNo;
    private boolean ac;
    private int capacity;

    BusDetails(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getbusno() {
        return this.busNo;
    }

    public boolean getac() {
        return this.ac;
    }

    public void setac(boolean val) {
        this.ac = val;
    }

    public int getcapacity() {
        return this.capacity;
    }

    public void setcapacity(int cap) {
        this.capacity = cap;
    }

}
