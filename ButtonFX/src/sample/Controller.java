package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button clickMeButton;


    public void initialize() {
        /*
        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Click on the button will print out a message in console.
                System.out.println("You clicked me!  ");
            }
        });
        */

        /* Lambda expression version.   */
        clickMeButton.setOnAction(event -> System.out.println("You clicked me!  "));
    }

}
