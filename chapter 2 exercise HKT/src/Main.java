import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
 Author HKT = new Author( "hkt","hehe@deobiet.com", "male");

        System.out.println( HKT );

HKT.setEmail(" niga@africa.com");
System.out.println( "name is " + HKT.getName() );
System.out.println( "email is " + HKT.getEmail() );
System.out.println( "gender is " + HKT.getGender() );

    }
}