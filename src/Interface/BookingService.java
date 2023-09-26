package Interface;

import Model.Announcement;
import Model.User;

import java.util.List;

public interface BookingService {

    void bookAnnouncement(User bookedUser, Announcement announcement) throws BookingException;

    void unBookAnnouncement(User bookedUser, Announcement announcement);

    List<User> getAllUsers();

    List<Announcement> getAllAnnouncements();

    void unbookAnnouncement(User user, Announcement announcement);
}
