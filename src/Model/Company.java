package Model;

import java.util.List;

public class Company {
    private int id;
    private String name;
  private List <Kurs> kurs;

    public Company(int id, String name, List<Kurs> kurs) {
        this.id = id;
        this.name = name;
        this.kurs = kurs;
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

    public List<Kurs> getKurs() {
        return kurs;
    }

    public void setKurs(List<Kurs> kurs) {
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kurs=" + kurs +
                '}';
    }
}
