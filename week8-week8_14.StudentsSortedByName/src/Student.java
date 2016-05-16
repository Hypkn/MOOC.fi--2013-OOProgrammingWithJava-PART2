public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(Student other){
     String otherName =  other.getName();
        return  this.name.compareToIgnoreCase(otherName);
    }
   

    @Override
    public String toString() {
        return name;
    }

}
