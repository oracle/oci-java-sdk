/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalytics label <br>
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
        builder = LogAnalyticsLabel.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsLabel
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "aliases",
        "countUsageInSource",
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
    public LogAnalyticsLabel(
            java.util.List<LogAnalyticsLabelAlias> aliases,
            Long countUsageInSource,
            Long suggestType,
            String description,
            String displayName,
            Long editVersion,
            String impact,
            Boolean isSystem,
            String name,
            Priority priority,
            String recommendation,
            Type type,
            Boolean isUserDeleted) {
        super();
        this.aliases = aliases;
        this.countUsageInSource = countUsageInSource;
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
        /** An array of label aliases. */
        @com.fasterxml.jackson.annotation.JsonProperty("aliases")
        private java.util.List<LogAnalyticsLabelAlias> aliases;

        /**
         * An array of label aliases.
         *
         * @param aliases the value to set
         * @return this builder
         */
        public Builder aliases(java.util.List<LogAnalyticsLabelAlias> aliases) {
            this.aliases = aliases;
            this.__explicitlySet__.add("aliases");
            return this;
        }
        /** The source usage count for this label. */
        @com.fasterxml.jackson.annotation.JsonProperty("countUsageInSource")
        private Long countUsageInSource;

        /**
         * The source usage count for this label.
         *
         * @param countUsageInSource the value to set
         * @return this builder
         */
        public Builder countUsageInSource(Long countUsageInSource) {
            this.countUsageInSource = countUsageInSource;
            this.__explicitlySet__.add("countUsageInSource");
            return this;
        }
        /** The type of suggestion for label usage. */
        @com.fasterxml.jackson.annotation.JsonProperty("suggestType")
        private Long suggestType;

        /**
         * The type of suggestion for label usage.
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
         * The system flag. A value of false denotes a custom, or user defined label. A value of
         * true denotes a built in label.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag. A value of false denotes a custom, or user defined label. A value of
         * true denotes a built in label.
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
        /** The label priority. Valid values are (NONE, LOW, HIGH). NONE is default. */
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Priority priority;

        /**
         * The label priority. Valid values are (NONE, LOW, HIGH). NONE is default.
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
        /** The label type. Valid values are (INFO, PROBLEM). INFO is default. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The label type. Valid values are (INFO, PROBLEM). INFO is default.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
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

        public LogAnalyticsLabel build() {
            LogAnalyticsLabel model =
                    new LogAnalyticsLabel(
                            this.aliases,
                            this.countUsageInSource,
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
        public Builder copy(LogAnalyticsLabel model) {
            if (model.wasPropertyExplicitlySet("aliases")) {
                this.aliases(model.getAliases());
            }
            if (model.wasPropertyExplicitlySet("countUsageInSource")) {
                this.countUsageInSource(model.getCountUsageInSource());
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

    /** An array of label aliases. */
    @com.fasterxml.jackson.annotation.JsonProperty("aliases")
    private final java.util.List<LogAnalyticsLabelAlias> aliases;

    /**
     * An array of label aliases.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsLabelAlias> getAliases() {
        return aliases;
    }

    /** The source usage count for this label. */
    @com.fasterxml.jackson.annotation.JsonProperty("countUsageInSource")
    private final Long countUsageInSource;

    /**
     * The source usage count for this label.
     *
     * @return the value
     */
    public Long getCountUsageInSource() {
        return countUsageInSource;
    }

    /** The type of suggestion for label usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("suggestType")
    private final Long suggestType;

    /**
     * The type of suggestion for label usage.
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
     * The system flag. A value of false denotes a custom, or user defined label. A value of true
     * denotes a built in label.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag. A value of false denotes a custom, or user defined label. A value of true
     * denotes a built in label.
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

    /** The label priority. Valid values are (NONE, LOW, HIGH). NONE is default. */
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
    /** The label priority. Valid values are (NONE, LOW, HIGH). NONE is default. */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Priority priority;

    /**
     * The label priority. Valid values are (NONE, LOW, HIGH). NONE is default.
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

    /** The label type. Valid values are (INFO, PROBLEM). INFO is default. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Info("INFO"),
        Problem("PROBLEM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The label type. Valid values are (INFO, PROBLEM). INFO is default. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The label type. Valid values are (INFO, PROBLEM). INFO is default.
     *
     * @return the value
     */
    public Type getType() {
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
        sb.append("LogAnalyticsLabel(");
        sb.append("super=").append(super.toString());
        sb.append("aliases=").append(String.valueOf(this.aliases));
        sb.append(", countUsageInSource=").append(String.valueOf(this.countUsageInSource));
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
        if (!(o instanceof LogAnalyticsLabel)) {
            return false;
        }

        LogAnalyticsLabel other = (LogAnalyticsLabel) o;
        return java.util.Objects.equals(this.aliases, other.aliases)
                && java.util.Objects.equals(this.countUsageInSource, other.countUsageInSource)
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
                        + (this.countUsageInSource == null
                                ? 43
                                : this.countUsageInSource.hashCode());
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
