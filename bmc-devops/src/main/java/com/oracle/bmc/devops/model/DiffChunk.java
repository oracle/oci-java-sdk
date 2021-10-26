/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details about a group of changes.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiffChunk.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DiffChunk {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("baseLine")
        private Integer baseLine;

        public Builder baseLine(Integer baseLine) {
            this.baseLine = baseLine;
            this.__explicitlySet__.add("baseLine");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("baseSpan")
        private Integer baseSpan;

        public Builder baseSpan(Integer baseSpan) {
            this.baseSpan = baseSpan;
            this.__explicitlySet__.add("baseSpan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetLine")
        private Integer targetLine;

        public Builder targetLine(Integer targetLine) {
            this.targetLine = targetLine;
            this.__explicitlySet__.add("targetLine");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetSpan")
        private Integer targetSpan;

        public Builder targetSpan(Integer targetSpan) {
            this.targetSpan = targetSpan;
            this.__explicitlySet__.add("targetSpan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diffSections")
        private java.util.List<DiffSection> diffSections;

        public Builder diffSections(java.util.List<DiffSection> diffSections) {
            this.diffSections = diffSections;
            this.__explicitlySet__.add("diffSections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiffChunk build() {
            DiffChunk __instance__ =
                    new DiffChunk(baseLine, baseSpan, targetLine, targetSpan, diffSections);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiffChunk o) {
            Builder copiedBuilder =
                    baseLine(o.getBaseLine())
                            .baseSpan(o.getBaseSpan())
                            .targetLine(o.getTargetLine())
                            .targetSpan(o.getTargetSpan())
                            .diffSections(o.getDiffSections());

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
     * Line number in base version where changes begin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseLine")
    Integer baseLine;

    /**
     * Number of lines chunk spans in base version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseSpan")
    Integer baseSpan;

    /**
     * Line number in target version where changes begin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetLine")
    Integer targetLine;

    /**
     * Number of lines chunk spans in target version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetSpan")
    Integer targetSpan;

    /**
     * List of DiffSection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diffSections")
    java.util.List<DiffSection> diffSections;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
