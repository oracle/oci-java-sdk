/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemanagerproxy.model;

/**
 * Collection of service environments.
 * <p>
 **Note:** Service URL formats may vary from the provided example.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210914")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceEnvironmentCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceEnvironmentCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public ServiceEnvironmentCollection(java.util.List<ServiceEnvironmentSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Collection of items.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ServiceEnvironmentSummary> items;

        /**
         * Collection of items.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<ServiceEnvironmentSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceEnvironmentCollection build() {
            ServiceEnvironmentCollection model = new ServiceEnvironmentCollection(this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceEnvironmentCollection model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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
     * Collection of items.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ServiceEnvironmentSummary> items;

    /**
     * Collection of items.
     * @return the value
     **/
    public java.util.List<ServiceEnvironmentSummary> getItems() {
        return items;
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
        sb.append("ServiceEnvironmentCollection(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceEnvironmentCollection)) {
            return false;
        }

        ServiceEnvironmentCollection other = (ServiceEnvironmentCollection) o;
        return java.util.Objects.equals(this.items, other.items) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
