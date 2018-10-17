package com.wey.map;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

public class XmlUtil {
    
    /**
     * DOM模式的解析器对象
     * @return
     * @throws ParserConfigurationException
     */
    public static DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
        /* DocumentBuilderFactory用于创建DOM模式的解析器对象,
         * DocumentBuilderFactory是一个抽象工厂类，它不能直接实例化，但该类提供了一个newInstance方法 ，
         * 这个方法会根据本地平台默认安装的解析器，自动创建一个工厂的对象并返回。
         * 调用 DocumentBuilderFactory.newInstance() 方法得到创建 DOM 解析器的工厂
         * */
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        documentBuilderFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
        documentBuilderFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        documentBuilderFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        documentBuilderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        documentBuilderFactory.setXIncludeAware(false);
        documentBuilderFactory.setExpandEntityReferences(false);
        
        // 调用工厂对象的newDocumentBuilder方法得到 DOM 解析器对象。
        return documentBuilderFactory.newDocumentBuilder();
    }
    
    public static Document newDocument() throws ParserConfigurationException {
        return newDocumentBuilder().newDocument();
    }
}
