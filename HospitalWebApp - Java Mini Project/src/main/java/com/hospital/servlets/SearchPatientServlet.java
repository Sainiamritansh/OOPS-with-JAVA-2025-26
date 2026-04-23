package com.hospital.servlets;

import com.hospital.HospitalService;
import com.hospital.Patient;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/searchPatient")
public class SearchPatientServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        try {
            int id = Integer.parseInt(req.getParameter("id"));

            Patient p = new HospitalService().searchPatient(id);

            req.setAttribute("patient", p);
            req.getRequestDispatcher("searchResult.jsp").forward(req, resp);

        } catch (Exception e) {
            resp.getWriter().println("Invalid ID");
        }
    }
}