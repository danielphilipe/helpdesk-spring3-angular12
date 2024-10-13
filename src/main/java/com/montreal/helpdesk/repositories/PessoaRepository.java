package com.montreal.helpdesk.repositories;

import com.montreal.helpdesk.domains.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
