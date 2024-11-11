/*
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class CrearXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
       /* try {
            // Crear un documento XML
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            // Crear el elemento raíz
            Element raiz = doc.createElement("libro");
            doc.appendChild(raiz);

            // Crear el elemento título
            Element titulo = doc.createElement("titulo");
            titulo.appendChild(doc.createTextNode("El Principito"));
            raiz.appendChild(titulo);

            // Crear el elemento autor
            Element autor = doc.createElement("autor");
            autor.appendChild(doc.createTextNode("Antoine de Saint-Exupéry"));
            raiz.appendChild(autor);

            // Escribir el contenido del documento en un fichero XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("libro.xml"));
            transformer.transform(source, result);

            System.out.println("Documento XML creado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder  docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            Element raiz = doc.createElement("fruta");
            doc.appendChild(raiz);

            Element nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("manzana"));
            raiz.appendChild(nombre);

            Element color = doc.createElement("color");
            color.appendChild(doc.createTextNode("rojo"));
            raiz.appendChild(color);

            Element cantidad = doc.createElement("cantidad");
            cantidad.appendChild(doc.createTextNode("10"));
            raiz.appendChild(cantidad);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("fruta.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        /*
        try {
            File archivo = new File("fruta.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(archivo);

            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();
            System.out.println("Raiz: " + root.getNodeName());

            NodeList listalibros= doc.getElementsByTagName("fruta");
            for(int i=0; i<listalibros.getLength(); i++){
                Element libro= (Element) listalibros.item(i);
                System.out.println("Nombre: " + libro.getElementsByTagName("nombre").item(0).getTextContent());
                System.out.println("Color: " + libro.getElementsByTagName("color").item(0).getTextContent());
                System.out.println("Cantidad: " + libro.getElementsByTagName("cantidad").item(0).getTextContent());
            }
        }catch (Exception e){
            e.printStackTrace();
        }*/

        /*try {
                    // Cargar el esquema XSD
                    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
                    Schema schema = factory.newSchema(new File("src/libro.xsd"));

                    // Crear el validador
                    Validator validator = schema.newValidator();

                    // Validar el documento XML
                    validator.validate(new StreamSource(new File("libro.xml")));
                    System.out.println("El documento XML es válido.");
                } catch (Exception e) {
                    System.out.println("El documento XML no es válido: " + e.getMessage());
                }*/
/*
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse("fruta.xml");

                // Acceder al elemento raíz
                Element raiz = document.getDocumentElement();
                System.out.println("Elemento raíz: " + raiz.getNodeName());


                try {
                    File file = new File("ruta/del/libro.xml");
                    JAXBContext jaxbContext = JAXBContext.newInstance(Libro.class);

                    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                    Libro libro = (Libro) jaxbUnmarshaller.unmarshal(file);
                    System.out.println("Título: " + libro.getTitulo());
                    System.out.println("Autor: " + libro.getAutor());
                } catch (JAXBException e) {
                    e.printStackTrace();
                }


    }
}*/