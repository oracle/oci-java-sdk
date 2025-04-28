/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a Warehouse data object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WarehouseDataObjectSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WarehouseDataObjectSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dataObjectType", "name", "owner", "details"})
    public WarehouseDataObjectSummary(
            DataObjectType dataObjectType,
            String name,
            String owner,
            WarehouseDataObjectDetails details) {
        super();
        this.dataObjectType = dataObjectType;
        this.name = name;
        this.owner = owner;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of the data object. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataObjectType")
        private DataObjectType dataObjectType;

        /**
         * Type of the data object.
         *
         * @param dataObjectType the value to set
         * @return this builder
         */
        public Builder dataObjectType(DataObjectType dataObjectType) {
            this.dataObjectType = dataObjectType;
            this.__explicitlySet__.add("dataObjectType");
            return this;
        }
        /**
         * Name of the data object, which can be used in data object queries just like how view
         * names are used in a query.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the data object, which can be used in data object queries just like how view
         * names are used in a query.
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
         * Owner of the data object, which can be used in data object queries in front of data
         * object names just like SCHEMA.VIEW notation in queries.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * Owner of the data object, which can be used in data object queries in front of data
         * object names just like SCHEMA.VIEW notation in queries.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private WarehouseDataObjectDetails details;

        public Builder details(WarehouseDataObjectDetails details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WarehouseDataObjectSummary build() {
            WarehouseDataObjectSummary model =
                    new WarehouseDataObjectSummary(
                            this.dataObjectType, this.name, this.owner, this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WarehouseDataObjectSummary model) {
            if (model.wasPropertyExplicitlySet("dataObjectType")) {
                this.dataObjectType(model.getDataObjectType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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

    /** Type of the data object. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataObjectType")
    private final DataObjectType dataObjectType;

    /**
     * Type of the data object.
     *
     * @return the value
     */
    public DataObjectType getDataObjectType() {
        return dataObjectType;
    }

    /**
     * Name of the data object, which can be used in data object queries just like how view names
     * are used in a query.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the data object, which can be used in data object queries just like how view names
     * are used in a query.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Owner of the data object, which can be used in data object queries in front of data object
     * names just like SCHEMA.VIEW notation in queries.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * Owner of the data object, which can be used in data object queries in front of data object
     * names just like SCHEMA.VIEW notation in queries.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final WarehouseDataObjectDetails details;

    public WarehouseDataObjectDetails getDetails() {
        return details;
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
        sb.append("WarehouseDataObjectSummary(");
        sb.append("super=").append(super.toString());
        sb.append("dataObjectType=").append(String.valueOf(this.dataObjectType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WarehouseDataObjectSummary)) {
            return false;
        }

        WarehouseDataObjectSummary other = (WarehouseDataObjectSummary) o;
        return java.util.Objects.equals(this.dataObjectType, other.dataObjectType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dataObjectType == null ? 43 : this.dataObjectType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
