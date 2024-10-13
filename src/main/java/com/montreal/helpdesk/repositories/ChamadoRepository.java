package com.montreal.helpdesk.repositories;

import com.montreal.helpdesk.domains.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {
}
