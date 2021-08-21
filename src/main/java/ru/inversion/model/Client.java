package ru.inversion.model;

import java.util.Date;

public class Client {
    private Long cusnum;            // Ид клиента
    private String lastname;        // Фамилия
    private String firstName;       // Имя
    private String middleName;      // Отчество
    private Date birthday;          // Дата рождения
    private String resident;        // Резидент или нет
    private String inn;             // ИНН
    private String citizenship;     // Гражданство
    private String magic_word;      // Кодовое слово
    private String filial;          // Филиал
    private String cus_qty;         // Категория качества
    private Date dopen;             // Дата заведения клиента
    private String birthplace;      // Место рождения
    private String sex;             // Пол
    private Doc doc;

    public Client() {
    }

    public Long getCusnum() {
        return cusnum;
    }

    public void setCusnum(Long cusnum) {
        this.cusnum = cusnum;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getMagic_word() {
        return magic_word;
    }

    public void setMagic_word(String magic_word) {
        this.magic_word = magic_word;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getCus_qty() {
        return cus_qty;
    }

    public void setCus_qty(String cus_qty) {
        this.cus_qty = cus_qty;
    }

    public Date getDopen() {
        return dopen;
    }

    public void setDopen(Date dopen) {
        this.dopen = dopen;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }
}
