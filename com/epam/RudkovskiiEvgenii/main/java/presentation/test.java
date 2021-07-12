package presentation;

import dao.plane.PlaneConstructor;
import entity.plane.PlaneList;
import service.found.PlaneFound;

import java.io.IOException;

public class test {
    public static void main(String args[]) throws IOException {
        PlaneConstructor planeConstructor = new PlaneConstructor();
        PlaneList planes = new PlaneList( planeConstructor.createPlanesArray() );
        System.out.println(planes.toString());
        System.out.println(PlaneFound.findPlaneById(planes, 4));
        System.out.println(PlaneFound.findPlaneByName(planes, "Samura-2"));
    }
}
