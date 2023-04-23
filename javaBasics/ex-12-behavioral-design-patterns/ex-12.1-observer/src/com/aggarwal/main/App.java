package com.aggarwal.main;

import javax.security.auth.Subject;

import com.aggarwal.channel.Channel;
import com.aggarwal.channel.IObservable;
import com.aggarwal.subscriber.IObserver;
import com.aggarwal.subscriber.Subscriber;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! \n ");

        IObservable abc = new Channel();
        Subscriber s1 = new Subscriber("Rishabh");
        Subscriber s2 = new Subscriber("Rishi");
        Subscriber s3 = new Subscriber("rishu");
        Subscriber s4 = new Subscriber("aggaral");
        IObserver s5 = new Subscriber("aggarwal");

        abc.subscribe(s1);
        abc.subscribe(s2);
        abc.subscribe(s3);
        abc.subscribe(s4);

        s1.subscribeChannel(abc);
        s2.subscribeChannel(abc);
        s3.subscribeChannel(abc);
        s4.subscribeChannel(abc);
        s5.subscribeChannel(abc);

        abc.upload("Observer Design Pattern!");
    }

}

