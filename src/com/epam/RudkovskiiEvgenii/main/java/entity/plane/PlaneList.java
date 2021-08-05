package epam.RudkovskiiEvgenii.main.java.entity.plane;

import java.util.ArrayList;
import java.util.Objects;

public class PlaneList{
    private ArrayList<Plane> planes = new ArrayList<>();
    private int size;


    public PlaneList(){}

    public PlaneList(ArrayList<Plane> planes){
        this.planes = planes;
    }


    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<Plane> planes) {
        this.planes = planes;
    }

    public int getSize() {
        size = planes.size();
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Plane findPlaneByIndex(int index){
        return planes.get(index);
    }

    public void addPlane(Plane plane){
        this.planes.add(plane);
    }

    public void changePlanes(int index1, int index2){
        if(index1 > planes.size() || index2 > planes.size()){
            return;
        }

        if (index1 < 0 || index2 < 0){
            return;
        }
        Plane plane = findPlaneByIndex(index1);
        planes.set(index1, findPlaneByIndex(index2));
        planes.set(index2, plane);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneList planeList = (PlaneList) o;
        return getSize() == planeList.getSize() &&
                Objects.equals(getPlanes(), planeList.getPlanes());
    }

    @Override
    public int hashCode() {
        return size * planes.hashCode() * 24;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < planes.size(); i++){
            stringBuilder.append("Plane: " + planes.get(i).toString() +
                    "\n   Model: " + planes.get(i).getModel().toString() +
                    "\n   Engine: " + planes.get(i).getModel().getEngine().toString()+ '\n');
        }
        return stringBuilder.toString();
    }
}
