package com.visitor;
import com.visitor.visitable.*;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.doService(new Customer());
        System.out.println("============");
        service.doService(new Member());
        System.out.println("============");
        service.doService(new VIP());
        System.out.println("============");
    }
}