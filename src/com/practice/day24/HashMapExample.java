package com.practice.day24;

import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
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
// Hashmap is an implimentation  class of map interface
// data is stored in the form of Key and Value pair
//Hashmap works on hashing tecnology
// hashing means it takes object as input and gives fixed size output using hash function
//return type is integer
// hashcode are used to efficient lookup and storage opperations in hashmap
// when we call map.put or set.add method, put method executes
// bucket
// load factor is threshold ad of load factor hashmap is 0.75
// initial capacity of hashmap is 16
//0.75 of hash map capacity is 12
// when we add 12 th eliment to hashmap the capacity wii bw doubled means it will become 32
//it will find the hashcode of key means for 44 "key" hashcode();
// find the bucket index using hashcode hashcode and (length-1)
// hashcollesion