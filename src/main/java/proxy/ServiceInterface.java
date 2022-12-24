package proxy;

import org.jsoup.nodes.Document;

import java.io.IOException;

public interface ServiceInterface {
    public Document scrapLink(String link) throws IOException;
}
