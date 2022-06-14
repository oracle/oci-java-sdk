/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Updates the cloud Exadata infrastructure. Applies to Exadata Cloud Service instances only.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCloudExadataInfrastructureDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateCloudExadataInfrastructureDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "maintenanceWindow",
        "computeCount",
        "storageCount",
        "freeformTags",
        "definedTags",
        "customerContacts"
    })
    public UpdateCloudExadataInfrastructureDetails(
            String displayName,
            MaintenanceWindow maintenanceWindow,
            Integer computeCount,
            Integer storageCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<CustomerContact> customerContacts) {
        super();
        this.displayName = displayName;
        this.maintenanceWindow = maintenanceWindow;
        this.computeCount = computeCount;
        this.storageCount = storageCount;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.customerContacts = customerContacts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user-friendly name for the cloud Exadata infrastructure. The name does not need to be unique.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud Exadata infrastructure. The name does not need to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }
        /**
         * The number of compute servers for the cloud Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Integer computeCount;

        /**
         * The number of compute servers for the cloud Exadata infrastructure.
         * @param computeCount the value to set
         * @return this builder
         **/
        public Builder computeCount(Integer computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /**
         * The number of storage servers for the cloud Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
        private Integer storageCount;

        /**
         * The number of storage servers for the cloud Exadata infrastructure.
         * @param storageCount the value to set
         * @return this builder
         **/
        public Builder storageCount(Integer storageCount) {
            this.storageCount = storageCount;
            this.__explicitlySet__.add("storageCount");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Customer contacts. Setting this to an empty list removes all customer contact information (email addresses) for the specified OCI Database service resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        /**
         * Customer contacts. Setting this to an empty list removes all customer contact information (email addresses) for the specified OCI Database service resource.
         * @param customerContacts the value to set
         * @return this builder
         **/
        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCloudExadataInfrastructureDetails build() {
            UpdateCloudExadataInfrastructureDetails __instance__ =
                    new UpdateCloudExadataInfrastructureDetails(
                            displayName,
                            maintenanceWindow,
                            computeCount,
                            storageCount,
                            freeformTags,
                            definedTags,
                            customerContacts);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCloudExadataInfrastructureDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .maintenanceWindow(o.getMaintenanceWindow())
                            .computeCount(o.getComputeCount())
                            .storageCount(o.getStorageCount())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .customerContacts(o.getCustomerContacts());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The user-friendly name for the cloud Exadata infrastructure. The name does not need to be unique.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud Exadata infrastructure. The name does not need to be unique.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * The number of compute servers for the cloud Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Integer computeCount;

    /**
     * The number of compute servers for the cloud Exadata infrastructure.
     * @return the value
     **/
    public Integer getComputeCount() {
        return computeCount;
    }

    /**
     * The number of storage servers for the cloud Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageCount")
    private final Integer storageCount;

    /**
     * The number of storage servers for the cloud Exadata infrastructure.
     * @return the value
     **/
    public Integer getStorageCount() {
        return storageCount;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Customer contacts. Setting this to an empty list removes all customer contact information (email addresses) for the specified OCI Database service resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * Customer contacts. Setting this to an empty list removes all customer contact information (email addresses) for the specified OCI Database service resource.
     * @return the value
     **/
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateCloudExadataInfrastructureDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", storageCount=").append(String.valueOf(this.storageCount));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCloudExadataInfrastructureDetails)) {
            return false;
        }

        UpdateCloudExadataInfrastructureDetails other = (UpdateCloudExadataInfrastructureDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.storageCount, other.storageCount)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result = (result * PRIME) + (this.storageCount == null ? 43 : this.storageCount.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
