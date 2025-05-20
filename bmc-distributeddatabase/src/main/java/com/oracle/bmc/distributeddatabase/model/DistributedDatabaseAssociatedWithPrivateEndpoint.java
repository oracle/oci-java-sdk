/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * The details of distributed database associated with the private endpoint. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DistributedDatabaseAssociatedWithPrivateEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedDatabaseAssociatedWithPrivateEndpoint
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "dbDeploymentType"})
    public DistributedDatabaseAssociatedWithPrivateEndpoint(
            String id, DistributedDatabase.DbDeploymentType dbDeploymentType) {
        super();
        this.id = id;
        this.dbDeploymentType = dbDeploymentType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * distributed database.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The dbDeploymentType associated with the distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbDeploymentType")
        private DistributedDatabase.DbDeploymentType dbDeploymentType;

        /**
         * The dbDeploymentType associated with the distributed database.
         *
         * @param dbDeploymentType the value to set
         * @return this builder
         */
        public Builder dbDeploymentType(DistributedDatabase.DbDeploymentType dbDeploymentType) {
            this.dbDeploymentType = dbDeploymentType;
            this.__explicitlySet__.add("dbDeploymentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedDatabaseAssociatedWithPrivateEndpoint build() {
            DistributedDatabaseAssociatedWithPrivateEndpoint model =
                    new DistributedDatabaseAssociatedWithPrivateEndpoint(
                            this.id, this.dbDeploymentType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedDatabaseAssociatedWithPrivateEndpoint model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("dbDeploymentType")) {
                this.dbDeploymentType(model.getDbDeploymentType());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * distributed database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * distributed database.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The dbDeploymentType associated with the distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbDeploymentType")
    private final DistributedDatabase.DbDeploymentType dbDeploymentType;

    /**
     * The dbDeploymentType associated with the distributed database.
     *
     * @return the value
     */
    public DistributedDatabase.DbDeploymentType getDbDeploymentType() {
        return dbDeploymentType;
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
        sb.append("DistributedDatabaseAssociatedWithPrivateEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", dbDeploymentType=").append(String.valueOf(this.dbDeploymentType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedDatabaseAssociatedWithPrivateEndpoint)) {
            return false;
        }

        DistributedDatabaseAssociatedWithPrivateEndpoint other =
                (DistributedDatabaseAssociatedWithPrivateEndpoint) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.dbDeploymentType, other.dbDeploymentType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.dbDeploymentType == null ? 43 : this.dbDeploymentType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
