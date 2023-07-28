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
public class Doctor extends Staff {
// 1) Variables:
    private String function_code,qualification, speciality, medecines [], type_operation [];

// 2) Constructors :

    
    public Doctor(String employment_code, String first_name, String last_name) {
        super(employment_code ,first_name,last_name); 

    }
    public Doctor(String first_name, String last_name) {
        super(first_name,last_name);
    }
    public Doctor(String function_code,String first_name, String last_name, String speciality) {
        super(first_name,last_name);
        this.function_code = function_code;
        this.qualification = qualification;
        this.speciality = speciality;
    }

    public Doctor(String function_code, String qualification, String speciality, String[] medecines, String[] type_operation, String employment_code, String department, String type, String national_code, String first_name, String last_name, String adress, String mobile_no, String email, String password) {
        super(employment_code, department, type, national_code, first_name, last_name, adress, mobile_no, email, password);
        this.function_code = function_code;
        this.qualification = qualification;
        this.speciality = speciality;
        this.medecines = medecines;
        this.type_operation = type_operation;
    }

    
    
// 3) Getters and Setters :

    public String getFunction_code() {
        return function_code;
    }

    public String getQualification() {
        return qualification;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setFunction_code(String function_code) {
        this.function_code = function_code;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

// 4) Méthodes :    
    
    @Override
    public void authentificate(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String display_infos() {
        return "Doctor{" + "function_code=" + function_code + ", qualification=" + qualification + ", speciality=" + speciality + '}'+ super.display_infos() ;
    }
    
    public String display_infos_for_patient() {
        return super.getEmployment_code() +"    "+ super.getLast_name()+" "+ super.getFirst_name();
    }
    
    public void prescribe_medicines ( String medecines []){
        
    }
    public void prescribe_tests ( String tests []){
        
    }
    public boolean perform_operation ( String type_operation []){
        return false;
    }
}
