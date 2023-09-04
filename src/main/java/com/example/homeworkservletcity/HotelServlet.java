package com.example.homeworkservletcity;

import com.example.homeworkservletcity.Class.City;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "hotelServlet", value = "/hotel-servlet")
public class HotelServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        City city = new City();
        city.setCityName("c-hotels Club House Roma");
        city.setDescription("Ви можете отримати знижку Genius у помешканні c-hotels Club House Roma! Щоб зекономити, " +
                "просто увійдіть в акаунт.\n" +
                "Готель Club House Roma розташований у тихому районі Рима, за 100 метрів від станції метро Cornelia " +
                "та за 3 зупинки їзди на метро від Ватикана. Номери оснащені безкоштовним Wi-Fi, кондиціонером і " +
                "телевізором із супутниковим телебаченням. Для гостей сервірують сніданок \"шведський стіл\" зі " +
                "свіжих тістечок і випічки.\n" +
                "Поїздка на метро від помешкання Club House до фонтану Треві та Іспанських сходів займе 10 хвилин. " +
                "Працівники цілодобової стійки реєстрації, які розмовляють кількома мовами, нададуть гостям туристичну " +
                "інформацію. У зонах загального користування можна скористатися безкоштовним Wi-Fi.\n" +
                "Сучасні номери готелю Club House Roma оформлені в теплих тонах. У кожному номері є окрема ванна " +
                "кімната, укомплектована феном. Деякі номери також мають балкон.\n");

        request.setAttribute("city", city);
        request.getRequestDispatcher("Hotel/hotel.jsp").forward(request, response);

    }
}


