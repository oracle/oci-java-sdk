/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a database configuration for a resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource",
    defaultImpl = DatabaseConfigurationSummary.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EmManagedExternalDatabaseConfigurationSummary.class,
        name = "EM_MANAGED_EXTERNAL_DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AutonomousDatabaseConfigurationSummary.class,
        name = "AUTONOMOUS_DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MacsManagedExternalDatabaseConfigurationSummary.class,
        name = "MACS_MANAGED_EXTERNAL_DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PeComanagedManagedExternalDatabaseConfigurationSummary.class,
        name = "PE_COMANAGED_DATABASE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DatabaseConfigurationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseInsightId",
        "compartmentId",
        "databaseName",
        "databaseDisplayName",
        "databaseType",
        "databaseVersion",
        "cdbName",
        "definedTags",
        "freeformTags",
        "processorCount"
    })
    protected DatabaseConfigurationSummary(
            String databaseInsightId,
            String compartmentId,
            String databaseName,
            String databaseDisplayName,
            String databaseType,
            String databaseVersion,
            String cdbName,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            Integer processorCount) {
        super();
        this.databaseInsightId = databaseInsightId;
        this.compartmentId = compartmentId;
        this.databaseName = databaseName;
        this.databaseDisplayName = databaseDisplayName;
        this.databaseType = databaseType;
        this.databaseVersion = databaseVersion;
        this.cdbName = cdbName;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.processorCount = processorCount;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseInsightId")
    private final String databaseInsightId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
     * @return the value
     **/
    public String getDatabaseInsightId() {
        return databaseInsightId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The database name. The database name is unique within the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The database name. The database name is unique within the tenancy.
     * @return the value
     **/
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * The user-friendly name for the database. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
    private final String databaseDisplayName;

    /**
     * The user-friendly name for the database. The name does not have to be unique.
     * @return the value
     **/
    public String getDatabaseDisplayName() {
        return databaseDisplayName;
    }

    /**
     * Operations Insights internal representation of the database type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final String databaseType;

    /**
     * Operations Insights internal representation of the database type.
     * @return the value
     **/
    public String getDatabaseType() {
        return databaseType;
    }

    /**
     * The version of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The version of the database.
     * @return the value
     **/
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * Name of the CDB.Only applies to PDB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdbName")
    private final String cdbName;

    /**
     * Name of the CDB.Only applies to PDB.
     * @return the value
     **/
    public String getCdbName() {
        return cdbName;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Processor count. This is the OCPU count for Autonomous Database and CPU core count for other database types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processorCount")
    private final Integer processorCount;

    /**
     * Processor count. This is the OCPU count for Autonomous Database and CPU core count for other database types.
     * @return the value
     **/
    public Integer getProcessorCount() {
        return processorCount;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseConfigurationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("databaseInsightId=").append(String.valueOf(this.databaseInsightId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseDisplayName=").append(String.valueOf(this.databaseDisplayName));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", cdbName=").append(String.valueOf(this.cdbName));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", processorCount=").append(String.valueOf(this.processorCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseConfigurationSummary)) {
            return false;
        }

        DatabaseConfigurationSummary other = (DatabaseConfigurationSummary) o;
        return java.util.Objects.equals(this.databaseInsightId, other.databaseInsightId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseDisplayName, other.databaseDisplayName)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.cdbName, other.cdbName)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.processorCount, other.processorCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseInsightId == null ? 43 : this.databaseInsightId.hashCode());
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
        result = (result * PRIME) + (this.cdbName == null ? 43 : this.cdbName.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.processorCount == null ? 43 : this.processorCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
