package com.nowcoder.async;

import java.util.List;

/**
 * Created by zsy on 2017/7/24.
 */
public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
