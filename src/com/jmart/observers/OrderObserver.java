package com.jmart.observers;

import com.jmart.entities.Order;

public interface OrderObserver {

    void update(Order order);

}
