package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("Main.fxml"));
        stage.setTitle("Hello world");
        stage.setScene(new Scene(root,500,300));
        stage.show();
    }

    public static void Main(String[] args)
    {
        launch(args);
    }


}
