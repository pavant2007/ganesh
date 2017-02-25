package com.ganesh.smartapps;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Ganesh Software Solutions!");

        Date date = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);

        DatatypeFactory dc = null;
        try {
            dc = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        if(null != dc) {
            XMLGregorianCalendar calendar = dc.newXMLGregorianCalendar(gc);
            System.out.println(calendar);
        }
    }
}
