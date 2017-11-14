package com.springboot.study.service.dao;

import com.springboot.study.entity.TicketOD;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ticketODMapper")
public interface TicketODMapper {


    List<TicketOD> getByOd(Long planeOdId);

    TicketOD getByTicketId(Long planeTicketId);
}
