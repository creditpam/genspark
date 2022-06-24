package org.exampl;

import java.util.List;

public class student implements Person
{

    private int id;
    private String name;
    private List<Phone> ph;
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
