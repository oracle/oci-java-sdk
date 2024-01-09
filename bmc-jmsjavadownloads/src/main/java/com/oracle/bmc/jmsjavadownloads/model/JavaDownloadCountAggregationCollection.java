/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * Collection of download count aggregations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JavaDownloadCountAggregationCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaDownloadCountAggregationCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"aggregationType", "items"})
    public JavaDownloadCountAggregationCollection(
            JavaDownloadCountAggregationType aggregationType,
            java.util.List<JavaDownloadCountAggregation> items) {
        super();
        this.aggregationType = aggregationType;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Aggregation type */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregationType")
        private JavaDownloadCountAggregationType aggregationType;

        /**
         * Aggregation type
         *
         * @param aggregationType the value to set
         * @return this builder
         */
        public Builder aggregationType(JavaDownloadCountAggregationType aggregationType) {
            this.aggregationType = aggregationType;
            this.__explicitlySet__.add("aggregationType");
            return this;
        }
        /** A list of download count aggregations. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<JavaDownloadCountAggregation> items;

        /**
         * A list of download count aggregations.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<JavaDownloadCountAggregation> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaDownloadCountAggregationCollection build() {
            JavaDownloadCountAggregationCollection model =
                    new JavaDownloadCountAggregationCollection(this.aggregationType, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaDownloadCountAggregationCollection model) {
            if (model.wasPropertyExplicitlySet("aggregationType")) {
                this.aggregationType(model.getAggregationType());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    /** Aggregation type */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregationType")
    private final JavaDownloadCountAggregationType aggregationType;

    /**
     * Aggregation type
     *
     * @return the value
     */
    public JavaDownloadCountAggregationType getAggregationType() {
        return aggregationType;
    }

    /** A list of download count aggregations. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<JavaDownloadCountAggregation> items;

    /**
     * A list of download count aggregations.
     *
     * @return the value
     */
    public java.util.List<JavaDownloadCountAggregation> getItems() {
        return items;
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
        sb.append("JavaDownloadCountAggregationCollection(");
        sb.append("super=").append(super.toString());
        sb.append("aggregationType=").append(String.valueOf(this.aggregationType));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaDownloadCountAggregationCollection)) {
            return false;
        }

        JavaDownloadCountAggregationCollection other = (JavaDownloadCountAggregationCollection) o;
        return java.util.Objects.equals(this.aggregationType, other.aggregationType)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.aggregationType == null ? 43 : this.aggregationType.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
