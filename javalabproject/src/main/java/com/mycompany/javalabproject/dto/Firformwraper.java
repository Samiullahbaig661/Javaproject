/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalabproject.dto;
import javax.swing.*;
import  com.mycompany.javalabproject.dto.FirDto;
/**
 *
 * @author CC
 */
    public class Firformwraper {
      public static FirDto mapFormToFIR(
        JTextField txtname,
        JTextField txtFathername,
        JTextField txtcnic,
        JTextField txtphoenNumber,
        JTextField txtAddress,
        JTextField txtincident_location,
        JComboBox<String> cbCrimeType,
        JComboBox<String> jComboBox1,
        JTextField jTextField10,
        JTextField txtOfficerName
    ) {
        FirDto fir = new FirDto();
        fir.setName(txtname.getText());
        fir.setFatherName(txtFathername.getText());
        fir.setCnic(txtcnic.getText());
        fir.setPhoneNo(txtphoenNumber.getText());
        fir.setAddress(txtAddress.getText());
        fir.setIncidentLocation(txtincident_location.getText());
        fir.setCrimeType((String) cbCrimeType.getSelectedItem());
        fir.setStatus((String) jComboBox1.getSelectedItem());
        fir.setPoliceStation(jTextField10.getText());
        fir.setOfficerName(txtOfficerName.getText());
        return fir;
    }
}
