/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Specifications for the new index. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateIndexDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateIndexDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "compartmentId", "keys", "isIfNotExists"})
    public CreateIndexDetails(
            String name,
            String compartmentId,
            java.util.List<IndexKey> keys,
            Boolean isIfNotExists) {
        super();
        this.name = name;
        this.compartmentId = compartmentId;
        this.keys = keys;
        this.isIfNotExists = isIfNotExists;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Index name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Index name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The OCID of the table's compartment. Required if the tableNameOrId path parameter is a
         * table name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and
         * compartmentId is supplied, the latter must match the identified table's compartmentId.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the table's compartment. Required if the tableNameOrId path parameter is a
         * table name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and
         * compartmentId is supplied, the latter must match the identified table's compartmentId.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A set of keys for a secondary index. */
        @com.fasterxml.jackson.annotation.JsonProperty("keys")
        private java.util.List<IndexKey> keys;

        /**
         * A set of keys for a secondary index.
         *
         * @param keys the value to set
         * @return this builder
         */
        public Builder keys(java.util.List<IndexKey> keys) {
            this.keys = keys;
            this.__explicitlySet__.add("keys");
            return this;
        }
        /**
         * If true, the operation completes successfully even when the index exists. Otherwise, an
         * attempt to create an index that already exists will return an error.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIfNotExists")
        private Boolean isIfNotExists;

        /**
         * If true, the operation completes successfully even when the index exists. Otherwise, an
         * attempt to create an index that already exists will return an error.
         *
         * @param isIfNotExists the value to set
         * @return this builder
         */
        public Builder isIfNotExists(Boolean isIfNotExists) {
            this.isIfNotExists = isIfNotExists;
            this.__explicitlySet__.add("isIfNotExists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIndexDetails build() {
            CreateIndexDetails model =
                    new CreateIndexDetails(
                            this.name, this.compartmentId, this.keys, this.isIfNotExists);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIndexDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("keys")) {
                this.keys(model.getKeys());
            }
            if (model.wasPropertyExplicitlySet("isIfNotExists")) {
                this.isIfNotExists(model.getIsIfNotExists());
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

    /** Index name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Index name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The OCID of the table's compartment. Required if the tableNameOrId path parameter is a table
     * name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and compartmentId is
     * supplied, the latter must match the identified table's compartmentId.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the table's compartment. Required if the tableNameOrId path parameter is a table
     * name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and compartmentId is
     * supplied, the latter must match the identified table's compartmentId.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A set of keys for a secondary index. */
    @com.fasterxml.jackson.annotation.JsonProperty("keys")
    private final java.util.List<IndexKey> keys;

    /**
     * A set of keys for a secondary index.
     *
     * @return the value
     */
    public java.util.List<IndexKey> getKeys() {
        return keys;
    }

    /**
     * If true, the operation completes successfully even when the index exists. Otherwise, an
     * attempt to create an index that already exists will return an error.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIfNotExists")
    private final Boolean isIfNotExists;

    /**
     * If true, the operation completes successfully even when the index exists. Otherwise, an
     * attempt to create an index that already exists will return an error.
     *
     * @return the value
     */
    public Boolean getIsIfNotExists() {
        return isIfNotExists;
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
        sb.append("CreateIndexDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", keys=").append(String.valueOf(this.keys));
        sb.append(", isIfNotExists=").append(String.valueOf(this.isIfNotExists));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIndexDetails)) {
            return false;
        }

        CreateIndexDetails other = (CreateIndexDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.keys, other.keys)
                && java.util.Objects.equals(this.isIfNotExists, other.isIfNotExists)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.keys == null ? 43 : this.keys.hashCode());
        result =
                (result * PRIME)
                        + (this.isIfNotExists == null ? 43 : this.isIfNotExists.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
