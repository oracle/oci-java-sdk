/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * source summary
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LabelSourceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LabelSourceSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
        private String sourceDisplayName;

        public Builder sourceDisplayName(String sourceDisplayName) {
            this.sourceDisplayName = sourceDisplayName;
            this.__explicitlySet__.add("sourceDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelOperatorName")
        private String labelOperatorName;

        public Builder labelOperatorName(String labelOperatorName) {
            this.labelOperatorName = labelOperatorName;
            this.__explicitlySet__.add("labelOperatorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelCondition")
        private String labelCondition;

        public Builder labelCondition(String labelCondition) {
            this.labelCondition = labelCondition;
            this.__explicitlySet__.add("labelCondition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelFieldDisplayname")
        private String labelFieldDisplayname;

        public Builder labelFieldDisplayname(String labelFieldDisplayname) {
            this.labelFieldDisplayname = labelFieldDisplayname;
            this.__explicitlySet__.add("labelFieldDisplayname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelFieldName")
        private String labelFieldName;

        public Builder labelFieldName(String labelFieldName) {
            this.labelFieldName = labelFieldName;
            this.__explicitlySet__.add("labelFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LabelSourceSummary build() {
            LabelSourceSummary __instance__ =
                    new LabelSourceSummary(
                            sourceDisplayName,
                            sourceName,
                            sourceId,
                            labelOperatorName,
                            labelCondition,
                            labelFieldDisplayname,
                            labelFieldName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LabelSourceSummary o) {
            Builder copiedBuilder =
                    sourceDisplayName(o.getSourceDisplayName())
                            .sourceName(o.getSourceName())
                            .sourceId(o.getSourceId())
                            .labelOperatorName(o.getLabelOperatorName())
                            .labelCondition(o.getLabelCondition())
                            .labelFieldDisplayname(o.getLabelFieldDisplayname())
                            .labelFieldName(o.getLabelFieldName());

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
     * The source display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
    String sourceDisplayName;

    /**
     * The source internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    String sourceName;

    /**
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    Long sourceId;

    /**
     * The label operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelOperatorName")
    String labelOperatorName;

    /**
     * The label condition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelCondition")
    String labelCondition;

    /**
     * The label field display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelFieldDisplayname")
    String labelFieldDisplayname;

    /**
     * The label field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelFieldName")
    String labelFieldName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
