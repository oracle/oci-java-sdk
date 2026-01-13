/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import java.net.Proxy;
import java.util.Objects;

public final class ProxyConfiguration {
    private final Proxy proxy;
    private final String username;
    private final char[] password;

    public ProxyConfiguration(Proxy proxy, String username, char[] password) {
        this.proxy = Objects.requireNonNull(proxy, "proxy");
        if (proxy.type() == Proxy.Type.DIRECT) {
            throw new IllegalArgumentException("'DIRECT' proxy is not supported");
        }
        this.username = username;
        this.password = password;
    }

    public ProxyConfiguration(Proxy proxy) {
        this(proxy, null, null);
    }

    public Proxy getProxy() {
        return proxy;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Proxy proxy = null;
        private String username = null;
        private char[] password = null;

        private Builder() {}

        public ProxyConfiguration build() {
            return new ProxyConfiguration(proxy, username, password);
        }

        public ProxyConfiguration build(Proxy proxy) {
            this.proxy(proxy);
            return build();
        }

        public Builder proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(char[] password) {
            this.password = password;
            return this;
        }
    }
}
