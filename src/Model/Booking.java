package Model;

public class Booking {
    private User bookedUser;
    private Announcement announcement;


    public Booking(User bookedUser, Announcement announcement) {
        this.bookedUser = bookedUser;
        this.announcement = announcement;
    }


    public User getBookedUser() {
        return bookedUser;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }


    public void setBookedUser(User bookedUser) {
        this.bookedUser = bookedUser;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Booking{");
        sb.append("bookedUser=").append(bookedUser);
        sb.append(", announcement=").append(announcement);
        sb.append('}');
        return sb.toString();
    }
}

