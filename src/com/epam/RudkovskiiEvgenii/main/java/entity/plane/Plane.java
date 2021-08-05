package epam.RudkovskiiEvgenii.main.java.entity.plane;

import epam.RudkovskiiEvgenii.main.java.entity.AbstractEntity;
import epam.RudkovskiiEvgenii.main.java.entity.plane.Model;

import java.util.Objects;

public class Plane extends AbstractEntity {
    private int id;
    private String name;
    private Model model;


    public Plane(){}

    public Plane(int id, String name, Model model){
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public Plane(Plane plane){
        this.id = plane.getId();
        this.name = plane.getName();
        this.model = plane.getModel();
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

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return getId() == plane.getId() &&
                getName() == plane.getName() &&
                Objects.equals(getModel(), plane.getModel());
    }

    @Override
    public int hashCode() {
        return id*37;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id: " + id + " name: " + name + " model: " + model.getId() + ": " + model.getName());
        return stringBuilder.toString();
    }
}
