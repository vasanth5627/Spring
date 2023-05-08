package org.spring.core.StandAloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String, Integer> fee;

    private Properties props; //key value pair collection

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", fee=" + fee +
                ", props=" + props +
                '}';
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Map<String, Integer> getFee() {
        return fee;
    }

    public void setFee(Map<String, Integer> fee) {
        this.fee = fee;
    }

    public Person(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getFriends() {
        return friends;
    }

    public Person() {
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

}
