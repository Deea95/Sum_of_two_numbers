package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Sum_Controller implements Initializable {

    @FXML
    private TextField txtPrimul;

    @FXML
    private TextField txtAlDoilea;

    @FXML
    private Label lblRezultat;

    @FXML
    private void lblRezultat (MouseEvent ev){
        lblRezultat.setOnMouseClicked(e->{
            lblRezultat.setText(Integer.parseInt(txtPrimul.getText()) + Integer.parseInt(txtAlDoilea.getText())+ "");
        });
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) { }
}
