package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class TemplateController {
    @FXML
    private ComboBox<String> cboTemplates;
    @FXML
    private Label templateName;

    public void initialize() {
        cboTemplates.setItems(FXCollections.observableArrayList("Template 1", "Template 2", "Template 3", "Template 4"));
    }

    public void changeTemplateName() {
        templateName.setText(cboTemplates.getValue());
    }

    public void toCalendar(MouseEvent mouseEvent) throws IOException {
        Parent calendarParent = FXMLLoader.load(getClass().getResource("calendar.fxml"));
        Scene calendarScene = new Scene(calendarParent);
        Stage calendarStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        calendarStage.setScene(calendarScene);
        calendarStage.show();
    }
}
