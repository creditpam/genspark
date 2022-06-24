package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class student implements Person
{

    private int id;
    private String name;
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;
    public void display(){
        System.out.println(name+ "with ID:"+id+"\n has Phone Numbers:");
        if(ph==null){
            System.out.println("No phone Numbers");
        }
        else
        for (Phone phone:ph){
            System.out.println(phone.toString());
        }
        System.out.println(name +" Lives at :\n"+add);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
}
