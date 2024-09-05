module com.example.nadeemsassinuserregistration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nadeemsassinuserregistration to javafx.fxml;
    exports com.example.nadeemsassinuserregistration;
}