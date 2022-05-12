package lodingwindowe;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author MAHMOUD.T
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label lodingText;

    @FXML
    private AnchorPane LodingScreen;

    @FXML
    private ImageView email;
    @FXML
    private ImageView instegram;
    @FXML
    private ImageView faceBook;
    @FXML
    private ImageView tuetar;
    @FXML
    private ImageView youtybe;
    @FXML
    private ImageView minemum;
    @FXML
    private ImageView close;
    @FXML
    private ImageView minemumRed;
    @FXML
    private ImageView closeRed;
    @FXML
    private ImageView emailRed;
    @FXML
    private ImageView instegramRed;
    @FXML
    private ImageView faceBookRed;
    @FXML
    private ImageView tuetarRed;
    @FXML
    private ImageView youtybeRed;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Atrebute^
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        from_Loding$Window_to();
    }

    private void taskLoding() {
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                File file = new File("src/reading");
                File[] listOfFile = file.listFiles();
//                ------
                for (int i = 0; i < listOfFile.length; i++) {
                    updateProgress(i, listOfFile.length);
                    updateMessage(listOfFile[i].getName());
                    Thread.sleep(50);
                }
                return null;
            }
        };

        task.messageProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                lodingText.setText(newValue + " Reading ...");
            }
        });

        progressBar.progressProperty().unbind();
        progressBar.progressProperty().bind(task.progressProperty());
        Thread th = new Thread(task);
        th.setDaemon(true);
        th.start();
    }

//=++++++++++++++++++++++++++++++++++++++++
    private void from_Loding$Window_to() {

//  -----------------
        new Thread() {
            public void run() {
                try {
                    taskLoding();
                    Thread.sleep(1000);//10000
                } catch (InterruptedException ex) {
                    System.out.println(ex + " (-_-)");
                }
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Parent root = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
                            Stage stage = new Stage();
                            Scene scene = new Scene(root);
                            stage.setScene(scene);
                            stage.initStyle(StageStyle.UNDECORATED);
                            stage.getIcons().add(new Image("icon.png"));
                            stage.setTitle("Medical Clinic - Login User");
                            stage.show();
                            LodingScreen.getScene().getWindow().hide();
                        } catch (IOException ex) {
                            System.out.println(ex + " (-_-)");
                        }
                    }
                });
            }
        }.start();
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++minimze|close

    @FXML
    private void showMinimizeRed(MouseEvent event) {
        minemumRed.setVisible(true);
        minemum.setOpacity(0);
    }
    @FXML
    private void showCloseRed(MouseEvent event) {
        closeRed.setVisible(true);
        close.setOpacity(0);
    }
    @FXML
    private void hidenMinimizeRed(MouseEvent event) {
        minemumRed.setVisible(false);
        minemum.setOpacity(1);
    }
    @FXML
    private void hidenCloseRed(MouseEvent event) {
        closeRed.setVisible(false);
        close.setOpacity(1);
    }

    @FXML
    private void mininizing(MouseEvent event) {
        Stage stage = (Stage) LodingScreen.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void closing(MouseEvent event) {
        javafx.application.Platform.exit();
    }
//sochialmedia

    @FXML
    private void hidenEmailRed(MouseEvent event) {
        emailRed.setVisible(false);
        email.setOpacity(1);
    }
    @FXML
    private void showEmailRed(MouseEvent event) {
        emailRed.setVisible(true);
        email.setOpacity(0);
    }
    @FXML
    private void hidenInstaRed(MouseEvent event) {
        instegramRed.setVisible(false);
        instegram.setOpacity(1);
    }
    @FXML
    private void showInstaRed(MouseEvent event) {
        instegramRed.setVisible(true);
        instegram.setOpacity(0);
    }
    @FXML
    private void hidenFaceBookRed(MouseEvent event) {
        faceBookRed.setVisible(false);
        faceBook.setOpacity(1);
    }
    @FXML
    private void showFaceBookRed(MouseEvent event) {
        faceBookRed.setVisible(true);
        faceBook.setOpacity(0);
    }
    @FXML
    private void hidenTueterRed(MouseEvent event) {
        tuetarRed.setVisible(false);
        tuetar.setOpacity(1);
    }
    @FXML
    private void showTueterRed(MouseEvent event) {
        tuetarRed.setVisible(true);
        tuetar.setOpacity(0);
    }
    @FXML
    private void hidenYoutupRed(MouseEvent event) {
        youtybeRed.setVisible(false);
        youtybe.setOpacity(1);
    }
    @FXML
    private void showYoutupRed(MouseEvent event) {
        youtybeRed.setVisible(true);
        youtybe.setOpacity(0);
    }

}//END;
