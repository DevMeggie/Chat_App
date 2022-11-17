package org.maggie.entity;

import lombok.Getter;
import lombok.Setter;
import org.maggie.service.client_service.ClientServiceImpl;

@Getter
@Setter
public class Client {
    public static void main(String[] args) {
        ClientServiceImpl clientFunctionalities = new ClientServiceImpl();
        clientFunctionalities.connectToSocket("localhost", 1233);
        clientFunctionalities.listenForMessage();
        clientFunctionalities.sendMessage();
    }
}
