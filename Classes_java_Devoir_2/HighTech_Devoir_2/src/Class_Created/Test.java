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
public class Test {
// 1) Variables :
    private String test_id;
    private String test_name;
    
// 2) Constructors :

    public Test() {
    }
    public Test(String test_id, String test_name) {
        this.test_id = test_id;
        this.test_name = test_name;
    }
    
// 3) Getters and Setters :

    public String getTest_id() {
        return test_id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_id(String test_id) {
        this.test_id = test_id;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }
// 4) Méthodes :

    public String test_details() {
        return "Test{" + "test_id=" + test_id + ", test_name=" + test_name + '}';
    }
    
}
