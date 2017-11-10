package com.springboot.study.service;

import com.springboot.study.entity.TicketOD;
import com.springboot.study.service.dao.TicketODMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ticketService")
public class TicketService {

    @Autowired
    private TicketODMapper ticketODMapper;

    public TicketOD getTicketODByTicketId(Long ticketId) throws Exception {
        return ticketODMapper.getByTicketId(ticketId);
    }

    public List<TicketOD> getTicketListByOd(Long od) throws Exception {
        return ticketODMapper.getByOd(od);
    }
}
