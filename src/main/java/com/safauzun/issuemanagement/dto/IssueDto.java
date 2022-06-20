package com.safauzun.issuemanagement.dto;

import com.safauzun.issuemanagement.common.GeneralEnumerationDefinitions.IssueStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssueDto {

    private Long id;
    private String description;
    public String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;
}
