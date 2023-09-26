import Interface.AnnouncementService;
import Interface.BookingException;
import Interface.BookingService;
import Interface.UserService;
import InterfaceImpl.AnnouncementServiceImpl;
import InterfaceImpl.BookingServiceImpl;
import InterfaceImpl.UserServiceImpl;
import Model.Announcement;
import Model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        AnnouncementService announcementService = new AnnouncementServiceImpl();
        BookingService bookingService = new BookingServiceImpl();

        try {

            User user1 = userService.createUser("Nurai", "Makeeva", "nuraimakeeva533@gmail.com");
            User user2 = userService.createUser("Meder", "Baktyarov", "meder@gmail.com");


            Announcement announcement1 = announcementService.createAnnouncement("Хорогая квартира", "Мебель", "1", "Квартира", user1, 100.0);
            Announcement announcement2 = announcementService.createAnnouncement("Уютная квартира", "Инструментов", " 2", "Кваримра", user2, 200.0);


            bookingService.bookAnnouncement(user1, announcement1);


            bookingService.unbookAnnouncement(user1, announcement1);


            List<User> allUsers = userService.getAllUsers();
            System.out.println("All Users:");
            for (User user : allUsers) {
                System.out.println(user);
            }

            // Retrieve all announcements
            List<Announcement> allAnnouncements = announcementService.getAllAnnouncements();
            System.out.println("\nAll Announcements:");
            for (Announcement announcement : allAnnouncements) {
                System.out.println(announcement);
            }
        } catch (BookingException e) {
            System.err.println("Booking Exception: " + e.getMessage());
        }
    }
}
