package demos.components;

import com.jfoenix.controls.JFXSlider.IndicatorPosition;
import com.jfoenix.controls.JFXTrimSlider;

import demos.ApplicationNoModule;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JFXTrimSliderDemo extends ApplicationNoModule
{
   @Override
   public void start(Stage primaryStage) throws Exception
   {
      ToggleButton showTrimButton = new ToggleButton("Show trim");
      JFXTrimSlider cropSlider1 = new JFXTrimSlider();
      cropSlider1.showTrimProperty().bind(showTrimButton.selectedProperty());
      cropSlider1.setOrientation(Orientation.HORIZONTAL);
      cropSlider1.setIndicatorPosition(IndicatorPosition.LEFT);

      JFXTrimSlider cropSlider2 = new JFXTrimSlider();
      cropSlider2.showTrimProperty().bind(showTrimButton.selectedProperty());
      cropSlider2.setOrientation(Orientation.HORIZONTAL);
      cropSlider2.setIndicatorPosition(IndicatorPosition.RIGHT);

      JFXTrimSlider cropSlider3 = new JFXTrimSlider();
      cropSlider3.showTrimProperty().bind(showTrimButton.selectedProperty());
      cropSlider3.setOrientation(Orientation.VERTICAL);
      cropSlider3.setIndicatorPosition(IndicatorPosition.LEFT);

      JFXTrimSlider cropSlider4 = new JFXTrimSlider();
      cropSlider4.showTrimProperty().bind(showTrimButton.selectedProperty());
      cropSlider4.setOrientation(Orientation.VERTICAL);
      cropSlider4.setIndicatorPosition(IndicatorPosition.RIGHT);
      
      VBox pane = new VBox(60.0, showTrimButton, cropSlider1, cropSlider2, cropSlider3, cropSlider4);
      pane.alignmentProperty().set(Pos.CENTER);
      pane.setPadding(new Insets(50.0));
      Scene scene = new Scene(pane);
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
