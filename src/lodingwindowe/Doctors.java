/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lodingwindowe;

/**
 *
 * @author MAHMOUD.T
 */
public class Doctors extends User {

    private String specialization;

    public Doctors(String firstName, String lastName, String email, String password, String gender, int age, String specialization) {
        super(firstName, lastName, email, password, gender, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
