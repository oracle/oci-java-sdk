/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Collection of AdvisorReportCheckObjectSummary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ListUpdateCheckActionUpdateObjectDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ListUpdateCheckActionUpdateObjectDetails
        extends UpdateCheckActionUpdateObjectDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Array of check objects.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AdvisorReportCheckObjectSummary> items;

        /**
         * Array of check objects.
         *
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<AdvisorReportCheckObjectSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListUpdateCheckActionUpdateObjectDetails build() {
            ListUpdateCheckActionUpdateObjectDetails model =
                    new ListUpdateCheckActionUpdateObjectDetails(this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListUpdateCheckActionUpdateObjectDetails model) {
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

    @Deprecated
    public ListUpdateCheckActionUpdateObjectDetails(
            java.util.List<AdvisorReportCheckObjectSummary> items) {
        super();
        this.items = items;
    }

    /**
     * Array of check objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AdvisorReportCheckObjectSummary> items;

    /**
     * Array of check objects.
     *
     * @return the value
     **/
    public java.util.List<AdvisorReportCheckObjectSummary> getItems() {
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
        sb.append("ListUpdateCheckActionUpdateObjectDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListUpdateCheckActionUpdateObjectDetails)) {
            return false;
        }

        ListUpdateCheckActionUpdateObjectDetails other =
                (ListUpdateCheckActionUpdateObjectDetails) o;
        return java.util.Objects.equals(this.items, other.items) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
