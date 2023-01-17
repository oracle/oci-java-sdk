/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservice.model;

/**
 * Renames a subset of Labels in the Dataset's LabelSet.  The Labels in the source LabelSet will be replaced with the Labels in the target LabelSet.
 * Labels are correlated by index, i.e. the first Label in the source LabelSet will be replaced by the first Label in the target LabelSet.
 * If the size of the\u00A0source and target LabelSets are not equal, the request will be rejected.
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
    builder = RenameDatasetLabelsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RenameDatasetLabelsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceLabelSet", "targetLabelSet"})
    public RenameDatasetLabelsDetails(LabelSet sourceLabelSet, LabelSet targetLabelSet) {
        super();
        this.sourceLabelSet = sourceLabelSet;
        this.targetLabelSet = targetLabelSet;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("sourceLabelSet")
        private LabelSet sourceLabelSet;

        public Builder sourceLabelSet(LabelSet sourceLabelSet) {
            this.sourceLabelSet = sourceLabelSet;
            this.__explicitlySet__.add("sourceLabelSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetLabelSet")
        private LabelSet targetLabelSet;

        public Builder targetLabelSet(LabelSet targetLabelSet) {
            this.targetLabelSet = targetLabelSet;
            this.__explicitlySet__.add("targetLabelSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RenameDatasetLabelsDetails build() {
            RenameDatasetLabelsDetails model =
                    new RenameDatasetLabelsDetails(this.sourceLabelSet, this.targetLabelSet);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameDatasetLabelsDetails model) {
            if (model.wasPropertyExplicitlySet("sourceLabelSet")) {
                this.sourceLabelSet(model.getSourceLabelSet());
            }
            if (model.wasPropertyExplicitlySet("targetLabelSet")) {
                this.targetLabelSet(model.getTargetLabelSet());
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

    @com.fasterxml.jackson.annotation.JsonProperty("sourceLabelSet")
    private final LabelSet sourceLabelSet;

    public LabelSet getSourceLabelSet() {
        return sourceLabelSet;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetLabelSet")
    private final LabelSet targetLabelSet;

    public LabelSet getTargetLabelSet() {
        return targetLabelSet;
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
        sb.append("RenameDatasetLabelsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceLabelSet=").append(String.valueOf(this.sourceLabelSet));
        sb.append(", targetLabelSet=").append(String.valueOf(this.targetLabelSet));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenameDatasetLabelsDetails)) {
            return false;
        }

        RenameDatasetLabelsDetails other = (RenameDatasetLabelsDetails) o;
        return java.util.Objects.equals(this.sourceLabelSet, other.sourceLabelSet)
                && java.util.Objects.equals(this.targetLabelSet, other.targetLabelSet)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceLabelSet == null ? 43 : this.sourceLabelSet.hashCode());
        result =
                (result * PRIME)
                        + (this.targetLabelSet == null ? 43 : this.targetLabelSet.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
