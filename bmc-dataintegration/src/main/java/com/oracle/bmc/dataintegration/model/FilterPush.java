/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about a filter operator. The filter operator lets you select certain attributes
 * from the inbound port to continue downstream to the outbound port. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FilterPush.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FilterPush extends PushDownOperation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The filter condition. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterCondition")
        private String filterCondition;

        /**
         * The filter condition.
         *
         * @param filterCondition the value to set
         * @return this builder
         */
        public Builder filterCondition(String filterCondition) {
            this.filterCondition = filterCondition;
            this.__explicitlySet__.add("filterCondition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FilterPush build() {
            FilterPush model = new FilterPush(this.filterCondition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FilterPush model) {
            if (model.wasPropertyExplicitlySet("filterCondition")) {
                this.filterCondition(model.getFilterCondition());
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
    public FilterPush(String filterCondition) {
        super();
        this.filterCondition = filterCondition;
    }

    /** The filter condition. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterCondition")
    private final String filterCondition;

    /**
     * The filter condition.
     *
     * @return the value
     */
    public String getFilterCondition() {
        return filterCondition;
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
        sb.append("FilterPush(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", filterCondition=").append(String.valueOf(this.filterCondition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FilterPush)) {
            return false;
        }

        FilterPush other = (FilterPush) o;
        return java.util.Objects.equals(this.filterCondition, other.filterCondition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.filterCondition == null ? 43 : this.filterCondition.hashCode());
        return result;
    }
}
