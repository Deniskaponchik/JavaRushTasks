package com.javarush.task.task24.task2407;
/*
В работе вам иногда будет нужно закастить класс к какому-нибудь интерфейсу (тут Sayable),
который не реализован в текущем классе
 */
public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

     // Это - механизм адаптирования к другому интерфейсу - Sayable
     public Sayable toSayable (final int i) {
         // Внутри метода toSayable создайте class CatPet, реализующий интерфейс Sayable
         class CatPet implements Sayable {
             // Логика метода say:
             public String say() {
                 // Если i < 1, то вывести на экран, что кот спит. Пример, "Васька спит."
                 if (i < 1) {
                     //System.out.println(Cat.this.name + " спит");
                     //CatPet.this.
                     return Cat.this.name + " спит.";
                 }
                 // Иначе вывести фразу: "имя_кота говорит мяу!". Пример для i=3, "Васька говорит мяяяу!"
                 else {
                     StringBuilder sb = new StringBuilder();
                     for (int j = 0; j < i; j++) {
                         sb.append("я");
                     }
                     //System.out.println(Cat.this.name + " говорит м" + sb);
                     return Cat.this.name + " говорит м" + sb + "у";
                 }
             }
         };
         return new CatPet();
     }

     /* <p/>
     * <b>Пример вывода:</b>
     * Мурзик спит.
     * Васька говорит мяяу!
     * Кошка говорит мяяяяяу!
     * Мышь пищит.
     * Томас говорит мяу!
     * <p/>
     *
     * @param i количество букв 'я' в слове мяу
     * @return экземпляр класса CatPet
     */
}