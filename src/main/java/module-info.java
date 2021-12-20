module org.biqcat.pochatnik {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.biqcat.pochatnik to javafx.fxml;
    exports org.biqcat.pochatnik;
}