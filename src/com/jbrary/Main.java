package com.jbrary;

import com.jbrary.model.DBHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("JBrary");
        primaryStage.setResizable(false);
        Scene scene = new Scene(root, 1000, 650);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        DBHelper.getInstance().open();
    }

    @Override
    public void stop() throws Exception {
        DBHelper.getInstance().close();
        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
