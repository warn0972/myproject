package com.train;

public class Ticket {
    int number;
    int roundtrip;

    public Ticket(int number, int roundtrip) {
        this.number = number;
        this.roundtrip = roundtrip;
    }
    public void print(){
//        double total = (((number-roundtrip)*1000)+(roundtrip*2000*0.9));
        System.out.println( "Total tickets: "+ number + "\n" + "Round-trip: " + roundtrip +
                "\n" + "Total Money:" + (((number-roundtrip)*1000)+(roundtrip*2000*0.9)));
    }
}