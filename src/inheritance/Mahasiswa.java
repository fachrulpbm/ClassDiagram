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
public class Mahasiswa extends Person{
    
    private String nim;

    @Override
    public String showPerson() {
        return getNim()+" "+super.getNama()+" "+super.getJk(); 
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    
        
    
}
