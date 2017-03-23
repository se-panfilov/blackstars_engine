package com.blackwings.store.reducer;

import com.blackwings.store.action.type.IncrementAction;

public class IncrementReducer implements redux.api.Reducer<Integer> {

    @Override
    public Integer reduce(Integer state, Object action) {
        return action instanceof IncrementAction ? reduce(state, (IncrementAction) action) : state;
    }

    private Integer reduce(Integer state, IncrementAction IncrementAction) {
        switch (IncrementAction) {
            case INCREMENT:
                return state + 1;
            case DECREMENT:
                return state - 1;
            default:
                return state;
        }
    }
}