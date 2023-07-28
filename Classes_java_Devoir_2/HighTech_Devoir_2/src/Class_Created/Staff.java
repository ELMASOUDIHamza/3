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
public abstract class Staff extends User{
// 1) Variables :
    private String employment_code;
    private String department;
    
// 2) Constructors :
    public Staff() {
    }

    public Staff(String type) {
        super(type);
    }

    public Staff(String first_name, String last_name) {
        super(first_name, last_name);
    }

    public Staff(String employment_code, String first_name, String last_name) {
        super( first_name, last_name);
        this.employment_code=employment_code;
    }

    public Staff(String employment_code, String department, String type, String national_code, String first_name, String last_name, String adress, String mobile_no, String email, String password) {
        super(type, national_code, first_name, last_name, adress, mobile_no, email, password);
        this.employment_code = employment_code;
        this.department = department;
    }

    

    

//3) Getters and Setters :    

    public String getEmployment_code() {
        return employment_code;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployment_code(String employment_code) {
        this.employment_code = employment_code;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
// 4) Méthodes :
    @Override
    public abstract void authentificate(String email, String password);
    
}
