package full;

import java.time.LocalDateTime;

public class Student extends Person {
    private String department;
    public Student(String name, double age, String department) {
        super(name, age);
        this.department=department;
    }

    @Override
    public Long getId(){
        String studentId =String.valueOf(this.getIdentificationNumber());
        studentId +="000";
        return Long.valueOf(studentId);
    }

    @Override
    public LocalDateTime createdAt() {
        return LocalDateTime.now();
    }
    @Override
    public boolean equals(Object o){
        if (this == o)return true;
        if (o instanceof Person){
            Person anotherStudent = (Person) o;
            if (anotherStudent.getAge()==this.getAge()||this.getName().equals(anotherStudent.getName())){
                return true;
            }return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Student s1 = new Student("zusha",25.0, "cs");
        System.out.println(s1.getId());
    }
}
