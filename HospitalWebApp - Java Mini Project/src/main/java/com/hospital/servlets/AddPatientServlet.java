package com.hospital.servlets;

import com.hospital.HospitalService;
import com.hospital.Patient;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/addPatient")
public class AddPatientServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        try {
            Patient p = new Patient(
                    Integer.parseInt(req.getParameter("id")),
                    req.getParameter("name"),
                    Integer.parseInt(req.getParameter("age")),
                    req.getParameter("disease")
            );

            new HospitalService().addPatient(p);

            resp.sendRedirect("displayPatient");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}