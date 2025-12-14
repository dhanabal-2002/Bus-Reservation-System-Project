//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package BusReservation;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengerName;
    int BusNo;
    Date date;

    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name of passenger: ");
        this.passengerName = scanner.next();
        System.out.println("Enter bus no: ");
        this.BusNo = scanner.nextInt();
        System.out.println("Enter date dd-MM-yyyy");
        String inputDate = scanner.next();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            this.date = dateformat.parse(inputDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public boolean isAvailable() throws SQLException {
        BusDAO busDAO=new BusDAO();
        BookingDAO bookingDAO =new BookingDAO();
        int capacity = busDAO.getCapacity(BusNo);


        int booked = bookingDAO.getBookedCount(BusNo,date);


        return booked < capacity;
    }
}
