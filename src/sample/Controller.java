package sample;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {


    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpSurname;

    @FXML
    private TextField signUpCourse;

    @FXML
    private TextField signUpGroup;


    @FXML
    private Button LoginButton;


    @FXML
    Button NextButton;

    @FXML
    Button RepeatButton;


    @FXML
    private ToggleGroup answers;


    public void initialize() throws SQLException, ClassNotFoundException, NullPointerException{

        /*DatabaseHandler dbHandler = new DatabaseHandler();
        LoginButton.setOnAction(event -> {
            try {
                dbHandler.signUpUser(signUpName.getText(), signUpSurname.getText(), Integer.parseInt(signUpCourse.getText()), signUpGroup.getText(), "Male");
            } catch (SQLException | ClassNotFoundException | NullPointerException throwables) {
                System.out.println("Вы не не заполнили данные");

                throwables.printStackTrace();
            }

        }); */

    }

    public void switchToPage1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/page1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }

    public void switchToPage2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/page2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToPage3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/page3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToPage4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/page4.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToFinishPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/FinishPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSamplePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}































