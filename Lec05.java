public class Lec05 {
    public static void main(String[] args){
        User john = new User("john",1954,6,16);
        john.displayInfo();
        System.out.println();
        Admin nicolas = new Admin("nicolas",1964,12,24);
        nicolas.displayInfo();
        System.out.println();
        nicolas.displayInfo();
        System.out.println();
        nicolas.displayHappyBirthday();
        System.out.println();
        john.displayHappyBirthday();
    }
}