package demos.gui.uicomponents;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;

import io.datafx.controller.ViewController;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

@ViewController(value = "/com/jfoenix/assets/fxml/ui/Pickers.fxml", title = "Material Design Example")
public class PickersController
{

   @FXML
   private StackPane root;
   @FXML
   private JFXDatePicker dateOverlay;
   @FXML
   private JFXTimePicker timeOverlay;

   public void initialize(URL location, ResourceBundle resources) throws Exception
   {
      dateOverlay.setDialogParent(root);
      timeOverlay.setDialogParent(root);
   }
}
