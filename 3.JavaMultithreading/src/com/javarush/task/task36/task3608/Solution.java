package com.javarush.task.task36.task3608;

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.FakeModel;
import com.javarush.task.task36.task3608.model.MainModel;
import com.javarush.task.task36.task3608.model.Model;
import com.javarush.task.task36.task3608.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventShowDeletedUsers();

    }

}

/*
цепочка композиции от Отображения до Источника данных:
объект View содержит в себе ссылку на Controller;
Controller - на Model;
Model (MainModel) - на UserService;
UserService (UserServiceImpl) - на UserDao;
UserDao - на DataSource.....
 */



/*
9) Класс Solution -- имитирует запрос пользователя, который, по сути, не трогает модель, а только пользуется Видом (смотрит).
В начале инициализации программы у нас создаются Модель, Вид и Контроллер, далее они знакомятся друг с другом
    (Вид знакомится с Контроллером,
    Контроллер знакомится с Моделью и Видом
    -- обратите внимание, что Вид и Модель не знакомятся).
Всё, что происходит в конце -- одно действие от пользователя
-- Solution просит usersView показать данные, а дальше всё происходит автоматически:
    Вид пинает Контроллер,
    Контроллер пинает Модель, та возвращает ему данные,
    Контроллер передаёт эти данные Виду,
    Вид выводит результат на экран.
 */