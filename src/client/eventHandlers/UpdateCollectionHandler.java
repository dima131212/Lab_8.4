package client.eventHandlers;

import java.io.IOException;

import client.Client;
import client.ClientRequestSender;

public class UpdateCollectionHandler {
	private ClientRequestSender sender;
	public UpdateCollectionHandler(ClientRequestSender sender) {
		this.sender = sender;
	}
	
	public void updateCollection() {
		try {
			sender.send(new Object[]{"load_next_page", new Object[]{Client.pageCounter}, Client.currentClient.getUserName(), Client.currentClient.getUserPassword()});
			Thread.sleep(1000);
			
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
