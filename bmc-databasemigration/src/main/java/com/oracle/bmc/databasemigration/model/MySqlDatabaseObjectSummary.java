/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Database objects to include or exclude from migration <br>
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
        builder = MySqlDatabaseObjectSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlDatabaseObjectSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"objectStatus", "schema", "objectName", "type"})
    public MySqlDatabaseObjectSummary(
            ObjectStatus objectStatus, String schema, String objectName, String type) {
        super();
        this.objectStatus = objectStatus;
        this.schema = schema;
        this.objectName = objectName;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Object status. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private ObjectStatus objectStatus;

        /**
         * Object status.
         *
         * @param objectStatus the value to set
         * @return this builder
         */
        public Builder objectStatus(ObjectStatus objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }
        /** Schema of the object (regular expression is allowed) */
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        /**
         * Schema of the object (regular expression is allowed)
         *
         * @param schema the value to set
         * @return this builder
         */
        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /** Name of the object (regular expression is allowed) */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * Name of the object (regular expression is allowed)
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * Type of object to exclude. If not specified, matching owners and object names of type
         * TABLE would be excluded.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of object to exclude. If not specified, matching owners and object names of type
         * TABLE would be excluded.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlDatabaseObjectSummary build() {
            MySqlDatabaseObjectSummary model =
                    new MySqlDatabaseObjectSummary(
                            this.objectStatus, this.schema, this.objectName, this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlDatabaseObjectSummary model) {
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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

    /** Object status. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final ObjectStatus objectStatus;

    /**
     * Object status.
     *
     * @return the value
     */
    public ObjectStatus getObjectStatus() {
        return objectStatus;
    }

    /** Schema of the object (regular expression is allowed) */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * Schema of the object (regular expression is allowed)
     *
     * @return the value
     */
    public String getSchema() {
        return schema;
    }

    /** Name of the object (regular expression is allowed) */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * Name of the object (regular expression is allowed)
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Type of object to exclude. If not specified, matching owners and object names of type TABLE
     * would be excluded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of object to exclude. If not specified, matching owners and object names of type TABLE
     * would be excluded.
     *
     * @return the value
     */
    public String getType() {
        return type;
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
        sb.append("MySqlDatabaseObjectSummary(");
        sb.append("super=").append(super.toString());
        sb.append("objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlDatabaseObjectSummary)) {
            return false;
        }

        MySqlDatabaseObjectSummary other = (MySqlDatabaseObjectSummary) o;
        return java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
