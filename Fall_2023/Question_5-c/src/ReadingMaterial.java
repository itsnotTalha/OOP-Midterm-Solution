abstract class ReadingMaterial {
    private String title;
    private String author;
    private int year;

    //constructor with parameter
    public ReadingMaterial(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //get methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    abstract void displayDetails();
}

//child class
class Book extends ReadingMaterial {
    private String genre;

    //constructor with parameter
    public Book(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    //method overriding
    void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("Genre: " + genre);
    }
}
//child class
class Magazine extends ReadingMaterial{
    private int issueNumber;
    public Magazine(String title, String author, int year, int issueNumber){
        super(title,author,year);
        this.issueNumber=issueNumber;
    }
    //method overriding
    void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("Issue Number: " + issueNumber);
    }
}