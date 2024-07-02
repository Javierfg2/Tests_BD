import com.hazelcast.config.Config;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastServer {

    public static void main(String[] args) {
        Config config = new Config();
        NetworkConfig networkConfig = config.getNetworkConfig();

        networkConfig.setPort(5701).setPortAutoIncrement(false);
        networkConfig.getJoin().getMulticastConfig().setEnabled(false);
        networkConfig.getJoin().getTcpIpConfig()
                .addMember("192.168.43.166") // Reemplaza con la IP del otro ordenador
                .addMember("192.168.43.53")
                .addMember("192.168.43.221")
                .addMember("192.168.43.55")// Reemplaza con la IP de tu ordenador
                .setEnabled(true);

        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(config);
        System.out.println("Hazelcast server is running on port 5701");
    }
}

