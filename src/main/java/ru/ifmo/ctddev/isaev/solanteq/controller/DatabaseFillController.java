package ru.ifmo.ctddev.isaev.solanteq.controller;

/**
 * Created by root on //.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.ifmo.ctddev.isaev.solanteq.dao.MainDAO;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

@Controller
@RequestMapping("/dbFill")
public class DatabaseFillController {
    private static String[] surnames = new String[]{
            "Иванов",
            "Васильев",
            "Петров",
            "Смирнов",
            "Михайлов",
            "Фёдоров",
            "Соколов",
            "Яковлев",
            "Попов",
            "Андреев",
            "Алексеев",
            "Александров",
            "Лебедев",
            "Григорьев",
            "Степанов",
            "Семёнов",
            "Павлов",
            "Богданов",
            "Николаев",
            "Дмитриев",
            "Егоров",
            "Волков",
            "Кузнецов",
            "Никитин",
            "Соловьёв",
            "Тимофеев",
            "Орлов",
            "Афанасьев",
            "Филиппов",
            "Сергеев",
            "Захаров",
            "Матвеев",
            "Виноградов",
            "Кузьмин",
            "Максимов",
            "Козлов",
            "Ильин",
            "Герасимов",
            "Марков",
            "Новиков",
            "Морозов",
            "Романов",
            "Осипов",
            "Макаров",
            "Зайцев",
            "Беляев",
            "Гаврилов",
            "Антонов",
            "Ефимов",
            "Леонтьев",
            "Давыдов",
            "Гусев",
            "Данилов",
            "Киселёв",
            "Сорокин",
            "Тихомиров",
            "Крылов"
    };
    private static String[] names = new String[]{
            "Александр",
            "Сергей",
            "Андрей",
            "Владимир",
            "Алексей",
            "Дмитрий",
            "Николай",
            "Евгений",
            "Иван",
            "Михаил",
            "Юрий",
            "Игорь",
            "Виктор",
            "Олег",
            "Павел",
            "Максим",
            "Василий",
            "Анатолий",
            "Виталий",
            "Роман",
            "Денис",
            "Валерий",
            "Константин",
            "Вячеслав",
            "Антон",
            "Вадим",
            "Илья",
            "Петр",
            "Владислав",
            "Геннадий",
            "Руслан",
            "Григорий",
            "Станислав",
            "Леонид",
            "Борис",
            "Артем",
            "Кирилл",
            "Никита",
            "Валентин",
            "Эдуард",
            "Георгий",
            "Федор",
            "Артур",
            "Степан",
            "Егор",
            "Ярослав",
            "Яков",
            "Богдан",
            "Даниил",
            "Тимур"
    };
    private static Random rand = new Random();
    @Autowired
    MainDAO dao;
    private String[] patronymics = new String[]{

            "Аланович", "Альбертович", "Анатольевич", "Арнольдович", "Аронович", "Артурович", "Валерьевич", "Вениаминович", "Владленович", "Германович", "Денисович", "Дмитриевич", "Елизарович", "Игоревич", "Иосифович", "Леонидович", "Львович", "Маркович", "Наумович", "Николаевич", "Олегович", "Рудольфович", "Станиславович", "Степанович", "Феликсович", "Эммануилович",
            "Александрович", "Вадимович", "Григорьевич", "Ефимович", "Максимович", "Натанович", "Павлович", "Ростиславович", "Федорович", "Эдуардович",
            "Алексеевич", "Васильевич", "Викторович", "Владимирович", "Евгеньевич", "Иванович", "Ильич", "Михайлович", "Петрович", "Сергеевич", "Юрьевич", "Яковлевич",
            "Андреевич", "Аркадьевич", "Артемович", "Валентинович", "Витальевич", "Матвеевич", "Никитович", "Платонович", "Романович", "Тимофеевич",
            "Антонович", "Богданович", "Богуславович", "Владиславович", "Вячеславович", "Геннадьевич", "Георгиевич", "Глебович", "Давидович", "Данилович", "Егорович", "Захарович", "Кириллович", "Константинович", "Макарович", "Миронович", "Никанорович", "Робертович", "Русланович", "Семенович", "Янович"
    };

    private static int randBetween(int start, int end) {
        return start + rand.nextInt(end - start);
    }

    private static Date getRandomDate() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1950, 1995);
        gc.set(Calendar.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));
        gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
        return gc.getTime();

    }


    @RequestMapping(method = RequestMethod.GET)
    public String getPage() {
        /*for(int i=0;i<200;++i){
            Employee employee = new Employee(0,
                    names[rand.nextInt(names.length)],
                    surnames[rand.nextInt(surnames.length)],
                    patronymics[rand.nextInt(patronymics.length)],
                    getRandomDate(),
                    new Position(1+rand.nextInt(18)));
            dao.addEmployee(employee);
        }*/
        return "main.jsp";
    }
}
