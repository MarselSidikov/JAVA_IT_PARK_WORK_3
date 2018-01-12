package ru.itpark.full_annotation_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    @Autowired
    @Qualifier(value = "friendlyWaiterImpl")
    private Waiter waiter;

    public void welcome() {
        waiter.giveMenu();
    }
}
