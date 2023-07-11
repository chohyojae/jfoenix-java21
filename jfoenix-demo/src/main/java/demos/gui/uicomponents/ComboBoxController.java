package demos.gui.uicomponents;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXComboBox;

import io.datafx.controller.ViewController;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.StringConverter;

@ViewController(value = "/com/jfoenix/assets/fxml/ui/Combobox.fxml", title = "Material Design Example")
public class ComboBoxController
{

   @FXML
   private JFXComboBox<Label> jfxComboBox;
   @FXML
   private JFXComboBox<Label> jfxEditableComboBox;

   /**
    * init fxml when loaded.
    */
   public void initialize(URL location, ResourceBundle resources) throws Exception
   {

      jfxComboBox.focusedProperty().addListener((o, oldVal, newVal) ->
      {
         if (!newVal)
         {
            jfxComboBox.validate();
         }
      });

      ChangeListener<? super Boolean> comboBoxFocus = (o, oldVal, newVal) ->
      {
         if (!newVal)
         {
            jfxEditableComboBox.validate();
         }
      };
      jfxEditableComboBox.focusedProperty().addListener(comboBoxFocus);
      jfxEditableComboBox.getEditor().focusedProperty().addListener(comboBoxFocus);
      jfxEditableComboBox.setConverter(new StringConverter<Label>()
      {
         @Override
         public String toString(Label object)
         {
            return object == null ? "" : object.getText();
         }

         @Override
         public Label fromString(String string)
         {
            return string == null || string.isEmpty() ? null : new Label(string);
         }
      });
   }

}
