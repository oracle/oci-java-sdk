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
        builder = CreateSubsettingSchemaRelationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSubsettingSchemaRelationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "parentObjectKey",
        "parentSchemaName",
        "parentObjectName",
        "parentColumns",
        "childObjectKey",
        "childSchemaName",
        "childObjectName",
        "childColumns"
    })
    public CreateSubsettingSchemaRelationDetails(
            String parentObjectKey,
            String parentSchemaName,
            String parentObjectName,
            java.util.List<String> parentColumns,
            String childObjectKey,
            String childSchemaName,
            String childObjectName,
            java.util.List<String> childColumns) {
        super();
        this.parentObjectKey = parentObjectKey;
        this.parentSchemaName = parentSchemaName;
        this.parentObjectName = parentObjectName;
        this.parentColumns = parentColumns;
        this.childObjectKey = childObjectKey;
        this.childSchemaName = childSchemaName;
        this.childObjectName = childObjectName;
        this.childColumns = childColumns;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSubsettingSchemaRelationDetails build() {
            CreateSubsettingSchemaRelationDetails model =
                    new CreateSubsettingSchemaRelationDetails(
                            this.parentObjectKey,
                            this.parentSchemaName,
                            this.parentObjectName,
                            this.parentColumns,
                            this.childObjectKey,
                            this.childSchemaName,
                            this.childObjectName,
                            this.childColumns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSubsettingSchemaRelationDetails model) {
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
        sb.append("CreateSubsettingSchemaRelationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("parentObjectKey=").append(String.valueOf(this.parentObjectKey));
        sb.append(", parentSchemaName=").append(String.valueOf(this.parentSchemaName));
        sb.append(", parentObjectName=").append(String.valueOf(this.parentObjectName));
        sb.append(", parentColumns=").append(String.valueOf(this.parentColumns));
        sb.append(", childObjectKey=").append(String.valueOf(this.childObjectKey));
        sb.append(", childSchemaName=").append(String.valueOf(this.childSchemaName));
        sb.append(", childObjectName=").append(String.valueOf(this.childObjectName));
        sb.append(", childColumns=").append(String.valueOf(this.childColumns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSubsettingSchemaRelationDetails)) {
            return false;
        }

        CreateSubsettingSchemaRelationDetails other = (CreateSubsettingSchemaRelationDetails) o;
        return java.util.Objects.equals(this.parentObjectKey, other.parentObjectKey)
                && java.util.Objects.equals(this.parentSchemaName, other.parentSchemaName)
                && java.util.Objects.equals(this.parentObjectName, other.parentObjectName)
                && java.util.Objects.equals(this.parentColumns, other.parentColumns)
                && java.util.Objects.equals(this.childObjectKey, other.childObjectKey)
                && java.util.Objects.equals(this.childSchemaName, other.childSchemaName)
                && java.util.Objects.equals(this.childObjectName, other.childObjectName)
                && java.util.Objects.equals(this.childColumns, other.childColumns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
