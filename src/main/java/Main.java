import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<String> booksList = new ArrayList<>();

    public static void main(String[] args) {
        booksList.add("1");
        booksList.add("65");
        booksList.add("0");
        booksList.add("-6");
        booksList.add("11");
        booksList.add("56");
        booksList.add("99");
        booksList.add("1354651");
        booksList.add("85");
        booksList.add("1");
        booksList.add("55");

    }

    private static List<List<String>> getBooksByShelf(List<String> list) {
        Collections.sort(list);
        int numberOfBooksOnShelves = Math.round(list.size()/5);
        List<List<String>> booksByShelvesList = new ArrayList<>(List.of(new ArrayList(), new ArrayList(),
                new ArrayList(), new ArrayList(), new ArrayList()));
        int currentList = 0;
        for (int i = 0; i < list.size(); i++) {
            booksByShelvesList.get(currentList).add(list.get(i));
            if(currentList+1 != booksByShelvesList.size()) {
                if(i+1 % numberOfBooksOnShelves == 0) {
                    currentList++;
                }
            }
        }
        return booksByShelvesList;
    }

}






