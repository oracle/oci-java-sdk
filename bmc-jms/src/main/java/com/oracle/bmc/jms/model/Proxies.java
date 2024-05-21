/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * List of proxy properties to be configured in net.properties file.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Proxies.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Proxies extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "useSystemProxies",
        "httpProxyHost",
        "httpProxyPort",
        "httpsProxyHost",
        "httpsProxyPort",
        "ftpProxyHost",
        "ftpProxyPort",
        "socksProxyHost",
        "socksProxyPort"
    })
    public Proxies(
            Boolean useSystemProxies,
            String httpProxyHost,
            Integer httpProxyPort,
            String httpsProxyHost,
            Integer httpsProxyPort,
            String ftpProxyHost,
            Integer ftpProxyPort,
            String socksProxyHost,
            Integer socksProxyPort) {
        super();
        this.useSystemProxies = useSystemProxies;
        this.httpProxyHost = httpProxyHost;
        this.httpProxyPort = httpProxyPort;
        this.httpsProxyHost = httpsProxyHost;
        this.httpsProxyPort = httpsProxyPort;
        this.ftpProxyHost = ftpProxyHost;
        this.ftpProxyPort = ftpProxyPort;
        this.socksProxyHost = socksProxyHost;
        this.socksProxyPort = socksProxyPort;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Sets "java.net.useSystemProxies=true" in net.properties when they exist.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("useSystemProxies")
        private Boolean useSystemProxies;

        /**
         * Sets "java.net.useSystemProxies=true" in net.properties when they exist.
         *
         * @param useSystemProxies the value to set
         * @return this builder
         **/
        public Builder useSystemProxies(Boolean useSystemProxies) {
            this.useSystemProxies = useSystemProxies;
            this.__explicitlySet__.add("useSystemProxies");
            return this;
        }
        /**
         * Http host to be set in net.properties file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("httpProxyHost")
        private String httpProxyHost;

        /**
         * Http host to be set in net.properties file.
         *
         * @param httpProxyHost the value to set
         * @return this builder
         **/
        public Builder httpProxyHost(String httpProxyHost) {
            this.httpProxyHost = httpProxyHost;
            this.__explicitlySet__.add("httpProxyHost");
            return this;
        }
        /**
         * Http port number to be set in net.properties file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("httpProxyPort")
        private Integer httpProxyPort;

        /**
         * Http port number to be set in net.properties file.
         *
         * @param httpProxyPort the value to set
         * @return this builder
         **/
        public Builder httpProxyPort(Integer httpProxyPort) {
            this.httpProxyPort = httpProxyPort;
            this.__explicitlySet__.add("httpProxyPort");
            return this;
        }
        /**
         * Https host to be set in net.properties file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("httpsProxyHost")
        private String httpsProxyHost;

        /**
         * Https host to be set in net.properties file.
         *
         * @param httpsProxyHost the value to set
         * @return this builder
         **/
        public Builder httpsProxyHost(String httpsProxyHost) {
            this.httpsProxyHost = httpsProxyHost;
            this.__explicitlySet__.add("httpsProxyHost");
            return this;
        }
        /**
         * Https port number to be set in net.properties file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("httpsProxyPort")
        private Integer httpsProxyPort;

        /**
         * Https port number to be set in net.properties file.
         *
         * @param httpsProxyPort the value to set
         * @return this builder
         **/
        public Builder httpsProxyPort(Integer httpsProxyPort) {
            this.httpsProxyPort = httpsProxyPort;
            this.__explicitlySet__.add("httpsProxyPort");
            return this;
        }
        /**
         * Ftp host to be set in net.properties file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ftpProxyHost")
        private String ftpProxyHost;

        /**
         * Ftp host to be set in net.properties file.
         *
         * @param ftpProxyHost the value to set
         * @return this builder
         **/
        public Builder ftpProxyHost(String ftpProxyHost) {
            this.ftpProxyHost = ftpProxyHost;
            this.__explicitlySet__.add("ftpProxyHost");
            return this;
        }
        /**
         * Ftp port number to be set in net.properties file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ftpProxyPort")
        private Integer ftpProxyPort;

        /**
         * Ftp port number to be set in net.properties file.
         *
         * @param ftpProxyPort the value to set
         * @return this builder
         **/
        public Builder ftpProxyPort(Integer ftpProxyPort) {
            this.ftpProxyPort = ftpProxyPort;
            this.__explicitlySet__.add("ftpProxyPort");
            return this;
        }
        /**
         * Socks host to be set in net.properties file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("socksProxyHost")
        private String socksProxyHost;

        /**
         * Socks host to be set in net.properties file.
         *
         * @param socksProxyHost the value to set
         * @return this builder
         **/
        public Builder socksProxyHost(String socksProxyHost) {
            this.socksProxyHost = socksProxyHost;
            this.__explicitlySet__.add("socksProxyHost");
            return this;
        }
        /**
         * Socks port number to be set in net.properties file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("socksProxyPort")
        private Integer socksProxyPort;

        /**
         * Socks port number to be set in net.properties file.
         *
         * @param socksProxyPort the value to set
         * @return this builder
         **/
        public Builder socksProxyPort(Integer socksProxyPort) {
            this.socksProxyPort = socksProxyPort;
            this.__explicitlySet__.add("socksProxyPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Proxies build() {
            Proxies model =
                    new Proxies(
                            this.useSystemProxies,
                            this.httpProxyHost,
                            this.httpProxyPort,
                            this.httpsProxyHost,
                            this.httpsProxyPort,
                            this.ftpProxyHost,
                            this.ftpProxyPort,
                            this.socksProxyHost,
                            this.socksProxyPort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Proxies model) {
            if (model.wasPropertyExplicitlySet("useSystemProxies")) {
                this.useSystemProxies(model.getUseSystemProxies());
            }
            if (model.wasPropertyExplicitlySet("httpProxyHost")) {
                this.httpProxyHost(model.getHttpProxyHost());
            }
            if (model.wasPropertyExplicitlySet("httpProxyPort")) {
                this.httpProxyPort(model.getHttpProxyPort());
            }
            if (model.wasPropertyExplicitlySet("httpsProxyHost")) {
                this.httpsProxyHost(model.getHttpsProxyHost());
            }
            if (model.wasPropertyExplicitlySet("httpsProxyPort")) {
                this.httpsProxyPort(model.getHttpsProxyPort());
            }
            if (model.wasPropertyExplicitlySet("ftpProxyHost")) {
                this.ftpProxyHost(model.getFtpProxyHost());
            }
            if (model.wasPropertyExplicitlySet("ftpProxyPort")) {
                this.ftpProxyPort(model.getFtpProxyPort());
            }
            if (model.wasPropertyExplicitlySet("socksProxyHost")) {
                this.socksProxyHost(model.getSocksProxyHost());
            }
            if (model.wasPropertyExplicitlySet("socksProxyPort")) {
                this.socksProxyPort(model.getSocksProxyPort());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Sets "java.net.useSystemProxies=true" in net.properties when they exist.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("useSystemProxies")
    private final Boolean useSystemProxies;

    /**
     * Sets "java.net.useSystemProxies=true" in net.properties when they exist.
     *
     * @return the value
     **/
    public Boolean getUseSystemProxies() {
        return useSystemProxies;
    }

    /**
     * Http host to be set in net.properties file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpProxyHost")
    private final String httpProxyHost;

    /**
     * Http host to be set in net.properties file.
     *
     * @return the value
     **/
    public String getHttpProxyHost() {
        return httpProxyHost;
    }

    /**
     * Http port number to be set in net.properties file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpProxyPort")
    private final Integer httpProxyPort;

    /**
     * Http port number to be set in net.properties file.
     *
     * @return the value
     **/
    public Integer getHttpProxyPort() {
        return httpProxyPort;
    }

    /**
     * Https host to be set in net.properties file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpsProxyHost")
    private final String httpsProxyHost;

    /**
     * Https host to be set in net.properties file.
     *
     * @return the value
     **/
    public String getHttpsProxyHost() {
        return httpsProxyHost;
    }

    /**
     * Https port number to be set in net.properties file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpsProxyPort")
    private final Integer httpsProxyPort;

    /**
     * Https port number to be set in net.properties file.
     *
     * @return the value
     **/
    public Integer getHttpsProxyPort() {
        return httpsProxyPort;
    }

    /**
     * Ftp host to be set in net.properties file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ftpProxyHost")
    private final String ftpProxyHost;

    /**
     * Ftp host to be set in net.properties file.
     *
     * @return the value
     **/
    public String getFtpProxyHost() {
        return ftpProxyHost;
    }

    /**
     * Ftp port number to be set in net.properties file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ftpProxyPort")
    private final Integer ftpProxyPort;

    /**
     * Ftp port number to be set in net.properties file.
     *
     * @return the value
     **/
    public Integer getFtpProxyPort() {
        return ftpProxyPort;
    }

    /**
     * Socks host to be set in net.properties file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("socksProxyHost")
    private final String socksProxyHost;

    /**
     * Socks host to be set in net.properties file.
     *
     * @return the value
     **/
    public String getSocksProxyHost() {
        return socksProxyHost;
    }

    /**
     * Socks port number to be set in net.properties file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("socksProxyPort")
    private final Integer socksProxyPort;

    /**
     * Socks port number to be set in net.properties file.
     *
     * @return the value
     **/
    public Integer getSocksProxyPort() {
        return socksProxyPort;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Proxies(");
        sb.append("super=").append(super.toString());
        sb.append("useSystemProxies=").append(String.valueOf(this.useSystemProxies));
        sb.append(", httpProxyHost=").append(String.valueOf(this.httpProxyHost));
        sb.append(", httpProxyPort=").append(String.valueOf(this.httpProxyPort));
        sb.append(", httpsProxyHost=").append(String.valueOf(this.httpsProxyHost));
        sb.append(", httpsProxyPort=").append(String.valueOf(this.httpsProxyPort));
        sb.append(", ftpProxyHost=").append(String.valueOf(this.ftpProxyHost));
        sb.append(", ftpProxyPort=").append(String.valueOf(this.ftpProxyPort));
        sb.append(", socksProxyHost=").append(String.valueOf(this.socksProxyHost));
        sb.append(", socksProxyPort=").append(String.valueOf(this.socksProxyPort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Proxies)) {
            return false;
        }

        Proxies other = (Proxies) o;
        return java.util.Objects.equals(this.useSystemProxies, other.useSystemProxies)
                && java.util.Objects.equals(this.httpProxyHost, other.httpProxyHost)
                && java.util.Objects.equals(this.httpProxyPort, other.httpProxyPort)
                && java.util.Objects.equals(this.httpsProxyHost, other.httpsProxyHost)
                && java.util.Objects.equals(this.httpsProxyPort, other.httpsProxyPort)
                && java.util.Objects.equals(this.ftpProxyHost, other.ftpProxyHost)
                && java.util.Objects.equals(this.ftpProxyPort, other.ftpProxyPort)
                && java.util.Objects.equals(this.socksProxyHost, other.socksProxyHost)
                && java.util.Objects.equals(this.socksProxyPort, other.socksProxyPort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.useSystemProxies == null ? 43 : this.useSystemProxies.hashCode());
        result =
                (result * PRIME)
                        + (this.httpProxyHost == null ? 43 : this.httpProxyHost.hashCode());
        result =
                (result * PRIME)
                        + (this.httpProxyPort == null ? 43 : this.httpProxyPort.hashCode());
        result =
                (result * PRIME)
                        + (this.httpsProxyHost == null ? 43 : this.httpsProxyHost.hashCode());
        result =
                (result * PRIME)
                        + (this.httpsProxyPort == null ? 43 : this.httpsProxyPort.hashCode());
        result = (result * PRIME) + (this.ftpProxyHost == null ? 43 : this.ftpProxyHost.hashCode());
        result = (result * PRIME) + (this.ftpProxyPort == null ? 43 : this.ftpProxyPort.hashCode());
        result =
                (result * PRIME)
                        + (this.socksProxyHost == null ? 43 : this.socksProxyHost.hashCode());
        result =
                (result * PRIME)
                        + (this.socksProxyPort == null ? 43 : this.socksProxyPort.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
