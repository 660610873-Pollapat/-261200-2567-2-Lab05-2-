import java.time.LocalDate;

public class Admin extends User{
    public Admin(){
        super();
    }

    Admin(String name ,int year,int month,int day){
       super(name,year,month,day);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("User type: admin.");
    }

    public void displayInfo(boolean full){
        if(full){
            System.out.println(getName()+getdob());
            System.out.println("User type: admin" + LocalDate.now());
        }
        else{
            System.out.println(getName());
        }
    }

    public void displayHappyBirthday() {
        super.today.getYear();
        super.dob.getYear();
        int age = today.getYear() - dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + getName() + "! You are " + age + "!");
        }
        else{
            System.out.println( getName() + ", it's not your birthday.");
        }
    }
}
