package collections;

import java.util.HashMap;
import java.util.Map;

class Faculty {
    Integer id;
    String namedep;

    public Faculty(){

    }

    public Faculty(Integer id, String namedep){
        this.id = id;
        this.namedep = namedep;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNamedep(String namedep) {
        this.namedep = namedep;
    }

    public String getNamedep() {
        return namedep;
    }
}

class Department {
    Integer idf;
    String namething;

    public Department(){

    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public String getNamething() {
        return namething;
    }

    public void setNamething(String namething) {
        this.namething = namething;
    }

}

public class MapUniversity {

    public void createUniversityMap(){
        Faculty faculty = new Faculty();
        Map<Integer, Faculty> university = new HashMap<>();

    }

public static void main(String[] args) {

    }
}
