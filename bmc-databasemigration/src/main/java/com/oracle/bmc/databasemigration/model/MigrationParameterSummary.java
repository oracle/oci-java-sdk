/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration parameter response object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MigrationParameterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MigrationParameterSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseCombination",
        "displayName",
        "docUrlLink",
        "description",
        "categoryName",
        "categoryDisplayName",
        "migrationType",
        "defaultValue",
        "minValue",
        "maxValue",
        "hintText",
        "name",
        "dataType"
    })
    public MigrationParameterSummary(
            DatabaseCombination databaseCombination,
            String displayName,
            String docUrlLink,
            String description,
            String categoryName,
            String categoryDisplayName,
            MigrationTypes migrationType,
            String defaultValue,
            Float minValue,
            Float maxValue,
            String hintText,
            String name,
            AdvancedParameterDataTypes dataType) {
        super();
        this.databaseCombination = databaseCombination;
        this.displayName = displayName;
        this.docUrlLink = docUrlLink;
        this.description = description;
        this.categoryName = categoryName;
        this.categoryDisplayName = categoryDisplayName;
        this.migrationType = migrationType;
        this.defaultValue = defaultValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.hintText = hintText;
        this.name = name;
        this.dataType = dataType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The combination of source and target databases participating in a migration. Example:
         * ORACLE means the migration is meant for migrating Oracle source and target databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseCombination")
        private DatabaseCombination databaseCombination;

        /**
         * The combination of source and target databases participating in a migration. Example:
         * ORACLE means the migration is meant for migrating Oracle source and target databases.
         *
         * @param databaseCombination the value to set
         * @return this builder
         */
        public Builder databaseCombination(DatabaseCombination databaseCombination) {
            this.databaseCombination = databaseCombination;
            this.__explicitlySet__.add("databaseCombination");
            return this;
        }
        /** Parameter display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Parameter display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Parameter documentation URL link. */
        @com.fasterxml.jackson.annotation.JsonProperty("docUrlLink")
        private String docUrlLink;

        /**
         * Parameter documentation URL link.
         *
         * @param docUrlLink the value to set
         * @return this builder
         */
        public Builder docUrlLink(String docUrlLink) {
            this.docUrlLink = docUrlLink;
            this.__explicitlySet__.add("docUrlLink");
            return this;
        }
        /** Parameter name description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Parameter name description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Parameter category name. */
        @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
        private String categoryName;

        /**
         * Parameter category name.
         *
         * @param categoryName the value to set
         * @return this builder
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            this.__explicitlySet__.add("categoryName");
            return this;
        }
        /** Parameter category display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayName")
        private String categoryDisplayName;

        /**
         * Parameter category display name.
         *
         * @param categoryDisplayName the value to set
         * @return this builder
         */
        public Builder categoryDisplayName(String categoryDisplayName) {
            this.categoryDisplayName = categoryDisplayName;
            this.__explicitlySet__.add("categoryDisplayName");
            return this;
        }
        /** Migration Stage. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrationType")
        private MigrationTypes migrationType;

        /**
         * Migration Stage.
         *
         * @param migrationType the value to set
         * @return this builder
         */
        public Builder migrationType(MigrationTypes migrationType) {
            this.migrationType = migrationType;
            this.__explicitlySet__.add("migrationType");
            return this;
        }
        /** Default value for a parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * Default value for a parameter.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** Parameter minimum value. */
        @com.fasterxml.jackson.annotation.JsonProperty("minValue")
        private Float minValue;

        /**
         * Parameter minimum value.
         *
         * @param minValue the value to set
         * @return this builder
         */
        public Builder minValue(Float minValue) {
            this.minValue = minValue;
            this.__explicitlySet__.add("minValue");
            return this;
        }
        /** Parameter maximum value. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
        private Float maxValue;

        /**
         * Parameter maximum value.
         *
         * @param maxValue the value to set
         * @return this builder
         */
        public Builder maxValue(Float maxValue) {
            this.maxValue = maxValue;
            this.__explicitlySet__.add("maxValue");
            return this;
        }
        /** Hint text for parameter value. */
        @com.fasterxml.jackson.annotation.JsonProperty("hintText")
        private String hintText;

        /**
         * Hint text for parameter value.
         *
         * @param hintText the value to set
         * @return this builder
         */
        public Builder hintText(String hintText) {
            this.hintText = hintText;
            this.__explicitlySet__.add("hintText");
            return this;
        }
        /** Parameter name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Parameter name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Parameter data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private AdvancedParameterDataTypes dataType;

        /**
         * Parameter data type.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(AdvancedParameterDataTypes dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationParameterSummary build() {
            MigrationParameterSummary model =
                    new MigrationParameterSummary(
                            this.databaseCombination,
                            this.displayName,
                            this.docUrlLink,
                            this.description,
                            this.categoryName,
                            this.categoryDisplayName,
                            this.migrationType,
                            this.defaultValue,
                            this.minValue,
                            this.maxValue,
                            this.hintText,
                            this.name,
                            this.dataType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationParameterSummary model) {
            if (model.wasPropertyExplicitlySet("databaseCombination")) {
                this.databaseCombination(model.getDatabaseCombination());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("docUrlLink")) {
                this.docUrlLink(model.getDocUrlLink());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("categoryName")) {
                this.categoryName(model.getCategoryName());
            }
            if (model.wasPropertyExplicitlySet("categoryDisplayName")) {
                this.categoryDisplayName(model.getCategoryDisplayName());
            }
            if (model.wasPropertyExplicitlySet("migrationType")) {
                this.migrationType(model.getMigrationType());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("minValue")) {
                this.minValue(model.getMinValue());
            }
            if (model.wasPropertyExplicitlySet("maxValue")) {
                this.maxValue(model.getMaxValue());
            }
            if (model.wasPropertyExplicitlySet("hintText")) {
                this.hintText(model.getHintText());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
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

    /**
     * The combination of source and target databases participating in a migration. Example: ORACLE
     * means the migration is meant for migrating Oracle source and target databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseCombination")
    private final DatabaseCombination databaseCombination;

    /**
     * The combination of source and target databases participating in a migration. Example: ORACLE
     * means the migration is meant for migrating Oracle source and target databases.
     *
     * @return the value
     */
    public DatabaseCombination getDatabaseCombination() {
        return databaseCombination;
    }

    /** Parameter display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Parameter display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Parameter documentation URL link. */
    @com.fasterxml.jackson.annotation.JsonProperty("docUrlLink")
    private final String docUrlLink;

    /**
     * Parameter documentation URL link.
     *
     * @return the value
     */
    public String getDocUrlLink() {
        return docUrlLink;
    }

    /** Parameter name description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Parameter name description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Parameter category name. */
    @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
    private final String categoryName;

    /**
     * Parameter category name.
     *
     * @return the value
     */
    public String getCategoryName() {
        return categoryName;
    }

    /** Parameter category display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayName")
    private final String categoryDisplayName;

    /**
     * Parameter category display name.
     *
     * @return the value
     */
    public String getCategoryDisplayName() {
        return categoryDisplayName;
    }

    /** Migration Stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationType")
    private final MigrationTypes migrationType;

    /**
     * Migration Stage.
     *
     * @return the value
     */
    public MigrationTypes getMigrationType() {
        return migrationType;
    }

    /** Default value for a parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * Default value for a parameter.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** Parameter minimum value. */
    @com.fasterxml.jackson.annotation.JsonProperty("minValue")
    private final Float minValue;

    /**
     * Parameter minimum value.
     *
     * @return the value
     */
    public Float getMinValue() {
        return minValue;
    }

    /** Parameter maximum value. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
    private final Float maxValue;

    /**
     * Parameter maximum value.
     *
     * @return the value
     */
    public Float getMaxValue() {
        return maxValue;
    }

    /** Hint text for parameter value. */
    @com.fasterxml.jackson.annotation.JsonProperty("hintText")
    private final String hintText;

    /**
     * Hint text for parameter value.
     *
     * @return the value
     */
    public String getHintText() {
        return hintText;
    }

    /** Parameter name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Parameter name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Parameter data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final AdvancedParameterDataTypes dataType;

    /**
     * Parameter data type.
     *
     * @return the value
     */
    public AdvancedParameterDataTypes getDataType() {
        return dataType;
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
        sb.append("MigrationParameterSummary(");
        sb.append("super=").append(super.toString());
        sb.append("databaseCombination=").append(String.valueOf(this.databaseCombination));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", docUrlLink=").append(String.valueOf(this.docUrlLink));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", categoryName=").append(String.valueOf(this.categoryName));
        sb.append(", categoryDisplayName=").append(String.valueOf(this.categoryDisplayName));
        sb.append(", migrationType=").append(String.valueOf(this.migrationType));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", minValue=").append(String.valueOf(this.minValue));
        sb.append(", maxValue=").append(String.valueOf(this.maxValue));
        sb.append(", hintText=").append(String.valueOf(this.hintText));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationParameterSummary)) {
            return false;
        }

        MigrationParameterSummary other = (MigrationParameterSummary) o;
        return java.util.Objects.equals(this.databaseCombination, other.databaseCombination)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.docUrlLink, other.docUrlLink)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.categoryName, other.categoryName)
                && java.util.Objects.equals(this.categoryDisplayName, other.categoryDisplayName)
                && java.util.Objects.equals(this.migrationType, other.migrationType)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.minValue, other.minValue)
                && java.util.Objects.equals(this.maxValue, other.maxValue)
                && java.util.Objects.equals(this.hintText, other.hintText)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseCombination == null
                                ? 43
                                : this.databaseCombination.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.docUrlLink == null ? 43 : this.docUrlLink.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.categoryName == null ? 43 : this.categoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.categoryDisplayName == null
                                ? 43
                                : this.categoryDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.migrationType == null ? 43 : this.migrationType.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.minValue == null ? 43 : this.minValue.hashCode());
        result = (result * PRIME) + (this.maxValue == null ? 43 : this.maxValue.hashCode());
        result = (result * PRIME) + (this.hintText == null ? 43 : this.hintText.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
