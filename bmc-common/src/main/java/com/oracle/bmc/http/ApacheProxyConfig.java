/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.util.internal.StringUtils;

/** Defines the proxy configuration for clients. */
public class ApacheProxyConfig {
    private final String uri;
    private final String username;
    private final String password;

    @java.beans.ConstructorProperties({"uri", "username", "password"})
    ApacheProxyConfig(String uri, String username, String password) {
        this.uri = uri;
        this.username = username;
        this.password = password;
    }

    public static ApacheProxyConfigBuilder builder() {
        return new ApacheProxyConfigBuilder();
    }

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

    public String getUri() {
        return this.uri;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ApacheProxyConfig)) return false;
        final ApacheProxyConfig other = (ApacheProxyConfig) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$uri = this.getUri();
        final Object other$uri = other.getUri();
        if (this$uri == null ? other$uri != null : !this$uri.equals(other$uri)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username))
            return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ApacheProxyConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uri = this.getUri();
        result = result * PRIME + ($uri == null ? 43 : $uri.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        return result;
    }

    public static class ApacheProxyConfigBuilder {
        private String uri;
        private String username;
        private String password;

        ApacheProxyConfigBuilder() {}

        public ApacheProxyConfigBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public ApacheProxyConfigBuilder username(String username) {
            this.username = username;
            return this;
        }

        public ApacheProxyConfigBuilder password(String password) {
            this.password = password;
            return this;
        }

        public ApacheProxyConfig build() {
            return new ApacheProxyConfig(uri, username, password);
        }

        public String toString() {
            return "ApacheProxyConfig.ApacheProxyConfigBuilder(uri="
                    + this.uri
                    + ", username="
                    + this.username
                    + ", password="
                    + this.password
                    + ")";
        }
    }
}
