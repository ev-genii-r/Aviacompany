import dao.plane.PlaneConstructor;
import entity.plane.Plane;
import entity.plane.PlaneList;
import org.junit.Assert;
import org.junit.Test;
import service.found.PlaneFound;

public class FoundTest {

    @Test
    public void foundByIdNullTest(){
        Plane actual = PlaneFound.findPlaneById(null, 10);
        Plane expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void foundByIdNotFoundTest(){
        PlaneConstructor planeConstructor = new PlaneConstructor();
        PlaneList planes = new PlaneList( planeConstructor.createPlanesArray() );
        Plane actual = PlaneFound.findPlaneById(planes, 19);
        Plane expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void foundByIdActualTest(){
        PlaneConstructor planeConstructor = new PlaneConstructor();
        PlaneList planes = new PlaneList( planeConstructor.createPlanesArray() );
        Plane actual =PlaneFound.findPlaneById(planes, 4);
        Plane expected = planes.getPlanes().get(3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void complexFoundNullTest(){
        PlaneFound planeFound = new PlaneFound();
        PlaneList actual = planeFound.planesBySpeedRange(null, 0, 10000);
        PlaneList expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void outOfBoundsComplexFoundTest(){
        PlaneFound planeFound = new PlaneFound();
        PlaneConstructor planeConstructor = new PlaneConstructor();
        PlaneList planes = new PlaneList( planeConstructor.createPlanesArray() );
        PlaneList actual = planeFound.planesBySpeedRange(planes, 40000, 50000);
        PlaneList expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void actualComplexFoundTest(){
        PlaneFound planeFound = new PlaneFound();
        PlaneConstructor planeConstructor = new PlaneConstructor();
        PlaneList planes = new PlaneList( planeConstructor.createPlanesArray() );
        PlaneList actual = planeFound.planesBySpeedRange(planes,390, 410);
        PlaneList expected = new PlaneList();
        expected.addPlane(planes.findPlaneByIndex(1));
        expected.addPlane(planes.findPlaneByIndex(2));
        expected.addPlane(planes.findPlaneByIndex(3));
        expected.addPlane(planes.findPlaneByIndex(6));

        Assert.assertEquals(expected, actual);
    }
}
