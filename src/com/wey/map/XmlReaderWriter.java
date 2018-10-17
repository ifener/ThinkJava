package com.wey.map;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReaderWriter {
    
    public static void reader() throws ParserConfigurationException, SAXException, IOException {
        
        DocumentBuilder documentBuilder = XmlUtil.newDocumentBuilder();
        
        // InputStream is = new FileInputStream(new File("file.xml"));
        String strXML = "<CATALOG><CD><TITLE>Empire Burlesque</TITLE></CD><CD><TITLE>Hide your heart</TITLE></CD></CATALOG>";
        InputStream is = new ByteArrayInputStream(strXML.getBytes("UTF-8"));
        // 调用 DOM 解析器对象的 parse() 方法解析 XML 文档，得到代表整个文档的 Document 对象，进行可以利用DOM特性对整个XML文档进行操作了。
        Document document = documentBuilder.parse(is);
        // 得到 XML 文档的根节点
        Element rootElement = document.getDocumentElement();
        rootElement.normalize();
        
        // 得到节点的子节点
        NodeList catalogs = rootElement.getChildNodes();
        if (catalogs != null) {
            for (int i = 0; i < catalogs.getLength(); i++) {
                Node cd = catalogs.item(i);
                // TEXT_NODE 说明该节点是文本节点
                // ELEMENT_NODE 说明该节点是个元素节点
                if (cd.getNodeType() == Node.ELEMENT_NODE) {
                    // 取得节点的属性值
                    // String email = user.getAttributes().getNamedItem("attr").getNodeValue();
                    // 轮循子节点
                    for (Node node = cd.getFirstChild(); node != null; node = node.getNextSibling()) {
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            if (node.getNodeName().equals("TITLE")) {
                                Node titleNode = node.getFirstChild();
                                // 如果是文本
                                if (titleNode.getNodeType() == Node.TEXT_NODE) {
                                    
                                    System.out.println("节点的值：" + titleNode.getNodeValue());
                                }
                                
                            }
                            
                        }
                    }
                }
            }
        }
        
    }
    
    public static void writer() throws ParserConfigurationException, TransformerException {
        Map<String, String> maps = new HashMap<String, String>(16);
        maps.put("ARTIST", "Bonnie Tyler");
        maps.put("TITLE", "Hide your heart");
        maps.put("COUNTRY", "UK");
        Document document = XmlUtil.newDocument();
        // 根节点
        Element rootEmement = document.createElement("CATALOGS");
        document.appendChild(rootEmement);
        
        Element cdElement = document.createElement("CD");
        rootEmement.appendChild(cdElement);
        
        for (String key : maps.keySet()) {
            Element field = document.createElement(key);
            field.appendChild(document.createTextNode(maps.get(key)));
            cdElement.appendChild(field);
        }
        
        // 设置XML声明中standalone为yes，即没有dtd和schema作为该XML的说明文档，且不显示该属性
        document.setXmlStandalone(true);
        
        // 开始生成XML文件
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        DOMSource source = new DOMSource(document);
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        // 生成到文件里
        // StreamResult result = new StreamResult("D:\\cds.xml");
        transformer.transform(source, result);
        String output = writer.getBuffer().toString(); // .replaceAll("\n|\r", "");
        try {
            writer.close();
        }
        catch (Exception ex) {
        }
        System.out.println(output);
    }
    
    public static void main(String[] args)
            throws ParserConfigurationException, SAXException, IOException, TransformerException {
        XmlReaderWriter.reader();
        XmlReaderWriter.writer();
    }
    
}
