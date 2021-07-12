package entity.plane;

public abstract class abstractEntity {
    private int id;
    private String name;

    public abstract void setId(int id);
    public abstract int getId();
    public abstract void setName(String name);
    public abstract String getName();
}
