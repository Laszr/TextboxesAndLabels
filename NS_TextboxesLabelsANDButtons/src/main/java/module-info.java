module com.example.ns_textboxeslabelsandbuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ns_textboxeslabelsandbuttons to javafx.fxml;
    exports com.example.ns_textboxeslabelsandbuttons;
}