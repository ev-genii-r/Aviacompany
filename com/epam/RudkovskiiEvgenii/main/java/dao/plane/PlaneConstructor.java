package dao.plane;

import dao.Reader;
import entity.plane.Engine;
import entity.plane.Model;
import entity.plane.Plane;

import java.io.IOException;
import java.util.ArrayList;

public class PlaneConstructor {
    public ArrayList<Plane> createPlanesArray(){
        String engineData;
        String modelData;
        String planeData;

        try {
            engineData = Reader.readFile("engine");
            modelData = Reader.readFile("model");
            planeData = Reader.readFile("plane");
        } catch (IOException e) {
            return null;
        }

        Selector selector = new Selector();
        ArrayList<String> engineString = selector.cutWord(engineData);
        ArrayList<String> modelString = selector.cutWord(modelData);
        ArrayList<String> planeString = selector.cutWord(planeData);

        ArrayList<Engine> engines = new ArrayList<>();
        for(int i = 0; i < engineString.size(); i++){
            Engine engine = new Engine();
            selector.parceWord(engineString.get(i), engine);
            engines.add(engine);
        }

        ArrayList<Model> models = new ArrayList<>();
        for (int i = 0; i < modelString.size(); i++){
            Model model = new Model();
            selector.parceWord(modelString.get(i), model, engines);
            models.add(model);
        }

        ArrayList<Plane> planes = new ArrayList<>();
        for(int i = 0; i < planeString.size(); i++){
            Plane plane = new Plane();
            selector.parceWord(planeString.get(i), plane, models);
            planes.add(plane);
        }

        return planes;
    }
}
