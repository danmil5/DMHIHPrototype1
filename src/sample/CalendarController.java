package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CalendarController {

    public void toTemplate(MouseEvent mouseEvent) throws IOException {
        Parent templateParent = FXMLLoader.load(getClass().getResource(
                "template.fxml"));
        Scene templateScene = new Scene(templateParent);
        Stage templateStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        templateStage.setScene(templateScene);
        templateStage.show();
    }
}
