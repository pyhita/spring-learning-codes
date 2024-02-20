package com.yangtao.servlet;

import com.yangtao.service.DemoService;
import com.yangtao.service.impl.DemoServiceImpl;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: kante_yang
 * @Date: 2024/1/24
 */
@WebServlet("/demo")
public class DemoServlet extends HttpServlet {

    private DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        Long userId = Long.valueOf(req.getParameter("id"));
        String body = demoService.getById(userId);

        OutputStream output = resp.getOutputStream();
        output.write(body.getBytes("utf-8"));
        output.flush();
        output.close();
    }
}
