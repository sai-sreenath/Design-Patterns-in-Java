package com.ObserverDesign;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}
