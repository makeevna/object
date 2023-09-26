package Model;
;

public class Announcement {
    private int id;
    private String description;
    private String data;
    private String title;
    private String type; // Apartment, House
    private User owner;
    private boolean isBooked;
    private double rating;
    private double pricePerDay;


    public Announcement(int id, String description, String data, String title, String type, User owner, boolean isBooked, double rating, double pricePerDay) {
        this.id = id;
        this.description = description;
        this.data = data;
        this.title = title;
        this.type = type;
        this.owner = owner;
        this.isBooked = isBooked;
        this.rating = rating;
        this.pricePerDay = pricePerDay;
    }






    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getData() {
        return data;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public User getOwner() {
        return owner;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public double getRating() {
        return rating;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }


    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", data='" + data + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", owner=" + owner +
                ", isBooked=" + isBooked +
                ", rating=" + rating +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
