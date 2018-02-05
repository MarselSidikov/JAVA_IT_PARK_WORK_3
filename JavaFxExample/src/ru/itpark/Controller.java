package ru.itpark;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.List;

public class Controller {

  @FXML
  private AnchorPane mainPane;

  @FXML
  private Button searchButton;

  @FXML
  private TextField userIdTextField;

  @FXML
  public void initialize() {
    VkApi vkApi = VkApiBuilder.build();
    searchButton.setOnAction(event -> {
      List<UserDto> friends = vkApi.getFriends(
          Integer.parseInt(userIdTextField.getText()));
      VBox boxPane = new VBox();
      for (int i = 0; i < 10; i++) {
        UserDto friend = friends.get(i);
        ImageView image = new ImageView(friend.getPhoto());
        TitledPane titledPane = new TitledPane(
            friend.getFirstName()
                + " " + friend.getLastName(), image);
        titledPane.setExpanded(false);
        boxPane.getChildren().add(titledPane);
      }
      ScrollPane scrollPane = new ScrollPane(boxPane);
      scrollPane.setFitToHeight(true);
      scrollPane.setLayoutX(0);
      scrollPane.setLayoutY(0);
      mainPane.getChildren().add(scrollPane);
    });
  }
}
