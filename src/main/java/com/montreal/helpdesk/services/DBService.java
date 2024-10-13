package com.montreal.helpdesk.services;

import com.montreal.helpdesk.domains.Chamado;
import com.montreal.helpdesk.domains.Cliente;
import com.montreal.helpdesk.domains.Tecnico;
import com.montreal.helpdesk.domains.enums.Perfil;
import com.montreal.helpdesk.domains.enums.Prioridade;
import com.montreal.helpdesk.domains.enums.Status;
import com.montreal.helpdesk.repositories.ChamadoRepository;
import com.montreal.helpdesk.repositories.ClienteRepository;
import com.montreal.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public DBService instanciaDB(){

        Tecnico tec1 = new Tecnico(null, "Daniel Dreher", "63653230268","danieloBonitao@hotmail.com","123");
        tec1.addPerfis(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Monique Dreher", "80527954780","moniqueLindona@gmail.com","1234");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado",tec1,cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));

        return null;
    }
}
