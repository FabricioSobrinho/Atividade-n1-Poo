package fabricio.com.entities.bank;

import java.util.List;

public class Bank {

    List<Client> clients;

    public void CreateAccount(String holderName) {

        Client client = new Client(holderName, 0);
        this.clients.add(client);
    }

}
