package Model;

public class Address {
    private int id;
    private String province;
    private String region;
    private String address;


    public Address(int id, String province, String region, String address) {
        this.id = id;
        this.province = province;
        this.region = region;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public String getProvince() {
        return province;
    }

    public String getRegion() {
        return region;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", region='" + region + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
