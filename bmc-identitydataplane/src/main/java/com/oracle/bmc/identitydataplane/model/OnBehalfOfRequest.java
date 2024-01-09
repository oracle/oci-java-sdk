/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OnBehalfOfRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OnBehalfOfRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "requestHeaders",
        "targetServiceName",
        "oboToken",
        "expiration"
    })
    public OnBehalfOfRequest(
            java.util.Map<String, java.util.List<String>> requestHeaders,
            String targetServiceName,
            String oboToken,
            String expiration) {
        super();
        this.requestHeaders = requestHeaders;
        this.targetServiceName = targetServiceName;
        this.oboToken = oboToken;
        this.expiration = expiration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The signed headers of the customer call. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.Map<String, java.util.List<String>> requestHeaders;

        /**
         * The signed headers of the customer call.
         *
         * @param requestHeaders the value to set
         * @return this builder
         */
        public Builder requestHeaders(
                java.util.Map<String, java.util.List<String>> requestHeaders) {
            this.requestHeaders = requestHeaders;
            this.__explicitlySet__.add("requestHeaders");
            return this;
        }
        /** The name of the target service. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetServiceName")
        private String targetServiceName;

        /**
         * The name of the target service.
         *
         * @param targetServiceName the value to set
         * @return this builder
         */
        public Builder targetServiceName(String targetServiceName) {
            this.targetServiceName = targetServiceName;
            this.__explicitlySet__.add("targetServiceName");
            return this;
        }
        /** If you have an obo token already, exchange that for a new obo token. */
        @com.fasterxml.jackson.annotation.JsonProperty("oboToken")
        private String oboToken;

        /**
         * If you have an obo token already, exchange that for a new obo token.
         *
         * @param oboToken the value to set
         * @return this builder
         */
        public Builder oboToken(String oboToken) {
            this.oboToken = oboToken;
            this.__explicitlySet__.add("oboToken");
            return this;
        }
        /** A duration for which the obo token is requested to be valid. */
        @com.fasterxml.jackson.annotation.JsonProperty("expiration")
        private String expiration;

        /**
         * A duration for which the obo token is requested to be valid.
         *
         * @param expiration the value to set
         * @return this builder
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            this.__explicitlySet__.add("expiration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OnBehalfOfRequest build() {
            OnBehalfOfRequest model =
                    new OnBehalfOfRequest(
                            this.requestHeaders,
                            this.targetServiceName,
                            this.oboToken,
                            this.expiration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OnBehalfOfRequest model) {
            if (model.wasPropertyExplicitlySet("requestHeaders")) {
                this.requestHeaders(model.getRequestHeaders());
            }
            if (model.wasPropertyExplicitlySet("targetServiceName")) {
                this.targetServiceName(model.getTargetServiceName());
            }
            if (model.wasPropertyExplicitlySet("oboToken")) {
                this.oboToken(model.getOboToken());
            }
            if (model.wasPropertyExplicitlySet("expiration")) {
                this.expiration(model.getExpiration());
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

    /** The signed headers of the customer call. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
    private final java.util.Map<String, java.util.List<String>> requestHeaders;

    /**
     * The signed headers of the customer call.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.List<String>> getRequestHeaders() {
        return requestHeaders;
    }

    /** The name of the target service. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetServiceName")
    private final String targetServiceName;

    /**
     * The name of the target service.
     *
     * @return the value
     */
    public String getTargetServiceName() {
        return targetServiceName;
    }

    /** If you have an obo token already, exchange that for a new obo token. */
    @com.fasterxml.jackson.annotation.JsonProperty("oboToken")
    private final String oboToken;

    /**
     * If you have an obo token already, exchange that for a new obo token.
     *
     * @return the value
     */
    public String getOboToken() {
        return oboToken;
    }

    /** A duration for which the obo token is requested to be valid. */
    @com.fasterxml.jackson.annotation.JsonProperty("expiration")
    private final String expiration;

    /**
     * A duration for which the obo token is requested to be valid.
     *
     * @return the value
     */
    public String getExpiration() {
        return expiration;
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
        sb.append("OnBehalfOfRequest(");
        sb.append("super=").append(super.toString());
        sb.append("requestHeaders=").append(String.valueOf(this.requestHeaders));
        sb.append(", targetServiceName=").append(String.valueOf(this.targetServiceName));
        sb.append(", oboToken=").append(String.valueOf(this.oboToken));
        sb.append(", expiration=").append(String.valueOf(this.expiration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OnBehalfOfRequest)) {
            return false;
        }

        OnBehalfOfRequest other = (OnBehalfOfRequest) o;
        return java.util.Objects.equals(this.requestHeaders, other.requestHeaders)
                && java.util.Objects.equals(this.targetServiceName, other.targetServiceName)
                && java.util.Objects.equals(this.oboToken, other.oboToken)
                && java.util.Objects.equals(this.expiration, other.expiration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.requestHeaders == null ? 43 : this.requestHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.targetServiceName == null ? 43 : this.targetServiceName.hashCode());
        result = (result * PRIME) + (this.oboToken == null ? 43 : this.oboToken.hashCode());
        result = (result * PRIME) + (this.expiration == null ? 43 : this.expiration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
