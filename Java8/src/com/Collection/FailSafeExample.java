package com.Collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample
{
    public static void main(String[] args)
    {
        Map<String,String> premiumPhone = new ConcurrentHashMap<>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        Iterator iterator = premiumPhone.keySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }
        
        
        List<String> l1 = new CopyOnWriteArrayList();
        l1.addAll(premiumPhone.keySet());
        ListIterator li = l1.listIterator(0);
        while(li.hasNext()) {
        	System.out.println(li.next());
        	l1.add("sagar");
        }

        
        Set<String> s1 = new ConcurrentSkipListSet<>();
        s1.addAll(l1);
        Iterator li1 = s1.iterator();
        while(li1.hasNext()) {
        	System.out.println(li1.next());
        	s1.add("pawar");
        }

    }
    
}