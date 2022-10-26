/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

import com.oracle.bmc.http.client.RequestInterceptor;

public interface DelegationTokenClientFilterProvider {
    String ADD_DEPENDENCY_SUGGESTION =
            "add dependency on one of the oci-java-sdk-common-httpclient-* choices, e.g. oci-java-sdk-common-httpclient-jersey";

    RequestInterceptor newDelegationTokenClientFilter(String delegationToken);

    int getPriority();

    static DelegationTokenClientFilterProvider getDefault() {
        DelegationTokenClientFilterProvider provider = DefaultHolder.getDefault();
        if (provider == null) {
            throw new IllegalStateException(
                    "No DelegationTokenClientFilter provider found; " + ADD_DEPENDENCY_SUGGESTION);
        }
        return provider;
    }
}

class DefaultHolder {
    private static DelegationTokenClientFilterProvider DEFAULT = null;

    public static synchronized DelegationTokenClientFilterProvider getDefault() {
        if (DEFAULT == null) {
            DEFAULT = findProvider();
        }
        return DEFAULT;
    }

    private static DelegationTokenClientFilterProvider findProvider() {
        Iterator<DelegationTokenClientFilterProvider> itr =
                ServiceLoader.load(DelegationTokenClientFilterProvider.class).iterator();
        ServiceConfigurationError lastException = null;
        while (itr.hasNext()) {
            try {
                return itr.next();
            } catch (ServiceConfigurationError e) {
                lastException = e;
            }
        }
        if (lastException == null) {
            throw new NoSuchElementException(
                    "No DelegationTokenClientFilter provider available; "
                            + DelegationTokenClientFilterProvider.ADD_DEPENDENCY_SUGGESTION);
        } else {
            throw lastException;
        }
    }
}
