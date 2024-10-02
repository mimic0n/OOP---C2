public class book {
    private String name ;
    private Author[] authors ;
    private double price;
    private int qty = 0 ;
    public book (String name , Author[]authors ,double price )
    {
        this.name = name ;
        this.authors = authors ;
        this.price = price ;
    }
    public book (String name , Author[]authors ,double price , int qty )
    {
        this.name = name ;
        this.authors= authors ;
        this.price = price ;
        this.qty = qty ;
    }
    public String getName()
    {
        return name;
    }
    public Author[] getAuthors()
    {
        return authors;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQty()
    {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    String getAuthName() {
        int index = authors.length;
        String listName="";
        for (int in = 0; in < index; in++) {
            listName += "AuthorName "+ in + " is " + authors[in].getName();
        }
        return listName;
    }

    public String toString()
    {
        return "Book [Name=" + getName() +"authors" + authors + ", Price=" + getPrice() + ", Qty=" + getQty() + "]";
    }

}
