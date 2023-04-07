package com.javarush.task.task25.task2503;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public enum Column implements Columnable {
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new LinkedList<>();
        result = Arrays.stream(Column.values())        //делаем стрим
                .filter(Column::isShown)              //фильтруем видимые
                .sorted( (c1,c2) -> realOrder[c1.ordinal()] - realOrder[c2.ordinal()] ) //вот тут сортируем
                .collect(Collectors.toList()           //возвращаем коллекцию.
                );
        return result;
    }


    @Override
    public String getColumnName() {
        //должен возвращать полное имя колонки
        return null;
    }

    @Override
    public boolean isShown() {
        //должен возвращать true, если колонка видимая, иначе false.
        return false;
    }

    @Override
    public void hide() {
        //должен скрывать колонку и сдвигать индексы остальных отображаемых колонок.

    }
}
