/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The health check policy configuration.
 * For more information, see [Editing Health Check Policies](https://docs.cloud.oracle.com/Content/Balance/Tasks/editinghealthcheck.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HealthChecker.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HealthChecker extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "protocol",
        "urlPath",
        "port",
        "returnCode",
        "retries",
        "timeoutInMillis",
        "intervalInMillis",
        "responseBodyRegex"
    })
    public HealthChecker(
            String protocol,
            String urlPath,
            Integer port,
            Integer returnCode,
            Integer retries,
            Integer timeoutInMillis,
            Integer intervalInMillis,
            String responseBodyRegex) {
        super();
        this.protocol = protocol;
        this.urlPath = urlPath;
        this.port = port;
        this.returnCode = returnCode;
        this.retries = retries;
        this.timeoutInMillis = timeoutInMillis;
        this.intervalInMillis = intervalInMillis;
        this.responseBodyRegex = responseBodyRegex;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The protocol the health check must use; either HTTP or TCP.
         * <p>
         * Example: {@code HTTP}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        /**
         * The protocol the health check must use; either HTTP or TCP.
         * <p>
         * Example: {@code HTTP}
         *
         * @param protocol the value to set
         * @return this builder
         **/
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /**
         * The path against which to run the health check.
         * <p>
         * Example: {@code /healthcheck}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
        private String urlPath;

        /**
         * The path against which to run the health check.
         * <p>
         * Example: {@code /healthcheck}
         *
         * @param urlPath the value to set
         * @return this builder
         **/
        public Builder urlPath(String urlPath) {
            this.urlPath = urlPath;
            this.__explicitlySet__.add("urlPath");
            return this;
        }
        /**
         * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
         * port information from the {@code Backend} object.
         * <p>
         * Example: {@code 8080}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
         * port information from the {@code Backend} object.
         * <p>
         * Example: {@code 8080}
         *
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The status code a healthy backend server should return. If you configure the health check policy to use the HTTP protocol,
         * you can use common HTTP status codes such as "200".
         * <p>
         * Example: {@code 200}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
        private Integer returnCode;

        /**
         * The status code a healthy backend server should return. If you configure the health check policy to use the HTTP protocol,
         * you can use common HTTP status codes such as "200".
         * <p>
         * Example: {@code 200}
         *
         * @param returnCode the value to set
         * @return this builder
         **/
        public Builder returnCode(Integer returnCode) {
            this.returnCode = returnCode;
            this.__explicitlySet__.add("returnCode");
            return this;
        }
        /**
         * The number of retries to attempt before a backend server is considered "unhealthy". This number also applies
         * when recovering a server to the "healthy" state. Defaults to 3.
         * <p>
         * Example: {@code 3}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("retries")
        private Integer retries;

        /**
         * The number of retries to attempt before a backend server is considered "unhealthy". This number also applies
         * when recovering a server to the "healthy" state. Defaults to 3.
         * <p>
         * Example: {@code 3}
         *
         * @param retries the value to set
         * @return this builder
         **/
        public Builder retries(Integer retries) {
            this.retries = retries;
            this.__explicitlySet__.add("retries");
            return this;
        }
        /**
         * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
         * returns within this timeout period. Defaults to 3000 (3 seconds).
         * <p>
         * Example: {@code 3000}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
        private Integer timeoutInMillis;

        /**
         * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
         * returns within this timeout period. Defaults to 3000 (3 seconds).
         * <p>
         * Example: {@code 3000}
         *
         * @param timeoutInMillis the value to set
         * @return this builder
         **/
        public Builder timeoutInMillis(Integer timeoutInMillis) {
            this.timeoutInMillis = timeoutInMillis;
            this.__explicitlySet__.add("timeoutInMillis");
            return this;
        }
        /**
         * The interval between health checks, in milliseconds. The default is 10000 (10 seconds).
         * <p>
         * Example: {@code 10000}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
        private Integer intervalInMillis;

        /**
         * The interval between health checks, in milliseconds. The default is 10000 (10 seconds).
         * <p>
         * Example: {@code 10000}
         *
         * @param intervalInMillis the value to set
         * @return this builder
         **/
        public Builder intervalInMillis(Integer intervalInMillis) {
            this.intervalInMillis = intervalInMillis;
            this.__explicitlySet__.add("intervalInMillis");
            return this;
        }
        /**
         * A regular expression for parsing the response body from the backend server.
         * <p>
         * Example: {@code ^((?!false).|\\s)*$}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
        private String responseBodyRegex;

        /**
         * A regular expression for parsing the response body from the backend server.
         * <p>
         * Example: {@code ^((?!false).|\\s)*$}
         *
         * @param responseBodyRegex the value to set
         * @return this builder
         **/
        public Builder responseBodyRegex(String responseBodyRegex) {
            this.responseBodyRegex = responseBodyRegex;
            this.__explicitlySet__.add("responseBodyRegex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthChecker build() {
            HealthChecker model =
                    new HealthChecker(
                            this.protocol,
                            this.urlPath,
                            this.port,
                            this.returnCode,
                            this.retries,
                            this.timeoutInMillis,
                            this.intervalInMillis,
                            this.responseBodyRegex);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthChecker model) {
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("urlPath")) {
                this.urlPath(model.getUrlPath());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("returnCode")) {
                this.returnCode(model.getReturnCode());
            }
            if (model.wasPropertyExplicitlySet("retries")) {
                this.retries(model.getRetries());
            }
            if (model.wasPropertyExplicitlySet("timeoutInMillis")) {
                this.timeoutInMillis(model.getTimeoutInMillis());
            }
            if (model.wasPropertyExplicitlySet("intervalInMillis")) {
                this.intervalInMillis(model.getIntervalInMillis());
            }
            if (model.wasPropertyExplicitlySet("responseBodyRegex")) {
                this.responseBodyRegex(model.getResponseBodyRegex());
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
     * The protocol the health check must use; either HTTP or TCP.
     * <p>
     * Example: {@code HTTP}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    /**
     * The protocol the health check must use; either HTTP or TCP.
     * <p>
     * Example: {@code HTTP}
     *
     * @return the value
     **/
    public String getProtocol() {
        return protocol;
    }

    /**
     * The path against which to run the health check.
     * <p>
     * Example: {@code /healthcheck}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
    private final String urlPath;

    /**
     * The path against which to run the health check.
     * <p>
     * Example: {@code /healthcheck}
     *
     * @return the value
     **/
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
     * port information from the {@code Backend} object.
     * <p>
     * Example: {@code 8080}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
     * port information from the {@code Backend} object.
     * <p>
     * Example: {@code 8080}
     *
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * The status code a healthy backend server should return. If you configure the health check policy to use the HTTP protocol,
     * you can use common HTTP status codes such as "200".
     * <p>
     * Example: {@code 200}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
    private final Integer returnCode;

    /**
     * The status code a healthy backend server should return. If you configure the health check policy to use the HTTP protocol,
     * you can use common HTTP status codes such as "200".
     * <p>
     * Example: {@code 200}
     *
     * @return the value
     **/
    public Integer getReturnCode() {
        return returnCode;
    }

    /**
     * The number of retries to attempt before a backend server is considered "unhealthy". This number also applies
     * when recovering a server to the "healthy" state. Defaults to 3.
     * <p>
     * Example: {@code 3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retries")
    private final Integer retries;

    /**
     * The number of retries to attempt before a backend server is considered "unhealthy". This number also applies
     * when recovering a server to the "healthy" state. Defaults to 3.
     * <p>
     * Example: {@code 3}
     *
     * @return the value
     **/
    public Integer getRetries() {
        return retries;
    }

    /**
     * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
     * returns within this timeout period. Defaults to 3000 (3 seconds).
     * <p>
     * Example: {@code 3000}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
    private final Integer timeoutInMillis;

    /**
     * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
     * returns within this timeout period. Defaults to 3000 (3 seconds).
     * <p>
     * Example: {@code 3000}
     *
     * @return the value
     **/
    public Integer getTimeoutInMillis() {
        return timeoutInMillis;
    }

    /**
     * The interval between health checks, in milliseconds. The default is 10000 (10 seconds).
     * <p>
     * Example: {@code 10000}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
    private final Integer intervalInMillis;

    /**
     * The interval between health checks, in milliseconds. The default is 10000 (10 seconds).
     * <p>
     * Example: {@code 10000}
     *
     * @return the value
     **/
    public Integer getIntervalInMillis() {
        return intervalInMillis;
    }

    /**
     * A regular expression for parsing the response body from the backend server.
     * <p>
     * Example: {@code ^((?!false).|\\s)*$}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
    private final String responseBodyRegex;

    /**
     * A regular expression for parsing the response body from the backend server.
     * <p>
     * Example: {@code ^((?!false).|\\s)*$}
     *
     * @return the value
     **/
    public String getResponseBodyRegex() {
        return responseBodyRegex;
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
        sb.append("HealthChecker(");
        sb.append("super=").append(super.toString());
        sb.append("protocol=").append(String.valueOf(this.protocol));
        sb.append(", urlPath=").append(String.valueOf(this.urlPath));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", returnCode=").append(String.valueOf(this.returnCode));
        sb.append(", retries=").append(String.valueOf(this.retries));
        sb.append(", timeoutInMillis=").append(String.valueOf(this.timeoutInMillis));
        sb.append(", intervalInMillis=").append(String.valueOf(this.intervalInMillis));
        sb.append(", responseBodyRegex=").append(String.valueOf(this.responseBodyRegex));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthChecker)) {
            return false;
        }

        HealthChecker other = (HealthChecker) o;
        return java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.urlPath, other.urlPath)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.returnCode, other.returnCode)
                && java.util.Objects.equals(this.retries, other.retries)
                && java.util.Objects.equals(this.timeoutInMillis, other.timeoutInMillis)
                && java.util.Objects.equals(this.intervalInMillis, other.intervalInMillis)
                && java.util.Objects.equals(this.responseBodyRegex, other.responseBodyRegex)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.urlPath == null ? 43 : this.urlPath.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.returnCode == null ? 43 : this.returnCode.hashCode());
        result = (result * PRIME) + (this.retries == null ? 43 : this.retries.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInMillis == null ? 43 : this.timeoutInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalInMillis == null ? 43 : this.intervalInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.responseBodyRegex == null ? 43 : this.responseBodyRegex.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
