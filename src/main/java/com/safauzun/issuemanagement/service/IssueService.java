package com.safauzun.issuemanagement.service;

import com.safauzun.issuemanagement.dto.IssueDto;
import com.safauzun.issuemanagement.entity.Issue;
import com.safauzun.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete (IssueDto issue);
}
