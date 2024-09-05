package Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorThing {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void appendNumber(ActionEvent event)
    {

    }

    @FXML
    void selectOperator(ActionEvent event)
    {

    }
    void calculate(ActionEvent event)
    {
        Label result_lbl = null;
        double secondNum = Double.parseDouble(result_lbl.getText());
        double firstNum = 0;
        boolean isNumber;
        Label running_lbl = null;
        String operator = null;
        running_lbl.setText(firstNum + " " + operator + " " + secondNum);
        switch (operator) {
            case "+":
                firstNum += secondNum;
                break;
            case "-":
                firstNum -= secondNum;
                break;
            case "*":
                firstNum *= secondNum;
                break;
            case "/":
                if (secondNum != 0)
                {
                    firstNum /= secondNum;
                }
                else
                {
                    result_lbl.setText(("Error 404 Nononono dont do tis"));
                }
                break;
        }

    }
}