module com.example.wordcoun {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wordcoun to javafx.fxml;
    exports com.example.wordcoun;
}