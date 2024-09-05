package com.example.wordcoun;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label button;

    @FXML
    private Label charCount;

    @FXML
    private Label wordCount;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public Label getButton() {
        return button;
    }

    public void setButton(Label button) {
        this.button = button;
    }

}