/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lodingwindowe;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author mahmo
 */
public class MainWindowController implements Initializable {

    LoginWindowController loginWindow = new LoginWindowController();
//    loginWindow.
//------
    @FXML
    private AnchorPane MainWindowScreen;
    @FXML
    private Pane patientPane;
    @FXML
    private ImageView p$patientImage;
    @FXML
    private Label p$patientName;
    @FXML
    private Label p$parientAge;
    @FXML
    private Label p$patientGender;
    @FXML
    private Label p$patientPathologicalCase;
    @FXML
    private Pane doctorPane;
    @FXML
    private ImageView doctorORnurse_image;
    @FXML
    private Label doctorORnurse_text;
    @FXML
    private ImageView d$doctorImage;
    @FXML
    private Label d$doctorName;
    @FXML
    private Label d$doctorAge;
    @FXML
    private Label d$doctorGender;
    @FXML
    private Label d$doctorSpecialization;
    @FXML
    private Label d$numberDoctors;
    @FXML
    private Label d$numberDoctorMale;
    @FXML
    private Label d$numberDoctorFemale;
    @FXML
    private Label d$numberNurserMale;
    @FXML
    private Label d$numberNurseFemale;
    @FXML
    private Label d$numberNurses;
    @FXML
    private Label d$addNewPatient;
    @FXML
    private Label d$numberPatients;
    @FXML
    private Label d$numberPatientFemale;
    @FXML
    private Label d$numberPatientsMale;
    @FXML
    private Label d$numberPaOverage;
    @FXML
    private Label d$numberPaChildren;
    @FXML
    private Label d$numberPaPregnant;
    @FXML
    private Label d$numberPaYoung;
    @FXML
    private Pane homePane;
    @FXML
    private VBox listOf_LastNews;
    @FXML
    private Pane doctorPaneSup;
    @FXML
    private Label numberDoctors;
    @FXML
    private Label numberDoctorMale;
    @FXML
    private Label numberDoctorFemale;
    @FXML
    private Pane nursesPaneSup;
    @FXML
    private Label numberNurserMale;
    @FXML
    private Label numberNurseFemale;
    @FXML
    private Label numberNurses;
    @FXML
    private Pane PatientPaneSup;
    @FXML
    private Label numberPatientFemale;
    @FXML
    private Label numberPatientsMale;
    @FXML
    private Label numberPatients;
    @FXML
    private Label numberPaOverage;
    @FXML
    private Label numberPaChildren;
    @FXML
    private Label numberPaPregnant;
    @FXML
    private Label numberPaYoung;
    @FXML
    private Pane listOf_Newsletter1;
    @FXML
    private Pane clo;
    @FXML
    private ImageView closeRed;
    @FXML
    private ImageView minemumRed;
    @FXML
    private ImageView close;
    @FXML
    private ImageView minemum;
    @FXML
    private TextField searchInput;
    @FXML
    private Pane men;
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
    private ImageView homeIcon;
    @FXML
    private ImageView doctorIcon;
    @FXML
    private ImageView patientIcon;
    @FXML
    private ImageView userIcon;
    @FXML
    private Pane logo;
    @FXML
    private HBox homeText;
    @FXML
    private HBox doctorText;
    @FXML
    private HBox patientText;
    @FXML
    private HBox singInText;

//    ----------------------------------
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

//++++++++++++++++++++++++++++++++++++++++++++++++++++++Main Pane.
        //-------------------------Doctor
        numberDoctors.setText(Integer.toString(MyDatabase.numberOfDoctors()));
        numberDoctorMale.setText(Integer.toString(MyDatabase.numberOfDoctorMale()));
        numberDoctorFemale.setText(Integer.toString(MyDatabase.numberOfDoctorFemale()));
        //------------------------------Nurse
        numberNurses.setText(Integer.toString(MyDatabase.numberOfNurses()));
        numberNurserMale.setText(Integer.toString(MyDatabase.numberOfNurserMale()));
        numberNurseFemale.setText(Integer.toString(MyDatabase.numberOfNurseFemale()));
        //-----------------------------Patient
        numberPatients.setText(Integer.toString(MyDatabase.numberOfPatients()));
        numberPatientsMale.setText(Integer.toString(MyDatabase.numberOfPatientsMale()));
        numberPatientFemale.setText(Integer.toString(MyDatabase.numberOfPatientFemale()));
        numberPaOverage.setText(Integer.toString(MyDatabase.numberOfPaOverage()));
        numberPaChildren.setText(Integer.toString(MyDatabase.numberOfPaChildren()));
        numberPaPregnant.setText("0");
        numberPaYoung.setText(Integer.toString(MyDatabase.numberoFPaYoung()));
//++++++++++++++++++++++++++++++++++++++++++++++++++++++Doctor Pane.

        //-------------------------Doctor
        d$numberDoctors.setText(Integer.toString(MyDatabase.numberOfDoctors()));
        d$numberDoctorMale.setText(Integer.toString(MyDatabase.numberOfDoctorMale()));
        d$numberDoctorFemale.setText(Integer.toString(MyDatabase.numberOfDoctorFemale()));
        //------------------------------Nurse
        d$numberNurses.setText(Integer.toString(MyDatabase.numberOfNurses()));
        d$numberNurserMale.setText(Integer.toString(MyDatabase.numberOfNurserMale()));
        d$numberNurseFemale.setText(Integer.toString(MyDatabase.numberOfNurseFemale()));
        //-----------------------------Patient
        //        vvv         //
    }//END initialize;

//***************************//
    public void getInfo(String s) {
        HashMap<String, String> ofin_d = MyDatabase.doctorInfo(s);
        d$doctorName.setText(ofin_d.get("fName") + " " + ofin_d.get("lName"));
        d$doctorAge.setText(ofin_d.get("age"));
        d$doctorGender.setText(ofin_d.get("gender"));
        d$doctorSpecialization.setText(ofin_d.get("specialization"));
//        Image img = new Image("doctor (1).png");
//        d$doctorImage.setImage(img);
//---------------------
        HashMap<String, String> ofin_p = MyDatabase.doctorInfoForPatient(s);
        d$numberPatients.setText(ofin_p.get("patients"));
        d$numberPatientsMale.setText(ofin_p.get("patientMale"));
        d$numberPatientFemale.setText(ofin_p.get("patientFemale"));
        d$numberPaOverage.setText(ofin_p.get("PaOverage"));
        d$numberPaChildren.setText(ofin_p.get("PaChildren"));
        d$numberPaPregnant.setText("0");
        d$numberPaYoung.setText(ofin_p.get("PaYoung"));
    }//END;
//-+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Main Pane +++
//++minimze|close

    @FXML
    private void showMinimizeRed(MouseEvent event) {
        minemumRed.setVisible(true);
        minemum.setOpacity(0);
    }//END;

    @FXML
    private void showCloseRed(MouseEvent event) {
        closeRed.setVisible(true);
        close.setOpacity(0);
    }//END;

    @FXML
    private void hidenMinimizeRed(MouseEvent event) {
        minemumRed.setVisible(false);
        minemum.setOpacity(1);
    }//END;

    @FXML
    private void hidenCloseRed(MouseEvent event) {
        closeRed.setVisible(false);
        close.setOpacity(1);
    }//END;

    @FXML
    private void mininizing(MouseEvent event) {
        Stage stage = (Stage) MainWindowScreen.getScene().getWindow();
        stage.setIconified(true);
    }//END;

    @FXML
    private void closing(MouseEvent event) {
        javafx.application.Platform.exit();
    }//END;
//sochialmedia

    @FXML
    private void hidenEmailRed(MouseEvent event) {
        emailRed.setVisible(false);
        email.setOpacity(1);
    }//END;

    @FXML
    private void showEmailRed(MouseEvent event) {
        emailRed.setVisible(true);
        email.setOpacity(0);
    }//END;

    @FXML
    private void hidenInstaRed(MouseEvent event) {
        instegramRed.setVisible(false);
        instegram.setOpacity(1);
    }//END;

    @FXML
    private void showInstaRed(MouseEvent event) {
        instegramRed.setVisible(true);
        instegram.setOpacity(0);
    }//END;

    @FXML
    private void hidenFaceBookRed(MouseEvent event) {
        faceBookRed.setVisible(false);
        faceBook.setOpacity(1);
    }//END;

    @FXML
    private void showFaceBookRed(MouseEvent event) {
        faceBookRed.setVisible(true);
        faceBook.setOpacity(0);
    }//END;

    @FXML
    private void hidenTueterRed(MouseEvent event) {
        tuetarRed.setVisible(false);
        tuetar.setOpacity(1);
    }//END;

    @FXML
    private void showTueterRed(MouseEvent event) {
        tuetarRed.setVisible(true);
        tuetar.setOpacity(0);
    }//END;

    @FXML
    private void hidenYoutupRed(MouseEvent event) {
        youtybeRed.setVisible(false);
        youtybe.setOpacity(1);
    }//END;

    @FXML
    private void showYoutupRed(MouseEvent event) {
        youtybeRed.setVisible(true);
        youtybe.setOpacity(0);
    }//END;
//    --------------------------------------------------------------------------

    @FXML
    private void hidenHomeText(MouseEvent event) {
        homeText.setVisible(false);
    }//END;

    @FXML
    private void showHomeText(MouseEvent event) {
        homeText.setVisible(true);
    }//END;

    @FXML
    private void goHomePane(MouseEvent event) {
        patientPane.setVisible(false);
        doctorPane.setVisible(false);
        homePane.setVisible(true);
    }//END;

    @FXML
    private void hidenDoctorText(MouseEvent event) {
        doctorText.setVisible(false);
    }//END;

    @FXML
    private void showDoctorText(MouseEvent event) {
        doctorText.setVisible(true);
    }//END;

    @FXML
    private void goDoctorPane(MouseEvent event) {
        patientPane.setVisible(false);
        homePane.setVisible(false);
        doctorPane.setVisible(true);
    }//END;

    @FXML
    private void hidenPatientText(MouseEvent event) {
        patientText.setVisible(false);
    }//END;

    @FXML
    private void showPatientText(MouseEvent event) {
        patientText.setVisible(true);
    }//END;

    @FXML
    private void goPatientPane(MouseEvent event) {
        doctorPane.setVisible(false);
        homePane.setVisible(false);
        patientPane.setVisible(true);
    }//END;

    @FXML
    private void showSearch(MouseEvent event) {
        searchInput.setVisible(true);
    }//END;

    @FXML
    private void onClickPane(MouseEvent event) {
        searchInput.setVisible(false);
    }//END;
//    -------------------------------------------------------------------------

    @FXML
    private void goToSingInScene(MouseEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.getIcons().add(new Image("icon.png"));
            stage.setTitle("Medical Clinic - Login User");
            stage.show();
            MainWindowScreen.getScene().getWindow().hide();
        } catch (IOException ex) {
            System.out.println(ex + " (-_-)");
        }
    }//END;

    @FXML
    private void hidenSingInText(MouseEvent event) {
        singInText.setVisible(false);
    }//END;

    @FXML
    private void showSingInText(MouseEvent event) {
        singInText.setVisible(true);
    }//END;

    @FXML
    private void addNew_LastNews(MouseEvent event) {
    }
//-+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Doctor Pane +++

}//END ALL;
