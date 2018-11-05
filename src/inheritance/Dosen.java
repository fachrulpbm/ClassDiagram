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
public class Dosen implements PersonInterface{
    
    private String nidn;

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
        

    @Override
    public String showPerson() {
        return getNidn();
    }

    @Override
    public void addPerson(String nama, String jk) {
        
    }

    @Override
    public void editPerson(String idPerson, String nama, String jk) {
        
    }

    @Override
    public void deletePerson(String idPerson) {
        
    }
    
}
