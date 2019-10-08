package com.moringaschool.redditrssapi.model.entry;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "entry",strict = false)
public class Author implements Serializable {

    @Element(name = "name")
    private String name;

    @Element(name = "uri")
    private String uri;
}
