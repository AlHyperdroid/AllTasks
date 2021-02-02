package collections;

import java.util.HashMap;
import java.util.Map;

public class MapUniversity {

    public static void createUniversityMap(){
        Map<Integer, String> department = new HashMap<>();
        department.put(1, "Smartphone");
        department.put(2, "Memory card");
        department.put(3, "Laptop");
        department.put(4, "Pen");
        department.put(4, "Notebook");

        Map<String, Map<Integer, String>> faculty = new HashMap<>();
        faculty.put("Department of Electronics and Control Systems", department);
        faculty.put("Department of Systems and Technologies Modeling", department);
        faculty.put("Department of Theoretical and Applied Systems Engineering", department);
        faculty.put("Department of Artificial Intelligence and Software", department);
        faculty.put("Department of Security of Information Systems and Technologies", department);

        Map<String, Map<String, Map<Integer, String>>> university = new HashMap<>();
        university.put("Computer Science", faculty);

        System.out.println(university);
    }

public static void main(String[] args) {
    createUniversityMap();
    }
}
