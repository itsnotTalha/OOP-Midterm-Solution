abstract class ReadingMaterial {
    private String title;
    private String author;
    private int year;

    public ReadingMaterial(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

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
