/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author fachr
 */
public interface PersonInterface {
    
    public String showPerson();  
    public void addPerson(String nama, String jk);  
    public void editPerson(String idPerson, String nama, String jk);
    public void deletePerson(String idPerson);
    
}
