package com.javarush.task.task36.task3608.model;
/*
4) Интерфейс Model - класс, который реализует этот интерфейс, обязан уметь всё, что умеет модель.
А модель должна уметь выдавать свои данные и загружать в себя список пользователей.
Почему? Потому что мы так хотим -- такая у нас логика бизнес-модели.
 */
public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
}
