package com.javarush.task.task36.task3608.view;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;
/*
6) Интерфейс View -- виды, которые мы создаём, должны уметь обновлять данные, а ещё быть в связке с контроллером.
Потому что вид сам себя не обновит, ему нужен пинок от контроллера.
 */
public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
