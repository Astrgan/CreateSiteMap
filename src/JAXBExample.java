import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBExample {
    //13481
    private static int fin = 5;
    private URLSet urlSet;

    public void start() {

        urlSet = new URLSet();
        List<URL> listURL = new ArrayList<>();
        for(int i = 1; i < fin; i++){
            listURL.add(new URL("http://kino-free.tk/MovieServer_war/index.xhtml?id="+ i, "2018-11-06"));
        }

        urlSet.setUrlset(listURL);


        try {

            File file = new File("file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(URLSet.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(urlSet, file);
            jaxbMarshaller.marshal(urlSet, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}