package com.aggarwal.channel;

import java.util.ArrayList;
import java.util.List;

import com.aggarwal.subscriber.IObserver;
import com.aggarwal.subscriber.Subscriber;

public class Channel implements IObservable {

  private String title;
  List<Subscriber> subs = new ArrayList<>();

  // public Channel(String title) {
  // this.title = title;
  // }

  @Override
  public void subscribe(Subscriber sub) {
    subs.add(sub);
  }

  @Override
  public void unSubscribe() {
    subs.remove(subs);
  }

  @Override
  public void notifySubscriber() {
    for (IObserver s : subs) {
      s.update();
    }
  }

  @Override
  public void upload(String title) {
    this.title = title;
    notifySubscriber();
  }

}
