package by.it.kust.jd02_08;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.stream.XMLStreamConstants;

/**
 * Created by Tanya Kust.
 */
public class STAX {
    public static void main(String[] args) {
        String filename = "src/by/it/kust/jd02_08/04+XSD.xml";
        String name;
        String tab = "";
        String content = "";
        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(filename));
            while (reader.hasNext()){
                int element = reader.next();
                switch (element){
                    case XMLStreamConstants.START_ELEMENT:
                        name = reader.getLocalName();
                        System.out.print(tab + "<" + name);
                        int attrCount = reader.getAttributeCount();
                        for (int i=0; i<attrCount; i++){
                            System.out.print(" " + reader.getAttributeLocalName(i) + "=\"");
                            System.out.print(reader.getAttributeValue(i) + "\"");
                        }
                        System.out.println(">");
                        tab = tab.concat("\t");
                        content = "";
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        if (!content.isEmpty()){
                            System.out.println(tab + content);
                        }
                        content = "";
                        tab = tab.substring(1);
                        System.out.println(tab + "</" + reader.getLocalName() + ">");
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        content = content.concat(reader.getText().trim());
                        break;
                    case XMLStreamConstants.ATTRIBUTE:
                        System.out.println(tab + "Attribute error!");
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
