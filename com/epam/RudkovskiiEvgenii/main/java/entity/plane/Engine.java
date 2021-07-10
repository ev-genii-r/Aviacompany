package entity.plane;


public class Engine {
    private int id;
    private String name;
    private int speed;
    private int fuelConsumption;


    public Engine(){ }

    public Engine(int id, String name, int speed, int fuelConsumption){
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return getId() == engine.getId() &&
                getSpeed() == engine.getSpeed() &&
                getFuelConsumption() == engine.getFuelConsumption() &&
                getName() == engine.getName();
    }

    @Override
    public int hashCode() {
        return id*42;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("id: " + id + " name: " + name + " speed: " + speed + " fuelConsumption: " + fuelConsumption);
        return stringBuilder.toString();
    }
}
