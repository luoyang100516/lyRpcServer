import impl.HelloServiceImpl;
import proxy.RpcProxyServer;
import service.IHelloService;

/**
 * @author 61749
 */
public class DoPublish {
    public static void main(String[] args) {
        IHelloService helloService = new HelloServiceImpl();
        RpcProxyServer rpcProxyServer = new RpcProxyServer();
        rpcProxyServer.publish(helloService,8080);
    }
}
