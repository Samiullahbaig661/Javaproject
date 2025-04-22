/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalabproject.service;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author CC
 */

public class Formvalidator {
    public static boolean validateForm(
        JTextField txtname, JLabel jLabel1,
        JTextField txtFathername, JLabel jLabel2,
        JTextField txtcnic, JLabel jLabel3,
        JTextField txtAddress, JLabel jLabel4,
        JTextField txtphoenNumber, JLabel jLabel5,
        JTextField txtAddress1, JLabel jLabel6,
        JTextField txtincident_location, JLabel jLabel7,
        JTextField jTextField10, JLabel jLabel8,
        JTextField txtOfficerName, JLabel jLabel9,
        JTextArea jTextArea1, JLabel jLabel10
    ) {
        boolean isValid = true;

        // clear all error labels
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

        if (txtname.getText().trim().isEmpty()) {
            jLabel1.setText("Name is required.");
            isValid = false;
        }

        if (txtFathername.getText().trim().isEmpty()) {
            jLabel2.setText("Father Name is required.");
            isValid = false;
        }

        if (!validateCNIC(txtcnic, jLabel3)) {
            isValid = false;
        }

        if (txtAddress.getText().trim().isEmpty()) {
            jLabel4.setText("Address is required.");
            isValid = false;
        }

        String phone = txtphoenNumber.getText().trim();
        if (phone.isEmpty()) {
            jLabel5.setText("Phone number is required.");
            isValid = false;
        } else if (!phone.matches("\\d{11}")) {
            jLabel5.setText("Enter 11 digit phone number.");
            isValid = false;
        }

        if (txtAddress1.getText().trim().isEmpty()) {
            jLabel6.setText("Date is required.");
            isValid = false;
        }

        if (txtincident_location.getText().trim().isEmpty()) {
            jLabel7.setText("Location is required.");
            isValid = false;
        }

        if (jTextField10.getText().trim().isEmpty()) {
            jLabel8.setText("Police Station required.");
            isValid = false;
        }

        if (txtOfficerName.getText().trim().isEmpty()) {
            jLabel9.setText("Officer Name is required.");
            isValid = false;
        }

        String description = jTextArea1.getText().trim();
        int wordCount = description.isEmpty() ? 0 : description.split("\\s+").length;
        if (description.isEmpty()) {
            jLabel10.setText("Description is required.");
            isValid = false;
        } else if (wordCount > 100) {
            jLabel10.setText("Max 100 words allowed. Currently: " + wordCount);
            isValid = false;
        }

        return isValid;
    }

    private static boolean validateCNIC(JTextField txtcnic, JLabel jLabel3) {
        String raw = txtcnic.getText();
        if (raw == null || raw.trim().isEmpty()) {
            jLabel3.setText("CNIC is required.");
            return false;
        }

        String digits = raw.replaceAll("[-\\s]", "").trim();

        if (!digits.matches("\\d{13}")) {
            jLabel3.setText("CNIC must be exactly 13 digits.");
            return false;
        }

        jLabel3.setText("");
        applyCnicaDash(txtcnic, digits);  // now we pass digits to format
        return true;
    }

    public static void applyCnicaDash(JTextField txtcnic, String digitsOnly) {
        // digitsOnly must already be 13 digits with no dashes
        if (digitsOnly.length() == 13) {
            String formatted = digitsOnly.substring(0, 5) + "-" 
                             + digitsOnly.substring(5, 12) + "-" 
                             + digitsOnly.substring(12);
            txtcnic.setText(formatted);
        }
    }
}
