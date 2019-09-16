package de.wbstraining.masterdata.web.event;

import org.springframework.stereotype.Component;

import de.wbstraining.common.web.listeners.ResourceCreatedDiscoverabilityListener;

@Component
class SecResourceCreatedDiscoverabilityListener extends ResourceCreatedDiscoverabilityListener {

    public SecResourceCreatedDiscoverabilityListener() {
        super();
    }

    //

    @Override
    protected final String getBase() {
        return "/";
    }

}
