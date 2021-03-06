package com.bin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.bin.service.*;

/**
 * @Author: Bhy
 * @Date: 2019/1/8
 */
@WebServlet(name = "sendSMSServlet")
public class sendSMSServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        new sendSMSService().send(request.getParameter("phoneNumber"));
    }
}
