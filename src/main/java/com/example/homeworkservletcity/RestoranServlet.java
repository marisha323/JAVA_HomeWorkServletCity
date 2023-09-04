package com.example.homeworkservletcity;

import com.example.homeworkservletcity.Class.City;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "restoranServlet", value = "/restoran-servlet")
public class RestoranServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        City city = new City();
        city.setCityName("Roscioli Ristorante Salumeria");
        city.setDescription("Roscioli Ristorante Salumeria  — це стильний та затишний ресторан для всієї родини. " +
                "Родина засновників ресторану Roscioli вже чотири покоління працює у сфері гостинності та еногастрономії." +
                " Родина почала свою справу з пекарні, та згодом заклад перетворився на вишукану багатофункціональну " +
                "бодегу з цікавою кухнею та винним льохом. Тут ви знайдете 300 видів сиру, 150 варіантів різноманітних " +
                "нарізок м’ясних делікатесів, 2800 найменувань вин, а також великий вибір італійських консервів, соусів," +
                " гірчиці, макаронних виробів, олій та оцтів, які можна придбати у лавці та забрати з собою. Ви можете " +
                "обрати столик перед вітриною гастроному, біля стійки або в одній з двох dining rooms. Також ви можете " +
                "зарезервувати простір Cucina для приватних заходів. У меню закладу – традиційні італійські страви, " +
                "приготовані з якісних продуктів. У меню не вказані ціни, але завдяки різноманітним позначкам буде л" +
                "егко визначити вегетаріанські страви, або ті, що, наприклад, не містять глютен.");

        request.setAttribute("city",city);
        request.getRequestDispatcher("Restoran/restoran.jsp").forward(request,response);

    }
}
