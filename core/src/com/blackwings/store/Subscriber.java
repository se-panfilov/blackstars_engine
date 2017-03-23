package com.blackwings.store;

import java.io.PrintStream;

class Subscriber implements redux.api.Store.Subscriber {
    private final redux.api.Store<Integer> store;
    private final PrintStream stream;

    Subscriber(redux.api.Store<Integer> store, PrintStream stream) {
        this.store = store;
        this.stream = stream;
    }

    @Override
    public void onStateChanged() {
        stream.println(store.getState());
    }
}