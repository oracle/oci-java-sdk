/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Provides the configuration information used to create the desktop pool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDesktopPoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDesktopPoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "maximumSize",
        "standbySize",
        "shapeName",
        "shapeConfig",
        "useDedicatedVmHost",
        "isStorageEnabled",
        "storageSizeInGBs",
        "storageBackupPolicyId",
        "devicePolicy",
        "availabilityPolicy",
        "image",
        "networkConfiguration",
        "sessionLifecycleActions",
        "timeStartScheduled",
        "timeStopScheduled",
        "contactDetails",
        "arePrivilegedUsers",
        "availabilityDomain",
        "freeformTags",
        "definedTags",
        "nsgIds",
        "privateAccessDetails"
    })
    public CreateDesktopPoolDetails(
            String compartmentId,
            String displayName,
            String description,
            Integer maximumSize,
            Integer standbySize,
            String shapeName,
            CreateDesktopPoolShapeConfigDetails shapeConfig,
            UseDedicatedVmHost useDedicatedVmHost,
            Boolean isStorageEnabled,
            Integer storageSizeInGBs,
            String storageBackupPolicyId,
            DesktopDevicePolicy devicePolicy,
            DesktopAvailabilityPolicy availabilityPolicy,
            DesktopImage image,
            DesktopNetworkConfiguration networkConfiguration,
            CreateDesktopPoolDesktopSessionLifecycleActions sessionLifecycleActions,
            java.util.Date timeStartScheduled,
            java.util.Date timeStopScheduled,
            String contactDetails,
            Boolean arePrivilegedUsers,
            String availabilityDomain,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> nsgIds,
            CreateDesktopPoolPrivateAccessDetails privateAccessDetails) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.maximumSize = maximumSize;
        this.standbySize = standbySize;
        this.shapeName = shapeName;
        this.shapeConfig = shapeConfig;
        this.useDedicatedVmHost = useDedicatedVmHost;
        this.isStorageEnabled = isStorageEnabled;
        this.storageSizeInGBs = storageSizeInGBs;
        this.storageBackupPolicyId = storageBackupPolicyId;
        this.devicePolicy = devicePolicy;
        this.availabilityPolicy = availabilityPolicy;
        this.image = image;
        this.networkConfiguration = networkConfiguration;
        this.sessionLifecycleActions = sessionLifecycleActions;
        this.timeStartScheduled = timeStartScheduled;
        this.timeStopScheduled = timeStopScheduled;
        this.contactDetails = contactDetails;
        this.arePrivilegedUsers = arePrivilegedUsers;
        this.availabilityDomain = availabilityDomain;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.nsgIds = nsgIds;
        this.privateAccessDetails = privateAccessDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment which will contain the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment which will contain the desktop pool.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A user friendly display name. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user friendly display name. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A user friendly description providing additional information about the resource. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user friendly description providing additional information about the resource. Avoid
         * entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The maximum number of desktops permitted in the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumSize")
        private Integer maximumSize;

        /**
         * The maximum number of desktops permitted in the desktop pool.
         *
         * @param maximumSize the value to set
         * @return this builder
         */
        public Builder maximumSize(Integer maximumSize) {
            this.maximumSize = maximumSize;
            this.__explicitlySet__.add("maximumSize");
            return this;
        }
        /** The maximum number of standby desktops available in the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("standbySize")
        private Integer standbySize;

        /**
         * The maximum number of standby desktops available in the desktop pool.
         *
         * @param standbySize the value to set
         * @return this builder
         */
        public Builder standbySize(Integer standbySize) {
            this.standbySize = standbySize;
            this.__explicitlySet__.add("standbySize");
            return this;
        }
        /** The shape of the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape of the desktop pool.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private CreateDesktopPoolShapeConfigDetails shapeConfig;

        public Builder shapeConfig(CreateDesktopPoolShapeConfigDetails shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }
        /** Indicates whether the desktop pool uses dedicated virtual machine hosts. */
        @com.fasterxml.jackson.annotation.JsonProperty("useDedicatedVmHost")
        private UseDedicatedVmHost useDedicatedVmHost;

        /**
         * Indicates whether the desktop pool uses dedicated virtual machine hosts.
         *
         * @param useDedicatedVmHost the value to set
         * @return this builder
         */
        public Builder useDedicatedVmHost(UseDedicatedVmHost useDedicatedVmHost) {
            this.useDedicatedVmHost = useDedicatedVmHost;
            this.__explicitlySet__.add("useDedicatedVmHost");
            return this;
        }
        /** Indicates whether storage is enabled for the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("isStorageEnabled")
        private Boolean isStorageEnabled;

        /**
         * Indicates whether storage is enabled for the desktop pool.
         *
         * @param isStorageEnabled the value to set
         * @return this builder
         */
        public Builder isStorageEnabled(Boolean isStorageEnabled) {
            this.isStorageEnabled = isStorageEnabled;
            this.__explicitlySet__.add("isStorageEnabled");
            return this;
        }
        /** The size in GBs of the storage for the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInGBs")
        private Integer storageSizeInGBs;

        /**
         * The size in GBs of the storage for the desktop pool.
         *
         * @param storageSizeInGBs the value to set
         * @return this builder
         */
        public Builder storageSizeInGBs(Integer storageSizeInGBs) {
            this.storageSizeInGBs = storageSizeInGBs;
            this.__explicitlySet__.add("storageSizeInGBs");
            return this;
        }
        /** The backup policy OCID of the storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageBackupPolicyId")
        private String storageBackupPolicyId;

        /**
         * The backup policy OCID of the storage.
         *
         * @param storageBackupPolicyId the value to set
         * @return this builder
         */
        public Builder storageBackupPolicyId(String storageBackupPolicyId) {
            this.storageBackupPolicyId = storageBackupPolicyId;
            this.__explicitlySet__.add("storageBackupPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("devicePolicy")
        private DesktopDevicePolicy devicePolicy;

        public Builder devicePolicy(DesktopDevicePolicy devicePolicy) {
            this.devicePolicy = devicePolicy;
            this.__explicitlySet__.add("devicePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityPolicy")
        private DesktopAvailabilityPolicy availabilityPolicy;

        public Builder availabilityPolicy(DesktopAvailabilityPolicy availabilityPolicy) {
            this.availabilityPolicy = availabilityPolicy;
            this.__explicitlySet__.add("availabilityPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private DesktopImage image;

        public Builder image(DesktopImage image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private DesktopNetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(DesktopNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionLifecycleActions")
        private CreateDesktopPoolDesktopSessionLifecycleActions sessionLifecycleActions;

        public Builder sessionLifecycleActions(
                CreateDesktopPoolDesktopSessionLifecycleActions sessionLifecycleActions) {
            this.sessionLifecycleActions = sessionLifecycleActions;
            this.__explicitlySet__.add("sessionLifecycleActions");
            return this;
        }
        /** The start time of the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStartScheduled")
        private java.util.Date timeStartScheduled;

        /**
         * The start time of the desktop pool.
         *
         * @param timeStartScheduled the value to set
         * @return this builder
         */
        public Builder timeStartScheduled(java.util.Date timeStartScheduled) {
            this.timeStartScheduled = timeStartScheduled;
            this.__explicitlySet__.add("timeStartScheduled");
            return this;
        }
        /** The stop time of the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStopScheduled")
        private java.util.Date timeStopScheduled;

        /**
         * The stop time of the desktop pool.
         *
         * @param timeStopScheduled the value to set
         * @return this builder
         */
        public Builder timeStopScheduled(java.util.Date timeStopScheduled) {
            this.timeStopScheduled = timeStopScheduled;
            this.__explicitlySet__.add("timeStopScheduled");
            return this;
        }
        /**
         * Contact information of the desktop pool administrator. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contactDetails")
        private String contactDetails;

        /**
         * Contact information of the desktop pool administrator. Avoid entering confidential
         * information.
         *
         * @param contactDetails the value to set
         * @return this builder
         */
        public Builder contactDetails(String contactDetails) {
            this.contactDetails = contactDetails;
            this.__explicitlySet__.add("contactDetails");
            return this;
        }
        /** Indicates whether desktop pool users have administrative privileges on their desktop. */
        @com.fasterxml.jackson.annotation.JsonProperty("arePrivilegedUsers")
        private Boolean arePrivilegedUsers;

        /**
         * Indicates whether desktop pool users have administrative privileges on their desktop.
         *
         * @param arePrivilegedUsers the value to set
         * @return this builder
         */
        public Builder arePrivilegedUsers(Boolean arePrivilegedUsers) {
            this.arePrivilegedUsers = arePrivilegedUsers;
            this.__explicitlySet__.add("arePrivilegedUsers");
            return this;
        }
        /** The availability domain of the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the desktop pool.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
        /** A list of network security groups for the private access. */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of network security groups for the private access.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateAccessDetails")
        private CreateDesktopPoolPrivateAccessDetails privateAccessDetails;

        public Builder privateAccessDetails(
                CreateDesktopPoolPrivateAccessDetails privateAccessDetails) {
            this.privateAccessDetails = privateAccessDetails;
            this.__explicitlySet__.add("privateAccessDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDesktopPoolDetails build() {
            CreateDesktopPoolDetails model =
                    new CreateDesktopPoolDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.maximumSize,
                            this.standbySize,
                            this.shapeName,
                            this.shapeConfig,
                            this.useDedicatedVmHost,
                            this.isStorageEnabled,
                            this.storageSizeInGBs,
                            this.storageBackupPolicyId,
                            this.devicePolicy,
                            this.availabilityPolicy,
                            this.image,
                            this.networkConfiguration,
                            this.sessionLifecycleActions,
                            this.timeStartScheduled,
                            this.timeStopScheduled,
                            this.contactDetails,
                            this.arePrivilegedUsers,
                            this.availabilityDomain,
                            this.freeformTags,
                            this.definedTags,
                            this.nsgIds,
                            this.privateAccessDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDesktopPoolDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("maximumSize")) {
                this.maximumSize(model.getMaximumSize());
            }
            if (model.wasPropertyExplicitlySet("standbySize")) {
                this.standbySize(model.getStandbySize());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("useDedicatedVmHost")) {
                this.useDedicatedVmHost(model.getUseDedicatedVmHost());
            }
            if (model.wasPropertyExplicitlySet("isStorageEnabled")) {
                this.isStorageEnabled(model.getIsStorageEnabled());
            }
            if (model.wasPropertyExplicitlySet("storageSizeInGBs")) {
                this.storageSizeInGBs(model.getStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("storageBackupPolicyId")) {
                this.storageBackupPolicyId(model.getStorageBackupPolicyId());
            }
            if (model.wasPropertyExplicitlySet("devicePolicy")) {
                this.devicePolicy(model.getDevicePolicy());
            }
            if (model.wasPropertyExplicitlySet("availabilityPolicy")) {
                this.availabilityPolicy(model.getAvailabilityPolicy());
            }
            if (model.wasPropertyExplicitlySet("image")) {
                this.image(model.getImage());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
            }
            if (model.wasPropertyExplicitlySet("sessionLifecycleActions")) {
                this.sessionLifecycleActions(model.getSessionLifecycleActions());
            }
            if (model.wasPropertyExplicitlySet("timeStartScheduled")) {
                this.timeStartScheduled(model.getTimeStartScheduled());
            }
            if (model.wasPropertyExplicitlySet("timeStopScheduled")) {
                this.timeStopScheduled(model.getTimeStopScheduled());
            }
            if (model.wasPropertyExplicitlySet("contactDetails")) {
                this.contactDetails(model.getContactDetails());
            }
            if (model.wasPropertyExplicitlySet("arePrivilegedUsers")) {
                this.arePrivilegedUsers(model.getArePrivilegedUsers());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("privateAccessDetails")) {
                this.privateAccessDetails(model.getPrivateAccessDetails());
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

    /** The OCID of the compartment which will contain the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment which will contain the desktop pool.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A user friendly display name. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user friendly display name. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user friendly description providing additional information about the resource. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user friendly description providing additional information about the resource. Avoid
     * entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The maximum number of desktops permitted in the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumSize")
    private final Integer maximumSize;

    /**
     * The maximum number of desktops permitted in the desktop pool.
     *
     * @return the value
     */
    public Integer getMaximumSize() {
        return maximumSize;
    }

    /** The maximum number of standby desktops available in the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("standbySize")
    private final Integer standbySize;

    /**
     * The maximum number of standby desktops available in the desktop pool.
     *
     * @return the value
     */
    public Integer getStandbySize() {
        return standbySize;
    }

    /** The shape of the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape of the desktop pool.
     *
     * @return the value
     */
    public String getShapeName() {
        return shapeName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final CreateDesktopPoolShapeConfigDetails shapeConfig;

    public CreateDesktopPoolShapeConfigDetails getShapeConfig() {
        return shapeConfig;
    }

    /** Indicates whether the desktop pool uses dedicated virtual machine hosts. */
    public enum UseDedicatedVmHost implements com.oracle.bmc.http.internal.BmcEnum {
        True("TRUE"),
        False("FALSE"),
        Auto("AUTO"),
        ;

        private final String value;
        private static java.util.Map<String, UseDedicatedVmHost> map;

        static {
            map = new java.util.HashMap<>();
            for (UseDedicatedVmHost v : UseDedicatedVmHost.values()) {
                map.put(v.getValue(), v);
            }
        }

        UseDedicatedVmHost(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UseDedicatedVmHost create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UseDedicatedVmHost: " + key);
        }
    };
    /** Indicates whether the desktop pool uses dedicated virtual machine hosts. */
    @com.fasterxml.jackson.annotation.JsonProperty("useDedicatedVmHost")
    private final UseDedicatedVmHost useDedicatedVmHost;

    /**
     * Indicates whether the desktop pool uses dedicated virtual machine hosts.
     *
     * @return the value
     */
    public UseDedicatedVmHost getUseDedicatedVmHost() {
        return useDedicatedVmHost;
    }

    /** Indicates whether storage is enabled for the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("isStorageEnabled")
    private final Boolean isStorageEnabled;

    /**
     * Indicates whether storage is enabled for the desktop pool.
     *
     * @return the value
     */
    public Boolean getIsStorageEnabled() {
        return isStorageEnabled;
    }

    /** The size in GBs of the storage for the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInGBs")
    private final Integer storageSizeInGBs;

    /**
     * The size in GBs of the storage for the desktop pool.
     *
     * @return the value
     */
    public Integer getStorageSizeInGBs() {
        return storageSizeInGBs;
    }

    /** The backup policy OCID of the storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageBackupPolicyId")
    private final String storageBackupPolicyId;

    /**
     * The backup policy OCID of the storage.
     *
     * @return the value
     */
    public String getStorageBackupPolicyId() {
        return storageBackupPolicyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("devicePolicy")
    private final DesktopDevicePolicy devicePolicy;

    public DesktopDevicePolicy getDevicePolicy() {
        return devicePolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availabilityPolicy")
    private final DesktopAvailabilityPolicy availabilityPolicy;

    public DesktopAvailabilityPolicy getAvailabilityPolicy() {
        return availabilityPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final DesktopImage image;

    public DesktopImage getImage() {
        return image;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final DesktopNetworkConfiguration networkConfiguration;

    public DesktopNetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sessionLifecycleActions")
    private final CreateDesktopPoolDesktopSessionLifecycleActions sessionLifecycleActions;

    public CreateDesktopPoolDesktopSessionLifecycleActions getSessionLifecycleActions() {
        return sessionLifecycleActions;
    }

    /** The start time of the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStartScheduled")
    private final java.util.Date timeStartScheduled;

    /**
     * The start time of the desktop pool.
     *
     * @return the value
     */
    public java.util.Date getTimeStartScheduled() {
        return timeStartScheduled;
    }

    /** The stop time of the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStopScheduled")
    private final java.util.Date timeStopScheduled;

    /**
     * The stop time of the desktop pool.
     *
     * @return the value
     */
    public java.util.Date getTimeStopScheduled() {
        return timeStopScheduled;
    }

    /**
     * Contact information of the desktop pool administrator. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contactDetails")
    private final String contactDetails;

    /**
     * Contact information of the desktop pool administrator. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getContactDetails() {
        return contactDetails;
    }

    /** Indicates whether desktop pool users have administrative privileges on their desktop. */
    @com.fasterxml.jackson.annotation.JsonProperty("arePrivilegedUsers")
    private final Boolean arePrivilegedUsers;

    /**
     * Indicates whether desktop pool users have administrative privileges on their desktop.
     *
     * @return the value
     */
    public Boolean getArePrivilegedUsers() {
        return arePrivilegedUsers;
    }

    /** The availability domain of the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the desktop pool.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** A list of network security groups for the private access. */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of network security groups for the private access.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privateAccessDetails")
    private final CreateDesktopPoolPrivateAccessDetails privateAccessDetails;

    public CreateDesktopPoolPrivateAccessDetails getPrivateAccessDetails() {
        return privateAccessDetails;
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
        sb.append("CreateDesktopPoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", maximumSize=").append(String.valueOf(this.maximumSize));
        sb.append(", standbySize=").append(String.valueOf(this.standbySize));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", useDedicatedVmHost=").append(String.valueOf(this.useDedicatedVmHost));
        sb.append(", isStorageEnabled=").append(String.valueOf(this.isStorageEnabled));
        sb.append(", storageSizeInGBs=").append(String.valueOf(this.storageSizeInGBs));
        sb.append(", storageBackupPolicyId=").append(String.valueOf(this.storageBackupPolicyId));
        sb.append(", devicePolicy=").append(String.valueOf(this.devicePolicy));
        sb.append(", availabilityPolicy=").append(String.valueOf(this.availabilityPolicy));
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(", sessionLifecycleActions=")
                .append(String.valueOf(this.sessionLifecycleActions));
        sb.append(", timeStartScheduled=").append(String.valueOf(this.timeStartScheduled));
        sb.append(", timeStopScheduled=").append(String.valueOf(this.timeStopScheduled));
        sb.append(", contactDetails=").append(String.valueOf(this.contactDetails));
        sb.append(", arePrivilegedUsers=").append(String.valueOf(this.arePrivilegedUsers));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", privateAccessDetails=").append(String.valueOf(this.privateAccessDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDesktopPoolDetails)) {
            return false;
        }

        CreateDesktopPoolDetails other = (CreateDesktopPoolDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.maximumSize, other.maximumSize)
                && java.util.Objects.equals(this.standbySize, other.standbySize)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.useDedicatedVmHost, other.useDedicatedVmHost)
                && java.util.Objects.equals(this.isStorageEnabled, other.isStorageEnabled)
                && java.util.Objects.equals(this.storageSizeInGBs, other.storageSizeInGBs)
                && java.util.Objects.equals(this.storageBackupPolicyId, other.storageBackupPolicyId)
                && java.util.Objects.equals(this.devicePolicy, other.devicePolicy)
                && java.util.Objects.equals(this.availabilityPolicy, other.availabilityPolicy)
                && java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && java.util.Objects.equals(
                        this.sessionLifecycleActions, other.sessionLifecycleActions)
                && java.util.Objects.equals(this.timeStartScheduled, other.timeStartScheduled)
                && java.util.Objects.equals(this.timeStopScheduled, other.timeStopScheduled)
                && java.util.Objects.equals(this.contactDetails, other.contactDetails)
                && java.util.Objects.equals(this.arePrivilegedUsers, other.arePrivilegedUsers)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.privateAccessDetails, other.privateAccessDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.maximumSize == null ? 43 : this.maximumSize.hashCode());
        result = (result * PRIME) + (this.standbySize == null ? 43 : this.standbySize.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.useDedicatedVmHost == null
                                ? 43
                                : this.useDedicatedVmHost.hashCode());
        result =
                (result * PRIME)
                        + (this.isStorageEnabled == null ? 43 : this.isStorageEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeInGBs == null ? 43 : this.storageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.storageBackupPolicyId == null
                                ? 43
                                : this.storageBackupPolicyId.hashCode());
        result = (result * PRIME) + (this.devicePolicy == null ? 43 : this.devicePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityPolicy == null
                                ? 43
                                : this.availabilityPolicy.hashCode());
        result = (result * PRIME) + (this.image == null ? 43 : this.image.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionLifecycleActions == null
                                ? 43
                                : this.sessionLifecycleActions.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartScheduled == null
                                ? 43
                                : this.timeStartScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStopScheduled == null ? 43 : this.timeStopScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.contactDetails == null ? 43 : this.contactDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.arePrivilegedUsers == null
                                ? 43
                                : this.arePrivilegedUsers.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.privateAccessDetails == null
                                ? 43
                                : this.privateAccessDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
