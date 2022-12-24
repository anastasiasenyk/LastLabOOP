package proxy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NewHomeSource implements ServiceInterface{

    @Override
    public Document scrapLink(String link) throws IOException {
        try {
            Document doc = Jsoup.connect(link)
                    .userAgent("Mozilla")
                    .userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21 (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21")
                    .timeout(10000)
                    .get();
            return doc.normalise();
        } catch (IOException e) {
            System.out.println(e);
        }
        return new Document("error in link");
    }
}
