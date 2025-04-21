package presentation;


import presentation.controllers.*;


public class LibraryApp {
    MemberController memberController;
    LibrarianController librarianController;
    DirectorController directorController;

    BookController bookController;
    MagazineController magazineController;
    DVDController dvdController;

    public LibraryApp() {
        memberController = new MemberController();
        librarianController = new LibrarianController();
        directorController = new DirectorController();

        bookController = new BookController();
        magazineController = new MagazineController();
        dvdController = new DVDController();
    }
}
