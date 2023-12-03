package io.javabrains.springbootstarter.topic;

public class Topic {

    private String id;
    private String name;
    private String decription;

    public Topic(){

    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.decription = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

}
