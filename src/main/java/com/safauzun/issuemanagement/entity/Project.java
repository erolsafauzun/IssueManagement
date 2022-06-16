package com.safauzun.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PROJECT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PROJECT_NAME", length = 300)
    private String projectName;

    @Column(name = "PROJECT_CODE", length = 30)
    private String projectCode;

    @JoinColumn(name = "MANAGER_USER_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User manager;



}
