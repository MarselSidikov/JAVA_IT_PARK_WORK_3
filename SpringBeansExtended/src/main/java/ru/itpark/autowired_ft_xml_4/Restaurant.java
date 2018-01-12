package ru.itpark.autowired_ft_xml_4;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {

    @Autowired
    private Waiter waiter;

    public void welcome() {
        waiter.giveMenu();
    }
}
