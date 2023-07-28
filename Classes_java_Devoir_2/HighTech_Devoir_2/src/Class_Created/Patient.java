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
public class Patient extends User {
//  1) Variables :
    private int medical_card_no;
    private int age;
    private String[] gender = {"Male","Female"};
    
//  2)Constructors :

    public Patient() {
    }

    public Patient(String type) {
        super(type);
    }
    public Patient(String national_code, String first_name, String last_name) {
        super(national_code, first_name, last_name);
    }

    public Patient(int medical_card_no, int age, String type, String national_code, String first_name, String last_name, String adress, String mobile_no, String email, String password) {
        super(type, national_code, first_name, last_name, adress, mobile_no, email, password);
        this.medical_card_no = medical_card_no;
        this.age = age;
    }
    

    
    
// 3)Getters and Setters :

    public int getMedical_card_no() {
        return medical_card_no;
    }

    public int getAge() {
        return age;
    }

    public String[] getGender() {
        return gender;
    }

    public void setMedical_card_no(int medical_card_no) {
        this.medical_card_no = medical_card_no;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String[] gender) {
        this.gender = gender;
    }
// 4) Méthodes :    
    
    @Override
    public void authentificate(String email, String password) {
        
    }

    @Override
    public String display_infos() {
        return "Patient{ "+super.display_infos() + "medical_card_no=" + medical_card_no + ", age=" + age + ", gender=" + gender + '}';
    }
    
    public void pay_bill(Pharmacist pharma, String medicines){
        
    }
     public void pay_bill(Receptionist reception, String appointment){
        
    }
    public void pay_bill(Lab_Assistant lab_assistant, String medicines){
        
    } 
     
}    
