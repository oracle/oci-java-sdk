/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * The information to be updated. <br>
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
        builder = UpdateDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "shape",
        "instanceOcpuCount",
        "instanceMemorySizeInGBs",
        "dbConfigurationParams",
        "managementPolicy",
        "storageDetails",
        "networkDetails",
        "freeformTags",
        "definedTags"
    })
    public UpdateDbSystemDetails(
            String displayName,
            String description,
            String shape,
            Integer instanceOcpuCount,
            Integer instanceMemorySizeInGBs,
            UpdateDbConfigParams dbConfigurationParams,
            ManagementPolicyDetails managementPolicy,
            UpdateStorageDetailsParams storageDetails,
            UpdateNetworkDetails networkDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.shape = shape;
        this.instanceOcpuCount = instanceOcpuCount;
        this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
        this.dbConfigurationParams = dbConfigurationParams;
        this.managementPolicy = managementPolicy;
        this.storageDetails = storageDetails;
        this.networkDetails = networkDetails;
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
        /** A user-provided description of the database system. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-provided description of the database system.
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
         * The name of the shape for the database system nodes. Example: {@code VM.Standard.E4.Flex}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The name of the shape for the database system nodes. Example: {@code VM.Standard.E4.Flex}
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The total number of OCPUs available to each database system node. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
        private Integer instanceOcpuCount;

        /**
         * The total number of OCPUs available to each database system node.
         *
         * @param instanceOcpuCount the value to set
         * @return this builder
         */
        public Builder instanceOcpuCount(Integer instanceOcpuCount) {
            this.instanceOcpuCount = instanceOcpuCount;
            this.__explicitlySet__.add("instanceOcpuCount");
            return this;
        }
        /** The total amount of memory available to each database system node, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
        private Integer instanceMemorySizeInGBs;

        /**
         * The total amount of memory available to each database system node, in gigabytes.
         *
         * @param instanceMemorySizeInGBs the value to set
         * @return this builder
         */
        public Builder instanceMemorySizeInGBs(Integer instanceMemorySizeInGBs) {
            this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
            this.__explicitlySet__.add("instanceMemorySizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbConfigurationParams")
        private UpdateDbConfigParams dbConfigurationParams;

        public Builder dbConfigurationParams(UpdateDbConfigParams dbConfigurationParams) {
            this.dbConfigurationParams = dbConfigurationParams;
            this.__explicitlySet__.add("dbConfigurationParams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementPolicy")
        private ManagementPolicyDetails managementPolicy;

        public Builder managementPolicy(ManagementPolicyDetails managementPolicy) {
            this.managementPolicy = managementPolicy;
            this.__explicitlySet__.add("managementPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageDetails")
        private UpdateStorageDetailsParams storageDetails;

        public Builder storageDetails(UpdateStorageDetailsParams storageDetails) {
            this.storageDetails = storageDetails;
            this.__explicitlySet__.add("storageDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
        private UpdateNetworkDetails networkDetails;

        public Builder networkDetails(UpdateNetworkDetails networkDetails) {
            this.networkDetails = networkDetails;
            this.__explicitlySet__.add("networkDetails");
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

        public UpdateDbSystemDetails build() {
            UpdateDbSystemDetails model =
                    new UpdateDbSystemDetails(
                            this.displayName,
                            this.description,
                            this.shape,
                            this.instanceOcpuCount,
                            this.instanceMemorySizeInGBs,
                            this.dbConfigurationParams,
                            this.managementPolicy,
                            this.storageDetails,
                            this.networkDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("dbConfigurationParams")) {
                this.dbConfigurationParams(model.getDbConfigurationParams());
            }
            if (model.wasPropertyExplicitlySet("managementPolicy")) {
                this.managementPolicy(model.getManagementPolicy());
            }
            if (model.wasPropertyExplicitlySet("storageDetails")) {
                this.storageDetails(model.getStorageDetails());
            }
            if (model.wasPropertyExplicitlySet("networkDetails")) {
                this.networkDetails(model.getNetworkDetails());
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

    /** A user-provided description of the database system. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-provided description of the database system.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The name of the shape for the database system nodes. Example: {@code VM.Standard.E4.Flex} */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The name of the shape for the database system nodes. Example: {@code VM.Standard.E4.Flex}
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The total number of OCPUs available to each database system node. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
    private final Integer instanceOcpuCount;

    /**
     * The total number of OCPUs available to each database system node.
     *
     * @return the value
     */
    public Integer getInstanceOcpuCount() {
        return instanceOcpuCount;
    }

    /** The total amount of memory available to each database system node, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
    private final Integer instanceMemorySizeInGBs;

    /**
     * The total amount of memory available to each database system node, in gigabytes.
     *
     * @return the value
     */
    public Integer getInstanceMemorySizeInGBs() {
        return instanceMemorySizeInGBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbConfigurationParams")
    private final UpdateDbConfigParams dbConfigurationParams;

    public UpdateDbConfigParams getDbConfigurationParams() {
        return dbConfigurationParams;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("managementPolicy")
    private final ManagementPolicyDetails managementPolicy;

    public ManagementPolicyDetails getManagementPolicy() {
        return managementPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageDetails")
    private final UpdateStorageDetailsParams storageDetails;

    public UpdateStorageDetailsParams getStorageDetails() {
        return storageDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
    private final UpdateNetworkDetails networkDetails;

    public UpdateNetworkDetails getNetworkDetails() {
        return networkDetails;
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
        sb.append("UpdateDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", instanceOcpuCount=").append(String.valueOf(this.instanceOcpuCount));
        sb.append(", instanceMemorySizeInGBs=")
                .append(String.valueOf(this.instanceMemorySizeInGBs));
        sb.append(", dbConfigurationParams=").append(String.valueOf(this.dbConfigurationParams));
        sb.append(", managementPolicy=").append(String.valueOf(this.managementPolicy));
        sb.append(", storageDetails=").append(String.valueOf(this.storageDetails));
        sb.append(", networkDetails=").append(String.valueOf(this.networkDetails));
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
        if (!(o instanceof UpdateDbSystemDetails)) {
            return false;
        }

        UpdateDbSystemDetails other = (UpdateDbSystemDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.instanceOcpuCount, other.instanceOcpuCount)
                && java.util.Objects.equals(
                        this.instanceMemorySizeInGBs, other.instanceMemorySizeInGBs)
                && java.util.Objects.equals(this.dbConfigurationParams, other.dbConfigurationParams)
                && java.util.Objects.equals(this.managementPolicy, other.managementPolicy)
                && java.util.Objects.equals(this.storageDetails, other.storageDetails)
                && java.util.Objects.equals(this.networkDetails, other.networkDetails)
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
                        + (this.dbConfigurationParams == null
                                ? 43
                                : this.dbConfigurationParams.hashCode());
        result =
                (result * PRIME)
                        + (this.managementPolicy == null ? 43 : this.managementPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.storageDetails == null ? 43 : this.storageDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.networkDetails == null ? 43 : this.networkDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
