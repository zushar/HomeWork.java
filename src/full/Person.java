package full;

import java.time.LocalDateTime;

public abstract class Person implements AcademicType {
       private static Long idCounter = 0L;
       private String name;
       private double age;
       private Long identificationNumber;
       private LocalDateTime creationTime;

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public abstract Long getId();


        static Long incrementAndGet(){
            idCounter = idCounter + 1;
            return idCounter;
        }

    public Person(String name, double age) {
            this.name = name;
            this.age = age;
            this.identificationNumber = incrementAndGet();
            this.creationTime = LocalDateTime.now();
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

}
