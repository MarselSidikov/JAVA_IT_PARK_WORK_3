package ru.itpark;

import com.sun.deploy.resources.Deployment_pt_BR;

public class MainWithObjects {
    public static void main(String[] args) {
        Document document = new Document();
        Document document1 = new Document();
        document.addLineToBegin("Hello");
        document.addLineToBegin("Bye");
        document1.addLineToEnd("Russia");
    }
}
