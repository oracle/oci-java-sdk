/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RenameDatasetLabelsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RenameDatasetLabelsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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
            RenameDatasetLabelsDetails __instance__ =
                    new RenameDatasetLabelsDetails(sourceLabelSet, targetLabelSet);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameDatasetLabelsDetails o) {
            Builder copiedBuilder =
                    sourceLabelSet(o.getSourceLabelSet()).targetLabelSet(o.getTargetLabelSet());

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

    @com.fasterxml.jackson.annotation.JsonProperty("sourceLabelSet")
    LabelSet sourceLabelSet;

    @com.fasterxml.jackson.annotation.JsonProperty("targetLabelSet")
    LabelSet targetLabelSet;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
