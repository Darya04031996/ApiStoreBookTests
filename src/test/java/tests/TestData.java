package tests;

import models.BookDataModel;
import models.CredentialsModel;

public class TestData {
    private static final String login = System.getProperty("userName", "defaultUser");
    private static final String password = System.getProperty("password", "defaultPass");

    public static CredentialsModel credentials = new CredentialsModel(login, password);

    private static final String book_isbn = "9781449325862";
    private static final String book_title = "Git Pocket Guide";
    public static final BookDataModel book = new BookDataModel(book_isbn, book_title);
}

