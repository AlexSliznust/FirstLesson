public class Book {
    private Type booKtype;
    String name;
    String author;
    Book(Type booktype, String name, String author) {
        this.booKtype = booktype;
        this.name = name;
        this.author = author;
    }
    String getType() {
        switch (booKtype) {
            case BELLETRE:
                return "belletre";
            case NOVEL:
                return "novel";
            case ESSAY:
                return "essay";
            default:
                return "unknown";
        }
    }

}

enum Type {
    BELLETRE, NOVEL, ESSAY;
}