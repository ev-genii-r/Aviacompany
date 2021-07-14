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
        if(planes == null || planes.getSize() == 0){
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



    public static PlaneList planesByEngeneId(PlaneList planes, int engeneId){
        if(planes == null || planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(plane.getModel().getEngine().getId() == engeneId){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        return complexFound(founder, planes);
    }

    public static PlaneList planesByEngeneName(PlaneList planes, String engeneName){
        if(planes == null || planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(engeneName.equals(plane.getModel().getEngine().getName())){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        return complexFound(founder, planes);
    }

    public static PlaneList planesByModelId(PlaneList planes, int modelId){
        if(planes == null || planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(plane.getModel().getId() == modelId){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        return complexFound(founder, planes);
    }

    public static PlaneList planesByModelName(PlaneList planes, String modelName){
        if(planes == null || planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(modelName.equals(plane.getModel().getName())){
                result = true;
            } else {
                result = false;
            }
            return result;
        };
        return complexFound(founder, planes);
    }

    public static PlaneList planesBySpeedRange(PlaneList planes, int minSpeed, int maxSpeed){
        if(planes == null || planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(plane.getModel().getEngine().getSpeed() >= minSpeed && plane.getModel().getEngine().getSpeed() <= maxSpeed){
                result = true;
            }else {
                result = false;
            }
            return result;
        };
        return complexFound(founder, planes);
    }

    public static PlaneList planesByFuelConsumptionRange(PlaneList planes, int minFuelConsumption, int maxFuelConsumption){
        if(planes == null || planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(plane.getModel().getEngine().getFuelConsumption() >= minFuelConsumption && plane.getModel().getEngine().getFuelConsumption() <= maxFuelConsumption){
                result = true;
            }else {
                result = false;
            }
            return result;
        };
        return complexFound(founder, planes);
    }

    public static PlaneList planesByCapacityRange(PlaneList planes, int minCapacity, int maxCapacity){
        if(planes == null || planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(plane.getModel().getCapacity() >= minCapacity && plane.getModel().getCapacity() <= maxCapacity){
                result = true;
            }else {
                result = false;
            }
            return result;
        };
        return complexFound(founder, planes);
    }

    public static PlaneList planesByWeightCapacityRange(PlaneList planes, int minWeightCapacity, int maxWeightCapacity){
        if(planes == null || planes.getSize() == 0){
            return null;
        }
        Founder founder = (Plane plane) -> {
            boolean result;
            if(plane.getModel().getWeightCapacity() >= minWeightCapacity && plane.getModel().getWeightCapacity() <= maxWeightCapacity){
                result = true;
            }else {
                result = false;
            }
            return result;
        };
        return complexFound(founder, planes);
    }

    private static PlaneList complexFound(Founder founder, PlaneList planes){
        PlaneList resultPlanes = new PlaneList();
        for(int i = 0; i < planes.getSize(); i++){
            if(founder.foundType(planes.findPlaneByIndex(i))){
                resultPlanes.addPlane(planes.findPlaneByIndex(i));
            }
        }
        return resultPlanes;
    }
}
