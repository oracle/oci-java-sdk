/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * Dimensions to summarize record information for a given dataset
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
    builder = RecordAggregationDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RecordAggregationDimensions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isLabeled")
        private Boolean isLabeled;

        public Builder isLabeled(Boolean isLabeled) {
            this.isLabeled = isLabeled;
            this.__explicitlySet__.add("isLabeled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("annotationLabelContains")
        private String annotationLabelContains;

        public Builder annotationLabelContains(String annotationLabelContains) {
            this.annotationLabelContains = annotationLabelContains;
            this.__explicitlySet__.add("annotationLabelContains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecordAggregationDimensions build() {
            RecordAggregationDimensions __instance__ =
                    new RecordAggregationDimensions(isLabeled, annotationLabelContains);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecordAggregationDimensions o) {
            Builder copiedBuilder =
                    isLabeled(o.getIsLabeled())
                            .annotationLabelContains(o.getAnnotationLabelContains());

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

    /**
     * Whether the record has been labeled and has associated annotations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLabeled")
    Boolean isLabeled;

    /**
     * Whether the annotation contains label.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("annotationLabelContains")
    String annotationLabelContains;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
