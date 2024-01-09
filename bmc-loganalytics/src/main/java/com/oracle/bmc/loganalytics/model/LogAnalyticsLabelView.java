/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsLabelView <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsLabelView.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsLabelView
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** An arrya of label aliases. */
        @com.fasterxml.jackson.annotation.JsonProperty("aliases")
        private java.util.List<LogAnalyticsLabelAlias> aliases;

        /**
         * An arrya of label aliases.
         *
         * @param aliases the value to set
         * @return this builder
         */
        public Builder aliases(java.util.List<LogAnalyticsLabelAlias> aliases) {
            this.aliases = aliases;
            this.__explicitlySet__.add("aliases");
            return this;
        }
        /** The label alert rule usage count. */
        @com.fasterxml.jackson.annotation.JsonProperty("countUsageInAlertRule")
        private Long countUsageInAlertRule;

        /**
         * The label alert rule usage count.
         *
         * @param countUsageInAlertRule the value to set
         * @return this builder
         */
        public Builder countUsageInAlertRule(Long countUsageInAlertRule) {
            this.countUsageInAlertRule = countUsageInAlertRule;
            this.__explicitlySet__.add("countUsageInAlertRule");
            return this;
        }
        /** The label source usage count. */
        @com.fasterxml.jackson.annotation.JsonProperty("countUsageInSource")
        private Long countUsageInSource;

        /**
         * The label source usage count.
         *
         * @param countUsageInSource the value to set
         * @return this builder
         */
        public Builder countUsageInSource(Long countUsageInSource) {
            this.countUsageInSource = countUsageInSource;
            this.__explicitlySet__.add("countUsageInSource");
            return this;
        }
        /** The label unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Object id;

        /**
         * The label unique identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(Object id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The label suggestion type. */
        @com.fasterxml.jackson.annotation.JsonProperty("suggestType")
        private Long suggestType;

        /**
         * The label suggestion type.
         *
         * @param suggestType the value to set
         * @return this builder
         */
        public Builder suggestType(Long suggestType) {
            this.suggestType = suggestType;
            this.__explicitlySet__.add("suggestType");
            return this;
        }
        /** The label description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The label description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The label display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The label display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The label edit version. */
        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        /**
         * The label edit version.
         *
         * @param editVersion the value to set
         * @return this builder
         */
        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }
        /** The label impact. */
        @com.fasterxml.jackson.annotation.JsonProperty("impact")
        private String impact;

        /**
         * The label impact.
         *
         * @param impact the value to set
         * @return this builder
         */
        public Builder impact(String impact) {
            this.impact = impact;
            this.__explicitlySet__.add("impact");
            return this;
        }
        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         */
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /** The label name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The label name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The label priority. Default value is NONE. */
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Priority priority;

        /**
         * The label priority. Default value is NONE.
         *
         * @param priority the value to set
         * @return this builder
         */
        public Builder priority(Priority priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /** The label recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        /**
         * The label recommendation.
         *
         * @param recommendation the value to set
         * @return this builder
         */
        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }
        /** The label type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Long type;

        /**
         * The label type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Long type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** A flag indicating whether or not the label has been deleted. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
        private Boolean isUserDeleted;

        /**
         * A flag indicating whether or not the label has been deleted.
         *
         * @param isUserDeleted the value to set
         * @return this builder
         */
        public Builder isUserDeleted(Boolean isUserDeleted) {
            this.isUserDeleted = isUserDeleted;
            this.__explicitlySet__.add("isUserDeleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsLabelView build() {
            LogAnalyticsLabelView model =
                    new LogAnalyticsLabelView(
                            this.aliases,
                            this.countUsageInAlertRule,
                            this.countUsageInSource,
                            this.id,
                            this.suggestType,
                            this.description,
                            this.displayName,
                            this.editVersion,
                            this.impact,
                            this.isSystem,
                            this.name,
                            this.priority,
                            this.recommendation,
                            this.type,
                            this.isUserDeleted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsLabelView model) {
            if (model.wasPropertyExplicitlySet("aliases")) {
                this.aliases(model.getAliases());
            }
            if (model.wasPropertyExplicitlySet("countUsageInAlertRule")) {
                this.countUsageInAlertRule(model.getCountUsageInAlertRule());
            }
            if (model.wasPropertyExplicitlySet("countUsageInSource")) {
                this.countUsageInSource(model.getCountUsageInSource());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("suggestType")) {
                this.suggestType(model.getSuggestType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("editVersion")) {
                this.editVersion(model.getEditVersion());
            }
            if (model.wasPropertyExplicitlySet("impact")) {
                this.impact(model.getImpact());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("recommendation")) {
                this.recommendation(model.getRecommendation());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isUserDeleted")) {
                this.isUserDeleted(model.getIsUserDeleted());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** An arrya of label aliases. */
    @com.fasterxml.jackson.annotation.JsonProperty("aliases")
    private final java.util.List<LogAnalyticsLabelAlias> aliases;

    /**
     * An arrya of label aliases.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsLabelAlias> getAliases() {
        return aliases;
    }

    /** The label alert rule usage count. */
    @com.fasterxml.jackson.annotation.JsonProperty("countUsageInAlertRule")
    private final Long countUsageInAlertRule;

    /**
     * The label alert rule usage count.
     *
     * @return the value
     */
    public Long getCountUsageInAlertRule() {
        return countUsageInAlertRule;
    }

    /** The label source usage count. */
    @com.fasterxml.jackson.annotation.JsonProperty("countUsageInSource")
    private final Long countUsageInSource;

    /**
     * The label source usage count.
     *
     * @return the value
     */
    public Long getCountUsageInSource() {
        return countUsageInSource;
    }

    /** The label unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Object id;

    /**
     * The label unique identifier.
     *
     * @return the value
     */
    public Object getId() {
        return id;
    }

    /** The label suggestion type. */
    @com.fasterxml.jackson.annotation.JsonProperty("suggestType")
    private final Long suggestType;

    /**
     * The label suggestion type.
     *
     * @return the value
     */
    public Long getSuggestType() {
        return suggestType;
    }

    /** The label description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The label description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The label display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The label display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The label edit version. */
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    /**
     * The label edit version.
     *
     * @return the value
     */
    public Long getEditVersion() {
        return editVersion;
    }

    /** The label impact. */
    @com.fasterxml.jackson.annotation.JsonProperty("impact")
    private final String impact;

    /**
     * The label impact.
     *
     * @return the value
     */
    public String getImpact() {
        return impact;
    }

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     *
     * @return the value
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    /** The label name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The label name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The label priority. Default value is NONE. */
    public enum Priority implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The label priority. Default value is NONE. */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Priority priority;

    /**
     * The label priority. Default value is NONE.
     *
     * @return the value
     */
    public Priority getPriority() {
        return priority;
    }

    /** The label recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    private final String recommendation;

    /**
     * The label recommendation.
     *
     * @return the value
     */
    public String getRecommendation() {
        return recommendation;
    }

    /** The label type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Long type;

    /**
     * The label type.
     *
     * @return the value
     */
    public Long getType() {
        return type;
    }

    /** A flag indicating whether or not the label has been deleted. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUserDeleted")
    private final Boolean isUserDeleted;

    /**
     * A flag indicating whether or not the label has been deleted.
     *
     * @return the value
     */
    public Boolean getIsUserDeleted() {
        return isUserDeleted;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsLabelView(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
