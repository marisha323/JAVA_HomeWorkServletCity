package com.example.homeworkservletcity;

import com.example.homeworkservletcity.Class.City;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "landmarksServlet", value = "/landmarks-servlet")
public class LandmarksServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        City city = new City();
        city.setCityName("Ватикан");
        city.setDescription(" – найменша, але одна із найбільш відвідуваних туристами держав Європи.  " +
                "Із площею всього " +
                "лиш 0,44 м.кв. Ватикан є містом-музеєм, де кожна будівля має свою цікаву історію.  Від території " +
                "Італії Ватикан відділений оборонним муром 16 століття, а зі сторони Площі Св. Петра – білою лінією " +
                "на бруківці.");
        request.setAttribute("city",city);
        request.getRequestDispatcher("Landmarks/landmarks.jsp").forward(request,response);
    }
}
