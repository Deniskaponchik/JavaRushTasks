package com.javarush.task.task36.task3608.controller;
import com.javarush.task.task36.task3608.model.Model;
import com.javarush.task.task36.task3608.view.UsersView;

/*
8) Класс Controller -- имеет связи и с Моделью, и с Видом.
Может приказать модели загрузить пользователей, запросить результат,
а потом передать его Виду для того, чтобы тот уже красиво всё оформил и показал пользователю.
 */
public class Controller {
    private Model model;
    private UsersView usersView;

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers(){
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }
    public void onShowAllDeletedUsers() {
        model.loadDeletedUsers();
        usersView.refresh(model.getModelData());
    }
}
