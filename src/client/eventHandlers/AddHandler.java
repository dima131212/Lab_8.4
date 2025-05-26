package client.eventHandlers;

import client.Client;
import client.ClientRequestSender;
import client.ClientResponseReceiver;
import client.GUI.AddPageGUI;
import client.interfaces.AddHandlerInterface;

import java.io.IOException;
import java.util.Map;

public class AddHandler implements AddHandlerInterface {
    private AddPageGUI addPageGUI;
    private ClientRequestSender sender;
    private ClientResponseReceiver receiver;

    public AddHandler(AddPageGUI addPageGUI, ClientRequestSender sender, ClientResponseReceiver receiver) {
        this.addPageGUI = addPageGUI;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public void add(Map<String, Object> elementFields) {
        try {
            sender.send(new Object[]{"add", new Object[]{elementFields}, Client.currentClient.getUserName(), Client.currentClient.getUserPassword()});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}