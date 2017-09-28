package ru.myCompany.entity;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(
                name = "getGradeById",
                query = "from Grade g where g.id = :id"
        )
})

@Entity
@Table
public class Grade {

    @Id
    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    public Grade() {
    }

    public Grade(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return name;
    }

    public void setGrade(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
