package epam.RudkovskiiEvgenii.main.java.presentation;

import epam.RudkovskiiEvgenii.main.java.dao.plane.PlaneConstructor;
import epam.RudkovskiiEvgenii.main.java.entity.plane.PlaneList;
import epam.RudkovskiiEvgenii.main.java.service.found.PlaneFound;

import java.io.IOException;

public class starter {
    public static void main(String args[]) throws IOException {
        PlaneConstructor planeConstructor = new PlaneConstructor();
        PlaneList planes = new PlaneList(planeConstructor.createPlanesArray() );
        System.out.println(planes.toString());
        System.out.println(PlaneFound.findPlaneById(planes, 4));
        System.out.println(PlaneFound.findPlaneByName(planes, "Samura-2"));
    }
}
