package de.wbstraining.common.util.order;

import com.google.common.collect.Ordering;

import de.wbstraining.common.interfaces.IWithLongId;

public final class OrderById<T extends IWithLongId> extends Ordering<T> {

    public OrderById() {
        super();
    }

    // API

    @Override
    public final int compare(final T left, final T right) {
        return left.getId().compareTo(right.getId());
    }

}
