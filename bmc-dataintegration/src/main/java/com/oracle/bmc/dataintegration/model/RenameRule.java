/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Lets you rename an attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RenameRule.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RenameRule extends ProjectionRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isJavaRegexSyntax")
        private Boolean isJavaRegexSyntax;

        public Builder isJavaRegexSyntax(Boolean isJavaRegexSyntax) {
            this.isJavaRegexSyntax = isJavaRegexSyntax;
            this.__explicitlySet__.add("isJavaRegexSyntax");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSkipRemainingRulesOnMatch")
        private Boolean isSkipRemainingRulesOnMatch;

        public Builder isSkipRemainingRulesOnMatch(Boolean isSkipRemainingRulesOnMatch) {
            this.isSkipRemainingRulesOnMatch = isSkipRemainingRulesOnMatch;
            this.__explicitlySet__.add("isSkipRemainingRulesOnMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fromName")
        private String fromName;

        public Builder fromName(String fromName) {
            this.fromName = fromName;
            this.__explicitlySet__.add("fromName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("toName")
        private String toName;

        public Builder toName(String toName) {
            this.toName = toName;
            this.__explicitlySet__.add("toName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RenameRule build() {
            RenameRule __instance__ =
                    new RenameRule(
                            key,
                            modelVersion,
                            parentRef,
                            isJavaRegexSyntax,
                            configValues,
                            objectStatus,
                            description,
                            isSkipRemainingRulesOnMatch,
                            fromName,
                            toName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameRule o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .isJavaRegexSyntax(o.getIsJavaRegexSyntax())
                            .configValues(o.getConfigValues())
                            .objectStatus(o.getObjectStatus())
                            .description(o.getDescription())
                            .isSkipRemainingRulesOnMatch(o.getIsSkipRemainingRulesOnMatch())
                            .fromName(o.getFromName())
                            .toName(o.getToName());

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

    @Deprecated
    public RenameRule(
            String key,
            String modelVersion,
            ParentReference parentRef,
            Boolean isJavaRegexSyntax,
            ConfigValues configValues,
            Integer objectStatus,
            String description,
            Boolean isSkipRemainingRulesOnMatch,
            String fromName,
            String toName) {
        super(
                key,
                modelVersion,
                parentRef,
                isJavaRegexSyntax,
                configValues,
                objectStatus,
                description);
        this.isSkipRemainingRulesOnMatch = isSkipRemainingRulesOnMatch;
        this.fromName = fromName;
        this.toName = toName;
    }

    /**
     * Specifies whether to skip remaining rules when a match is found.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipRemainingRulesOnMatch")
    Boolean isSkipRemainingRulesOnMatch;

    /**
     * The attribute name that needs to be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fromName")
    String fromName;

    /**
     * The new attribute name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toName")
    String toName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
