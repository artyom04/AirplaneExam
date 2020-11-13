package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {
    //Create Plane
    public Plane createPlane() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Model of Plane: ");
        String model = scanner.nextLine();
        System.out.println("Enter Country: ");
        String country = scanner.next();
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();
        System.out.println("Enter the time in air: ");
        int hours = scanner.nextInt();
        System.out.println("Is Military? Write true or false: ");
        boolean military = scanner.nextBoolean();
        System.out.println("Enter Weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter Wingspan: ");
        int wingspan = scanner.nextInt();
        System.out.println("Enter Top Speed: ");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter the Number of Seats: ");
        int seats = scanner.nextInt();
        System.out.println("Enter the Cost: ");
        int cost = scanner.nextInt();
        return new Plane(model, country, year, hours, military, weight, wingspan, topSpeed, seats, cost);
    }

    //    Task 1. (score 5)
    //    Create function:
    //    Parameter one Plane
    //    Result: print all information of the plane
    public void printPlane(Plane plane) {
        System.out.println("Plane Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Year of Publishing: " + plane.getYear());
        System.out.println("Hours in Air: " + plane.getHours());
        System.out.println("Is Military Plane or Not: " + (plane.isMilitary() ? "Yes" : "No"));
        System.out.println("Weight of Plane: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("Maximal Speed per Hour: " + plane.getTopSpeed());
        System.out.println("Number of Seats: " + plane.getSeats());
        System.out.println("Cost of plane: " + plane.getCost());
    }

    //    Task 2. (score 5)
    //    Create function:
    //    Parameter one Plane
    //    Result: print cost and topSpeed if the plane is military otherwise print model and country
    public void printInfoOnCondition(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("Cost: " + plane.getCost() + " Maximal Speed: " + plane.getTopSpeed());
        } else {
            System.out.println("Model: " + plane.getModel() + " Country: " + plane.getCountry());
        }
    }

    //    Task 3. (score 7)
    //    Create function:
    //    Parameter two Planes
    //    Result: return the plane which one is newer (if they have the same age return first one).

    public Plane newerPlane(Plane planeOne, Plane planeTwo) {
        return (planeOne.getYear() >= planeTwo.getYear() ? planeOne : planeTwo);
    }

    //    Task 4. (score 7)
    //    Create function:
    //    Parameter two Planes
    //    Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).

    public String modelOfPlaneWithBiggerWingspan(Plane planeOne, Plane planeTwo) {
        return ((planeTwo.getWingspan() >= planeOne.getWingspan()) ? planeTwo.getModel() : planeOne.getModel());
    }

    //    Task 5. (score 7)
    //    Create function:
    //    Parameter three Planes
    //    Result: print country of the plane with smallest seats count (if they have the same - print first).

    public String countryOfPlaneWithSmallestSeatsCount(Plane planeOne, Plane planeTwo, Plane planeThree) {
        if (planeOne.getSeats() < planeTwo.getSeats()) {
            if (planeOne.getSeats() < planeThree.getSeats()) {
                return planeOne.getCountry();
            } else {
                return planeThree.getCountry();
            }
        } else {
            if (planeTwo.getSeats() < planeThree.getSeats()) {
                return planeTwo.getCountry();
            } else {
                return planeThree.getCountry();
            }
        }
    }

    //    Task 6. (score 7)
    //    Create function:
    //    Parameter array of Planes
    //    Result: print all not military planes.

    public void printNotMilitaryPlanes(Plane[] planes) {
        for (Plane plane : planes) {
            if (!(plane.isMilitary())) {
                printPlane(plane);
                System.out.println();
            }
        }
    }

    //    Task 7. (score 10)
    //    Create function:
    //    Parameter array of Planes
    //    Result: print all military planes which were in air more than 100 hours.

    public void printMilitaryAndMaxAir(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                printPlane(plane);
                System.out.println();
            }
        }
    }

    //    Task 8. (score 10)
    //    Create function:
    //    Parameter array of Planes
    //    Result: return the plane with minimal weight (if there are some of them return last one).

    public Plane returnPlaneWithMinimalWeight(Plane[] planes) {
        int minimalWeight = planes[0].getWeight();
        int indexOfLastMinimalWeightPlane = 0;
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= minimalWeight) {
                minimalWeight = planes[i].getWeight();
                indexOfLastMinimalWeightPlane = i;
            }
        }
        return planes[indexOfLastMinimalWeightPlane];
    }

    //    Task 9. (score 10)
    //    Create function:
    //    Parameter array of Planes
    //    Result: return the plane with minimal cost from all military planes (if there are some of them return first one).

    public Plane returnMinimalCostPlaneWithMilitary(Plane[] planes) {
        Plane minCostPlane = null;
        for (int i = 0; i < planes.length; i++) {
            if (minCostPlane == null && planes[i].isMilitary()) {
                minCostPlane = planes[i];
            }
            if (planes[i].isMilitary() && planes[i].getCost() < minCostPlane.getCost()) {
                minCostPlane = planes[i];
            }
        }
        return minCostPlane;
    }

    //    Task 10. (score 12)
    //    Create function:
    //    Parameter array of Planes
    //    Result: print planes in ascending form order by year

    public void printPlanesInAscendingOrder(Plane[] planes) {
        for (int i = 0; i < planes.length - 1; i++) {
            for (int j = 0; j < planes.length - i - 1; j++) {
                if (planes[j].getYear() > planes[j + 1].getYear()) {
                    Plane temporaryPlane = planes[j];
                    planes[j] = planes[j + 1];
                    planes[j + 1] = temporaryPlane;
                }
            }
        }
        for (Plane plane : planes) {
            printPlane(plane);
            System.out.println();
        }
    }
}