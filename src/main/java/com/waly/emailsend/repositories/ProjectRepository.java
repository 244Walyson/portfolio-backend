package com.waly.emailsend.repositories;

import com.waly.emailsend.dto.ProjectDTO;
import com.waly.emailsend.entities.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    Page<Project> findAll(Pageable pageable);
}
