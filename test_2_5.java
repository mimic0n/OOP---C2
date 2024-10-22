public class test_2_5 {
    public static void main(String[] args) {
        Customer c1 = new Customer( 4, " elon musk " , 'm') ;
        System.out.println( c1 );

        System.out.println(c1);
        System.out.println( " id is : " + c1.getId() );
        System.out.println( " name is : " + c1.getName() );
        System.out.println( " gender is : " + c1.getGender() );

        Account a1 = new Account( 2 , c1 , 500.0 );
        System.out.println( a1 );
        System.out.println( "Account's ID is : " + a1.getId() );
        System.out.println( "Customer is : " + a1.customer);
        a1.setBalance( 300.0 );
        System.out.println( "Account's balance is : " + a1.getBalance() );

        System.out.println( "Account's name is : " + a1.getCustomerName());
        System.out.println( " Amount after deposit :" + a1.deposit( 200.0));
        System.out.println( " Amount after withdraw : " + a1.withdraw( 200.0));
    }
}
