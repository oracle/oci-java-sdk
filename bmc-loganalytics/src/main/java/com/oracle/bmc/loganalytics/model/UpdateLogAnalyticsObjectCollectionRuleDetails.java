/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Configuration of the collection rule to be updated.
 *
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
    builder = UpdateLogAnalyticsObjectCollectionRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateLogAnalyticsObjectCollectionRuleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logSourceName")
        private String logSourceName;

        public Builder logSourceName(String logSourceName) {
            this.logSourceName = logSourceName;
            this.__explicitlySet__.add("logSourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("charEncoding")
        private String charEncoding;

        public Builder charEncoding(String charEncoding) {
            this.charEncoding = charEncoding;
            this.__explicitlySet__.add("charEncoding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("overrides")
        private java.util.Map<String, java.util.List<PropertyOverride>> overrides;

        public Builder overrides(
                java.util.Map<String, java.util.List<PropertyOverride>> overrides) {
            this.overrides = overrides;
            this.__explicitlySet__.add("overrides");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLogAnalyticsObjectCollectionRuleDetails build() {
            UpdateLogAnalyticsObjectCollectionRuleDetails __instance__ =
                    new UpdateLogAnalyticsObjectCollectionRuleDetails(
                            description,
                            logGroupId,
                            logSourceName,
                            entityId,
                            charEncoding,
                            isEnabled,
                            overrides,
                            definedTags,
                            freeformTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLogAnalyticsObjectCollectionRuleDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .logGroupId(o.getLogGroupId())
                            .logSourceName(o.getLogSourceName())
                            .entityId(o.getEntityId())
                            .charEncoding(o.getCharEncoding())
                            .isEnabled(o.getIsEnabled())
                            .overrides(o.getOverrides())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags());

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
     * A string that describes the details of the rule.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Logging Analytics Log group OCID to associate the processed logs with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    String logGroupId;

    /**
     * Name of the Logging Analytics Source to use for the processing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logSourceName")
    String logSourceName;

    /**
     * Logging Analytics entity OCID. Associates the processed logs with the given entity (optional).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    String entityId;

    /**
     * An optional character encoding to aid in detecting the character encoding of the contents of the objects while processing.
     * It is recommended to set this value as ISO_8859_1 when configuring content of the objects having more numeric characters,
     * and very few alphabets.
     * For e.g. this applies when configuring VCN Flow Logs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("charEncoding")
    String charEncoding;

    /**
     * Whether or not this rule is currently enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * Use this to override some property values which are defined at bucket level to the scope of object.
     * Supported propeties for override are: logSourceName, charEncoding, entityId.
     * Supported matchType for override are "contains".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overrides")
    java.util.Map<String, java.util.List<PropertyOverride>> overrides;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
