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
public class InheritanceMain {
    
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("19170405");
        m.setNama("Andry");
        m.setJk("Laki-laki");
        System.out.println(m.showPerson());
    }
    
}
