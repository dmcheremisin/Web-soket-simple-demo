package com.example;

import javax.websocket.server.ServerEndpointConfig.Configurator;

/**
 * Created by Dmitrii on 31.10.2018.
 */
public class ChatServerEndPointConfigurator extends Configurator {
    private ChatServerEndPoint chatServer = new ChatServerEndPoint();

    @Override
    public <T> T getEndpointInstance(Class<T> endpointClass)
            throws InstantiationException {
        return (T)chatServer;
    }
}
