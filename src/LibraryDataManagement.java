import java.util.Scanner;
class LibraryItem
{
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    int year;
}
class Book extends LibraryItem
{
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;
}
class Magazine extends LibraryItem
{
    int issue;
}
public class LibraryDataManagement
{
    public static void main(String[] args) {
        Magazine magazine=new Magazine();
        Book book=new Book();
        magazine.setId(101);
        magazine.setTitle("Harry Potter");
        magazine.year=2002;
        magazine.issue=2023;
        book.setAuthor("J.K.Rowling");
        System.out.print(magazine.getId()+" "+magazine.getTitle()+" "+book.getAuthor()+" "+magazine.year+" "+magazine.issue);
    }
}
