package Lab_03.Bai2;

public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;
    public Book(){
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }
    public Book(String boCode, String boTitle, String boAuthor){
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
    public Book(Book bo){
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public String getBoCode() {
        return this.boCode;
    }

    public void setBoCode(String code) {
        this.boCode = code;
    }

    public String getBoTitle() {
        return this.boTitle;
    }

    public void setBoTitle(String title) {
        this.boTitle = title;
    }

    public String getBoAuthor() {
        return this.boAuthor;
    }

    public void setBoAuthor(String authorname) {
        this.boAuthor = authorname;
    }
    public String toString() {
        return "{" +
            " boCode='" + getBoCode() + "'" +
            ", boTitle='" + getBoTitle() + "'" +
            ", boAuthor='" + getBoAuthor() + "'" +
            "}";
    }
}
