package com.aggarwal.channel;

import com.aggarwal.subscriber.Subscriber;

public interface IObservable {

  void subscribe(Subscriber sub);

  void unSubscribe();

  void notifySubscriber();

  void upload(String title);

}