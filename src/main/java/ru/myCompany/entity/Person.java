package ru.myCompany.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(
                name = "getPersonById",
                query = "from Person p where p.id = :id"
        )
})

@Entity
@Table
public class Person {

    @Id
    @Column
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    @ManyToOne//(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @PrimaryKeyJoinColumn
    private Grade grade;

    public Person() {
    }

//    public Person(String name, String country, Grade grade) {
//        this.name = name;
//        this.country = country;
//        this.grade = grade;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", grade=" + grade +
                '}';
    }
}
