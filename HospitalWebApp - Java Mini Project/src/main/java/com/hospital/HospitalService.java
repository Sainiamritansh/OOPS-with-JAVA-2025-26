package com.hospital;

import java.sql.*;
import java.util.*;

public class HospitalService {

    public void addPatient(Patient p) throws Exception {

        Connection con = DBConnection.getConnection();

        String query = "INSERT INTO patients VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, p.getPatientId());
        ps.setString(2, p.getPatientName());
        ps.setInt(3, p.getAge());
        ps.setString(4, p.getDisease());

        ps.executeUpdate();

        con.close();
    }


    public List<Patient> getAllPatients() throws Exception {

        List<Patient> list = new ArrayList<>();

        Connection con = DBConnection.getConnection();

        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM patients");

        while (rs.next()) {
            list.add(new Patient(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getString(4)
            ));
        }

        con.close();

        return list;
    }


    public Patient searchPatient(int id) throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM patients WHERE patient_id=?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return new Patient(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getString(4)
            );
        }

        con.close();
        return null;
    }
}