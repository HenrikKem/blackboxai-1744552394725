package com.studyplanner;

import javafx.scene.control.*;
import javafx.scene.layout.*;

public class MainView extends BorderPane {
    public MainView() {
        createView();
    }

    private void createView() {
        // Top menu
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("Datei");
        Menu helpMenu = new Menu("Hilfe");
        menuBar.getMenus().addAll(fileMenu, helpMenu);
        
        // Calendar view
        TabPane tabPane = new TabPane();
        Tab calendarTab = new Tab("Kalender");
        Tab subjectsTab = new Tab("Fächer");
        Tab progressTab = new Tab("Fortschritt");
        
        tabPane.getTabs().addAll(calendarTab, subjectsTab, progressTab);
        
        // Status bar
        Label statusLabel = new Label("Bereit");
        StatusBar statusBar = new StatusBar(statusLabel);
        
        // Layout
        this.setTop(menuBar);
        this.setCenter(tabPane);
        this.setBottom(statusBar);
    }
}

class StatusBar extends HBox {
    public StatusBar(Label statusLabel) {
        this.getChildren().add(statusLabel);
        this.setStyle("-fx-background-color: #eee; -fx-padding: 5px;");
    }
}
