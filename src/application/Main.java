package application;

import application.mainWindows.login.Login;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static final String PAGE_ICON_PATH = "images/GmailIcon.png";

    @Override
    public void start(Stage primaryStage) throws Exception {
        new Login().display();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
