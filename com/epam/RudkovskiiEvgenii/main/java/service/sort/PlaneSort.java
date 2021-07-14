package service.sort;

import entity.plane.Plane;
import entity.plane.PlaneList;

public class PlaneSort {

    private void sort(PlaneList planes, Sorter sorter){
        for(int i = 0; i < planes.getSize(); i++){
            for(int j = 0; j < planes.getSize() - 1; j++){
                if(sorter.sortType(planes.findPlaneByIndex(j), planes.findPlaneByIndex(j+1))){
                    planes.changePlanes(j, j+1);
                }
            }
        }
    }

    public void sortByName(PlaneList planes){
        if(planes == null){
            return;
        }
        Sorter sorter = (Plane plane1, Plane plane2) -> {
            boolean result;
            if(plane1.getName().length() > plane2.getName().length()){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        sort(planes, sorter);
    }

    public void sortById(PlaneList planes){
        if(planes == null){
            return;
        }
        Sorter sorter = (Plane plane1, Plane plane2) -> {
            boolean result;
            if(plane1.getId() > plane2.getId()){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        sort(planes, sorter);
    }

    public void sortBySpeed(PlaneList planes){
        if(planes == null){
            return;
        }
        Sorter sorter = (Plane plane1, Plane plane2) -> {
            boolean result;
            if(plane1.getModel().getEngine().getSpeed() > plane2.getModel().getEngine().getSpeed()){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        sort(planes, sorter);
    }

    public void sortByFuelConsumption(PlaneList planes){
        if(planes == null){
            return;
        }
        Sorter sorter = (Plane plane1, Plane plane2) -> {
            boolean result;
            if(plane1.getModel().getEngine().getFuelConsumption() > plane2.getModel().getEngine().getFuelConsumption()){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        sort(planes, sorter);
    }

    public void sortByCapacity(PlaneList planes){
        if(planes == null){
            return;
        }
        Sorter sorter = (Plane plane1, Plane plane2) -> {
            boolean result;
            if(plane1.getModel().getCapacity() > plane2.getModel().getCapacity()){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        sort(planes, sorter);
    }

    public void sortByWeightCapacity(PlaneList planes){
        if(planes == null){
            return;
        }
        Sorter sorter = (Plane plane1, Plane plane2) -> {
            boolean result;
            if(plane1.getModel().getWeightCapacity() > plane2.getModel().getWeightCapacity()){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        sort(planes, sorter);
    }
}
