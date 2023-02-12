package com.example.programalaberinto.Controllers;

import com.example.programalaberinto.Models.Jugador;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    private Jugador kirby;

    @FXML
    private AnchorPane fondo;

    @FXML
    private Button btnAbajo;

    @FXML
    private Button btnArriba;

    @FXML
    private Button btnDerecha;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnIzquierda;

    private ImageView hero;

    private ImageView monster;

    private ImageView monster1;

    @FXML
    void OnMousebtnAbajo(MouseEvent event) {

    }

    @FXML
    void OnMousebtnArriba(MouseEvent event) {

    }

    @FXML
    void OnMousebtnDerecha(MouseEvent event) {

    }

    @FXML
    void OnMousebtnExit(MouseEvent event) {

    }

    @FXML
    void OnMousebtnIzquierda(MouseEvent event) {

    }

    @FXML
    void OnMousebtnInicio(MouseEvent event) {
        hero = new ImageView(new Image(getClass().getResourceAsStream("/images/hero.png")));
        hero.setFitHeight(50);
        hero.setFitWidth(50);
        hero.setLayoutX(379);
        hero.setLayoutY(335);
        fondo.getChildren().add(hero);


        monster = new ImageView(new Image(getClass().getResourceAsStream("/images/monterObstaculo.gif")));
        monster.setFitHeight(50);
        monster.setFitWidth(50);
        monster.setLayoutX(309);
        monster.setLayoutY(335);
        fondo.getChildren().add(monster);

        monster1 = new ImageView(new Image(getClass().getResourceAsStream("/images/monterObstaculo.gif")));
        monster1.setFitHeight(50);
        monster1.setFitWidth(50);
        monster1.setLayoutX(109);
        monster1.setLayoutY(235);
        fondo.getChildren().add(monster1);



    }


}
