/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsMetaSourceType <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsMetaSourceType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsMetaSourceType
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "builtInParserName",
        "description",
        "displayName",
        "entityDisplayName",
        "entityName",
        "name",
        "maximumExcludePattern",
        "maximumIncludePattern"
    })
    public LogAnalyticsMetaSourceType(
            String builtInParserName,
            String description,
            String displayName,
            String entityDisplayName,
            String entityName,
            String name,
            Long maximumExcludePattern,
            Long maximumIncludePattern) {
        super();
        this.builtInParserName = builtInParserName;
        this.description = description;
        this.displayName = displayName;
        this.entityDisplayName = entityDisplayName;
        this.entityName = entityName;
        this.name = name;
        this.maximumExcludePattern = maximumExcludePattern;
        this.maximumIncludePattern = maximumIncludePattern;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The built in parser name. */
        @com.fasterxml.jackson.annotation.JsonProperty("builtInParserName")
        private String builtInParserName;

        /**
         * The built in parser name.
         *
         * @param builtInParserName the value to set
         * @return this builder
         */
        public Builder builtInParserName(String builtInParserName) {
            this.builtInParserName = builtInParserName;
            this.__explicitlySet__.add("builtInParserName");
            return this;
        }
        /** The source type description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The source type description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The source type display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The source type display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The entity display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityDisplayName")
        private String entityDisplayName;

        /**
         * The entity display name.
         *
         * @param entityDisplayName the value to set
         * @return this builder
         */
        public Builder entityDisplayName(String entityDisplayName) {
            this.entityDisplayName = entityDisplayName;
            this.__explicitlySet__.add("entityDisplayName");
            return this;
        }
        /** The entity internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * The entity internal name.
         *
         * @param entityName the value to set
         * @return this builder
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /** The source type name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The source type name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The maximum exclude pattern. */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumExcludePattern")
        private Long maximumExcludePattern;

        /**
         * The maximum exclude pattern.
         *
         * @param maximumExcludePattern the value to set
         * @return this builder
         */
        public Builder maximumExcludePattern(Long maximumExcludePattern) {
            this.maximumExcludePattern = maximumExcludePattern;
            this.__explicitlySet__.add("maximumExcludePattern");
            return this;
        }
        /** The maximum include pattern. */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumIncludePattern")
        private Long maximumIncludePattern;

        /**
         * The maximum include pattern.
         *
         * @param maximumIncludePattern the value to set
         * @return this builder
         */
        public Builder maximumIncludePattern(Long maximumIncludePattern) {
            this.maximumIncludePattern = maximumIncludePattern;
            this.__explicitlySet__.add("maximumIncludePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsMetaSourceType build() {
            LogAnalyticsMetaSourceType model =
                    new LogAnalyticsMetaSourceType(
                            this.builtInParserName,
                            this.description,
                            this.displayName,
                            this.entityDisplayName,
                            this.entityName,
                            this.name,
                            this.maximumExcludePattern,
                            this.maximumIncludePattern);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsMetaSourceType model) {
            if (model.wasPropertyExplicitlySet("builtInParserName")) {
                this.builtInParserName(model.getBuiltInParserName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("entityDisplayName")) {
                this.entityDisplayName(model.getEntityDisplayName());
            }
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("maximumExcludePattern")) {
                this.maximumExcludePattern(model.getMaximumExcludePattern());
            }
            if (model.wasPropertyExplicitlySet("maximumIncludePattern")) {
                this.maximumIncludePattern(model.getMaximumIncludePattern());
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

    /** The built in parser name. */
    @com.fasterxml.jackson.annotation.JsonProperty("builtInParserName")
    private final String builtInParserName;

    /**
     * The built in parser name.
     *
     * @return the value
     */
    public String getBuiltInParserName() {
        return builtInParserName;
    }

    /** The source type description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The source type description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The source type display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The source type display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The entity display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityDisplayName")
    private final String entityDisplayName;

    /**
     * The entity display name.
     *
     * @return the value
     */
    public String getEntityDisplayName() {
        return entityDisplayName;
    }

    /** The entity internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * The entity internal name.
     *
     * @return the value
     */
    public String getEntityName() {
        return entityName;
    }

    /** The source type name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The source type name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The maximum exclude pattern. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumExcludePattern")
    private final Long maximumExcludePattern;

    /**
     * The maximum exclude pattern.
     *
     * @return the value
     */
    public Long getMaximumExcludePattern() {
        return maximumExcludePattern;
    }

    /** The maximum include pattern. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumIncludePattern")
    private final Long maximumIncludePattern;

    /**
     * The maximum include pattern.
     *
     * @return the value
     */
    public Long getMaximumIncludePattern() {
        return maximumIncludePattern;
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
        sb.append("LogAnalyticsMetaSourceType(");
        sb.append("super=").append(super.toString());
        sb.append("builtInParserName=").append(String.valueOf(this.builtInParserName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", entityDisplayName=").append(String.valueOf(this.entityDisplayName));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", maximumExcludePattern=").append(String.valueOf(this.maximumExcludePattern));
        sb.append(", maximumIncludePattern=").append(String.valueOf(this.maximumIncludePattern));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsMetaSourceType)) {
            return false;
        }

        LogAnalyticsMetaSourceType other = (LogAnalyticsMetaSourceType) o;
        return java.util.Objects.equals(this.builtInParserName, other.builtInParserName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.entityDisplayName, other.entityDisplayName)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.maximumExcludePattern, other.maximumExcludePattern)
                && java.util.Objects.equals(this.maximumIncludePattern, other.maximumIncludePattern)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.builtInParserName == null ? 43 : this.builtInParserName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.entityDisplayName == null ? 43 : this.entityDisplayName.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumExcludePattern == null
                                ? 43
                                : this.maximumExcludePattern.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumIncludePattern == null
                                ? 43
                                : this.maximumIncludePattern.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
