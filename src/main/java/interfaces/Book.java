package main.java.interfaces;

public class Book implements Product{
    private String name;
    private int pages;

    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Mary");
        System.out.println(book.getName());
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name) {
        System.out.println("Name is set to: " + name);
    }
}
