import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    protected LocalDate today = LocalDate.now();

    User(String name ,int year,int month,int day){
        this.name = name;
        dob = LocalDate.of(year,month,day);
    }

    User(){
        name = null;
        dob = LocalDate.now();
    }

    public boolean isBirthday(){
        if (today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth()){
            return true;
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public LocalDate getdob(){
        return dob;
    }

    public void displayInfo(){
        System.out.println("User name " + name);
        System.out.println("Date of Birth " + dob);
    }
    public void displayHappyBirthday() {
        int age = today.getYear() - dob.getYear();
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
        else {
            System.out.println( getName() + ", it's not your birthday.");
        }
    }

}
