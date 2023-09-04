package com.example.homeworkservletcity;

import com.example.homeworkservletcity.Class.City;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "historyServlet", value = "/history-servlet")
public class HistoryServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        City city = new City();
        city.setCityName("Історія міста Рим");
        city.setDescription("Заснування Риму — згідно з легендами, місто засноване у 753 р. до н. е. місцевими " +
                "племенами, що розбили табори\n" +
                "  на семи пагорбах.[1]\n" +
                "  Історія Стародавнього Риму мала свій початок від заснування міста Рим у 753 році до н. е. і " +
                "тривала до падіння\n" +
                "  створеної латинами Римської імперії в 476 році н. е. Цей період ділиться на декілька основних етапа: " +
                "королівський\n" +
                "  (тривав від середини 8 ст. до н. е. — до 510 р. до н. е.), республіканський " +
                "(впродовж 509 р. до н. е. — до 27 н. е.)\n" +
                "  та імперський (від 27 р. до н. е. — до 476 р. до н. е.). Продовженням Історії Стародавнього Риму " +
                "вважається також\n" +
                "  період Домінату у Візантії (395 — 610 роки).\n" +
                "  Стародавній Рим — це одна з наймогутніших стародавніх цивілізацій, яка одержала свою назву від її " +
                "столиці — міста Рим.\n" +
                "  Вагомий вплив на становлення давньої римської цивілізації мали культури таких народів, як етруски, " +
                "латини і давні\n" +
                "  греки. Пік могутності Стародавнього Риму припав на II століття н. е., коли під владою держави " +
                "опинилися народи країн\n" +
                "  Північної Африки, Середземномор'я, Європи й Близького Сходу.");

        request.setAttribute("city",city);
        request.getRequestDispatcher("History/history.jsp").forward(request,response);

    }
}
