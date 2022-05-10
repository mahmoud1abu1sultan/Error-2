package lodingwindowe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author MAHMOUD.T
 */
public class LoginWindowController implements Initializable {

    @FXML
    private AnchorPane loginScren;
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
    private Pane mainPane;
    @FXML
    private ImageView minemumRed;
    @FXML
    private ImageView closeRed;
    @FXML
    private ImageView minemum;
    @FXML
    private ImageView close;
    @FXML
    private Label successCreat;
    @FXML
    private TextField loginPassword;
    @FXML
    private TextField loginEmail;
    @FXML
    private Pane newAcountPane;
    @FXML
    private TextField logupFName;
    @FXML
    private TextField logupLNmae;
    @FXML
    private TextField logupEmail;
    @FXML
    private TextField logupPassword;
    @FXML
    private TextField logupConfirmPassword;
    @FXML
    private Label notpassCreat;
    @FXML
    private RadioButton maleSelect;
    @FXML
    private RadioButton femaleSelect;
    @FXML
    private TextField logupAge;
    @FXML
    private Pane forgetPane;
    @FXML
    private TextField codePass;
    @FXML
    private ProgressIndicator resendLod;
    @FXML
    private Label notCode;
    @FXML
    private Pane updatePassPane;
    @FXML
    private TextField newPass;
    @FXML
    private TextField newPassConfirm;
    @FXML
    private Label notPass;
    @FXML
    private TextField oldEmail;
    @FXML
    private Label loginNotCorrect;
//media-

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        MyDatabase.getConnection();
        //---------------------
    }//END initialize;
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
        Stage stage = (Stage) loginScren.getScene().getWindow();
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
//^^^

    @FXML
    private void singInClick(MouseEvent event) throws IOException {
        String email_si = loginEmail.getText();
        String pass_si = loginPassword.getText();
//        int status = (doctor.isSelected()) ? 1 : 0;
        boolean check = MyDatabase.singInCheck(email_si, pass_si);
        if (check) {
            //---
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            Parent root = (Parent) loader.load();
            MainWindowController con = loader.getController();
            con.getInfo(loginEmail.getText());
            //-
//            MyDatabase db = new MyDatabase();
//            db.getInfo(loginEmail.getText());
            //-
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.getIcons().add(new Image("icon.png"));
            stage.setTitle("Medical Clinic");
            loginScren.getScene().getWindow().hide();
            stage.show();
        } else {
            loginNotCorrect.setVisible(true);
        }
    }

    @FXML
    private void creatNewAcountClick(MouseEvent event) {
        if (forgetPane.isVisible()) {
            forgetPane.setVisible(false);
        }
        newAcountPane.setVisible(true);
//        
    }

    @FXML
    private void forgetPass(MouseEvent event) {
        if (newAcountPane.isVisible()) {
            newAcountPane.setVisible(false);
        }
        if (loginNotCorrect.isVisible()) {
            loginNotCorrect.setVisible(false);
        }
        resendLod.setProgress(0);
        forgetPane.setVisible(true);
    }

    @FXML
    private void singUpClick(MouseEvent event) {
        String fName_su = logupFName.getText();
        String lName_su = logupLNmae.getText();
        String email_su = logupEmail.getText();
        String pass_su = logupPassword.getText();
        String gender_us = (maleSelect.isSelected()) ? "male" : "female";
        int age_us = Integer.decode(logupAge.getText());
//        int status = (Casedoctor.isSelected()) ? 1 : 0;

        if (logupPassword.getText().equalsIgnoreCase(logupConfirmPassword.getText())
                && !logupPassword.getText().isEmpty()
                && !logupFName.getText().isEmpty()
                && !logupLNmae.getText().isEmpty()
                && !logupEmail.getText().isEmpty()
                && (maleSelect.isSelected() ^ femaleSelect.isSelected())
                && !logupAge.getText().isEmpty()) {
            User user = new User(fName_su, lName_su, email_su, pass_su, gender_us, age_us);
            MyDatabase.singUp(user);

            //------------------------------
            if (notpassCreat.isVisible()) {
                notpassCreat.setVisible(false);
            }
            newAcountPane.setVisible(false);
            successCreat.setText("Successful Createing (^_^)");
            successCreat.setVisible(true);
        } else {
            notpassCreat.setVisible(true);
        }
    }

    @FXML
    private void backCreateClick(MouseEvent event) {
        if (successCreat.isVisible()) {
            successCreat.setVisible(false);
        }
        newAcountPane.setVisible(false);
    }

    @FXML
    private void verificationClick(MouseEvent event) {
        if (codePass.getText().equalsIgnoreCase("123")) {//-----???
//            DB
            newAcountPane.setVisible(false);
            forgetPane.setVisible(false);
            oldEmail.setText(loginEmail.getText());
            updatePassPane.setVisible(true);
        } else {
            notCode.setVisible(true);
        }
    }//DB

    @FXML
    private void backForgetClick(MouseEvent event) {
        if (successCreat.isVisible()) {
            successCreat.setVisible(false);
        }
        if (notCode.isVisible()) {
            notCode.setVisible(false);
        }
        resendLod.setProgress(0);
        forgetPane.setVisible(false);
    }

    @FXML
    private void resendCode(MouseEvent event) throws InterruptedException {
        resendLod.setVisible(true);
        resendLod.setProgress(1);
    }

    @FXML
    private void updatePassClick(MouseEvent event) {
        String oldEmail_up = oldEmail.getText();
        String pass_up = newPass.getText();
//        boolean status = (doctor.isSelected());

        if (newPass.getText().equals(newPassConfirm.getText())
                && !newPass.getText().isEmpty()
                && !oldEmail.getText().isEmpty()) {
            MyDatabase.updatePass(oldEmail_up, pass_up);

            if (notPass.isVisible()) {
                notPass.setVisible(false);
            }
            if (newAcountPane.isVisible()) {
                newAcountPane.setVisible(false);
            }
            forgetPane.setVisible(false);
            updatePassPane.setVisible(false);
            successCreat.setText("successful Update (^_^)");
            successCreat.setVisible(true);
        } else {
            notPass.setVisible(true);
        }
    }

    @FXML
    private void backUpdatePassClick(MouseEvent event) {
        if (notPass.isVisible()) {
            notPass.setVisible(false);
        }
        if (newAcountPane.isVisible()) {
            newAcountPane.setVisible(false);
        }
        forgetPane.setVisible(false);
        updatePassPane.setVisible(false);
    }

}
