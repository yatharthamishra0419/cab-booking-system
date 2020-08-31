package sample.cablld.models.driver;

import java.util.Objects;

public class Driver {

    private String name;
    private String email;
    private String mobileNumber;
    private DriverAvailabilty driverAvailabilty;

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

    public DriverAvailabilty getDriverAvailabilty() {
        return driverAvailabilty;
    }

    public void setDriverAvailabilty(DriverAvailabilty driverAvailabilty) {
        this.driverAvailabilty = driverAvailabilty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(email, driver.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", driverAvailabilty=" + driverAvailabilty +
                '}';
    }
}
