package com.moringaschool.redditrssapi.model.entry;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;

import java.io.Serializable;

@Root(name = "entry",strict = false)
public class Entry implements Serializable {

    @Element(name = "content")
    private String content;

    @Element(required = false,name = "author")
    private String author;

    @Element(name = "id")
    private String id;

    @Element(name = "title")
    private String title;

    @Element(name = "updated")
    private String updated;



}
