package com.quiz2.Lists;


public class Main {

    public static void main (String [] args) {


        Player Ayaya = new Player(1, "Kamisato Ayaya", 90);
        Player Lolo = new Player(2, "Jhongli" , 69);
        Player Flat = new Player(3, "Tao ho", 80);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(Ayaya);
        playerLinkedList.addToFront(Flat);
        playerLinkedList.addToFront(Lolo);

        System.out.print("The result is ");
        playerLinkedList.contains(4, "mark", 24);
        System.out.print("The Total Index is  ");
        playerLinkedList.indexOF(1,"Kamisato Ayaya", 90);


        playerLinkedList.printList();
        System.out.print("The Current size of the list is "); playerLinkedList.getSize();





    }


}