/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.internal;

import com.oracle.bmc.http.ClientConfigurator;
import org.slf4j.Logger;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/** Configurator allowing internal SDK users to enable downstream propagation of opc-request-id. */
public interface SpiClientConfigurator extends ClientConfigurator {

    static List<SpiClientConfigurator> getSpiClientConfigurators() {
        return DefaultConfiguratorHolder.getDefault();
    }
}

class DefaultConfiguratorHolder {

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SpiClientConfigurator.class);

    private static List<SpiClientConfigurator> DEFAULT;

    public static synchronized List<SpiClientConfigurator> getDefault() {
        if (DEFAULT == null) {
            DEFAULT = findConfigurator();
        }
        return DEFAULT;
    }

    private static List<SpiClientConfigurator> findConfigurator() {
        Iterator<SpiClientConfigurator> itr =
                ServiceLoader.load(SpiClientConfigurator.class).iterator();
        List<SpiClientConfigurator> configurators = new ArrayList<>();
        ServiceConfigurationError lastException = null;
        while (itr.hasNext()) {
            try {
                configurators.add(itr.next());
            } catch (ServiceConfigurationError e) {
                if (lastException != null) {
                    LOG.error("Additional caught exception", lastException);
                }
                lastException = e;
            }
        }
        if (lastException != null) {
            throw lastException;
        }
        return configurators;
    }
}
