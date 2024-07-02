/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Partial information about the database which includes id, name, type. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "databaseId",
        "compartmentId",
        "databaseName",
        "databaseDisplayName",
        "databaseType",
        "databaseVersion",
        "instances",
        "cdbName"
    })
    public DatabaseDetails(
            String id,
            String databaseId,
            String compartmentId,
            String databaseName,
            String databaseDisplayName,
            String databaseType,
            String databaseVersion,
            java.util.List<HostInstanceMap> instances,
            String cdbName) {
        super();
        this.id = id;
        this.databaseId = databaseId;
        this.compartmentId = compartmentId;
        this.databaseName = databaseName;
        this.databaseDisplayName = databaseDisplayName;
        this.databaseType = databaseType;
        this.databaseVersion = databaseVersion;
        this.instances = instances;
        this.cdbName = cdbName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database insight resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database insight resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The database name. The database name is unique within the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The database name. The database name is unique within the tenancy.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** The user-friendly name for the database. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
        private String databaseDisplayName;

        /**
         * The user-friendly name for the database. The name does not have to be unique.
         *
         * @param databaseDisplayName the value to set
         * @return this builder
         */
        public Builder databaseDisplayName(String databaseDisplayName) {
            this.databaseDisplayName = databaseDisplayName;
            this.__explicitlySet__.add("databaseDisplayName");
            return this;
        }
        /** Ops Insights internal representation of the database type. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private String databaseType;

        /**
         * Ops Insights internal representation of the database type.
         *
         * @param databaseType the value to set
         * @return this builder
         */
        public Builder databaseType(String databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /** The version of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The version of the database.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /** Array of hostname and instance name. */
        @com.fasterxml.jackson.annotation.JsonProperty("instances")
        private java.util.List<HostInstanceMap> instances;

        /**
         * Array of hostname and instance name.
         *
         * @param instances the value to set
         * @return this builder
         */
        public Builder instances(java.util.List<HostInstanceMap> instances) {
            this.instances = instances;
            this.__explicitlySet__.add("instances");
            return this;
        }
        /** Name of the CDB.Only applies to PDB. */
        @com.fasterxml.jackson.annotation.JsonProperty("cdbName")
        private String cdbName;

        /**
         * Name of the CDB.Only applies to PDB.
         *
         * @param cdbName the value to set
         * @return this builder
         */
        public Builder cdbName(String cdbName) {
            this.cdbName = cdbName;
            this.__explicitlySet__.add("cdbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseDetails build() {
            DatabaseDetails model =
                    new DatabaseDetails(
                            this.id,
                            this.databaseId,
                            this.compartmentId,
                            this.databaseName,
                            this.databaseDisplayName,
                            this.databaseType,
                            this.databaseVersion,
                            this.instances,
                            this.cdbName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseDisplayName")) {
                this.databaseDisplayName(model.getDatabaseDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("instances")) {
                this.instances(model.getInstances());
            }
            if (model.wasPropertyExplicitlySet("cdbName")) {
                this.cdbName(model.getCdbName());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database insight resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database insight resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The database name. The database name is unique within the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The database name. The database name is unique within the tenancy.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** The user-friendly name for the database. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
    private final String databaseDisplayName;

    /**
     * The user-friendly name for the database. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDatabaseDisplayName() {
        return databaseDisplayName;
    }

    /** Ops Insights internal representation of the database type. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final String databaseType;

    /**
     * Ops Insights internal representation of the database type.
     *
     * @return the value
     */
    public String getDatabaseType() {
        return databaseType;
    }

    /** The version of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The version of the database.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /** Array of hostname and instance name. */
    @com.fasterxml.jackson.annotation.JsonProperty("instances")
    private final java.util.List<HostInstanceMap> instances;

    /**
     * Array of hostname and instance name.
     *
     * @return the value
     */
    public java.util.List<HostInstanceMap> getInstances() {
        return instances;
    }

    /** Name of the CDB.Only applies to PDB. */
    @com.fasterxml.jackson.annotation.JsonProperty("cdbName")
    private final String cdbName;

    /**
     * Name of the CDB.Only applies to PDB.
     *
     * @return the value
     */
    public String getCdbName() {
        return cdbName;
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
        sb.append("DatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseDisplayName=").append(String.valueOf(this.databaseDisplayName));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", instances=").append(String.valueOf(this.instances));
        sb.append(", cdbName=").append(String.valueOf(this.cdbName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseDetails)) {
            return false;
        }

        DatabaseDetails other = (DatabaseDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseDisplayName, other.databaseDisplayName)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.instances, other.instances)
                && java.util.Objects.equals(this.cdbName, other.cdbName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseDisplayName == null
                                ? 43
                                : this.databaseDisplayName.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + (this.instances == null ? 43 : this.instances.hashCode());
        result = (result * PRIME) + (this.cdbName == null ? 43 : this.cdbName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
