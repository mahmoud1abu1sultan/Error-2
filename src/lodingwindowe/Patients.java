/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lodingwindowe;

/**
 *
 * @author mahmo
 */
public class Patients extends User{
    
    private Boolean pregnant;
    
    public Patients(String firstName, String lastName, String email, String password, String gender, int age, boolean pregnant) {
        super(firstName, lastName, email, password, gender, age);
    }

    public Boolean getPregnant() {
        return pregnant;
    }

    public void setPregnant(Boolean pregnant) {
        this.pregnant = pregnant;
    }
    
}
