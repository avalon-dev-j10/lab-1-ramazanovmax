package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    
    private Address address;
    private Passport passport;
    
    public Person(String falmiliya, String imya, String otchestvo, String vtoroeimya){
        this.passport = new Passport(falmiliya,  imya, otchestvo, vtoroeimya);
    }
    
    public Person(String falmiliya, String imya, String otchestvo){
        this.passport = new Passport(falmiliya,  imya, otchestvo);
    }
    
    public Person(String falmiliya, String imya){   
        this.passport = new Passport(falmiliya,  imya);
        
    }
    
    /**
     *
     * @param number
     */
    public void setPassport(String number){
        this.passport.number = number;
    }
    
    public void setBirthday(String birthday){
        this.passport.birthday = birthday;
    }
    
        
    public void setIssueDate(String issueDate){
        this.passport.issueDate = issueDate;
    }
        
    public void setIssueAddress(String issueAddress){
        this.passport.issueAddress = issueAddress;
    };
        
    /*
     * TODO(Студент):ОК Создайте класс Address.
     *
     * 1.OK Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2.OK Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
       String fullName;
       if("" != this.passport.otchestvo){
           fullName = this.passport.imya+" "+this.passport.falmiliya+" "+this.passport.otchestvo;           
       }else if("" != this.passport.vtoroeimya){
           fullName = this.passport.imya+" "+this.passport.vtoroeimya.charAt(0)+". "+this.passport.falmiliya;       
       }else{
            fullName = this.passport.imya+" "+this.passport.falmiliya;       
       }
        /*
         * TODO(Студент):ОК Закончить определение метода 'getFullName()' класса 'Person'
         */
       //System.out.println(fullName);
        return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент):ОК Закончить определение метода 'getAddress()' класса 'Person'
         */
        //System.out.println(this.address.getAddress());
        return this.address.getAddress();
    }
    public void setAddress(String address){
        this.address = new Address(address);
    }
}