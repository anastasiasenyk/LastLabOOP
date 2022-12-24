package proxy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

public class Proxy {
    private ServiceInterface service;
    private String link;
    private Document doc;

    public Proxy(ServiceInterface service) {
        this.service = service;
    }

    public void getScrappedLink(String link) throws IOException {
        this.link = link;
        doc = service.scrapLink(link);
        save();
    }

    public void save() {
        Connection connection = Connection.getInstance();
        connection.executeQuery("insert into ScrappedLinks (link, doc) values ('" + link + "','" + doc + "')");
    }
}
