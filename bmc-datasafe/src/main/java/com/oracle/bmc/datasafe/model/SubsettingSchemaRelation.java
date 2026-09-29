/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a relationship between tables in the subsetting for a subsetting policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubsettingSchemaRelation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubsettingSchemaRelation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "parentObjectKey",
        "parentSchemaName",
        "parentObjectName",
        "parentColumns",
        "childObjectKey",
        "childSchemaName",
        "childObjectName",
        "childColumns",
        "relationType",
        "timeCreated",
        "timeUpdated"
    })
    public SubsettingSchemaRelation(
            String key,
            String parentObjectKey,
            String parentSchemaName,
            String parentObjectName,
            java.util.List<String> parentColumns,
            String childObjectKey,
            String childSchemaName,
            String childObjectName,
            java.util.List<String> childColumns,
            RelationType relationType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.key = key;
        this.parentObjectKey = parentObjectKey;
        this.parentSchemaName = parentSchemaName;
        this.parentObjectName = parentObjectName;
        this.parentColumns = parentColumns;
        this.childObjectKey = childObjectKey;
        this.childSchemaName = childSchemaName;
        this.childObjectName = childObjectName;
        this.childColumns = childColumns;
        this.relationType = relationType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key that identifies a relation between subsetting tables. The key is numeric
         * and unique within a subsetting policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key that identifies a relation between subsetting tables. The key is numeric
         * and unique within a subsetting policy.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The key that identifies the parent subsetting table in this relation. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentObjectKey")
        private String parentObjectKey;

        /**
         * The key that identifies the parent subsetting table in this relation.
         *
         * @param parentObjectKey the value to set
         * @return this builder
         */
        public Builder parentObjectKey(String parentObjectKey) {
            this.parentObjectKey = parentObjectKey;
            this.__explicitlySet__.add("parentObjectKey");
            return this;
        }
        /** The database schema that contains the parent subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("parentSchemaName")
        private String parentSchemaName;

        /**
         * The database schema that contains the parent subsetting table
         *
         * @param parentSchemaName the value to set
         * @return this builder
         */
        public Builder parentSchemaName(String parentSchemaName) {
            this.parentSchemaName = parentSchemaName;
            this.__explicitlySet__.add("parentSchemaName");
            return this;
        }
        /** The name of the parent subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("parentObjectName")
        private String parentObjectName;

        /**
         * The name of the parent subsetting table
         *
         * @param parentObjectName the value to set
         * @return this builder
         */
        public Builder parentObjectName(String parentObjectName) {
            this.parentObjectName = parentObjectName;
            this.__explicitlySet__.add("parentObjectName");
            return this;
        }
        /** Unique identifiers identifying the parents columns in the relation. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentColumns")
        private java.util.List<String> parentColumns;

        /**
         * Unique identifiers identifying the parents columns in the relation.
         *
         * @param parentColumns the value to set
         * @return this builder
         */
        public Builder parentColumns(java.util.List<String> parentColumns) {
            this.parentColumns = parentColumns;
            this.__explicitlySet__.add("parentColumns");
            return this;
        }
        /** The key that identifies the child subsetting table in this relation. */
        @com.fasterxml.jackson.annotation.JsonProperty("childObjectKey")
        private String childObjectKey;

        /**
         * The key that identifies the child subsetting table in this relation.
         *
         * @param childObjectKey the value to set
         * @return this builder
         */
        public Builder childObjectKey(String childObjectKey) {
            this.childObjectKey = childObjectKey;
            this.__explicitlySet__.add("childObjectKey");
            return this;
        }
        /** The database schema that contains the child subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("childSchemaName")
        private String childSchemaName;

        /**
         * The database schema that contains the child subsetting table
         *
         * @param childSchemaName the value to set
         * @return this builder
         */
        public Builder childSchemaName(String childSchemaName) {
            this.childSchemaName = childSchemaName;
            this.__explicitlySet__.add("childSchemaName");
            return this;
        }
        /** The name of the child subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("childObjectName")
        private String childObjectName;

        /**
         * The name of the child subsetting table
         *
         * @param childObjectName the value to set
         * @return this builder
         */
        public Builder childObjectName(String childObjectName) {
            this.childObjectName = childObjectName;
            this.__explicitlySet__.add("childObjectName");
            return this;
        }
        /** Unique identifiers identifying the child columns in the relation. */
        @com.fasterxml.jackson.annotation.JsonProperty("childColumns")
        private java.util.List<String> childColumns;

        /**
         * Unique identifiers identifying the child columns in the relation.
         *
         * @param childColumns the value to set
         * @return this builder
         */
        public Builder childColumns(java.util.List<String> childColumns) {
            this.childColumns = childColumns;
            this.__explicitlySet__.add("childColumns");
            return this;
        }
        /**
         * The type of referential relationship the column has with its parent. NONE indicates that
         * the sensitive column does not have a parent. DB_DEFINED indicates that the relationship
         * is defined in the database dictionary. APP_DEFINED indicates that the relationship is
         * defined at the application level and not in the database dictionary.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("relationType")
        private RelationType relationType;

        /**
         * The type of referential relationship the column has with its parent. NONE indicates that
         * the sensitive column does not have a parent. DB_DEFINED indicates that the relationship
         * is defined in the database dictionary. APP_DEFINED indicates that the relationship is
         * defined at the application level and not in the database dictionary.
         *
         * @param relationType the value to set
         * @return this builder
         */
        public Builder relationType(RelationType relationType) {
            this.relationType = relationType;
            this.__explicitlySet__.add("relationType");
            return this;
        }
        /**
         * The date and time the subsetting relation was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the subsetting relation was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the subsetting relation was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the subsetting relation was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubsettingSchemaRelation build() {
            SubsettingSchemaRelation model =
                    new SubsettingSchemaRelation(
                            this.key,
                            this.parentObjectKey,
                            this.parentSchemaName,
                            this.parentObjectName,
                            this.parentColumns,
                            this.childObjectKey,
                            this.childSchemaName,
                            this.childObjectName,
                            this.childColumns,
                            this.relationType,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubsettingSchemaRelation model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("parentObjectKey")) {
                this.parentObjectKey(model.getParentObjectKey());
            }
            if (model.wasPropertyExplicitlySet("parentSchemaName")) {
                this.parentSchemaName(model.getParentSchemaName());
            }
            if (model.wasPropertyExplicitlySet("parentObjectName")) {
                this.parentObjectName(model.getParentObjectName());
            }
            if (model.wasPropertyExplicitlySet("parentColumns")) {
                this.parentColumns(model.getParentColumns());
            }
            if (model.wasPropertyExplicitlySet("childObjectKey")) {
                this.childObjectKey(model.getChildObjectKey());
            }
            if (model.wasPropertyExplicitlySet("childSchemaName")) {
                this.childSchemaName(model.getChildSchemaName());
            }
            if (model.wasPropertyExplicitlySet("childObjectName")) {
                this.childObjectName(model.getChildObjectName());
            }
            if (model.wasPropertyExplicitlySet("childColumns")) {
                this.childColumns(model.getChildColumns());
            }
            if (model.wasPropertyExplicitlySet("relationType")) {
                this.relationType(model.getRelationType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The unique key that identifies a relation between subsetting tables. The key is numeric and
     * unique within a subsetting policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key that identifies a relation between subsetting tables. The key is numeric and
     * unique within a subsetting policy.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The key that identifies the parent subsetting table in this relation. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentObjectKey")
    private final String parentObjectKey;

    /**
     * The key that identifies the parent subsetting table in this relation.
     *
     * @return the value
     */
    public String getParentObjectKey() {
        return parentObjectKey;
    }

    /** The database schema that contains the parent subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("parentSchemaName")
    private final String parentSchemaName;

    /**
     * The database schema that contains the parent subsetting table
     *
     * @return the value
     */
    public String getParentSchemaName() {
        return parentSchemaName;
    }

    /** The name of the parent subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("parentObjectName")
    private final String parentObjectName;

    /**
     * The name of the parent subsetting table
     *
     * @return the value
     */
    public String getParentObjectName() {
        return parentObjectName;
    }

    /** Unique identifiers identifying the parents columns in the relation. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentColumns")
    private final java.util.List<String> parentColumns;

    /**
     * Unique identifiers identifying the parents columns in the relation.
     *
     * @return the value
     */
    public java.util.List<String> getParentColumns() {
        return parentColumns;
    }

    /** The key that identifies the child subsetting table in this relation. */
    @com.fasterxml.jackson.annotation.JsonProperty("childObjectKey")
    private final String childObjectKey;

    /**
     * The key that identifies the child subsetting table in this relation.
     *
     * @return the value
     */
    public String getChildObjectKey() {
        return childObjectKey;
    }

    /** The database schema that contains the child subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("childSchemaName")
    private final String childSchemaName;

    /**
     * The database schema that contains the child subsetting table
     *
     * @return the value
     */
    public String getChildSchemaName() {
        return childSchemaName;
    }

    /** The name of the child subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("childObjectName")
    private final String childObjectName;

    /**
     * The name of the child subsetting table
     *
     * @return the value
     */
    public String getChildObjectName() {
        return childObjectName;
    }

    /** Unique identifiers identifying the child columns in the relation. */
    @com.fasterxml.jackson.annotation.JsonProperty("childColumns")
    private final java.util.List<String> childColumns;

    /**
     * Unique identifiers identifying the child columns in the relation.
     *
     * @return the value
     */
    public java.util.List<String> getChildColumns() {
        return childColumns;
    }

    /**
     * The type of referential relationship the column has with its parent. NONE indicates that the
     * sensitive column does not have a parent. DB_DEFINED indicates that the relationship is
     * defined in the database dictionary. APP_DEFINED indicates that the relationship is defined at
     * the application level and not in the database dictionary.
     */
    public enum RelationType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        AppDefined("APP_DEFINED"),
        DbDefined("DB_DEFINED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RelationType.class);

        private final String value;
        private static java.util.Map<String, RelationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RelationType v : RelationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RelationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RelationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RelationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of referential relationship the column has with its parent. NONE indicates that the
     * sensitive column does not have a parent. DB_DEFINED indicates that the relationship is
     * defined in the database dictionary. APP_DEFINED indicates that the relationship is defined at
     * the application level and not in the database dictionary.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relationType")
    private final RelationType relationType;

    /**
     * The type of referential relationship the column has with its parent. NONE indicates that the
     * sensitive column does not have a parent. DB_DEFINED indicates that the relationship is
     * defined in the database dictionary. APP_DEFINED indicates that the relationship is defined at
     * the application level and not in the database dictionary.
     *
     * @return the value
     */
    public RelationType getRelationType() {
        return relationType;
    }

    /**
     * The date and time the subsetting relation was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the subsetting relation was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the subsetting relation was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the subsetting relation was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("SubsettingSchemaRelation(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", parentObjectKey=").append(String.valueOf(this.parentObjectKey));
        sb.append(", parentSchemaName=").append(String.valueOf(this.parentSchemaName));
        sb.append(", parentObjectName=").append(String.valueOf(this.parentObjectName));
        sb.append(", parentColumns=").append(String.valueOf(this.parentColumns));
        sb.append(", childObjectKey=").append(String.valueOf(this.childObjectKey));
        sb.append(", childSchemaName=").append(String.valueOf(this.childSchemaName));
        sb.append(", childObjectName=").append(String.valueOf(this.childObjectName));
        sb.append(", childColumns=").append(String.valueOf(this.childColumns));
        sb.append(", relationType=").append(String.valueOf(this.relationType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubsettingSchemaRelation)) {
            return false;
        }

        SubsettingSchemaRelation other = (SubsettingSchemaRelation) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.parentObjectKey, other.parentObjectKey)
                && java.util.Objects.equals(this.parentSchemaName, other.parentSchemaName)
                && java.util.Objects.equals(this.parentObjectName, other.parentObjectName)
                && java.util.Objects.equals(this.parentColumns, other.parentColumns)
                && java.util.Objects.equals(this.childObjectKey, other.childObjectKey)
                && java.util.Objects.equals(this.childSchemaName, other.childSchemaName)
                && java.util.Objects.equals(this.childObjectName, other.childObjectName)
                && java.util.Objects.equals(this.childColumns, other.childColumns)
                && java.util.Objects.equals(this.relationType, other.relationType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.parentObjectKey == null ? 43 : this.parentObjectKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentSchemaName == null ? 43 : this.parentSchemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.parentObjectName == null ? 43 : this.parentObjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.parentColumns == null ? 43 : this.parentColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.childObjectKey == null ? 43 : this.childObjectKey.hashCode());
        result =
                (result * PRIME)
                        + (this.childSchemaName == null ? 43 : this.childSchemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.childObjectName == null ? 43 : this.childObjectName.hashCode());
        result = (result * PRIME) + (this.childColumns == null ? 43 : this.childColumns.hashCode());
        result = (result * PRIME) + (this.relationType == null ? 43 : this.relationType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
