/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalabproject.service;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import com.mycompany.javalabproject.dto.FirDto;
/**
 *
 * @author CC
 */
public class FirService {
     public void saveFir(FirDto fir) {
      try {
            FileWriter writer = new FileWriter("fir_data.csv", true);

            File file = new File("fir_data.csv");
            if (file.length() == 0) {
                writer.write("Name,Father Name,CNIC,Phone No,Address,Incident Date,Incident Location,Crime Type,Status,Police Station,Officer Name\n");
            }

            writer.write(fir.getName() + ","
                    + fir.getFatherName() + ","
                    + fir.getCnic() + ","
                    + fir.getPhoneNo() + ","
                    + fir.getAddress() + ","
                    + fir.getIncidentDate() + ","
                    + fir.getIncidentLocation() + ","
                    + fir.getCrimeType() + ","
                    + fir.getStatus() + ","
                    + fir.getPoliceStation() + ","
                    + fir.getOfficerName() + "\n");

            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving FIR!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
