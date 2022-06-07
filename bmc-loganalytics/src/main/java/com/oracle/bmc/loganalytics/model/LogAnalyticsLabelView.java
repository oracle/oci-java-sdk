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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsLabelView.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsLabelView {
    @Deprecated
    @java.beans.ConstructorProperties({
        "aliases",
        "countUsageInAlertRule",
        "countUsageInSource",
        "id",
        "suggestType",
        "description",
        "displayName",
        "editVersion",
        "impact",
        "isSystem",
        "name",
        "priority",
        "recommendation",
        "type",
        "isUserDeleted"
    })
    public LogAnalyticsLabelView(
            java.util.List<LogAnalyticsLabelAlias> aliases,
            Long countUsageInAlertRule,
            Long countUsageInSource,
            Object id,
            Long suggestType,
            String description,
            String displayName,
            Long editVersion,
            String impact,
            Boolean isSystem,
            String name,
            Priority priority,
            String recommendation,
            Long type,
            Boolean isUserDeleted) {
        super();
        this.aliases = aliases;
        this.countUsageInAlertRule = countUsageInAlertRule;
        this.countUsageInSource = countUsageInSource;
        this.id = id;
        this.suggestType = suggestType;
        this.description = description;
        this.displayName = displayName;
        this.editVersion = editVersion;
        this.impact = impact;
        this.isSystem = isSystem;
        this.name = name;
        this.priority = priority;
        this.recommendation = recommendation;
        this.type = type;
        this.isUserDeleted = isUserDeleted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * An arrya of label aliases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aliases")
    private final java.util.List<LogAnalyticsLabelAlias> aliases;

    public java.util.List<LogAnalyticsLabelAlias> getAliases() {
        return aliases;
    }

    /**
     * The label alert rule usage count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countUsageInAlertRule")
    private final Long countUsageInAlertRule;

    public Long getCountUsageInAlertRule() {
        return countUsageInAlertRule;
    }

    /**
     * The label source usage count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countUsageInSource")
    private final Long countUsageInSource;

    public Long getCountUsageInSource() {
        return countUsageInSource;
    }

    /**
     * The label unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Object id;

    public Object getId() {
        return id;
    }

    /**
     * The label suggestion type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suggestType")
    private final Long suggestType;

    public Long getSuggestType() {
        return suggestType;
    }

    /**
     * The label description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The label display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The label edit version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    public Long getEditVersion() {
        return editVersion;
    }

    /**
     * The label impact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("impact")
    private final String impact;

    public String getImpact() {
        return impact;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * The label name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The label priority.  Default value is NONE.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Priority.class);

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
    private final Priority priority;

    public Priority getPriority() {
        return priority;
    }

    /**
     * The label recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    private final String recommendation;

    public String getRecommendation() {
        return recommendation;
    }

    /**
     * The label type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Long type;

    public Long getType() {
        return type;
    }

    /**
     * A flag indicating whether or not the label has been deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
    private final Boolean isUserDeleted;

    public Boolean getIsUserDeleted() {
        return isUserDeleted;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsLabelView(");
        sb.append("aliases=").append(String.valueOf(this.aliases));
        sb.append(", countUsageInAlertRule=").append(String.valueOf(this.countUsageInAlertRule));
        sb.append(", countUsageInSource=").append(String.valueOf(this.countUsageInSource));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", suggestType=").append(String.valueOf(this.suggestType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", editVersion=").append(String.valueOf(this.editVersion));
        sb.append(", impact=").append(String.valueOf(this.impact));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", recommendation=").append(String.valueOf(this.recommendation));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isUserDeleted=").append(String.valueOf(this.isUserDeleted));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsLabelView)) {
            return false;
        }

        LogAnalyticsLabelView other = (LogAnalyticsLabelView) o;
        return java.util.Objects.equals(this.aliases, other.aliases)
                && java.util.Objects.equals(this.countUsageInAlertRule, other.countUsageInAlertRule)
                && java.util.Objects.equals(this.countUsageInSource, other.countUsageInSource)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.suggestType, other.suggestType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.editVersion, other.editVersion)
                && java.util.Objects.equals(this.impact, other.impact)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.recommendation, other.recommendation)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isUserDeleted, other.isUserDeleted)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.aliases == null ? 43 : this.aliases.hashCode());
        result =
                (result * PRIME)
                        + (this.countUsageInAlertRule == null
                                ? 43
                                : this.countUsageInAlertRule.hashCode());
        result =
                (result * PRIME)
                        + (this.countUsageInSource == null
                                ? 43
                                : this.countUsageInSource.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.suggestType == null ? 43 : this.suggestType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.editVersion == null ? 43 : this.editVersion.hashCode());
        result = (result * PRIME) + (this.impact == null ? 43 : this.impact.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendation == null ? 43 : this.recommendation.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserDeleted == null ? 43 : this.isUserDeleted.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
