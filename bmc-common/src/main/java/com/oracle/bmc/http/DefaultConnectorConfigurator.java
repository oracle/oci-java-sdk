/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.http.client.HttpClientBuilder;
import org.slf4j.Logger;

/**
 * DefaultConnectorConfigurator represents the basic behavior of the transport layer.
 *
 * <p>It does not perform any special customization.
 *
 * <p>If the DefaultConnectorConfigurator results in any issues, callers can provide their own
 * implementation when constructing service objects.
 */
public class DefaultConnectorConfigurator implements ClientConfigurator {
    /** Creates a new {@code DefaultConnectorConfigurator} object. */
    public DefaultConnectorConfigurator() {}

    @Override
    public void customizeClient(HttpClientBuilder builder) {}
}
