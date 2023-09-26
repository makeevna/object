package InterfaceImpl;

import Interface.BookingException;
import Interface.BookingService;
import Model.Announcement;
import Model.Booking;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class BookingServiceImpl implements BookingService {
    private List<Booking> bookings = new ArrayList<>();

    @Override
    public void bookAnnouncement(User user, Announcement announcement) throws BookingException {
        if (announcement.isBooked()) {
            throw new BookingException("Announcement is already booked.");
        }
        Booking booking = new Booking(user, announcement);
        announcement.setBooked(true);
        bookings.add(booking);
    }

    @Override
    public void unBookAnnouncement(User bookedUser, Announcement announcement) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return null;
    }

    @Override
    public void unbookAnnouncement(User user, Announcement announcement) {

        bookings.removeIf(booking ->
                booking.getAnnouncement().getId() == announcement.getId() &&
                        booking.getBookedUser().getId() == user.getId()
        );
        announcement.setBooked(false);
    }


}
