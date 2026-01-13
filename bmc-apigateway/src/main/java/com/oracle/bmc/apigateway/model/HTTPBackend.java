/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Send the request to an HTTP backend. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HTTPBackend.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HTTPBackend extends ApiSpecificationRouteBackend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The url of the HTTP Backend */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The url of the HTTP Backend
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** Defines a timeout for establishing a connection with a proxied server. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInSeconds")
        private Float connectTimeoutInSeconds;

        /**
         * Defines a timeout for establishing a connection with a proxied server.
         *
         * @param connectTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder connectTimeoutInSeconds(Float connectTimeoutInSeconds) {
            this.connectTimeoutInSeconds = connectTimeoutInSeconds;
            this.__explicitlySet__.add("connectTimeoutInSeconds");
            return this;
        }
        /** Defines a timeout for reading a response from the proxied server. */
        @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInSeconds")
        private Float readTimeoutInSeconds;

        /**
         * Defines a timeout for reading a response from the proxied server.
         *
         * @param readTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder readTimeoutInSeconds(Float readTimeoutInSeconds) {
            this.readTimeoutInSeconds = readTimeoutInSeconds;
            this.__explicitlySet__.add("readTimeoutInSeconds");
            return this;
        }
        /** Defines a timeout for transmitting a request to the proxied server. */
        @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInSeconds")
        private Float sendTimeoutInSeconds;

        /**
         * Defines a timeout for transmitting a request to the proxied server.
         *
         * @param sendTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder sendTimeoutInSeconds(Float sendTimeoutInSeconds) {
            this.sendTimeoutInSeconds = sendTimeoutInSeconds;
            this.__explicitlySet__.add("sendTimeoutInSeconds");
            return this;
        }
        /** Defines whether or not to uphold SSL verification. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
        private Boolean isSslVerifyDisabled;

        /**
         * Defines whether or not to uphold SSL verification.
         *
         * @param isSslVerifyDisabled the value to set
         * @return this builder
         */
        public Builder isSslVerifyDisabled(Boolean isSslVerifyDisabled) {
            this.isSslVerifyDisabled = isSslVerifyDisabled;
            this.__explicitlySet__.add("isSslVerifyDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HTTPBackend build() {
            HTTPBackend model =
                    new HTTPBackend(
                            this.url,
                            this.connectTimeoutInSeconds,
                            this.readTimeoutInSeconds,
                            this.sendTimeoutInSeconds,
                            this.isSslVerifyDisabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HTTPBackend model) {
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("connectTimeoutInSeconds")) {
                this.connectTimeoutInSeconds(model.getConnectTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("readTimeoutInSeconds")) {
                this.readTimeoutInSeconds(model.getReadTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("sendTimeoutInSeconds")) {
                this.sendTimeoutInSeconds(model.getSendTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isSslVerifyDisabled")) {
                this.isSslVerifyDisabled(model.getIsSslVerifyDisabled());
            }
            return this;
        }
    }

    /** Create a new builder. */
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

    /** The url of the HTTP Backend */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The url of the HTTP Backend
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** Defines a timeout for establishing a connection with a proxied server. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInSeconds")
    private final Float connectTimeoutInSeconds;

    /**
     * Defines a timeout for establishing a connection with a proxied server.
     *
     * @return the value
     */
    public Float getConnectTimeoutInSeconds() {
        return connectTimeoutInSeconds;
    }

    /** Defines a timeout for reading a response from the proxied server. */
    @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInSeconds")
    private final Float readTimeoutInSeconds;

    /**
     * Defines a timeout for reading a response from the proxied server.
     *
     * @return the value
     */
    public Float getReadTimeoutInSeconds() {
        return readTimeoutInSeconds;
    }

    /** Defines a timeout for transmitting a request to the proxied server. */
    @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInSeconds")
    private final Float sendTimeoutInSeconds;

    /**
     * Defines a timeout for transmitting a request to the proxied server.
     *
     * @return the value
     */
    public Float getSendTimeoutInSeconds() {
        return sendTimeoutInSeconds;
    }

    /** Defines whether or not to uphold SSL verification. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
    private final Boolean isSslVerifyDisabled;

    /**
     * Defines whether or not to uphold SSL verification.
     *
     * @return the value
     */
    public Boolean getIsSslVerifyDisabled() {
        return isSslVerifyDisabled;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HTTPBackend(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", connectTimeoutInSeconds=")
                .append(String.valueOf(this.connectTimeoutInSeconds));
        sb.append(", readTimeoutInSeconds=").append(String.valueOf(this.readTimeoutInSeconds));
        sb.append(", sendTimeoutInSeconds=").append(String.valueOf(this.sendTimeoutInSeconds));
        sb.append(", isSslVerifyDisabled=").append(String.valueOf(this.isSslVerifyDisabled));
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
                && super.equals(other);
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
        return result;
    }
}
