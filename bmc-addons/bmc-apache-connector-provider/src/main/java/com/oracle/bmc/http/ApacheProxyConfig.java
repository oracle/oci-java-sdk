/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/** Defines the proxy configuration for clients. */
@Builder
@Data
public class ApacheProxyConfig {
    private final String uri;
    private final String username;
    private final String password;

    /**
     * Determines if the configuration is valid for configuring a proxy.
     *
     * @return {@code true} if the configuration is valid; otherwise, {@code false}
     */
    public boolean isConfiguredAndValid() {
        final boolean isCredentialsValid =
                (username != null && password != null) || (username == null && password == null);
        return StringUtils.isNotBlank(uri) && isCredentialsValid;
    }

    @Override
    public String toString() {
        final String providedValue = "<Provided>";
        final String username = this.username != null ? providedValue : null;
        final String password = this.password != null ? providedValue : null;
        return String.format("[uri: %s, username: %s, password: %s]", uri, username, password);
    }
}
