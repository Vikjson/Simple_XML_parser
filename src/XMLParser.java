import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * * Simple XML parser that reads a "users.xml" file and prints
 *  * each user's name, email, and username to the console.
 *  *
 *  * Handles errors if the file cannot be read or parsed.
 */
public class XMLParser {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("users.xml");
            NodeList nodeList = document.getDocumentElement().getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) node;
                    String name = elem.getElementsByTagName("name").item(0).getTextContent();
                    String email = elem.getElementsByTagName("email").item(0).getTextContent();
                    String userName = elem.getElementsByTagName("username").item(0).getTextContent();
                    System.out.println(name + " " + email + " " + userName);
                }
            }

        } catch (IOException | SAXException | ParserConfigurationException e) {
            System.err.println("Failed to parse XML file");
        }


    }
}
