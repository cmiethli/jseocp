package de.wbstraining.masterdata.persistence.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.google.common.base.Preconditions;

import de.wbstraining.common.persistence.event.BeforeSetupEvent;
import de.wbstraining.masterdata.web.controller.AuthenticationController;
import de.wbstraining.masterdata.web.controller.PrivilegeController;
import de.wbstraining.masterdata.web.controller.RoleController;
import de.wbstraining.masterdata.web.controller.UserController;

@Component
@Profile("dev")
public final class SpringVerificationsBeforeSetupListener implements ApplicationListener<BeforeSetupEvent> {
    // private final Logger logger = LoggerFactory.getLogger(SpringVerificationsBeforeSetupListener.class);

    @Autowired
    ApplicationContext context;

    public SpringVerificationsBeforeSetupListener() {
        super();
    }

    // API

    @Override
    public final void onApplicationEvent(final BeforeSetupEvent event) {
        Preconditions.checkNotNull(context.getBean(PrivilegeController.class));
        Preconditions.checkNotNull(context.getBean(RoleController.class));
        Preconditions.checkNotNull(context.getBean(UserController.class));
        Preconditions.checkNotNull(context.getBean(AuthenticationController.class));
    }

}
