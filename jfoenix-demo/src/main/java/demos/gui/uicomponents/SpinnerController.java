package demos.gui.uicomponents;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXSpinner;

import io.datafx.controller.ViewController;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.util.Duration;

@ViewController(value = "/com/jfoenix/assets/fxml/ui/Spinner.fxml", title = "Material Design Example")
public class SpinnerController
{

   @FXML
   private JFXSpinner blueSpinner;
   @FXML
   private JFXSpinner greenSpinner;

   public void initialize(URL location, ResourceBundle resources) throws Exception
   {
      Timeline timeline = new Timeline(new KeyFrame(Duration.ZERO,
                                                    new KeyValue(blueSpinner.progressProperty(), 0),
                                                    new KeyValue(greenSpinner.progressProperty(), 0)),
                                       new KeyFrame(Duration.seconds(0.5), new KeyValue(greenSpinner.progressProperty(), 0.5)),
                                       new KeyFrame(Duration.seconds(2),
                                                    new KeyValue(blueSpinner.progressProperty(), 1),
                                                    new KeyValue(greenSpinner.progressProperty(), 1)));
      timeline.setCycleCount(Timeline.INDEFINITE);
      timeline.play();
   }

}
