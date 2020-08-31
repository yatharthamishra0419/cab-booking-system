package sample.cablld.models.rider;

import java.util.Objects;

public class Rider {

    private String name;

    private String email;

    private String mobileNumber;

    private int totalNumberOfRides;

    private RiderState riderState;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getTotalNumberOfRides() {
        return totalNumberOfRides;
    }

    public void setTotalNumberOfRides(int totalNumberOfRides) {
        this.totalNumberOfRides = totalNumberOfRides;
    }

    public RiderState getRiderState() {
        return riderState;
    }

    public void setRiderState(RiderState riderState) {
        this.riderState = riderState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rider rider = (Rider) o;
        return Objects.equals(email, rider.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
