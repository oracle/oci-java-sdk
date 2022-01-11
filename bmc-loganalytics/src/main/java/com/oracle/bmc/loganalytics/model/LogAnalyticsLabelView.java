/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsLabelView
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
    builder = LogAnalyticsLabelView.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsLabelView {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("aliases")
        private java.util.List<LogAnalyticsLabelAlias> aliases;

        public Builder aliases(java.util.List<LogAnalyticsLabelAlias> aliases) {
            this.aliases = aliases;
            this.__explicitlySet__.add("aliases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countUsageInAlertRule")
        private Long countUsageInAlertRule;

        public Builder countUsageInAlertRule(Long countUsageInAlertRule) {
            this.countUsageInAlertRule = countUsageInAlertRule;
            this.__explicitlySet__.add("countUsageInAlertRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countUsageInSource")
        private Long countUsageInSource;

        public Builder countUsageInSource(Long countUsageInSource) {
            this.countUsageInSource = countUsageInSource;
            this.__explicitlySet__.add("countUsageInSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Object id;

        public Builder id(Object id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("suggestType")
        private Long suggestType;

        public Builder suggestType(Long suggestType) {
            this.suggestType = suggestType;
            this.__explicitlySet__.add("suggestType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("impact")
        private String impact;

        public Builder impact(String impact) {
            this.impact = impact;
            this.__explicitlySet__.add("impact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Priority priority;

        public Builder priority(Priority priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Long type;

        public Builder type(Long type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
        private Boolean isUserDeleted;

        public Builder isUserDeleted(Boolean isUserDeleted) {
            this.isUserDeleted = isUserDeleted;
            this.__explicitlySet__.add("isUserDeleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsLabelView build() {
            LogAnalyticsLabelView __instance__ =
                    new LogAnalyticsLabelView(
                            aliases,
                            countUsageInAlertRule,
                            countUsageInSource,
                            id,
                            suggestType,
                            description,
                            displayName,
                            editVersion,
                            impact,
                            isSystem,
                            name,
                            priority,
                            recommendation,
                            type,
                            isUserDeleted);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsLabelView o) {
            Builder copiedBuilder =
                    aliases(o.getAliases())
                            .countUsageInAlertRule(o.getCountUsageInAlertRule())
                            .countUsageInSource(o.getCountUsageInSource())
                            .id(o.getId())
                            .suggestType(o.getSuggestType())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .editVersion(o.getEditVersion())
                            .impact(o.getImpact())
                            .isSystem(o.getIsSystem())
                            .name(o.getName())
                            .priority(o.getPriority())
                            .recommendation(o.getRecommendation())
                            .type(o.getType())
                            .isUserDeleted(o.getIsUserDeleted());

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
     * An arrya of label aliases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aliases")
    java.util.List<LogAnalyticsLabelAlias> aliases;

    /**
     * The label alert rule usage count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countUsageInAlertRule")
    Long countUsageInAlertRule;

    /**
     * The label source usage count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countUsageInSource")
    Long countUsageInSource;

    /**
     * The label unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    Object id;

    /**
     * The label suggestion type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suggestType")
    Long suggestType;

    /**
     * The label description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The label display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The label edit version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    Long editVersion;

    /**
     * The label impact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("impact")
    String impact;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * The label name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The label priority.  Default value is NONE.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Priority {
        None("NONE"),
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Priority> map;

        static {
            map = new java.util.HashMap<>();
            for (Priority v : Priority.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Priority(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Priority create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Priority', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The label priority.  Default value is NONE.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    Priority priority;

    /**
     * The label recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    String recommendation;

    /**
     * The label type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Long type;

    /**
     * A flag indicating whether or not the label has been deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
    Boolean isUserDeleted;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
