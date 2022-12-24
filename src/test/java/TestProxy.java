import org.jsoup.nodes.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import proxy.NewHomeSource;
import proxy.Proxy;
import proxy.ServiceInterface;

import java.io.IOException;
import java.util.logging.Handler;

public class TestProxy {
    private Proxy proxy;

    @BeforeEach
    public void init() {
        this.proxy = new Proxy(new NewHomeSource());
    }

    @Test
    public void testCorrectInputs() throws IOException {
        proxy.getScrappedLink("https://kpi.ua/");
    }
}
