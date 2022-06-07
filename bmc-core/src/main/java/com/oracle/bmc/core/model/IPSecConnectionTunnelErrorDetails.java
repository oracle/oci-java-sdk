/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details for an error on an IPSec tunnel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IPSecConnectionTunnelErrorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IPSecConnectionTunnelErrorDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "errorCode",
        "errorDescription",
        "solution",
        "ociResourcesLink",
        "timestamp"
    })
    public IPSecConnectionTunnelErrorDetails(
            String id,
            String errorCode,
            String errorDescription,
            String solution,
            String ociResourcesLink,
            java.util.Date timestamp) {
        super();
        this.id = id;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.solution = solution;
        this.ociResourcesLink = ociResourcesLink;
        this.timestamp = timestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique ID generated for each error report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * Unique code describes the error type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    /**
     * A detailed description of the error.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorDescription")
    private final String errorDescription;

    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Resolution for the error.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("solution")
    private final String solution;

    public String getSolution() {
        return solution;
    }

    /**
     * Link to more Oracle resources or relevant documentation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociResourcesLink")
    private final String ociResourcesLink;

    public String getOciResourcesLink() {
        return ociResourcesLink;
    }

    /**
     * Timestamp when the error occurred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    public java.util.Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IPSecConnectionTunnelErrorDetails(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorDescription=").append(String.valueOf(this.errorDescription));
        sb.append(", solution=").append(String.valueOf(this.solution));
        sb.append(", ociResourcesLink=").append(String.valueOf(this.ociResourcesLink));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IPSecConnectionTunnelErrorDetails)) {
            return false;
        }

        IPSecConnectionTunnelErrorDetails other = (IPSecConnectionTunnelErrorDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorDescription, other.errorDescription)
                && java.util.Objects.equals(this.solution, other.solution)
                && java.util.Objects.equals(this.ociResourcesLink, other.ociResourcesLink)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result =
                (result * PRIME)
                        + (this.errorDescription == null ? 43 : this.errorDescription.hashCode());
        result = (result * PRIME) + (this.solution == null ? 43 : this.solution.hashCode());
        result =
                (result * PRIME)
                        + (this.ociResourcesLink == null ? 43 : this.ociResourcesLink.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
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
