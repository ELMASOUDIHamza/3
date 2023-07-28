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
public abstract class User {
    /* Dans le diagramme de classe, les attributs sont déclarés PUBLIC, mais par convention ils doivent être 
    déclarés private, c'est pour ça j'ai pas pris en considération le diagramme !
    */
 // 1) Variables :   
    private String type;
    private String national_code ;
    private String first_name ;
    private String last_name ;
    private String adress ;
    private String mobile_no ;
    private String email ;
    private String password ;
    
 // 2) Constructors :
    public User() {
    }

    public User(String type) {
        this.type = type ;
    }
    public User(String first_name , String last_name) {
        this.first_name = first_name ;
        this.last_name = last_name ;
    }
    public User(String national_code, String first_name , String last_name) {
        this.first_name = first_name ;
        this.last_name = last_name ;
    }
    
    public User(String type, String national_code, String first_name, String last_name, String adress, String mobile_no, String email, String password) {
        this.type = type ;
        this.national_code = national_code;
        this.first_name = first_name;
        this.last_name = last_name;
        this.adress = adress;
        this.mobile_no = mobile_no;
        this.email = email;
        this.password = password;
    }
 // 3) Getters and setters :

    public String getType() {
        return type;
    }

    public String getNational_code() {
        return national_code;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAdress() {
        return adress;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setNational_code(String national_code) {
        this.national_code = national_code;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }
    
// 4) Méthodes :

    public String display_infos() 
    {
        return  "national_code=" + national_code + ", first_name=" + first_name + ", last_name=" + last_name + 
                ", adress=" + adress + ", mobile_no=" + mobile_no + ", email=" + email + ", password=" + password + '}';
    }
    public abstract void authentificate(String email ,String password);
    
    
}
