/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * The quota details of resources under a tenancy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceQuotumCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceQuotumCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "isAllowed"})
    public ResourceQuotumCollection(
            java.util.List<ResourceQuotumSummary> items, Boolean isAllowed) {
        super();
        this.items = items;
        this.isAllowed = isAllowed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of resource quota details. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ResourceQuotumSummary> items;

        /**
         * The list of resource quota details.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<ResourceQuotumSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /** Used to indicate if further quota consumption isAllowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAllowed")
        private Boolean isAllowed;

        /**
         * Used to indicate if further quota consumption isAllowed.
         *
         * @param isAllowed the value to set
         * @return this builder
         */
        public Builder isAllowed(Boolean isAllowed) {
            this.isAllowed = isAllowed;
            this.__explicitlySet__.add("isAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceQuotumCollection build() {
            ResourceQuotumCollection model =
                    new ResourceQuotumCollection(this.items, this.isAllowed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceQuotumCollection model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("isAllowed")) {
                this.isAllowed(model.getIsAllowed());
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

    /** The list of resource quota details. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ResourceQuotumSummary> items;

    /**
     * The list of resource quota details.
     *
     * @return the value
     */
    public java.util.List<ResourceQuotumSummary> getItems() {
        return items;
    }

    /** Used to indicate if further quota consumption isAllowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowed")
    private final Boolean isAllowed;

    /**
     * Used to indicate if further quota consumption isAllowed.
     *
     * @return the value
     */
    public Boolean getIsAllowed() {
        return isAllowed;
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
        sb.append("ResourceQuotumCollection(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", isAllowed=").append(String.valueOf(this.isAllowed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceQuotumCollection)) {
            return false;
        }

        ResourceQuotumCollection other = (ResourceQuotumCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.isAllowed, other.isAllowed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.isAllowed == null ? 43 : this.isAllowed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
