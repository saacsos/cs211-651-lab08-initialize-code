package ku.cs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.github.saacsos.FXRouter;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "Change this String to your student ID or get 0 point", 800, 600);
        configRoute();
        FXRouter.goTo("home");

    }
    private static void configRoute() {
        String packageStr = "ku/cs/";
        FXRouter.when("member_card_detail", packageStr+"member_card_detail.fxml");
        FXRouter.when("home", packageStr+"home.fxml");
        FXRouter.when("about", packageStr+"about.fxml");
        FXRouter.when("member_card_list", packageStr+"member_card_list.fxml");
    }


    public static void main(String[] args) {
        launch();
    }
}