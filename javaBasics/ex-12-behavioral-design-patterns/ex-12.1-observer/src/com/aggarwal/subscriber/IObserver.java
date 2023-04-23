package com.aggarwal.subscriber;

import com.aggarwal.channel.IObservable;

public interface IObserver {

  void update();

  void subscribeChannel(IObservable ch);

}