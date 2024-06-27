import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.hazelcast.client.HazelcastClient;

public class HazelcastCliente {

    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.getNetworkConfig().addAddress("localhost:5701", "localhost:5701"); // Reemplaza con las IPs de los ordenadores

        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        IMap<String, String> map = client.getMap("my-distributed-map");

        // Agregar un valor al mapa distribuido
        map.put("key", "Hola mundo");

        // Leer el valor del mapa distribuido
        String value = map.get("key");
        System.out.println("Value for key: " + value);

        client.shutdown();
    }
}

