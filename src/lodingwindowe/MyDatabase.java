package lodingwindowe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;

/**
 *
 * @author MAHMOUD.T
 */
public class MyDatabase {

    private static Connection conn = null;
    private static final String url = "jdbc:mysql://localhost:3306/medical_clinic";
    private static final String userName = "root";
    private static final String password = "";

    public static void getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Successful Connection To Database use \"java mysql JDBC Driver\"");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex + "Say Hello To The ClassNotFoundException (_-_)");
        }
    }//END;
//-----------------------------------------------------------------------------v

//---------------------------- SingIn ***
    public static boolean singInCheck(String email_Login, String password_Login) {
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT * FROM doctor");
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    if (rs.getString("email").equalsIgnoreCase(email_Login)
                            && rs.getString("password").equalsIgnoreCase(password_Login)) {
                        return true;
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return false;
    }//END;
//    -----

//---------------------------- SingUp ***
    public static void singUp(Doctors doctor) {
        if (conn == null) {
            getConnection();
        } else {
            try {
                PreparedStatement statement = conn.prepareStatement("INSERT into doctor VALUES (?,?,?,?,?,?,?)");
                statement.setString(1, doctor.getFirstName());
                statement.setString(2, doctor.getLastName());
                statement.setString(3, doctor.getEmail());
                statement.setString(4, doctor.getPassword());
                statement.setString(5, doctor.getGender());
                statement.setInt(6, doctor.getAge());
                statement.setString(7, doctor.getSpecialization());
                statement.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
    }//END;
//    ------

//---------------------------- Update Password ***
    public static void updatePass(String emailUser, String passUser) {
        if (conn == null) {
            getConnection();
        } else {
            try {
                PreparedStatement statement = conn.prepareStatement("UPDATE doctor SET email=?, password=? WHERE email='" + emailUser + "'");
                statement.setString(1, emailUser);
                statement.setString(2, passUser);
                statement.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
    }//?DB?;
//-----------------------------------------------------------------------------^
//-------------------------------------------------Doctor Pane.
//---------------------------- Number of Doctor ***

    public static int numberOfDoctors() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM doctor");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberOfDoctorMale() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM doctor WHERE gender='male'");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberOfDoctorFemale() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM doctor WHERE gender='female'");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

//---------------------------- Number of Nurses ***
    public static int numberOfNurses() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM doctor WHERE specialization='nurse'");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberOfNurserMale() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM doctor WHERE specialization='nurse' AND gender='male'");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberOfNurseFemale() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM doctor WHERE specialization='nurse' AND gender='female'");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

//---------------------------- Number of Patient ***
    public static int numberOfPatients() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM patient");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberOfPatientsMale() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM patient WHERE gender='male'");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberOfPatientFemale() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM patient WHERE gender='female'");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberOfPaOverage() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM patient WHERE age >=  50");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberOfPaChildren() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM patient WHERE age <=10");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberoFPaYoung() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM patient WHERE age >10 && age <50");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

    public static int numberOfPaPregnant() {
        int num = 0;
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT count(*) AS num_rs FROM patient WHERE pregnant='true'");
                ResultSet rs = statement.executeQuery();
                rs.next();
                num = rs.getInt("num_rs");
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return num;
    }//END;
    //---

//---------------------------- Number of Patient For Doctor ***
    public static HashMap<String, String> doctorInfoForPatients(String emailForSerch) {
        HashMap<String, String> listOfInfo = new HashMap<>();
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statementFname;
            PreparedStatement statement;
            try {
                statementFname = conn.prepareStatement("SELECT Fname FROM doctor WHERE email=?");
                statementFname.setString(1, emailForSerch);
                ResultSet rsFn = statementFname.executeQuery();
                rsFn.next();
                String fname = rsFn.getString("fName");
                //------Number Start GO>
                statement = conn.prepareStatement("SELECT COUNT(supervising_doctor) AS num_rs FROM patient WHERE supervising_doctor='" + fname + "'");
                ResultSet rsP = statement.executeQuery();
                rsP.next();
                listOfInfo.put("patients", Integer.toString(rsP.getInt("num_rs")));
                rsP.close();
                //---
                statement = conn.prepareStatement("SELECT COUNT(supervising_doctor) AS num_rs FROM patient WHERE gender='male' AND supervising_doctor='" + fname + "'");
                ResultSet rsPm = statement.executeQuery();
                rsPm.next();
                listOfInfo.put("patientMale", Integer.toString(rsPm.getInt("num_rs")));
                rsPm.close();
                //---
                statement = conn.prepareStatement("SELECT COUNT(supervising_doctor) AS num_rs FROM patient WHERE gender='female' AND supervising_doctor='" + fname + "'");
                ResultSet rsPf = statement.executeQuery();
                rsPf.next();
                listOfInfo.put("patientFemale", Integer.toString(rsPf.getInt("num_rs")));
                rsPf.close();
                //---
                statement = conn.prepareStatement("SELECT COUNT(supervising_doctor) AS num_rs FROM patient WHERE age>=50 AND supervising_doctor='" + fname + "'");
                ResultSet rsPo = statement.executeQuery();
                rsPo.next();
                listOfInfo.put("PaOverage", Integer.toString(rsPo.getInt("num_rs")));
                rsPo.close();
                //---
                statement = conn.prepareStatement("SELECT COUNT(supervising_doctor) AS num_rs FROM patient WHERE age<=10 AND supervising_doctor='" + fname + "'");
                ResultSet rsPch = statement.executeQuery();
                rsPch.next();
                listOfInfo.put("PaChildren", Integer.toString(rsPch.getInt("num_rs")));
                rsPch.close();
                statement = conn.prepareStatement("SELECT COUNT(supervising_doctor) AS num_rs FROM patient WHERE age>10 AND age<50 AND supervising_doctor='" + fname + "'");
                ResultSet rsPy = statement.executeQuery();
                rsPy.next();
                listOfInfo.put("PaYoung", Integer.toString(rsPy.getInt("num_rs")));
                rsPy.close();
                //end........Close;
                rsFn.close();
            } catch (Exception ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return listOfInfo;
    }//END;
    //---
//-----------------------------------------------------------------------------^

    //---------------------------- Doctor Information ***
    public static HashMap<String, String> doctorInfo(String emailForSerch) {
        HashMap<String, String> listOfInfo = new HashMap<>();
        if (conn == null) {
            getConnection();
        } else {
            PreparedStatement statement;
            try {
                statement = conn.prepareStatement("SELECT * FROM doctor WHERE email=?");
                statement.setString(1, emailForSerch);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    listOfInfo.put("fName", rs.getString("fName"));
                    listOfInfo.put("lName", rs.getString("lName"));
                    listOfInfo.put("age", String.valueOf(rs.getInt("age")));
                    listOfInfo.put("gender", rs.getString("gender"));
                    listOfInfo.put("specialization", rs.getString("specialization"));
                }
            } catch (Exception ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return listOfInfo;
    }//END;
    //---

    public static int newLastNews(String title, String descr) {
        int countNews = 6;
        if (conn == null) {
            getConnection();
        } else {
            try {
                PreparedStatement statement = conn.prepareStatement("INSERT into last_news VALUES (?,?)");
                statement.setString(1, title);
                statement.setString(2, descr);
                statement.executeUpdate();
                //---
                PreparedStatement statcount = conn.prepareStatement("SELECT count(*) AS count FROM last_news");
                ResultSet rs = statcount.executeQuery();
                rs.next();
                countNews = rs.getInt("count");
                rs.close();

            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return countNews;
    }//END;
//    ------
//-----------------------------------------------------------------------------^

//-------------------------------------------------Doctor Pane.
//----------------------------Doctor ***
//-----------------------------------------------------------------------------^
//-------------------------------------------------Patient Pane.
    public static ObservableList<Patients> patient_info() {
        MainWindowController mn = new MainWindowController();
        ObservableList<Patients> info = FXCollections.observableArrayList();
        int countPatient = 0;

        if (conn == null) {
            getConnection();
        } else {
            try {
                PreparedStatement statment = conn.prepareStatement("SELECT * FROM patient");
                ResultSet rs = statment.executeQuery();
                while (rs.next()) {
                    String fName = rs.getString("Fname");
                    String lName = rs.getString("Lname");
                    String email = rs.getString("email");
                    String gender = rs.getString("gender");
                    int age = rs.getInt("age");
                    Date entry_date = rs.getDate("entry_date");
                    Date checkout_date = rs.getDate("checkout_date");
                    String pathological_case = rs.getString("pathological_case");
                    String supervising_doctor = rs.getString("supervising_doctor");
                    //---
                    Patients pati = new Patients(fName, lName, email, gender, age, entry_date, checkout_date, pathological_case, supervising_doctor);
                    info.add(pati);
                }
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }

        return info;
    }//END;
    //---

    public static void add_newPatient(Patients p) {
        if (conn == null) {
            getConnection();
        } else {
            try {
                PreparedStatement statement = conn.prepareStatement("INSERT into patient "
                        + "(Fname,Lname,email,gender,age,pathological_case,supervising_doctor)"
                        + " VALUES (?,?,?,?,?,?,?)");
                statement.setString(1, p.getFirstName());
                statement.setString(2, p.getLastName());
                statement.setString(3, p.getEmail());
                statement.setString(4, p.getGender());
                statement.setInt(5, p.getAge());
                statement.setString(6, p.getPathologicalCase());
                statement.setString(7, p.getSupervisingDoctor());
                statement.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
    }//END;
    //---

    public static void edite_newPatient(Patients p) {
        if (conn == null) {
            getConnection();
        } else {
            try {
                PreparedStatement statement = conn.prepareStatement("UPDATE patient SET Fname=? ,Lname=? ,email=? ,gender=?,age=?,pathological_case=? WHERE email='" + p.getEmail() + "'");
                statement.setString(1, p.getFirstName());
                statement.setString(2, p.getLastName());
                statement.setString(3, p.getEmail());
                statement.setString(4, p.getGender());
                statement.setInt(5, p.getAge());
                statement.setString(6, p.getPathologicalCase());
                statement.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
    }//END;
    //---
}//END MyDatabase;
