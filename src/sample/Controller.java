package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller { // veiksmus rasysime kuriuos programuosim ant mygtuku

    @FXML
    private Label text;

    public void sayHi(ActionEvent event){
        String prefix = text.getText();
        text.setText(prefix + " , Jau Isvyk!");


    }
}
