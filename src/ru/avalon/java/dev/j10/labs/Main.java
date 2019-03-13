package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;

class Main {
   public static void main(String args[]){
        /*
         * FIXME(Студент):OK Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

        Person ivanov = new Person("Иванов", "Иван", "Иванович");
        Person smith = new Person("John", "Edvard", "", "Smith");
        
        ivanov.setAddress("Москва");
        smith.setAddress("London");
        
        ivanov.setAddress("Москва");
        smith.setAddress("London");

        /*
         * TODO(Студент):OK Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        
        /*
         * TODO(Студент):ОК Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        String ivanovName = ivanov.getFullName();
        String ivanovAddress = ivanov.getAddress();
        
        
        String smithName = smith.getFullName();      
        String smithAddress = smith.getAddress();
       

        /*
         * TODO(Студент):ОК Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        System.out.println(ivanovName);
        System.out.println(ivanovAddress);
        System.out.println(smithName);
        System.out.println(smithAddress);
    }
}
