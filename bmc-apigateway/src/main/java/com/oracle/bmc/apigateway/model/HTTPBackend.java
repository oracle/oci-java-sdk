/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Send the request to an HTTP backend.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HTTPBackend.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HTTPBackend extends ApiSpecificationRouteBackend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInSeconds")
        private Float connectTimeoutInSeconds;

        public Builder connectTimeoutInSeconds(Float connectTimeoutInSeconds) {
            this.connectTimeoutInSeconds = connectTimeoutInSeconds;
            this.__explicitlySet__.add("connectTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInSeconds")
        private Float readTimeoutInSeconds;

        public Builder readTimeoutInSeconds(Float readTimeoutInSeconds) {
            this.readTimeoutInSeconds = readTimeoutInSeconds;
            this.__explicitlySet__.add("readTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInSeconds")
        private Float sendTimeoutInSeconds;

        public Builder sendTimeoutInSeconds(Float sendTimeoutInSeconds) {
            this.sendTimeoutInSeconds = sendTimeoutInSeconds;
            this.__explicitlySet__.add("sendTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
        private Boolean isSslVerifyDisabled;

        public Builder isSslVerifyDisabled(Boolean isSslVerifyDisabled) {
            this.isSslVerifyDisabled = isSslVerifyDisabled;
            this.__explicitlySet__.add("isSslVerifyDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HTTPBackend build() {
            HTTPBackend __instance__ =
                    new HTTPBackend(
                            url,
                            connectTimeoutInSeconds,
                            readTimeoutInSeconds,
                            sendTimeoutInSeconds,
                            isSslVerifyDisabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HTTPBackend o) {
            Builder copiedBuilder =
                    url(o.getUrl())
                            .connectTimeoutInSeconds(o.getConnectTimeoutInSeconds())
                            .readTimeoutInSeconds(o.getReadTimeoutInSeconds())
                            .sendTimeoutInSeconds(o.getSendTimeoutInSeconds())
                            .isSslVerifyDisabled(o.getIsSslVerifyDisabled());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @Deprecated
    public HTTPBackend(
            String url,
            Float connectTimeoutInSeconds,
            Float readTimeoutInSeconds,
            Float sendTimeoutInSeconds,
            Boolean isSslVerifyDisabled) {
        super();
        this.url = url;
        this.connectTimeoutInSeconds = connectTimeoutInSeconds;
        this.readTimeoutInSeconds = readTimeoutInSeconds;
        this.sendTimeoutInSeconds = sendTimeoutInSeconds;
        this.isSslVerifyDisabled = isSslVerifyDisabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    public String getUrl() {
        return url;
    }

    /**
     * Defines a timeout for establishing a connection with a proxied server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInSeconds")
    private final Float connectTimeoutInSeconds;

    public Float getConnectTimeoutInSeconds() {
        return connectTimeoutInSeconds;
    }

    /**
     * Defines a timeout for reading a response from the proxied server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInSeconds")
    private final Float readTimeoutInSeconds;

    public Float getReadTimeoutInSeconds() {
        return readTimeoutInSeconds;
    }

    /**
     * Defines a timeout for transmitting a request to the proxied server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInSeconds")
    private final Float sendTimeoutInSeconds;

    public Float getSendTimeoutInSeconds() {
        return sendTimeoutInSeconds;
    }

    /**
     * Defines whether or not to uphold SSL verification.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
    private final Boolean isSslVerifyDisabled;

    public Boolean getIsSslVerifyDisabled() {
        return isSslVerifyDisabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HTTPBackend(");
        sb.append("super=").append(super.toString());
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", connectTimeoutInSeconds=")
                .append(String.valueOf(this.connectTimeoutInSeconds));
        sb.append(", readTimeoutInSeconds=").append(String.valueOf(this.readTimeoutInSeconds));
        sb.append(", sendTimeoutInSeconds=").append(String.valueOf(this.sendTimeoutInSeconds));
        sb.append(", isSslVerifyDisabled=").append(String.valueOf(this.isSslVerifyDisabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HTTPBackend)) {
            return false;
        }

        HTTPBackend other = (HTTPBackend) o;
        return java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(
                        this.connectTimeoutInSeconds, other.connectTimeoutInSeconds)
                && java.util.Objects.equals(this.readTimeoutInSeconds, other.readTimeoutInSeconds)
                && java.util.Objects.equals(this.sendTimeoutInSeconds, other.sendTimeoutInSeconds)
                && java.util.Objects.equals(this.isSslVerifyDisabled, other.isSslVerifyDisabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result =
                (result * PRIME)
                        + (this.connectTimeoutInSeconds == null
                                ? 43
                                : this.connectTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.readTimeoutInSeconds == null
                                ? 43
                                : this.readTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.sendTimeoutInSeconds == null
                                ? 43
                                : this.sendTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.isSslVerifyDisabled == null
                                ? 43
                                : this.isSslVerifyDisabled.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
