package com.quiz4.Hashtables;

public class Main {
    public static void main(String[] args) {

        Player marky = new Player(24, "Marky", 169);
        Player daynona = new Player(9, "Daynona", 169);
        Player ayaya = new Player(20, "Ayaya", 169);
        Player jhongli = new Player(100, "Jhongli", 169);
        Player wazzah = new Player(530, "Wazzah", 169);
        Player lalamain = new Player(12, "lalamain", 59);
        Player katarina = new Player(69, "Katarina", 69);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(marky.getUserName(), marky);
        hashtable.put(daynona.getUserName(), daynona);
        hashtable.put(ayaya.getUserName(), ayaya);
        hashtable.put(jhongli.getUserName(), jhongli);
        hashtable.put(wazzah.getUserName(), wazzah);
        hashtable.put(lalamain.getUserName(), lalamain);
        hashtable.put(katarina.getUserName(), katarina);


        hashtable.printHashtable();

        //hashtable.remove("Jhongli");
        //System.out.println(hashtable.get("Wazzah"));
    }
}