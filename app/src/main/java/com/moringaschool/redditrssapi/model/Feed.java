package com.moringaschool.redditrssapi.model;

import com.moringaschool.redditrssapi.model.entry.Entry;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
//import org.simpleframework.xml.util.Entry;

import java.io.Serializable;
import java.util.List;


@Root(name = "feed", strict = false)
public class Feed implements Serializable {

    //tags I am going to extract from the reddit feed
    @Element(name = "icon")
    private String icon;

    @Element(name = "id")
    private String id;

    @Element(name = "logo")
    private String logo;

    @Element(name = "title")
    private String title;

    @Element(name = "updated")
    private String updated;

    @Element(name = "subtitle")
    private String subtitle;

    @ElementList(inline = true, name = "entry")
    private List<Entry> entrys;

    public String getIcon() {
        return icon;
    }

    public String getId() {
        return id;
    }

    public String getLogo() {
        return logo;
    }

    public String getTitle() {
        return title;
    }

    public String getUpdated() {
        return updated;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public List<Entry> getEntrys() {
        return entrys;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setEntrys(List<Entry> entrys) {
        this.entrys = entrys;
    }
}

