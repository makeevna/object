package Interface;

import Model.Address;
import Model.Announcement;
import Model.User;

import java.util.List;

public interface AnnouncementService {
    Announcement createAnnouncement(String description, String data, String title, String type, User owner, double pricePerDay);
    void deleteAnnouncementById(int id);
    void updateAnnouncementById(int id, String description, String data, String title, String type, double pricePerDay);
    Announcement getAnnouncementById(int id);
    List<Announcement> getAllAnnouncements();
    List<Announcement> sortAnnouncementsByRating();
    List<Announcement> sortByPrice();
    List<Announcement> filterByType(String type);
    List<Announcement> getAnnouncementsByUserId(int userId);
    List<Announcement> getAnnouncementsByAddress(Address address);

}
