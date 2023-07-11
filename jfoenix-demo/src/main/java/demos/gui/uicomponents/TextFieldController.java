package demos.gui.uicomponents;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import io.datafx.controller.ViewController;
import javafx.fxml.FXML;

@ViewController(value = "/com/jfoenix/assets/fxml/ui/TextField.fxml", title = "Material Design Example")
public class TextFieldController
{

   @FXML
   private JFXTextField validatedText;
   @FXML
   private JFXPasswordField validatedPassword;
   @FXML
   private JFXTextArea jfxTextArea;

   /**
    * init fxml when loaded.
    */
   public void initialize(URL location, ResourceBundle resources) throws Exception
   {
      validatedText.focusedProperty().addListener((o, oldVal, newVal) ->
      {
         if (!newVal)
         {
            validatedText.validate();
         }
      });
      validatedPassword.focusedProperty().addListener((o, oldVal, newVal) ->
      {
         if (!newVal)
         {
            validatedPassword.validate();
         }
      });
      jfxTextArea.focusedProperty().addListener((o, oldVal, newVal) ->
      {
         if (!newVal)
         {
            jfxTextArea.validate();
         }
      });
   }

}
