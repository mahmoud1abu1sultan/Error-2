/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lodingwindowe;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
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

//    LoginWindowController loginWindow = new LoginWindowController();
//    loginWindow.
//------
    @FXML
    private AnchorPane MainWindowScreen;
    @FXML
    private Pane patientPane;
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
    @FXML
    private TextField m$newsTitle;
    @FXML
    private TextField m$newsDescription;
    @FXML
    private Separator m$seperator;
    @FXML
    private Pane m$pane_addNews;
    @FXML
    private VBox m$listOf_LastNews;
    @FXML
    private Label m$subNews1_t;
    @FXML
    private Label m$subNews1_d;
    @FXML
    private Label m$subNews2_t;
    @FXML
    private Label m$subNews2_d;
    @FXML
    private Label m$subNews3_t;
    @FXML
    private Label m$subNews3_d;
    @FXML
    private Label m$subNews4_t;
    @FXML
    private Label m$subNews4_d;
    @FXML
    private Label m$subNews5_t;
    @FXML
    private Label m$subNews5_d;
    @FXML
    private Label m$subNews6_t;
    @FXML
    private Label m$subNews6_d;
    @FXML
    private ScrollPane m$lastNewsAorede;
    @FXML
    public TableView<Patients> p$tableViweP;
    @FXML
    private TableColumn<Patients, String> p$Fname;
    @FXML
    private TableColumn<Patients, String> p$Lname;
    @FXML
    private TableColumn<Patients, String> p$gender;
    @FXML
    private TableColumn<Patients, Integer> p$age;
    @FXML
    private TableColumn<Patients, String> p$pathologicalCase;
    @FXML
    private TableColumn<Patients, Date> p$entryDate;
    @FXML
    private TableColumn<Patients, Date> p$checkoutDate;
    @FXML
    private Pane p$addPatient_pane;
    @FXML
    private TextField p$add_firstName;
    @FXML
    private TextField p$add_lastName;
    @FXML
    private TextField p$add_age;
    @FXML
    private TextField p$add_email;
    @FXML
    private TextField p$add_pathologicalCase;
    @FXML
    private TextField p$add_SD$dis;
    @FXML
    private RadioButton p$add_female;
    @FXML
    private RadioButton p$add_male;
    @FXML
    private Pane p$editeInformationP_pane;
    @FXML
    private TextField p$edite_firstName;
    @FXML
    private TextField p$edite_lastName;
    @FXML
    private TextField p$edite_age;
    @FXML
    private TextField p$edite_email;
    @FXML
    private TextField p$edite_pathologicalCase;
    @FXML
    private TextField p$edite_SD$dis;
    @FXML
    private RadioButton p$edite_female;
    @FXML
    private RadioButton p$edite_male;
    @FXML
    private VBox p$successfull;
    @FXML
    private Label p$add_wrong;
    @FXML
    private Label p$edite_wrong;
    @FXML
    private TableColumn<Patients, String> p$supervisingDoctorCoulmn;
    @FXML
    private TableColumn<Patients, String> p$emailCoulmn;
    @FXML
    private Label p$edite_wrong1;
    @FXML
    private Pane p$infoSelectP_pane;
    @FXML
    private Label p$info_FullName;
    @FXML
    private Label p$info_gender;
    @FXML
    private Label p$info_email;
    @FXML
    private Label p$info_pathologicalCase;
    @FXML
    private Label p$info_supervisingDoctor;
    @FXML
    private Label p$info_age;

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
//++++++++++++++++++++++++++++++++++++++++++++++++++++++Doctor Pane.
        p$Fname.setCellValueFactory(new PropertyValueFactory<Patients, String>("firstName"));
        p$Lname.setCellValueFactory(new PropertyValueFactory<Patients, String>("lastName"));
        p$emailCoulmn.setCellValueFactory(new PropertyValueFactory<Patients, String>("email"));
        p$gender.setCellValueFactory(new PropertyValueFactory<Patients, String>("gender"));
        p$age.setCellValueFactory(new PropertyValueFactory<Patients, Integer>("age"));
        p$pathologicalCase.setCellValueFactory(new PropertyValueFactory<Patients, String>("pathologicalCase"));
        p$entryDate.setCellValueFactory(new PropertyValueFactory<Patients, Date>("entryDate"));
        p$checkoutDate.setCellValueFactory(new PropertyValueFactory<Patients, Date>("checkoutDate"));
        p$supervisingDoctorCoulmn.setCellValueFactory(new PropertyValueFactory<Patients, String>("supervisingDoctor"));
        //---
        reviweTableViwe();
//++++++++++++++++++++++++++++++++++++++++++++++++++++++Patient Pane.
        ToggleGroup add_group = new ToggleGroup();
        p$add_male.setToggleGroup(add_group);
        p$add_female.setToggleGroup(add_group);
        //---
        ToggleGroup edite_group = new ToggleGroup();
        p$edite_male.setToggleGroup(edite_group);
        p$edite_female.setToggleGroup(edite_group);
    }//END initialize;

//***************************//
    public void reviweTableViwe() {
        ObservableList<Patients> patientList = MyDatabase.patient_info();
        p$tableViweP.setItems(patientList);
    }
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
        HashMap<String, String> ofin_p = MyDatabase.doctorInfoForPatients(s);
        d$numberPatients.setText(ofin_p.get("patients"));
        d$numberPatientsMale.setText(ofin_p.get("patientMale"));
        d$numberPatientFemale.setText(ofin_p.get("patientFemale"));
        d$numberPaOverage.setText(ofin_p.get("PaOverage"));
        d$numberPaChildren.setText(ofin_p.get("PaChildren"));
        d$numberPaPregnant.setText("0");
        d$numberPaYoung.setText(ofin_p.get("PaYoung"));
        p$add_SD$dis.setText(ofin_d.get("fName") + " " + ofin_d.get("lName"));
        p$edite_SD$dis.setText(ofin_d.get("fName") + " " + ofin_d.get("lName"));
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
    private void add_LastNews(MouseEvent event) {
        int countNews;
        synchronized (this) {
            countNews = MyDatabase.newLastNews(m$newsTitle.getText(), m$newsDescription.getText());
            countNews %= 6;
        }
        switch (countNews) {
            case 1:
                m$subNews1_t.setText(m$newsTitle.getText());
                m$subNews1_d.setText(m$newsDescription.getText());
                break;
            case 2:
                m$subNews2_t.setText(m$newsTitle.getText());
                m$subNews2_d.setText(m$newsDescription.getText());
                break;
            case 3:
                m$subNews3_t.setText(m$newsTitle.getText());
                m$subNews3_d.setText(m$newsDescription.getText());
                break;
            case 4:
                m$subNews4_t.setText(m$newsTitle.getText());
                m$subNews4_d.setText(m$newsDescription.getText());
                break;
            case 5:
                m$subNews5_t.setText(m$newsTitle.getText());
                m$subNews5_d.setText(m$newsDescription.getText());
                break;
            case 0:
                m$subNews6_t.setText(m$newsTitle.getText());
                m$subNews6_d.setText(m$newsDescription.getText());
                break;
            default:
                System.out.println(countNews);
        }
        m$pane_addNews.setVisible(false);
        m$lastNewsAorede.setVisible(true);
    }//END;

    @FXML
    private void m$new_LastNews(MouseEvent event) {
        m$lastNewsAorede.setVisible(false);
        m$pane_addNews.setVisible(true);
    }//END;

    @FXML
    private void m$new_News(MouseEvent event) {
    }
//-+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Doctor Pane +++
//-+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Patient Pane +++

    @FXML
    private void p$add_P(MouseEvent event) {
        p$addPatient_pane.setVisible(true);
        p$editeInformationP_pane.setVisible(false);
        p$successfull.setVisible(false);
        p$add_wrong.setVisible(false);
        p$edite_wrong.setVisible(false);
        p$infoSelectP_pane.setVisible(false);
    }//END;

    @FXML
    private void p$edite_p(MouseEvent event) {
        p$editeInformationP_pane.setVisible(true);
        p$addPatient_pane.setVisible(false);
        p$successfull.setVisible(false);
        p$add_wrong.setVisible(false);
        p$edite_wrong.setVisible(false);
        p$infoSelectP_pane.setVisible(false);

    }//END;

    @FXML
    private void p$add_PatientGo(MouseEvent event) {
        if (!p$add_firstName.getText().isEmpty()
                && !p$add_lastName.getText().isEmpty()
                && !p$add_email.getText().isEmpty()
                && !p$add_age.getText().isEmpty()
                && Integer.decode(p$add_age.getText()) >= 1
                && !p$add_pathologicalCase.getText().isEmpty()
                && (p$add_male.isSelected() ^ p$add_female.isSelected())) {
            //---
            String gender = (p$add_male.isSelected() ? "male" : "female");
            Patients p = new Patients(p$add_firstName.getText(),
                    p$add_lastName.getText(),
                    p$add_email.getText(),
                    gender,
                    Integer.decode(p$add_age.getText()),
                    p$add_pathologicalCase.getText(),
                    p$add_SD$dis.getText());
            MyDatabase.add_newPatient(p);
            reviweTableViwe();
            //---
            p$add_wrong.setVisible(false);
            p$addPatient_pane.setVisible(false);
            p$successfull.setVisible(true);
        } else {
            p$add_wrong.setVisible(true);
        }
    }

    @FXML
    private void p$edite_PatientGo(MouseEvent event) {
        if (!p$edite_firstName.getText().isEmpty()
                && !p$edite_lastName.getText().isEmpty()
                && !p$edite_email.getText().isEmpty()
                && !p$edite_age.getText().isEmpty()
                && Integer.decode(p$edite_age.getText()) >= 1
                && !p$edite_pathologicalCase.getText().isEmpty()
                && (p$edite_male.isSelected() ^ p$edite_female.isSelected())) {
            //---
            String gender = (p$add_male.isSelected() ? "male" : "female");
            int ageP = Integer.parseInt(p$edite_age.getText());
            Patients p = new Patients(p$edite_firstName.getText(),
                    p$edite_lastName.getText(),
                    p$edite_email.getText(),
                    gender,
                    ageP,
                    p$edite_pathologicalCase.getText(),
                    p$edite_SD$dis.getText());
            MyDatabase.edite_newPatient(p);
            reviweTableViwe();
            //---
            p$edite_wrong.setVisible(false);
            p$successfull.setVisible(false);
            p$editeInformationP_pane.setVisible(false);
            p$successfull.setVisible(true);
        } else {
            p$edite_wrong.setVisible(true);
        }
    }

    @FXML
    private void p$backClick_i(MouseEvent event) {
        p$add_wrong.setVisible(false);
        p$edite_wrong.setVisible(false);
        p$addPatient_pane.setVisible(false);
        p$editeInformationP_pane.setVisible(false);
        p$successfull.setVisible(false);
        p$infoSelectP_pane.setVisible(false);
    }//END;

    @FXML
    private void p$backClick_t(MouseEvent event) {
        p$add_wrong.setVisible(false);
        p$edite_wrong.setVisible(false);
        p$addPatient_pane.setVisible(false);
        p$editeInformationP_pane.setVisible(false);
        p$successfull.setVisible(false);
        p$infoSelectP_pane.setVisible(false);
    }//END;
    //---

    @FXML
    private void p$selectIemAction(ActionEvent event) {
        Patients p = p$tableViweP.getSelectionModel().getSelectedItem();
        if (p != null) {
            p$edite_firstName.setText(p.getFirstName());
            p$edite_lastName.setText(p.getLastName());
            p$edite_email.setText(p.getEmail());
            p$edite_age.setText(String.valueOf(String.valueOf(p.getAge())));
            if (p.getGender().equalsIgnoreCase("male")) {
                p$edite_male.setSelected(true);
            } else {
                p$edite_female.setSelected(true);
            }
            //---
            p$info_FullName.setText(p.getFirstName() + "" + p.getLastName());
            p$info_age.setText(String.valueOf(String.valueOf(p.getAge())));;
            p$info_email.setText(p.getEmail());
            if (p.getGender().equalsIgnoreCase("male")) {
                p$info_gender.setText("male");
            } else {
                p$info_gender.setText("female");
            }
            p$info_pathologicalCase.setText(p.getPathologicalCase());
            p$info_supervisingDoctor.setText(p.getSupervisingDoctor());
            //---
            p$infoSelectP_pane.setVisible(true);
            p$edite_pathologicalCase.setText(p.getPathologicalCase());
            p$edite_SD$dis.setText(p.getSupervisingDoctor());
        }
    }//END:
    //---

    @FXML
    private void p$leavingPatient(MouseEvent event) {
    }

}//END ALL;
