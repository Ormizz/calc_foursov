import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {


    static Stage stage;
    static Scene scene;
    static Parent root;

    static String userId;

    @Override
    public void start(Stage primaryStage) throws Exception{
        root = FXMLLoader.load(getClass().getResource("views/face.fxml"));
        primaryStage.setTitle("Calculatrice");
        primaryStage.setScene(new Scene(root, 288, 306));
        primaryStage.show();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
}}
