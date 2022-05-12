/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lodingwindowe;

import java.util.Date;

/**
 *
 * @author mahmo
 */
public class Patients extends User {

    private String pathologicalCase;
    private Date entryDate;
    private Date checkoutDate;
    private String supervisingDoctor;

    public Patients(String firstName, String lastName, String gender, int age, String pathologicalCase, Date entryDate, Date checkoutDate) {
        super(firstName, lastName, gender, age);
        this.pathologicalCase = pathologicalCase;
        this.entryDate = entryDate;
        this.checkoutDate = checkoutDate;
    }

    public Patients(String firstName, String lastName, String email, String gender, int age, String pathologicalCase, String supervisingDoctor) {
        super(firstName, lastName, email, gender, age);
        this.pathologicalCase = pathologicalCase;
        this.supervisingDoctor = supervisingDoctor;
    }

    public Patients(String firstName, String lastName, String email, String gender, int age, Date entryDate, Date checkoutDate, String pathologicalCase, String supervisingDoctor) {
        super(firstName, lastName, email, gender, age);
        this.pathologicalCase = pathologicalCase;
        this.supervisingDoctor = supervisingDoctor;
        this.entryDate = entryDate;
        this.checkoutDate = checkoutDate;
    }

    public String getPathologicalCase() {
        return pathologicalCase;
    }

    public void setPathologicalCase(String pathologicalCase) {
        this.pathologicalCase = pathologicalCase;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getSupervisingDoctor() {
        return supervisingDoctor;
    }

    public void setSupervisingDoctor(String supervisingDoctor) {
        this.supervisingDoctor = supervisingDoctor;
    }

}
