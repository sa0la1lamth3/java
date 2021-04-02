package lesson10;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("1");
//        arrayList.add("2");
//        arrayList.remove("1");
//
//
//        for (int i = 0; i < arrayList.size(); i++) {
//           System.out.println(arrayList.get(i));
//        }
//
//        for (String element:arrayList){
//            System.out.println(element);
//
//        }

//        Set<String> mySet = new HashSet<>();
//        mySet.add("mot");
//        mySet.add("hai");
//        mySet.add("ba");
//        mySet.add("hai");
//        System.out.println(mySet);


        Map<String, lesson10.Student> myMap = new HashMap<String, Student>();
        Student student1 = new Student("Student1",18);
        Student student2 = new Student("Student2",20);
        Student student3 = new Student("Student3", 19);
        Student student4 = new Student("Student4", 23);

        myMap.put("Student1",student1);
        myMap.put("Student2",student2);
        myMap.put("Student3",student3);
        myMap.put("Student4",student4);


        System.out.println(myMap.get("Student1"));

    }
}
