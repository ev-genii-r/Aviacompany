package epam.RudkovskiiEvgenii.main.java.entity;

public abstract class AbstractEntity {
    private int id;
    private String name;

    public abstract void setId(int id);
    public abstract int getId();
    public abstract void setName(String name);
    public abstract String getName();
}
