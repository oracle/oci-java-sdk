/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

/**
 * This class is deprecated and just left here to document the proper way to configure the Apache
 * Connector now.
 *
 * <p>Use {@link com.oracle.bmc.http.client.ProxyConfiguration} instead.
 *
 * @deprecated use {@link com.oracle.bmc.http.client.ProxyConfiguration} instead
 */
@Deprecated
public class ApacheProxyConfigDecorator {
    private ApacheProxyConfigDecorator() {
        // prevent instantiation

    }
}
