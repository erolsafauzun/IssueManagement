package com.safauzun.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "UNAME",length = 100, unique = true)
    private String username;

    @Column(name = "PWD",length = 200)
    private String password;

    @Column(name = "NAME_SURNAME", length = 200)
    private String nameSurname;

    @Column(name = "EMAIL",length = 100)
    private String email;

    @JoinColumn(name = "ASSIGNEE_USER_ID")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Issue> issues;

}
