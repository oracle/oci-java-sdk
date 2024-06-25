/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
        builder = OracleDatabaseObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OracleDatabaseObject
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "owner",
        "objectName",
        "type",
        "isOmitExcludedTableFromReplication"
    })
    public OracleDatabaseObject(
            String owner,
            String objectName,
            String type,
            Boolean isOmitExcludedTableFromReplication) {
        super();
        this.owner = owner;
        this.objectName = objectName;
        this.type = type;
        this.isOmitExcludedTableFromReplication = isOmitExcludedTableFromReplication;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Owner of the object (regular expression is allowed) */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * Owner of the object (regular expression is allowed)
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
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
        /**
         * Whether an excluded table should be omitted from replication. Only valid for database
         * objects that have are of type TABLE and object status EXCLUDE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOmitExcludedTableFromReplication")
        private Boolean isOmitExcludedTableFromReplication;

        /**
         * Whether an excluded table should be omitted from replication. Only valid for database
         * objects that have are of type TABLE and object status EXCLUDE.
         *
         * @param isOmitExcludedTableFromReplication the value to set
         * @return this builder
         */
        public Builder isOmitExcludedTableFromReplication(
                Boolean isOmitExcludedTableFromReplication) {
            this.isOmitExcludedTableFromReplication = isOmitExcludedTableFromReplication;
            this.__explicitlySet__.add("isOmitExcludedTableFromReplication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleDatabaseObject build() {
            OracleDatabaseObject model =
                    new OracleDatabaseObject(
                            this.owner,
                            this.objectName,
                            this.type,
                            this.isOmitExcludedTableFromReplication);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleDatabaseObject model) {
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isOmitExcludedTableFromReplication")) {
                this.isOmitExcludedTableFromReplication(
                        model.getIsOmitExcludedTableFromReplication());
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

    /** Owner of the object (regular expression is allowed) */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * Owner of the object (regular expression is allowed)
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
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

    /**
     * Whether an excluded table should be omitted from replication. Only valid for database objects
     * that have are of type TABLE and object status EXCLUDE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOmitExcludedTableFromReplication")
    private final Boolean isOmitExcludedTableFromReplication;

    /**
     * Whether an excluded table should be omitted from replication. Only valid for database objects
     * that have are of type TABLE and object status EXCLUDE.
     *
     * @return the value
     */
    public Boolean getIsOmitExcludedTableFromReplication() {
        return isOmitExcludedTableFromReplication;
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
        sb.append("OracleDatabaseObject(");
        sb.append("super=").append(super.toString());
        sb.append("owner=").append(String.valueOf(this.owner));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isOmitExcludedTableFromReplication=")
                .append(String.valueOf(this.isOmitExcludedTableFromReplication));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleDatabaseObject)) {
            return false;
        }

        OracleDatabaseObject other = (OracleDatabaseObject) o;
        return java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(
                        this.isOmitExcludedTableFromReplication,
                        other.isOmitExcludedTableFromReplication)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.isOmitExcludedTableFromReplication == null
                                ? 43
                                : this.isOmitExcludedTableFromReplication.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
