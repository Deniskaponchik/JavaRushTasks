package com.javarush.task.task36.task3608.view;
import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

/*
7) Класс UsersView -- реализация вида. Рисует в консоли список с юзерами.
Самостоятельно нарисовать не может, т.к. не имеет связей с моделью, вообще никаких.
А вот контроллер имеет связь. Поэтому говорит контроллеру: "Передай мне данные модели, а я их покажу!".
 */
public class UsersView implements View {
    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }
    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }
    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users:");
        for (User usr : modelData.getUsers()){
            System.out.println("\t" + usr.toString());
        }
        System.out.println("===================================================");
    }
    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    private Controller controller;
}
