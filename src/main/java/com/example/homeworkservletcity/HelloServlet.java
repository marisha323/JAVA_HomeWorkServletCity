package com.example.homeworkservletcity;

import java.io.*;

import com.example.homeworkservletcity.Class.City;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        City city = new City();

        city.setCityName("Рим");
        city.setCountryName("Італія");
        city.setCoatOfArmsUrl("https://w0.peakpx.com/wallpaper/499/197/HD-wallpaper-flag-of-rome-silk-texture-burgundy-" +
                "yellow-silk-flag-capital-of-italy-coat-of-arms-italian-city-rome-lazio-italy-symbols.jpg");
        city.setPopulation(1000000);
        city.setDescription("Рим – одне з найдавніших міст Європи, засноване в 753р. до н.е. День народження " +
                "Вічного міста припадає на 21 квітня (дата міфічного заснування Риму Ромулом і Ремом)." +
                "У цей день до Риму з’їжджаються туристи з усього світу. Святкування римлян включають" +
                " феєрверки, шоу гладіаторів, ярмарки і дегустації страв італійської кухні, галасливі шоу " +
                "в центрі міста. До того ж в цей день в Римі безкоштовно можна відвідати багато музеїв.\n");
        request.setAttribute("city",city);
        request.getRequestDispatcher("Hello/city.jsp").forward(request,response);
    }

    public void destroy() {
    }
}