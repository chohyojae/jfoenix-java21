package demos.gui.uicomponents;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.effects.JFXDepthManager;
import com.jfoenix.utils.JFXHighlighter;
import com.jfoenix.utils.JFXNodeUtils;

import io.datafx.controller.ViewController;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

@ViewController(value = "/com/jfoenix/assets/fxml/ui/Highlighter.fxml", title = "Material Design Example")
public class HighlighterController
{

   @FXML
   private JFXTextField searchField;
   @FXML
   private Pane content;

   private JFXHighlighter highlighter = new JFXHighlighter();

   /**
    * init fxml when loaded.
    */
   public void initialize(URL location, ResourceBundle resources) throws Exception
   {
      JFXDepthManager.setDepth(content, 1);
      JFXNodeUtils.addDelayedEventHandler(searchField,
                                          Duration.millis(400),
                                          KeyEvent.KEY_PRESSED,
                                          event -> highlighter.highlight(content, searchField.getText()));
   }
}
