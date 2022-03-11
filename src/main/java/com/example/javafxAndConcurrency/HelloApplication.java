package com.example.javafxAndConcurrency;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Button startButton = new Button("Start");
    Button exitButton = new Button("Exit");
    Label statusLabel = new Label("(not started)");
    TextArea textArea = new TextArea("-");

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = createSceneForStage(stage);
        stage.setScene(scene);

        stage.setTitle("Hello!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


    private Scene createSceneForStage(Stage stage){
        Pane pane = new Pane();
        pane.getChildren().add(statusLabel);
        pane.getChildren().add(textArea);

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {/*startTask();*/}});

        exitButton.setOnAction(new EventHandler <ActionEvent>() {
            public void handle(ActionEvent event) {stage.close();}});

        pane.getChildren().add(startButton);
        pane.getChildren().add(exitButton);

        startButton.setTranslateX(100);
        exitButton.setTranslateX(150);
        textArea.setTranslateY(40);

        Scene scene = new Scene(pane);
        return scene;
    }

}