package service.found;

import entity.plane.Plane;
import entity.plane.PlaneList;

public class PlaneFound {

    public static Plane findPlaneById(PlaneList planes, int id){
        if(planes == null && planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(plane.getId() == id){
                result = true;
            }else {
                result = false;
            }
            return result;
        };
        return found(founder, planes);
    }

    public static Plane findPlaneByName(PlaneList planes, String name){
        if(planes == null && planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(plane.getName().equals(name)){
                result = true;
            }else{
                result = false;
            }
            return result;
        };
        return found(founder, planes);
    }

    private static Plane found(Founder founder, PlaneList planes){
        for(int i = 0; i < planes.getSize(); i++){
            if( founder.foundType( planes.findPlaneByIndex(i) ) ){
                return planes.findPlaneByIndex(i);
            }
        }
        return null;
    }
}
