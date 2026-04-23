package com.hospital.servlets;

import com.hospital.HospitalService;
import com.hospital.Patient;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/displayPatient")
public class DisplayPatientServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        try {
            List<Patient> patients = new HospitalService().getAllPatients();

            req.setAttribute("patients", patients);
            req.getRequestDispatcher("displayPatients.jsp").forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}