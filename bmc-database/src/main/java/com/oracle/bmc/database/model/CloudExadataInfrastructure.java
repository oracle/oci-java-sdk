/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances only.
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
    builder = CloudExadataInfrastructure.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloudExadataInfrastructure {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "lifecycleState",
        "displayName",
        "shape",
        "availabilityDomain",
        "computeCount",
        "storageCount",
        "totalStorageSizeInGBs",
        "availableStorageSizeInGBs",
        "timeCreated",
        "lifecycleDetails",
        "maintenanceWindow",
        "lastMaintenanceRunId",
        "nextMaintenanceRunId",
        "freeformTags",
        "definedTags",
        "customerContacts"
    })
    public CloudExadataInfrastructure(
            String id,
            String compartmentId,
            LifecycleState lifecycleState,
            String displayName,
            String shape,
            String availabilityDomain,
            Integer computeCount,
            Integer storageCount,
            Integer totalStorageSizeInGBs,
            Integer availableStorageSizeInGBs,
            java.util.Date timeCreated,
            String lifecycleDetails,
            MaintenanceWindow maintenanceWindow,
            String lastMaintenanceRunId,
            String nextMaintenanceRunId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<CustomerContact> customerContacts) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.shape = shape;
        this.availabilityDomain = availabilityDomain;
        this.computeCount = computeCount;
        this.storageCount = storageCount;
        this.totalStorageSizeInGBs = totalStorageSizeInGBs;
        this.availableStorageSizeInGBs = availableStorageSizeInGBs;
        this.timeCreated = timeCreated;
        this.lifecycleDetails = lifecycleDetails;
        this.maintenanceWindow = maintenanceWindow;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.customerContacts = customerContacts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The current lifecycle state of the cloud Exadata infrastructure resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the cloud Exadata infrastructure resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The model name of the cloud Exadata infrastructure resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The model name of the cloud Exadata infrastructure resource.
         *
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The name of the availability domain that the cloud Exadata infrastructure resource is located in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the cloud Exadata infrastructure resource is located in.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
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
         * The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalStorageSizeInGBs")
        private Integer totalStorageSizeInGBs;

        /**
         * The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
         * @param totalStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder totalStorageSizeInGBs(Integer totalStorageSizeInGBs) {
            this.totalStorageSizeInGBs = totalStorageSizeInGBs;
            this.__explicitlySet__.add("totalStorageSizeInGBs");
            return this;
        }
        /**
         * The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableStorageSizeInGBs")
        private Integer availableStorageSizeInGBs;

        /**
         * The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
         * @param availableStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder availableStorageSizeInGBs(Integer availableStorageSizeInGBs) {
            this.availableStorageSizeInGBs = availableStorageSizeInGBs;
            this.__explicitlySet__.add("availableStorageSizeInGBs");
            return this;
        }
        /**
         * The date and time the cloud Exadata infrastructure resource was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the cloud Exadata infrastructure resource was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Additional information about the current lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
        private String lastMaintenanceRunId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
         * @param lastMaintenanceRunId the value to set
         * @return this builder
         **/
        public Builder lastMaintenanceRunId(String lastMaintenanceRunId) {
            this.lastMaintenanceRunId = lastMaintenanceRunId;
            this.__explicitlySet__.add("lastMaintenanceRunId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
        private String nextMaintenanceRunId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
         * @param nextMaintenanceRunId the value to set
         * @return this builder
         **/
        public Builder nextMaintenanceRunId(String nextMaintenanceRunId) {
            this.nextMaintenanceRunId = nextMaintenanceRunId;
            this.__explicitlySet__.add("nextMaintenanceRunId");
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
         * The list of customer email addresses that receive information from Oracle about the specified OCI Database service resource.
         * Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators.
         * Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        /**
         * The list of customer email addresses that receive information from Oracle about the specified OCI Database service resource.
         * Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators.
         * Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
         *
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

        public CloudExadataInfrastructure build() {
            CloudExadataInfrastructure __instance__ =
                    new CloudExadataInfrastructure(
                            id,
                            compartmentId,
                            lifecycleState,
                            displayName,
                            shape,
                            availabilityDomain,
                            computeCount,
                            storageCount,
                            totalStorageSizeInGBs,
                            availableStorageSizeInGBs,
                            timeCreated,
                            lifecycleDetails,
                            maintenanceWindow,
                            lastMaintenanceRunId,
                            nextMaintenanceRunId,
                            freeformTags,
                            definedTags,
                            customerContacts);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudExadataInfrastructure o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .lifecycleState(o.getLifecycleState())
                            .displayName(o.getDisplayName())
                            .shape(o.getShape())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .computeCount(o.getComputeCount())
                            .storageCount(o.getStorageCount())
                            .totalStorageSizeInGBs(o.getTotalStorageSizeInGBs())
                            .availableStorageSizeInGBs(o.getAvailableStorageSizeInGBs())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .maintenanceWindow(o.getMaintenanceWindow())
                            .lastMaintenanceRunId(o.getLastMaintenanceRunId())
                            .nextMaintenanceRunId(o.getNextMaintenanceRunId())
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The current lifecycle state of the cloud Exadata infrastructure resource.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current lifecycle state of the cloud Exadata infrastructure resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the cloud Exadata infrastructure resource.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud Exadata infrastructure resource. The name does not need to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The model name of the cloud Exadata infrastructure resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The model name of the cloud Exadata infrastructure resource.
     *
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * The name of the availability domain that the cloud Exadata infrastructure resource is located in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the cloud Exadata infrastructure resource is located in.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
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
     * The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalStorageSizeInGBs")
    private final Integer totalStorageSizeInGBs;

    /**
     * The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     * @return the value
     **/
    public Integer getTotalStorageSizeInGBs() {
        return totalStorageSizeInGBs;
    }

    /**
     * The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableStorageSizeInGBs")
    private final Integer availableStorageSizeInGBs;

    /**
     * The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     * @return the value
     **/
    public Integer getAvailableStorageSizeInGBs() {
        return availableStorageSizeInGBs;
    }

    /**
     * The date and time the cloud Exadata infrastructure resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the cloud Exadata infrastructure resource was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
    private final String lastMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * @return the value
     **/
    public String getLastMaintenanceRunId() {
        return lastMaintenanceRunId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
    private final String nextMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * @return the value
     **/
    public String getNextMaintenanceRunId() {
        return nextMaintenanceRunId;
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
     * The list of customer email addresses that receive information from Oracle about the specified OCI Database service resource.
     * Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators.
     * Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * The list of customer email addresses that receive information from Oracle about the specified OCI Database service resource.
     * Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators.
     * Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
     *
     * @return the value
     **/
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
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
        sb.append("CloudExadataInfrastructure(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", storageCount=").append(String.valueOf(this.storageCount));
        sb.append(", totalStorageSizeInGBs=").append(String.valueOf(this.totalStorageSizeInGBs));
        sb.append(", availableStorageSizeInGBs=")
                .append(String.valueOf(this.availableStorageSizeInGBs));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", lastMaintenanceRunId=").append(String.valueOf(this.lastMaintenanceRunId));
        sb.append(", nextMaintenanceRunId=").append(String.valueOf(this.nextMaintenanceRunId));
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
        if (!(o instanceof CloudExadataInfrastructure)) {
            return false;
        }

        CloudExadataInfrastructure other = (CloudExadataInfrastructure) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.storageCount, other.storageCount)
                && java.util.Objects.equals(this.totalStorageSizeInGBs, other.totalStorageSizeInGBs)
                && java.util.Objects.equals(
                        this.availableStorageSizeInGBs, other.availableStorageSizeInGBs)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.lastMaintenanceRunId, other.lastMaintenanceRunId)
                && java.util.Objects.equals(this.nextMaintenanceRunId, other.nextMaintenanceRunId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result = (result * PRIME) + (this.storageCount == null ? 43 : this.storageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalStorageSizeInGBs == null
                                ? 43
                                : this.totalStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableStorageSizeInGBs == null
                                ? 43
                                : this.availableStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.lastMaintenanceRunId == null
                                ? 43
                                : this.lastMaintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.nextMaintenanceRunId == null
                                ? 43
                                : this.nextMaintenanceRunId.hashCode());
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
