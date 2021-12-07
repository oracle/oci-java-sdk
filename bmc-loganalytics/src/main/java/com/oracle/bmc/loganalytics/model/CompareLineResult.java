/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The result of a comparison of two lines in the two content input strings.
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
    builder = CompareLineResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CompareLineResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("leftContent")
        private String leftContent;

        public Builder leftContent(String leftContent) {
            this.leftContent = leftContent;
            this.__explicitlySet__.add("leftContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rightContent")
        private String rightContent;

        public Builder rightContent(String rightContent) {
            this.rightContent = rightContent;
            this.__explicitlySet__.add("rightContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diffType")
        private String diffType;

        public Builder diffType(String diffType) {
            this.diffType = diffType;
            this.__explicitlySet__.add("diffType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("leftIndices")
        private String leftIndices;

        public Builder leftIndices(String leftIndices) {
            this.leftIndices = leftIndices;
            this.__explicitlySet__.add("leftIndices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rightIndices")
        private String rightIndices;

        public Builder rightIndices(String rightIndices) {
            this.rightIndices = rightIndices;
            this.__explicitlySet__.add("rightIndices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompareLineResult build() {
            CompareLineResult __instance__ =
                    new CompareLineResult(
                            leftContent, rightContent, diffType, leftIndices, rightIndices);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompareLineResult o) {
            Builder copiedBuilder =
                    leftContent(o.getLeftContent())
                            .rightContent(o.getRightContent())
                            .diffType(o.getDiffType())
                            .leftIndices(o.getLeftIndices())
                            .rightIndices(o.getRightIndices());

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
     * A line from the content on the left. This may be empty if there is no matching line on
     * the left for a line in the right content.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("leftContent")
    String leftContent;

    /**
     * A line from the content on the right. This may be empty if there is no matching line on
     * the right for a line in the left content.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rightContent")
    String rightContent;

    /**
     * The result of the line comparison. An empty string means the lines being compared are the
     * same. A pipe, |, means the lines are different, and a caret, > or <, means the
     * line is only found either on the right or the left.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diffType")
    String diffType;

    /**
     * A comma delimited set of indices that identify which characters are different from those
     * in the right string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("leftIndices")
    String leftIndices;

    /**
     * A comma delimited set of indices that identify which characters are different from those
     * in the left string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rightIndices")
    String rightIndices;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
