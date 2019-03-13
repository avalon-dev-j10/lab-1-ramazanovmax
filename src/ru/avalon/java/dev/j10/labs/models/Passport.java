package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
class Passport {
    public String number;
    public String birthday;
    public String issueDate;
    public String issueAddress;
    
    public String falmiliya;
    public String imya;
    public String otchestvo;
    public String vtoroeimya;
    
    public Passport(String falmiliya, String imya, String otchestvo, String vtoroeimya){
        this.falmiliya = falmiliya;
        this.imya = imya;
        this.otchestvo = otchestvo;
        this.vtoroeimya = vtoroeimya;
    }
    
    public Passport(String falmiliya, String imya, String otchestvo){
        this.falmiliya = falmiliya;
        this.imya = imya;
        this.otchestvo = otchestvo;
    }
    
    
    public Passport(String falmiliya, String imya){
        this.falmiliya = falmiliya;
        this.imya = imya;
    }
    

    /*
     * TODO(Студент):ОК Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
