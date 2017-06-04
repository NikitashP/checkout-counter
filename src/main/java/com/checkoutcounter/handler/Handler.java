package com.checkoutcounter.handler;

import java.util.List;

/**
 * Created by Nikitash Pawar on 6/4/2017.
 */
public interface Handler<O,I> {
    O handle(I input);

    O handle(int id);

    List<O> handle();
}
