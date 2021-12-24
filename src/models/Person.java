package models;

import java.util.Date;
import java.util.Objects;

public class Person {

    protected String name;
    protected String phone;
    protected Date birthDate;
    protected Date insertDate;
    protected Date lastChangeDate;

    public Person(String name, String phone, Date birthDate, Date insertDate, Date lastChangeDate) {
        this.name = name;
        this.phone = phone;
        this.birthDate = birthDate;
        this.insertDate = insertDate;
        this.lastChangeDate = lastChangeDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDate=" + birthDate +
                ", insertDate=" + insertDate +
                ", lastChangeDate=" + lastChangeDate +
                '}';
    }
}