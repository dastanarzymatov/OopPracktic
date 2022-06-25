package Model;

import java.util.List;

public class Kurs {
    private String name;
   private List <Ticher> ticher;
   private List<Group> group;

    public Kurs(String name, List<Ticher> ticher, List<Group> group) {
        this.name = name;
        this.ticher = ticher;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticher> getTicher() {
        return ticher;
    }

    public void setTicher(List<Ticher> ticher) {
        this.ticher = ticher;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "name='" + name + '\'' +
                ", ticher=" + ticher +
                ", group=" + group +
                '}';
    }
}
