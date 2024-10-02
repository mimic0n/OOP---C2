public class Test_book {
    public static void main(String[] args) {
//
//      book Book = new book("Java", new Author("hkt", "hkt@somewhere.com", "male"), 60.00 , 99);
//        System.out.println(Book);
//
//
//        Book.setPrice(49.99);
//        Book.setQty(30);
//        System.out.println("name is: " + Book.getName());
//        System.out.println("price is: " + Book.getPrice());
//        System.out.println("qty is: " + Book.getQty());
//        System.out.println("Author is: " + Book.getAuthor());
//        System.out.println("Author's name is: " + Book.getAuthor().setName();
//        System.out.println("Author's email is: " + Book.getAuthor().setEmail());
//
//
//        book anotherBook = new book("more Java", new Author("hkt", "hkt@somewhere.com", "male"), 30.00);
//        System.out.println(anotherBook);
      Author[] authors = new Author[2];
      authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", "male");
      authors[1] = new Author("Paul Tan", "Paul@nowhere.com", "male");

      book javaDummy = new book("Java for Dummy", authors, 19.99, 99);
      System.out.println(javaDummy.getAuthName());  // toString()
    }

}
