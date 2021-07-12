package dao.plane;

import entity.plane.Engine;
import entity.plane.Model;
import entity.plane.Plane;

import java.util.ArrayList;

public class Selector {
    public ArrayList<String> cutWord(String str){
        String tempStr = "";
        ArrayList<String> array = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '$'){
                tempStr += str.charAt(i);
            }else {
                array.add(tempStr);
                tempStr = "";
            }
        }

        return array;
    }

    public boolean parceWord(String word, Plane plane, ArrayList<Model> models){
        int id;
        String name;
        int modelId;

        try{
            id = Integer.parseInt(findElement(word, 0));
            name = findElement(word, 1);
            modelId = Integer.parseInt(findElement(word, 2));
        }catch (Exception ex){
            return false;
        }

        for (int i = 0; i < models.size(); i++){
            if(models.get(i).getId() == modelId){
                plane.setModel(models.get(i));
                break;
            }
        }

        if(plane.getModel() == null){
            return false;
        }

        plane.setId(id);
        plane.setName(name);

        return true;
    }

    public boolean parceWord(String word, Model model, ArrayList<Engine> engines){
        int id;
        String name;
        int capacity;
        int weightCapacity;
        int engineId;

        try{
            id = Integer.parseInt(findElement(word, 0));
            name = findElement(word, 1);
            capacity = Integer.parseInt(findElement(word, 2));
            weightCapacity = Integer.parseInt(findElement(word, 3));
            engineId = Integer.parseInt(findElement(word, 4));
        }catch (Exception ex){
            return false;
        }

        for (int i = 0; i < engines.size(); i++){
            if(engines.get(i).getId() == engineId){
                model.setEngine(engines.get(i));
                break;
            }
        }

        if(model.getEngine() == null){
            return false;
        }

        model.setId(id);
        model.setName(name);
        model.setCapacity(capacity);
        model.setWeightCapacity(weightCapacity);

        return true;
    }

    public boolean parceWord(String word, Engine engine){
        int id;
        String name;
        int speed;
        int fuelConsumption;
        try {
            id = Integer.parseInt(findElement(word, 0));
            name = findElement(word, 1);
            speed = Integer.parseInt(findElement(word, 2));
            fuelConsumption = Integer.parseInt(findElement(word, 3));
        }catch (Exception ex){
            return false;
        }

        engine.setId(id);
        engine.setName(name);
        engine.setSpeed(speed);
        engine.setFuelConsumption(fuelConsumption);

        return true;
    }

    private String findElement(String word, int num){
        String resString = "";
        int counter = 0;

        for(int i = 0; i< word.length(); i++){
            if(word.charAt(i) != ' ') {
                resString += word.charAt(i);
            } else {
                if(num == counter && resString != ""){
                    return resString;
                }
                if(word.charAt(i-1) != ' '){
                    counter++;
                    resString = "";
                }
            }
        }

        return resString;
    }
}
