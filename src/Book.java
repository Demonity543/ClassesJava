import java.sql.Date;

public class Book {
    private String _name;
    private String _NameAutor;
    private Date _publishDate;
    private String _namePuplisher;
    private String _GenreBook;
    private short _countPage;

    public void setName(String newName) {
        _name = newName;
    }

    public void setNameAutor(String newNameAutor) {
        _NameAutor = newNameAutor;
    }

    public void setPublishDate(Date newPublishDate) {
        _publishDate = newPublishDate;
    }

    public void setNamePublisher(String newNamePublisher) {
        _namePuplisher = newNamePublisher;
    }

    public String getName() {
        return _name;
    }

    public String getNameAutor() {
        return _NameAutor;
    }

    public String getPublishDate() {
        return _publishDate.toLocalDate().toString();
    }

    public String getPublisher() {
        return _namePuplisher;
    }

    public String getBook() {
        return "\nName: " + getName() + "\nAutor: " + getNameAutor() + "\nPublish date: " + getPublishDate()
                + "\nPublisher: " + getPublisher() + "\nGenre book:" + _GenreBook + "\nCount page: "
                + Integer.toString(_countPage);
    }

}