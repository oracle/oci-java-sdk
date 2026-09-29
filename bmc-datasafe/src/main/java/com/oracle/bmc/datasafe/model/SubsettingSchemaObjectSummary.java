/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a table included in the schema for a subsetting policy <br>
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
        builder = SubsettingSchemaObjectSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubsettingSchemaObjectSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "schemaName",
        "objectName",
        "objectType",
        "initialRowCount",
        "isStatsStale",
        "timeCreated",
        "timeUpdated"
    })
    public SubsettingSchemaObjectSummary(
            String key,
            String schemaName,
            String objectName,
            ObjectType objectType,
            Long initialRowCount,
            Boolean isStatsStale,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.key = key;
        this.schemaName = schemaName;
        this.objectName = objectName;
        this.objectType = objectType;
        this.initialRowCount = initialRowCount;
        this.isStatsStale = isStatsStale;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key that identifies a subsetting table. The key is numeric and unique within a
         * subsetting policy
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key that identifies a subsetting table. The key is numeric and unique within a
         * subsetting policy
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The database schema that contains the subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The database schema that contains the subsetting table
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** The name of the database object */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the database object
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** The type of the database object that contains the subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        /**
         * The type of the database object that contains the subsetting table
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** The initial number of rows in this object/table */
        @com.fasterxml.jackson.annotation.JsonProperty("initialRowCount")
        private Long initialRowCount;

        /**
         * The initial number of rows in this object/table
         *
         * @param initialRowCount the value to set
         * @return this builder
         */
        public Builder initialRowCount(Long initialRowCount) {
            this.initialRowCount = initialRowCount;
            this.__explicitlySet__.add("initialRowCount");
            return this;
        }
        /**
         * Indicates if the table stats are stale. This can be used to judge the accuracy of
         * initialRowCount
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStatsStale")
        private Boolean isStatsStale;

        /**
         * Indicates if the table stats are stale. This can be used to judge the accuracy of
         * initialRowCount
         *
         * @param isStatsStale the value to set
         * @return this builder
         */
        public Builder isStatsStale(Boolean isStatsStale) {
            this.isStatsStale = isStatsStale;
            this.__explicitlySet__.add("isStatsStale");
            return this;
        }
        /**
         * The date and time the subsetting table was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the subsetting table was created, in the format defined by
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
         * The date and time the subsetting table was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the subsetting table was last updated, in the format defined by
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

        public SubsettingSchemaObjectSummary build() {
            SubsettingSchemaObjectSummary model =
                    new SubsettingSchemaObjectSummary(
                            this.key,
                            this.schemaName,
                            this.objectName,
                            this.objectType,
                            this.initialRowCount,
                            this.isStatsStale,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubsettingSchemaObjectSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("initialRowCount")) {
                this.initialRowCount(model.getInitialRowCount());
            }
            if (model.wasPropertyExplicitlySet("isStatsStale")) {
                this.isStatsStale(model.getIsStatsStale());
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
     * The unique key that identifies a subsetting table. The key is numeric and unique within a
     * subsetting policy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key that identifies a subsetting table. The key is numeric and unique within a
     * subsetting policy
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The database schema that contains the subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The database schema that contains the subsetting table
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** The name of the database object */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the database object
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The type of the database object that contains the subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

    /**
     * The type of the database object that contains the subsetting table
     *
     * @return the value
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /** The initial number of rows in this object/table */
    @com.fasterxml.jackson.annotation.JsonProperty("initialRowCount")
    private final Long initialRowCount;

    /**
     * The initial number of rows in this object/table
     *
     * @return the value
     */
    public Long getInitialRowCount() {
        return initialRowCount;
    }

    /**
     * Indicates if the table stats are stale. This can be used to judge the accuracy of
     * initialRowCount
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStatsStale")
    private final Boolean isStatsStale;

    /**
     * Indicates if the table stats are stale. This can be used to judge the accuracy of
     * initialRowCount
     *
     * @return the value
     */
    public Boolean getIsStatsStale() {
        return isStatsStale;
    }

    /**
     * The date and time the subsetting table was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the subsetting table was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the subsetting table was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the subsetting table was last updated, in the format defined by
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
        sb.append("SubsettingSchemaObjectSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", initialRowCount=").append(String.valueOf(this.initialRowCount));
        sb.append(", isStatsStale=").append(String.valueOf(this.isStatsStale));
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
        if (!(o instanceof SubsettingSchemaObjectSummary)) {
            return false;
        }

        SubsettingSchemaObjectSummary other = (SubsettingSchemaObjectSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.initialRowCount, other.initialRowCount)
                && java.util.Objects.equals(this.isStatsStale, other.isStatsStale)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result =
                (result * PRIME)
                        + (this.initialRowCount == null ? 43 : this.initialRowCount.hashCode());
        result = (result * PRIME) + (this.isStatsStale == null ? 43 : this.isStatsStale.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
