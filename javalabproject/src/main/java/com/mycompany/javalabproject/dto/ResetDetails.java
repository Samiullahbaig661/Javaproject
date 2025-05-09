/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalabproject.dto;
import javax.swing.*;
/**
 *
 * @author CC
 */
public class ResetDetails {
    public static void reset(JTextField txtname,
        JTextField txtFathername,
        JTextField txtcnic,
        JTextField txtphoenNumber,
        JTextField txtAddress,
        JTextField txtincident_location,
        JComboBox<String> cbCrimeType,
        JComboBox<String> jComboBox1,
        JTextField jTextField10,
        JTextField txtOfficerName,
        JTextArea jTextArea1,
        JLabel jLabel1,
        JLabel jLabel2,
        JLabel jLabel3,
        JLabel jLabel4,
        JLabel jLabel5,
        JLabel jLabel6,
        JLabel jLabel7,
        JLabel jLabel8,
        JLabel jLabel9,
        JLabel jLabel10)
    {
         txtname.setText("");
        txtFathername.setText("");
        txtcnic.setText("");
        txtphoenNumber.setText("");
        txtAddress.setText("");
        txtincident_location.setText("");
        cbCrimeType.setSelectedIndex(0);
        jComboBox1.setSelectedIndex(0);
        jTextField10.setText("");
        txtOfficerName.setText("");
        jTextArea1.setText("");

        // Clear error labels
        jLabel1.setText("");
        jLabel2.setText("");
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
        jLabel6.setText("");
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel10.setText("");
    }
}
