/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onetomany;

import java.util.Set;

/**
 *
 * @author Govind
 */
public class Customer {
   int cid;
   String name;
   Set v;

    public Set getV() {
        return v;
    }
    public void setV(Set v) {
        this.v = v;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getFidofcust() {
//        return fidofcust;
//    }
//
//    public void setFidofcust(int fidofcust) {
//        this.fidofcust = fidofcust;
//    }
//    
}
