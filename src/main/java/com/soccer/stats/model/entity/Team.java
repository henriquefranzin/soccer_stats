package com.soccer.stats.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import static javax.persistence.FetchType.*;

@Data
@Entity
@Table(name = "team")
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    @Id
    @Column(name = "id", length = 36, nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "city")
    private String city;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "age")
    private Integer age;

    @OneToMany(mappedBy = "team")
    private List<PersonTeam> personTeamList;
}


