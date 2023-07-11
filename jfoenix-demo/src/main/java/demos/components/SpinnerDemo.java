package demos.components;

import com.jfoenix.assets.JFoenixResources;
import com.jfoenix.controls.JFXSpinner;

import demos.ApplicationNoModule;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SpinnerDemo extends ApplicationNoModule
{

   @Override
   public void start(final Stage stage) throws Exception
   {

      StackPane pane = new StackPane();

      JFXSpinner root = new JFXSpinner();

      pane.getChildren().add(root);

      final Scene scene = new Scene(pane, 300, 300);
      scene.getStylesheets().add(JFoenixResources.load("css/jfoenix-components.css").toExternalForm());
      stage.setScene(scene);
      stage.setTitle("JFX Spinner Demo");
      stage.show();
   }

   public static void main(final String[] arguments)
   {
      launch(arguments);
   }
}
