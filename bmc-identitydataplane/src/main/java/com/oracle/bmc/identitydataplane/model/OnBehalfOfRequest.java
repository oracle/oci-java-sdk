/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OnBehalfOfRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OnBehalfOfRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.Map<String, java.util.List<String>> requestHeaders;

        public Builder requestHeaders(
                java.util.Map<String, java.util.List<String>> requestHeaders) {
            this.requestHeaders = requestHeaders;
            this.__explicitlySet__.add("requestHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetServiceName")
        private String targetServiceName;

        public Builder targetServiceName(String targetServiceName) {
            this.targetServiceName = targetServiceName;
            this.__explicitlySet__.add("targetServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oboToken")
        private String oboToken;

        public Builder oboToken(String oboToken) {
            this.oboToken = oboToken;
            this.__explicitlySet__.add("oboToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expiration")
        private String expiration;

        public Builder expiration(String expiration) {
            this.expiration = expiration;
            this.__explicitlySet__.add("expiration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OnBehalfOfRequest build() {
            OnBehalfOfRequest __instance__ =
                    new OnBehalfOfRequest(requestHeaders, targetServiceName, oboToken, expiration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OnBehalfOfRequest o) {
            Builder copiedBuilder =
                    requestHeaders(o.getRequestHeaders())
                            .targetServiceName(o.getTargetServiceName())
                            .oboToken(o.getOboToken())
                            .expiration(o.getExpiration());

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

    /**
     * The signed headers of the customer call.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
    java.util.Map<String, java.util.List<String>> requestHeaders;

    /**
     * The name of the target service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetServiceName")
    String targetServiceName;

    /**
     * If you have an obo token already, exchange that for a new obo token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oboToken")
    String oboToken;

    /**
     * A duration for which the obo token is requested to be valid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expiration")
    String expiration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
