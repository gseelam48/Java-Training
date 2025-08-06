package com.practice.day23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // Map is also an interface like list and set interface
        //it holds the data in the form of key and value pair
        //Each key is unique
        //but values can be the duplicates
        //ordered collectom
        // hashmap.Linkedhashmap,treemp,and the implemented class
        //weakhashmap,and identyhashmap
        // we have add method in list and set to add data to list
        // in map we have put metheod to add data
        Map<Integer, String> map = new TreeMap<>();
        // tree map does not allow null as a key
        // hashmap allowes one null as a key
        map.put(233, "gopi");
        // map.put(null,"r");
        //  System.out.println(map.size());
        map.put(33, "gopal");
        //System.out.println(map.size());
        map.put(44, "raju");
        //System.out.println();
        // for each
        // (datatype eliment : collectionorarray){
        // code to be exicuted for each eliment
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "--" + m.getValue());
        }
    }
}
// SQL structured query language
// these are the commands we use to connect with the database
// DDL DML DCL TCL DQL commands
//DDL - data definition language // Create, Drop, Alter, Truncate
//DML - data manupulation languagae // insert, update, delete, call, explain call. lock
//DCL - data control languagae// grant, revoke
//TCL - transactional cantrol language // commit, savepoint.rollback
//DQL - data query language// select