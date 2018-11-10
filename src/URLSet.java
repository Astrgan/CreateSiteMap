import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "urlset")
public class URLSet {

    private List<URL> urlset;

    @XmlAttribute(name="xmlns")
    private String xmlns = "http://www.sitemaps.org/schemas/sitemap/0.9";

    public URLSet() {
        urlset = new ArrayList<URL>();
    }

    @XmlElement(name="url")
    public List<URL> getUrlset() {
        return urlset;
    }

    public void setUrlset(List<URL> urlset) {
        this.urlset = urlset;
    }

}
