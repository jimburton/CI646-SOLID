package CI646.books;

public class BookContentsFormatter extends BookFormatter {

    public BookContentsFormatter ( Book book ) {
        super ( book );
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append(formatInfo());
        for(int i=0;i<book.getLength();i++) {
            sb.append("------------------------------------------------- ");
            sb.append(formatHeader());
            sb.append("------------------------------------------------- \n");

            sb.append(formatPage());
            book.turnPage();
        }
        return sb.toString();
    }
}
