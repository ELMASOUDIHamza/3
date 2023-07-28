/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Created;

/**
 *
 * @author hamza
 */
public class Receptionist extends Staff {
// 1) Constructors :    
    public Receptionist() {
    }

    public Receptionist(String employment_code, String department, String type, String national_code, String first_name, String last_name, String adress, String mobile_no, String email, String password) {
        super(employment_code, department, type, national_code, first_name, last_name, adress, mobile_no, email, password);
    }

    
    
// 2) Les méthodes :
    @Override
    public void authentificate(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String display_infos() {
        return "Receptionist {" +super.display_infos(); //To change body of generated methods, choose Tools | Templates.
    }

    public void pay_management(){
        
    }
    
    
    
}
