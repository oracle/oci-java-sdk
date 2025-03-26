/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservice.model;

/**
 * Adds a subset of Labels to the Dataset's LabelSet.  This LabelSet will be merged with the current Dataset's LabelSet. Requests with duplicate Labels will be rejected.
 *
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
    builder = AddDatasetLabelsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddDatasetLabelsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"labelSet"})
    public AddDatasetLabelsDetails(LabelSet labelSet) {
        super();
        this.labelSet = labelSet;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("labelSet")
        private LabelSet labelSet;

        public Builder labelSet(LabelSet labelSet) {
            this.labelSet = labelSet;
            this.__explicitlySet__.add("labelSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddDatasetLabelsDetails build() {
            AddDatasetLabelsDetails model = new AddDatasetLabelsDetails(this.labelSet);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddDatasetLabelsDetails model) {
            if (model.wasPropertyExplicitlySet("labelSet")) {
                this.labelSet(model.getLabelSet());
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

    @com.fasterxml.jackson.annotation.JsonProperty("labelSet")
    private final LabelSet labelSet;

    public LabelSet getLabelSet() {
        return labelSet;
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
        sb.append("AddDatasetLabelsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("labelSet=").append(String.valueOf(this.labelSet));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddDatasetLabelsDetails)) {
            return false;
        }

        AddDatasetLabelsDetails other = (AddDatasetLabelsDetails) o;
        return java.util.Objects.equals(this.labelSet, other.labelSet) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.labelSet == null ? 43 : this.labelSet.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
