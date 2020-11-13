package test;

import model.Plane;
import service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();
        Plane planeOne = planeService.createPlane();
        Plane planeTwo = planeService.createPlane();
        Plane planeThree = planeService.createPlane();
        Plane planeFour = planeService.createPlane();

        Plane[] planesArray = {planeOne, planeTwo, planeThree, planeFour};
        planeService.printPlane(planeOne);
        System.out.println("**************");
        planeService.printInfoOnCondition(planeOne);
        System.out.println("**************");
        planeService.printPlane(planeService.newerPlane(planeOne, planeTwo));
        System.out.println("**************");
        System.out.println("Model is: " + planeService.modelOfPlaneWithBiggerWingspan(planeThree, planeFour));
        System.out.println("**************");
        System.out.println("Country is: " + planeService.countryOfPlaneWithSmallestSeatsCount(planeOne, planeTwo, planeThree));
        System.out.println("**************");

        planeService.printNotMilitaryPlanes(planesArray);
        System.out.println("**************");
        planeService.printMilitaryAndMaxAir(planesArray);
        System.out.println("**************");
        planeService.printPlane(planeService.returnPlaneWithMinimalWeight(planesArray));
        System.out.println("**************");
        planeService.printPlane(planeService.returnMinimalCostPlaneWithMilitary(planesArray));
        System.out.println("**************");
        planeService.printPlanesInAscendingOrder(planesArray);
    }
}