package entity.plane;

import java.util.ArrayList;

public class PlaneList {
    private ArrayList<Plane> planes;
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
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Plane findPlaneByIndex(int index){
        return planes.get(index);
    }

    public Plane findPlaneById(int id){
        for(int i = 0; i < planes.size(); i++){
            if(findPlaneByIndex(i).getId() == id){
                return findPlaneByIndex(i);
            }
        }
        return null;
    }

    public Plane findPlaneByName(String name){
        for(int i = 0; i < planes.size(); i++){
            if(findPlaneByIndex(i).getName() == name){
                return findPlaneByIndex(i);
            }
        }
        return null;
    }

    public void changePlanes(int index1, int index2){
        if(index1 > planes.size() || index2 >planes.size()){
            return;
        }

        if (index1 < 0 || index2 < 0){
            return;
        }
        Plane plane = findPlaneByIndex(index1);
        planes.set(index1, findPlaneByIndex(index2));
        planes.set(index2, plane);
    }
}
