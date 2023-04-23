package com.aggarwal.subscriber;

import com.aggarwal.channel.IObservable;

public class Subscriber implements IObserver {

  private String name;
  private IObservable channel;

  public Subscriber(String name) {
    this.name = name;
  }

  @Override
  public void update() {
    System.out.println(name + " Video Uploaded");
  }

  @Override
  public void subscribeChannel(IObservable ch) {
    channel = ch;
  }

}
