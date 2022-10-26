/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public interface HttpProvider {
    String ADD_DEPENDENCY_SUGGESTION =
            "add dependency on one of the oci-java-sdk-common-httpclient-* choices, e.g. oci-java-sdk-common-httpclient-jersey";

    HttpClientBuilder newBuilder();

    static HttpProvider getDefault() {
        HttpProvider httpProvider = DefaultHolder.getDefault();
        if (httpProvider == null) {
            throw new IllegalStateException("No HTTP provider found; " + ADD_DEPENDENCY_SUGGESTION);
        }
        return httpProvider;
    }
}

class DefaultHolder {
    private static HttpProvider DEFAULT = null;

    public static synchronized HttpProvider getDefault() {
        if (DEFAULT == null) {
            DEFAULT = findHttpProvider();
        }
        return DEFAULT;
    }

    private static HttpProvider findHttpProvider() {
        Iterator<HttpProvider> itr = ServiceLoader.load(HttpProvider.class).iterator();
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
                    "No http provider available; " + HttpProvider.ADD_DEPENDENCY_SUGGESTION);
        } else {
            throw lastException;
        }
    }
}
