//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package BusReservation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusReserv {
    public static void main(String[] args) {
        BusDAO busDAO = new BusDAO();

        try {
            busDAO.DisplayBusInfo();

            int userOpt = 1;
            Scanner scan = new Scanner(System.in);


            while (userOpt == 1) {
                System.out.println("Enter 1 to Book and 2 to Exit");
                userOpt = scan.nextInt();
                if (userOpt == 1) {
                    System.out.println("Booking.....");
                }

                Booking booking = new Booking();
                if (booking.isAvailable()) {
                    BookingDAO bookingDAO = new BookingDAO();
                    bookingDAO.addBooking(booking);
                    System.out.println("Your booking is confirmed.");
                } else {
                    System.out.println("Sorry, Bus is Full.Try another bus or date.");
                }
            }
            scan.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
