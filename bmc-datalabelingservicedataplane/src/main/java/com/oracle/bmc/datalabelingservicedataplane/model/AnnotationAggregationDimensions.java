/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * The dimensions to summarize annotations for a given dataset.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnnotationAggregationDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnnotationAggregationDimensions
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"label", "updatedBy"})
    public AnnotationAggregationDimensions(Label label, String updatedBy) {
        super();
        this.label = label;
        this.updatedBy = updatedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private Label label;

        public Builder label(Label label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /**
         * The OCID of the principal which updated the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        /**
         * The OCID of the principal which updated the resource.
         * @param updatedBy the value to set
         * @return this builder
         **/
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnnotationAggregationDimensions build() {
            AnnotationAggregationDimensions model =
                    new AnnotationAggregationDimensions(this.label, this.updatedBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnnotationAggregationDimensions model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
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

    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final Label label;

    public Label getLabel() {
        return label;
    }

    /**
     * The OCID of the principal which updated the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

    /**
     * The OCID of the principal which updated the resource.
     * @return the value
     **/
    public String getUpdatedBy() {
        return updatedBy;
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
        sb.append("AnnotationAggregationDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnnotationAggregationDimensions)) {
            return false;
        }

        AnnotationAggregationDimensions other = (AnnotationAggregationDimensions) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
