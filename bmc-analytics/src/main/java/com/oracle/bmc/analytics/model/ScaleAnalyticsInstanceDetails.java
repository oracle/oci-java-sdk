/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Input payload to scale an Analytics instance up or down.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScaleAnalyticsInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScaleAnalyticsInstanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"capacity"})
    public ScaleAnalyticsInstanceDetails(Capacity capacity) {
        super();
        this.capacity = capacity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Capacity capacity;

        public Builder capacity(Capacity capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScaleAnalyticsInstanceDetails build() {
            ScaleAnalyticsInstanceDetails model = new ScaleAnalyticsInstanceDetails(this.capacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScaleAnalyticsInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
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

    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final Capacity capacity;

    public Capacity getCapacity() {
        return capacity;
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
        sb.append("ScaleAnalyticsInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("capacity=").append(String.valueOf(this.capacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScaleAnalyticsInstanceDetails)) {
            return false;
        }

        ScaleAnalyticsInstanceDetails other = (ScaleAnalyticsInstanceDetails) o;
        return java.util.Objects.equals(this.capacity, other.capacity) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
