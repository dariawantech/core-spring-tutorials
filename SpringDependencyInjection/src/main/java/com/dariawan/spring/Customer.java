package com.dariawan.spring;

public class Customer {

    private String source;
    private String name;

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Customer(String source, String name) {
        this.source = source;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Customer{" + "source=" + source + ", name=" + name + '}';
    }
}
