package com.javarush.task.task36.task3608.model;
import com.javarush.task.task36.task3608.bean.User;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
5) Класс FakeModel -- а вот и класс, с настоящим объектом которого мы будем работать.
Создаётся же фейковая модель в main методе Solution. У фейковой модели есть свои данные
-- объект ModelData, где на самом деле нет ничего, кроме ни с чем не связанного списка юзеров.
Модель может отдавать этот список по запросу,
а также "загружать" юзеров - просто добавляет выдуманных нами юзеров в список к своей ModelData.
 */
public class FakeModel implements Model {
    private ModelData modelData = new ModelData();
    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new LinkedList<>();
        users.add(new User("A", 1, 1));
        users.add(new User("B", 2, 1));

        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }
}
