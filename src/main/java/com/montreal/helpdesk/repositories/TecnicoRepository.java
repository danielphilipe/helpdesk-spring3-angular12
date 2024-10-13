package com.montreal.helpdesk.repositories;

import com.montreal.helpdesk.domains.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
}
