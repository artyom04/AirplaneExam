package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private double hours;
    private boolean military;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private int cost;

    public Plane(String model, String country, int year, double hours, boolean military, int weight, int wingspan, int topSpeed, int seats, int cost) {
        this.setModel(model);
        this.setCountry(country);
        this.setYear(year);
        this.setHours(hours);
        this.setMilitary(military);
        this.setWeight(weight);
        this.setWingspan(wingspan);
        this.setSeats(seats);
        this.setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!(model.length() == 0)) {
            this.model = model;
        } else {
            System.out.println("Model can't be space");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!(country.length() == 0)) {
            this.country = country;
        } else {
            System.out.println("Country can't be space");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("Year of publishing should be between 1903 and 2020");
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0 && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Hours in air should be between 0 and 10000");
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 1000 && weight <= 160000) {
            this.weight = weight;
        } else {
            System.out.println("Weight should be between 1000KG and 160000KG");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("Wingspan value should be between 10 and 45");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("Maximal speed can't be negative");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0) {
            this.seats = seats;
        } else {
            System.out.println("Number of seats can't be negative");
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("Cost can't be negative");
        }
    }
}
