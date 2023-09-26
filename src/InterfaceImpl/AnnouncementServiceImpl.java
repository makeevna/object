package InterfaceImpl;

import Interface.AnnouncementService;
import Model.Address;
import Model.Announcement;
import Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnnouncementServiceImpl implements AnnouncementService {
    private List<Announcement> announcements = new ArrayList<>();

    @Override
    public Announcement createAnnouncement(String description, String data, String title, String type, User owner, double pricePerDay) {
        int nextId = generateNextAnnouncementId();
        Announcement announcement = new Announcement(nextId, description, data, title, type, owner, false, 0.0, pricePerDay);
        announcements.add(announcement);
        return announcement;
    }

    @Override
    public void deleteAnnouncementById(int id) {
        announcements.removeIf(announcement -> announcement.getId() == id);
    }

    @Override
    public void updateAnnouncementById(int id, String description, String data, String title, String type, double pricePerDay) {
        announcements.stream()
                .filter(announcement -> announcement.getId() == id)
                .forEach(announcement -> {
                    announcement.setDescription(description);
                    announcement.setData(data);
                    announcement.setTitle(title);
                    announcement.setType(type);
                    announcement.setPricePerDay(pricePerDay);
                });
    }

    @Override
    public Announcement getAnnouncementById(int id) {
        return announcements.stream()
                .filter(announcement -> announcement.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return announcements;
    }

    @Override
    public List<Announcement> sortAnnouncementsByRating() {
        return announcements.stream()
                .sorted((a1, a2) -> Double.compare(a2.getRating(), a1.getRating()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Announcement> sortByPrice() {
        return announcements.stream()
                .sorted((a1, a2) -> Double.compare(a1.getPricePerDay(), a2.getPricePerDay()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Announcement> filterByType(String type) {
        return announcements.stream()
                .filter(announcement -> announcement.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    @Override
    public List<Announcement> getAnnouncementsByUserId(int userId) {
        return null;
    }

    @Override
    public List<Announcement> getAnnouncementsByAddress(Address address) {
        return null;
    }



    private int generateNextAnnouncementId() {


        return announcements.size() + 1;
    }
}
