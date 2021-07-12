package entity.plane;

import java.util.Objects;

public class Model extends abstractEntity{

    private int id;
    private String name;
    private int capacity;
    private int weightCapacity;
    private Engine engine;


    public Model(){}

    public Model(int id, String name, int capacity, int weightCapacity, Engine engine){
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.weightCapacity = weightCapacity;
        this.engine = engine;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return getId() == model.getId() &&
                getCapacity() == model.getCapacity() &&
                getWeightCapacity() == model.getWeightCapacity() &&
                getName() == model.getName() &&
                Objects.equals(getEngine(), model.getEngine());
    }

    @Override
    public int hashCode() {
        return id*37+5;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id: " + id + " name: " + name + " capacity: " + capacity +
                " weightCapacity: " + weightCapacity + " engine: " + engine.getId()+":"+engine.getName());
        return stringBuilder.toString();
    }
}
