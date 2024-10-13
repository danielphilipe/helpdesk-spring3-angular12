package com.montreal.helpdesk.repositories;

import com.montreal.helpdesk.domains.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
