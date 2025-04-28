/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * The information about new database system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "systemType",
        "dbVersion",
        "configId",
        "storageDetails",
        "shape",
        "instanceOcpuCount",
        "instanceMemorySizeInGBs",
        "instanceCount",
        "instancesDetails",
        "credentials",
        "networkDetails",
        "managementPolicy",
        "source",
        "freeformTags",
        "definedTags"
    })
    public CreateDbSystemDetails(
            String displayName,
            String description,
            String compartmentId,
            DbSystem.SystemType systemType,
            String dbVersion,
            String configId,
            StorageDetails storageDetails,
            String shape,
            Integer instanceOcpuCount,
            Integer instanceMemorySizeInGBs,
            Integer instanceCount,
            java.util.List<CreateDbInstanceDetails> instancesDetails,
            Credentials credentials,
            NetworkDetails networkDetails,
            ManagementPolicyDetails managementPolicy,
            SourceDetails source,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.systemType = systemType;
        this.dbVersion = dbVersion;
        this.configId = configId;
        this.storageDetails = storageDetails;
        this.shape = shape;
        this.instanceOcpuCount = instanceOcpuCount;
        this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
        this.instanceCount = instanceCount;
        this.instancesDetails = instancesDetails;
        this.credentials = credentials;
        this.networkDetails = networkDetails;
        this.managementPolicy = managementPolicy;
        this.source = source;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name for the database system. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the database system. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A user-provided description of a database system. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-provided description of a database system.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the database system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the database system.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Type of the database system. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemType")
        private DbSystem.SystemType systemType;

        /**
         * Type of the database system.
         *
         * @param systemType the value to set
         * @return this builder
         */
        public Builder systemType(DbSystem.SystemType systemType) {
            this.systemType = systemType;
            this.__explicitlySet__.add("systemType");
            return this;
        }
        /** Version of database system software. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * Version of database system software.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * configuration associated with the database system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configId")
        private String configId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * configuration associated with the database system.
         *
         * @param configId the value to set
         * @return this builder
         */
        public Builder configId(String configId) {
            this.configId = configId;
            this.__explicitlySet__.add("configId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageDetails")
        private StorageDetails storageDetails;

        public Builder storageDetails(StorageDetails storageDetails) {
            this.storageDetails = storageDetails;
            this.__explicitlySet__.add("storageDetails");
            return this;
        }
        /**
         * The name of the shape for the database instance node. Use the /shapes API for accepted
         * shapes. Example: {@code VM.Standard.E4.Flex}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The name of the shape for the database instance node. Use the /shapes API for accepted
         * shapes. Example: {@code VM.Standard.E4.Flex}
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The total number of OCPUs available to each database instance node. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
        private Integer instanceOcpuCount;

        /**
         * The total number of OCPUs available to each database instance node.
         *
         * @param instanceOcpuCount the value to set
         * @return this builder
         */
        public Builder instanceOcpuCount(Integer instanceOcpuCount) {
            this.instanceOcpuCount = instanceOcpuCount;
            this.__explicitlySet__.add("instanceOcpuCount");
            return this;
        }
        /** The total amount of memory available to each database instance node, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
        private Integer instanceMemorySizeInGBs;

        /**
         * The total amount of memory available to each database instance node, in gigabytes.
         *
         * @param instanceMemorySizeInGBs the value to set
         * @return this builder
         */
        public Builder instanceMemorySizeInGBs(Integer instanceMemorySizeInGBs) {
            this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
            this.__explicitlySet__.add("instanceMemorySizeInGBs");
            return this;
        }
        /** Count of database instances nodes to be created in the database system. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceCount")
        private Integer instanceCount;

        /**
         * Count of database instances nodes to be created in the database system.
         *
         * @param instanceCount the value to set
         * @return this builder
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            this.__explicitlySet__.add("instanceCount");
            return this;
        }
        /**
         * Details of database instances nodes to be created. This parameter is optional. If
         * specified, its size must match {@code instanceCount}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instancesDetails")
        private java.util.List<CreateDbInstanceDetails> instancesDetails;

        /**
         * Details of database instances nodes to be created. This parameter is optional. If
         * specified, its size must match {@code instanceCount}.
         *
         * @param instancesDetails the value to set
         * @return this builder
         */
        public Builder instancesDetails(java.util.List<CreateDbInstanceDetails> instancesDetails) {
            this.instancesDetails = instancesDetails;
            this.__explicitlySet__.add("instancesDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private Credentials credentials;

        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
        private NetworkDetails networkDetails;

        public Builder networkDetails(NetworkDetails networkDetails) {
            this.networkDetails = networkDetails;
            this.__explicitlySet__.add("networkDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementPolicy")
        private ManagementPolicyDetails managementPolicy;

        public Builder managementPolicy(ManagementPolicyDetails managementPolicy) {
            this.managementPolicy = managementPolicy;
            this.__explicitlySet__.add("managementPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private SourceDetails source;

        public Builder source(SourceDetails source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDbSystemDetails build() {
            CreateDbSystemDetails model =
                    new CreateDbSystemDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.systemType,
                            this.dbVersion,
                            this.configId,
                            this.storageDetails,
                            this.shape,
                            this.instanceOcpuCount,
                            this.instanceMemorySizeInGBs,
                            this.instanceCount,
                            this.instancesDetails,
                            this.credentials,
                            this.networkDetails,
                            this.managementPolicy,
                            this.source,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("systemType")) {
                this.systemType(model.getSystemType());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("configId")) {
                this.configId(model.getConfigId());
            }
            if (model.wasPropertyExplicitlySet("storageDetails")) {
                this.storageDetails(model.getStorageDetails());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("instanceOcpuCount")) {
                this.instanceOcpuCount(model.getInstanceOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("instanceMemorySizeInGBs")) {
                this.instanceMemorySizeInGBs(model.getInstanceMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("instanceCount")) {
                this.instanceCount(model.getInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("instancesDetails")) {
                this.instancesDetails(model.getInstancesDetails());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("networkDetails")) {
                this.networkDetails(model.getNetworkDetails());
            }
            if (model.wasPropertyExplicitlySet("managementPolicy")) {
                this.managementPolicy(model.getManagementPolicy());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * A user-friendly display name for the database system. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the database system. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A user-provided description of a database system. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-provided description of a database system.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the database system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the database system.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Type of the database system. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemType")
    private final DbSystem.SystemType systemType;

    /**
     * Type of the database system.
     *
     * @return the value
     */
    public DbSystem.SystemType getSystemType() {
        return systemType;
    }

    /** Version of database system software. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * Version of database system software.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * configuration associated with the database system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configId")
    private final String configId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * configuration associated with the database system.
     *
     * @return the value
     */
    public String getConfigId() {
        return configId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageDetails")
    private final StorageDetails storageDetails;

    public StorageDetails getStorageDetails() {
        return storageDetails;
    }

    /**
     * The name of the shape for the database instance node. Use the /shapes API for accepted
     * shapes. Example: {@code VM.Standard.E4.Flex}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The name of the shape for the database instance node. Use the /shapes API for accepted
     * shapes. Example: {@code VM.Standard.E4.Flex}
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The total number of OCPUs available to each database instance node. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
    private final Integer instanceOcpuCount;

    /**
     * The total number of OCPUs available to each database instance node.
     *
     * @return the value
     */
    public Integer getInstanceOcpuCount() {
        return instanceOcpuCount;
    }

    /** The total amount of memory available to each database instance node, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
    private final Integer instanceMemorySizeInGBs;

    /**
     * The total amount of memory available to each database instance node, in gigabytes.
     *
     * @return the value
     */
    public Integer getInstanceMemorySizeInGBs() {
        return instanceMemorySizeInGBs;
    }

    /** Count of database instances nodes to be created in the database system. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceCount")
    private final Integer instanceCount;

    /**
     * Count of database instances nodes to be created in the database system.
     *
     * @return the value
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * Details of database instances nodes to be created. This parameter is optional. If specified,
     * its size must match {@code instanceCount}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instancesDetails")
    private final java.util.List<CreateDbInstanceDetails> instancesDetails;

    /**
     * Details of database instances nodes to be created. This parameter is optional. If specified,
     * its size must match {@code instanceCount}.
     *
     * @return the value
     */
    public java.util.List<CreateDbInstanceDetails> getInstancesDetails() {
        return instancesDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final Credentials credentials;

    public Credentials getCredentials() {
        return credentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
    private final NetworkDetails networkDetails;

    public NetworkDetails getNetworkDetails() {
        return networkDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("managementPolicy")
    private final ManagementPolicyDetails managementPolicy;

    public ManagementPolicyDetails getManagementPolicy() {
        return managementPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final SourceDetails source;

    public SourceDetails getSource() {
        return source;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", systemType=").append(String.valueOf(this.systemType));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", configId=").append(String.valueOf(this.configId));
        sb.append(", storageDetails=").append(String.valueOf(this.storageDetails));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", instanceOcpuCount=").append(String.valueOf(this.instanceOcpuCount));
        sb.append(", instanceMemorySizeInGBs=")
                .append(String.valueOf(this.instanceMemorySizeInGBs));
        sb.append(", instanceCount=").append(String.valueOf(this.instanceCount));
        sb.append(", instancesDetails=").append(String.valueOf(this.instancesDetails));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", networkDetails=").append(String.valueOf(this.networkDetails));
        sb.append(", managementPolicy=").append(String.valueOf(this.managementPolicy));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbSystemDetails)) {
            return false;
        }

        CreateDbSystemDetails other = (CreateDbSystemDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.systemType, other.systemType)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.configId, other.configId)
                && java.util.Objects.equals(this.storageDetails, other.storageDetails)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.instanceOcpuCount, other.instanceOcpuCount)
                && java.util.Objects.equals(
                        this.instanceMemorySizeInGBs, other.instanceMemorySizeInGBs)
                && java.util.Objects.equals(this.instanceCount, other.instanceCount)
                && java.util.Objects.equals(this.instancesDetails, other.instancesDetails)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.networkDetails, other.networkDetails)
                && java.util.Objects.equals(this.managementPolicy, other.managementPolicy)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.systemType == null ? 43 : this.systemType.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.configId == null ? 43 : this.configId.hashCode());
        result =
                (result * PRIME)
                        + (this.storageDetails == null ? 43 : this.storageDetails.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceOcpuCount == null ? 43 : this.instanceOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceMemorySizeInGBs == null
                                ? 43
                                : this.instanceMemorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceCount == null ? 43 : this.instanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.instancesDetails == null ? 43 : this.instancesDetails.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result =
                (result * PRIME)
                        + (this.networkDetails == null ? 43 : this.networkDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.managementPolicy == null ? 43 : this.managementPolicy.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
