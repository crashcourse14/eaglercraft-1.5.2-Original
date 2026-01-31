package net.polarclient;

import net.polarclient.event.EventManager;
import net.polarclient.event.Event;

public class Client {
    public static final String CLIENT_VERSION = "PolarClient 1.5.2 R9";
    public static final Client INSTANCE = new Client();

    public EventManager eventManager;

    public void startup() {

        eventManager = new EventManager();


        EventManager.register(this);

        System.out.println("Starting " + CLIENT_VERSION);
    }

    public void shutdown() {
        EventManager.unregister(this);
        System.out.println("Shutting down " + CLIENT_VERSION);

    }
}