package com.safauzun.issuemanagement.entity;

import com.safauzun.issuemanagement.common.GeneralEnumerationDefinitions.IssueStatus;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ISSUE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Issue extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name = "DETAILS", length = 4000)
    private String details;

    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "ISSUE_STATUS")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "ASSIGNEE_USER_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    //Bir çok issue, bir user ile ilişkilendirilebilir
    private User assignee;

    @JoinColumn(name = "PROJECT_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;

}
