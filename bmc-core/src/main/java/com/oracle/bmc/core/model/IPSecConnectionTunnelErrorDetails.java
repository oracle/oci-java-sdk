/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Ipsec tunnels error details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IPSecConnectionTunnelErrorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class IPSecConnectionTunnelErrorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private String errorCode;

        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorDescription")
        private String errorDescription;

        public Builder errorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            this.__explicitlySet__.add("errorDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("solution")
        private String solution;

        public Builder solution(String solution) {
            this.solution = solution;
            this.__explicitlySet__.add("solution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ociResourcesLink")
        private String ociResourcesLink;

        public Builder ociResourcesLink(String ociResourcesLink) {
            this.ociResourcesLink = ociResourcesLink;
            this.__explicitlySet__.add("ociResourcesLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IPSecConnectionTunnelErrorDetails build() {
            IPSecConnectionTunnelErrorDetails __instance__ =
                    new IPSecConnectionTunnelErrorDetails(
                            id, errorCode, errorDescription, solution, ociResourcesLink, timestamp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IPSecConnectionTunnelErrorDetails o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .errorCode(o.getErrorCode())
                            .errorDescription(o.getErrorDescription())
                            .solution(o.getSolution())
                            .ociResourcesLink(o.getOciResourcesLink())
                            .timestamp(o.getTimestamp());

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
     * unique id generated for each error report
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * unique code describes error type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    String errorCode;

    /**
     * detailed description of the error
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorDescription")
    String errorDescription;

    /**
     * how to resolve the error
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("solution")
    String solution;

    /**
     * link to oracle resources
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociResourcesLink")
    String ociResourcesLink;

    /**
     * timestamp when error occurred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
