package com.db.multidb;

import com.db.multidb.entity.User;
import com.db.multidb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StarterBean {

    @Autowired
    MyService myService;

    @EventListener(ApplicationStartedEvent.class)
    public void getAndPrintEntity(){
        myService.processDelete();
    }
}
