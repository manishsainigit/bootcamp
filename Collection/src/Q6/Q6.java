package Q6;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Student s1=new Student("Manish",20,80);
        Student s2=new Student("Kim",22,85);
        Student s3=new Student("Jay",21,75);
        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score > o2.score) {
                    return 1;
                }
                else if (o1.score < o2.score){
                    return -1;
                }
                else {
                    return o1.name.compareTo(o2.name);
                }
            }
        });

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
class Student{
    String name;Double age,score;
    public Student(String name,double age, double score){
        this.name=name;
        this.age=age;
        this.score=score;

    }
    @Override
    public String toString() {
        return "name=" + name  +" score=" + score +", age=" + age +'}';
    }
}
