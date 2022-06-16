package com.safauzun.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ISSUE_HISTORY")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class IssueHistory extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "ISSUE_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Issue issue;

    @JoinColumn(name = "ASSIGNEE_USER_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;
}
