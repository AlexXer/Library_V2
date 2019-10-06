package parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXHandler extends DefaultHandler {
    public List<String> getList() {
        return list;
    }

    private List<String> list = new ArrayList<>();



    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String information = new String(ch,start,length).replace("\n","").trim();
        list.add(information);
        System.out.println(information);
    }




}
