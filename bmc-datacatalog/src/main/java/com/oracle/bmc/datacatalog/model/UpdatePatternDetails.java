/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in pattern update operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdatePatternDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdatePatternDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checkFilePathList")
        private java.util.List<String> checkFilePathList;

        public Builder checkFilePathList(java.util.List<String> checkFilePathList) {
            this.checkFilePathList = checkFilePathList;
            this.__explicitlySet__.add("checkFilePathList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnableCheckFailureLimit")
        private Boolean isEnableCheckFailureLimit;

        public Builder isEnableCheckFailureLimit(Boolean isEnableCheckFailureLimit) {
            this.isEnableCheckFailureLimit = isEnableCheckFailureLimit;
            this.__explicitlySet__.add("isEnableCheckFailureLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checkFailureLimit")
        private Integer checkFailureLimit;

        public Builder checkFailureLimit(Integer checkFailureLimit) {
            this.checkFailureLimit = checkFailureLimit;
            this.__explicitlySet__.add("checkFailureLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePatternDetails build() {
            UpdatePatternDetails __instance__ =
                    new UpdatePatternDetails(
                            displayName,
                            description,
                            expression,
                            checkFilePathList,
                            isEnableCheckFailureLimit,
                            checkFailureLimit,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePatternDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .expression(o.getExpression())
                            .checkFilePathList(o.getCheckFilePathList())
                            .isEnableCheckFailureLimit(o.getIsEnableCheckFailureLimit())
                            .checkFailureLimit(o.getCheckFailureLimit())
                            .properties(o.getProperties());

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
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Detailed description of the Pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The expression used in the pattern that may include qualifiers. Refer to the user documentation for details of the format and examples.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    String expression;

    /**
     * List of file paths against which the expression can be tried, as a check. This documents, for reference
     * purposes, some example objects a pattern is meant to work with. If isEnableCheckFailureLimit is set to true,
     * this will be run as a validation during the request, such that if the check fails the request fails. If
     * isEnableCheckFailureLimit instead is set to (the default) false, a pattern will still be created or updated even
     * if the check fails, with a lifecycleState of FAILED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checkFilePathList")
    java.util.List<String> checkFilePathList;

    /**
     * Indicates whether the expression check, against the checkFilePathList, will fail the request if the count of
     * UNMATCHED files is above the checkFailureLimit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnableCheckFailureLimit")
    Boolean isEnableCheckFailureLimit;

    /**
     * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails. Optional, if
     * checkFilePathList is provided - but if isEnableCheckFailureLimit is set to true it is required.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checkFailureLimit")
    Integer checkFailureLimit;

    /**
     * A map of maps that contains the properties which are specific to the pattern type. Each pattern type
     * definition defines it's set of required and optional properties.
     * Example: `{\"properties\": { \"default\": { \"tbd\"}}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.Map<String, String>> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
