package Oblig1;

import static  javax.swing.JOptionPane.*;

public class HelloWorld {

    public static void main(String[] args){
        String navn;
        navn = showInputDialog("Hva er ditt fornavn?");
        String etternavn;
        etternavn = showInputDialog("Hva er ditt etternavn?");
        String fulltNavn = navn + " " + etternavn;
        showMessageDialog(null, "Tenk at jeg, " + fulltNavn + ", har naila oblig 1 allerede!");
    }
}

