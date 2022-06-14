/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details required to establish a connection to the database using a private endpoint.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PrivateEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PrivateEndpoint extends ConnectionOption {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the Data Safe private endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datasafePrivateEndpointId")
        private String datasafePrivateEndpointId;

        /**
         * The OCID of the Data Safe private endpoint.
         * @param datasafePrivateEndpointId the value to set
         * @return this builder
         **/
        public Builder datasafePrivateEndpointId(String datasafePrivateEndpointId) {
            this.datasafePrivateEndpointId = datasafePrivateEndpointId;
            this.__explicitlySet__.add("datasafePrivateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateEndpoint build() {
            PrivateEndpoint __instance__ = new PrivateEndpoint(datasafePrivateEndpointId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateEndpoint o) {
            Builder copiedBuilder = datasafePrivateEndpointId(o.getDatasafePrivateEndpointId());

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
    public PrivateEndpoint(String datasafePrivateEndpointId) {
        super();
        this.datasafePrivateEndpointId = datasafePrivateEndpointId;
    }

    /**
     * The OCID of the Data Safe private endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datasafePrivateEndpointId")
    private final String datasafePrivateEndpointId;

    /**
     * The OCID of the Data Safe private endpoint.
     * @return the value
     **/
    public String getDatasafePrivateEndpointId() {
        return datasafePrivateEndpointId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PrivateEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append(", datasafePrivateEndpointId=")
                .append(String.valueOf(this.datasafePrivateEndpointId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateEndpoint)) {
            return false;
        }

        PrivateEndpoint other = (PrivateEndpoint) o;
        return java.util.Objects.equals(
                        this.datasafePrivateEndpointId, other.datasafePrivateEndpointId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.datasafePrivateEndpointId == null
                                ? 43
                                : this.datasafePrivateEndpointId.hashCode());
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
