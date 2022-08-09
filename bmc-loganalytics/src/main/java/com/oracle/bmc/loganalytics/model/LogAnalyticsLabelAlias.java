/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Label alias mapping view
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
    builder = LogAnalyticsLabelAlias.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsLabelAlias
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "alias",
        "aliasDisplayName",
        "isSystem",
        "displayName",
        "name",
        "priority"
    })
    public LogAnalyticsLabelAlias(
            String alias,
            String aliasDisplayName,
            Boolean isSystem,
            String displayName,
            String name,
            Priority priority) {
        super();
        this.alias = alias;
        this.aliasDisplayName = aliasDisplayName;
        this.isSystem = isSystem;
        this.displayName = displayName;
        this.name = name;
        this.priority = priority;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The alias.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * The alias.
         * @param alias the value to set
         * @return this builder
         **/
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }
        /**
         * The alias display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aliasDisplayName")
        private String aliasDisplayName;

        /**
         * The alias display name.
         * @param aliasDisplayName the value to set
         * @return this builder
         **/
        public Builder aliasDisplayName(String aliasDisplayName) {
            this.aliasDisplayName = aliasDisplayName;
            this.__explicitlySet__.add("aliasDisplayName");
            return this;
        }
        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         **/
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /**
         * The label display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The label display name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The label name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The label name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The label priority. Default value is NONE.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Priority priority;

        /**
         * The label priority. Default value is NONE.
         * @param priority the value to set
         * @return this builder
         **/
        public Builder priority(Priority priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsLabelAlias build() {
            LogAnalyticsLabelAlias model =
                    new LogAnalyticsLabelAlias(
                            this.alias,
                            this.aliasDisplayName,
                            this.isSystem,
                            this.displayName,
                            this.name,
                            this.priority);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsLabelAlias model) {
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            if (model.wasPropertyExplicitlySet("aliasDisplayName")) {
                this.aliasDisplayName(model.getAliasDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            return this;
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
     * The alias.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * The alias.
     * @return the value
     **/
    public String getAlias() {
        return alias;
    }

    /**
     * The alias display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aliasDisplayName")
    private final String aliasDisplayName;

    /**
     * The alias display name.
     * @return the value
     **/
    public String getAliasDisplayName() {
        return aliasDisplayName;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     * @return the value
     **/
    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * The label display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The label display name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The label name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The label name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The label priority. Default value is NONE.
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
     * The label priority. Default value is NONE.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Priority priority;

    /**
     * The label priority. Default value is NONE.
     * @return the value
     **/
    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsLabelAlias(");
        sb.append("super=").append(super.toString());
        sb.append("alias=").append(String.valueOf(this.alias));
        sb.append(", aliasDisplayName=").append(String.valueOf(this.aliasDisplayName));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsLabelAlias)) {
            return false;
        }

        LogAnalyticsLabelAlias other = (LogAnalyticsLabelAlias) o;
        return java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.aliasDisplayName, other.aliasDisplayName)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.priority, other.priority)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result =
                (result * PRIME)
                        + (this.aliasDisplayName == null ? 43 : this.aliasDisplayName.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
