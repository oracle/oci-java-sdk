/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * A Lustre file system is a parallel file system that is used as a storage solution for HPC/AI/ML
 * workloads. For more information, see [File Storage with
 * Lustre](https://docs.oracle.com/iaas/Content/lustre/home.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LustreFileSystem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LustreFileSystem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "availabilityDomain",
        "displayName",
        "fileSystemDescription",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags",
        "nsgIds",
        "kmsKeyId",
        "capacityInGBs",
        "subnetId",
        "performanceTier",
        "managementServiceAddress",
        "fileSystemName",
        "lnet",
        "majorVersion",
        "clusterPlacementGroupId",
        "timeBillingCycleEnd",
        "maintenanceWindow",
        "rootSquashConfiguration"
    })
    public LustreFileSystem(
            String id,
            String compartmentId,
            String availabilityDomain,
            String displayName,
            String fileSystemDescription,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<String> nsgIds,
            String kmsKeyId,
            Integer capacityInGBs,
            String subnetId,
            PerformanceTier performanceTier,
            String managementServiceAddress,
            String fileSystemName,
            String lnet,
            String majorVersion,
            String clusterPlacementGroupId,
            java.util.Date timeBillingCycleEnd,
            MaintenanceWindow maintenanceWindow,
            RootSquashConfiguration rootSquashConfiguration) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.displayName = displayName;
        this.fileSystemDescription = fileSystemDescription;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.nsgIds = nsgIds;
        this.kmsKeyId = kmsKeyId;
        this.capacityInGBs = capacityInGBs;
        this.subnetId = subnetId;
        this.performanceTier = performanceTier;
        this.managementServiceAddress = managementServiceAddress;
        this.fileSystemName = fileSystemName;
        this.lnet = lnet;
        this.majorVersion = majorVersion;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.timeBillingCycleEnd = timeBillingCycleEnd;
        this.maintenanceWindow = maintenanceWindow;
        this.rootSquashConfiguration = rootSquashConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Lustre file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Lustre file system.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Lustre file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Lustre file system.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The availability domain the file system is in. May be unset as a blank or NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain the file system is in. May be unset as a blank or NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
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
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My Lustre file system}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My Lustre file system}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Short description of the Lustre file system. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemDescription")
        private String fileSystemDescription;

        /**
         * Short description of the Lustre file system. Avoid entering confidential information.
         *
         * @param fileSystemDescription the value to set
         * @return this builder
         */
        public Builder fileSystemDescription(String fileSystemDescription) {
            this.fileSystemDescription = fileSystemDescription;
            this.__explicitlySet__.add("fileSystemDescription");
            return this;
        }
        /**
         * The date and time the Lustre file system was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2024-04-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Lustre file system was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2024-04-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the Lustre file system was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2024-04-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the Lustre file system was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2024-04-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the Lustre file system. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Lustre file system.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the Lustre file system in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the Lustre file system in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * A list of Network Security Group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this lustre file system. A maximum of 5 is allowed. Setting this to an empty array
         * after the list is created removes the lustre file system from all NSGs. For more
         * information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of Network Security Group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this lustre file system. A maximum of 5 is allowed. Setting this to an empty array
         * after the list is created removes the lustre file system from all NSGs. For more
         * information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * KMS key used to encrypt the encryption keys associated with this file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * KMS key used to encrypt the encryption keys associated with this file system.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /** Capacity of the Lustre file system in GB. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityInGBs")
        private Integer capacityInGBs;

        /**
         * Capacity of the Lustre file system in GB.
         *
         * @param capacityInGBs the value to set
         * @return this builder
         */
        public Builder capacityInGBs(Integer capacityInGBs) {
            this.capacityInGBs = capacityInGBs;
            this.__explicitlySet__.add("capacityInGBs");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the Lustre file system is in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the Lustre file system is in.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents
         * 125 megabytes per second per terabyte.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("performanceTier")
        private PerformanceTier performanceTier;

        /**
         * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents
         * 125 megabytes per second per terabyte.
         *
         * @param performanceTier the value to set
         * @return this builder
         */
        public Builder performanceTier(PerformanceTier performanceTier) {
            this.performanceTier = performanceTier;
            this.__explicitlySet__.add("performanceTier");
            return this;
        }
        /**
         * The IPv4 address of MGS (Lustre Management Service) used by clients to mount the file
         * system. For example '10.0.0.4'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementServiceAddress")
        private String managementServiceAddress;

        /**
         * The IPv4 address of MGS (Lustre Management Service) used by clients to mount the file
         * system. For example '10.0.0.4'.
         *
         * @param managementServiceAddress the value to set
         * @return this builder
         */
        public Builder managementServiceAddress(String managementServiceAddress) {
            this.managementServiceAddress = managementServiceAddress;
            this.__explicitlySet__.add("managementServiceAddress");
            return this;
        }
        /**
         * The Lustre file system name. This is used in mount commands and other aspects of the
         * client command line interface. The default file system name is 'lustre'. The file system
         * name is limited to 8 characters. Allowed characters are lower and upper case English
         * letters, numbers, and '_'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemName")
        private String fileSystemName;

        /**
         * The Lustre file system name. This is used in mount commands and other aspects of the
         * client command line interface. The default file system name is 'lustre'. The file system
         * name is limited to 8 characters. Allowed characters are lower and upper case English
         * letters, numbers, and '_'.
         *
         * @param fileSystemName the value to set
         * @return this builder
         */
        public Builder fileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            this.__explicitlySet__.add("fileSystemName");
            return this;
        }
        /**
         * Type of network used by clients to mount the file system.
         *
         * <p>Example: {@code tcp}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lnet")
        private String lnet;

        /**
         * Type of network used by clients to mount the file system.
         *
         * <p>Example: {@code tcp}
         *
         * @param lnet the value to set
         * @return this builder
         */
        public Builder lnet(String lnet) {
            this.lnet = lnet;
            this.__explicitlySet__.add("lnet");
            return this;
        }
        /** Major version of Lustre running in the Lustre file system. Example: {@code 2.15} */
        @com.fasterxml.jackson.annotation.JsonProperty("majorVersion")
        private String majorVersion;

        /**
         * Major version of Lustre running in the Lustre file system. Example: {@code 2.15}
         *
         * @param majorVersion the value to set
         * @return this builder
         */
        public Builder majorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            this.__explicitlySet__.add("majorVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group in which the Lustre file system exists.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group in which the Lustre file system exists.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }
        /**
         * The date and time that the current billing cycle for the file system will end, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. After the current
         * cycle ends, this date is updated automatically to the next timestamp, which is 30 days
         * later. File systems deleted earlier than this time will still incur charges until the
         * billing cycle ends.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBillingCycleEnd")
        private java.util.Date timeBillingCycleEnd;

        /**
         * The date and time that the current billing cycle for the file system will end, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. After the current
         * cycle ends, this date is updated automatically to the next timestamp, which is 30 days
         * later. File systems deleted earlier than this time will still incur charges until the
         * billing cycle ends.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeBillingCycleEnd the value to set
         * @return this builder
         */
        public Builder timeBillingCycleEnd(java.util.Date timeBillingCycleEnd) {
            this.timeBillingCycleEnd = timeBillingCycleEnd;
            this.__explicitlySet__.add("timeBillingCycleEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rootSquashConfiguration")
        private RootSquashConfiguration rootSquashConfiguration;

        public Builder rootSquashConfiguration(RootSquashConfiguration rootSquashConfiguration) {
            this.rootSquashConfiguration = rootSquashConfiguration;
            this.__explicitlySet__.add("rootSquashConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LustreFileSystem build() {
            LustreFileSystem model =
                    new LustreFileSystem(
                            this.id,
                            this.compartmentId,
                            this.availabilityDomain,
                            this.displayName,
                            this.fileSystemDescription,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.nsgIds,
                            this.kmsKeyId,
                            this.capacityInGBs,
                            this.subnetId,
                            this.performanceTier,
                            this.managementServiceAddress,
                            this.fileSystemName,
                            this.lnet,
                            this.majorVersion,
                            this.clusterPlacementGroupId,
                            this.timeBillingCycleEnd,
                            this.maintenanceWindow,
                            this.rootSquashConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LustreFileSystem model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("fileSystemDescription")) {
                this.fileSystemDescription(model.getFileSystemDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("capacityInGBs")) {
                this.capacityInGBs(model.getCapacityInGBs());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("performanceTier")) {
                this.performanceTier(model.getPerformanceTier());
            }
            if (model.wasPropertyExplicitlySet("managementServiceAddress")) {
                this.managementServiceAddress(model.getManagementServiceAddress());
            }
            if (model.wasPropertyExplicitlySet("fileSystemName")) {
                this.fileSystemName(model.getFileSystemName());
            }
            if (model.wasPropertyExplicitlySet("lnet")) {
                this.lnet(model.getLnet());
            }
            if (model.wasPropertyExplicitlySet("majorVersion")) {
                this.majorVersion(model.getMajorVersion());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("timeBillingCycleEnd")) {
                this.timeBillingCycleEnd(model.getTimeBillingCycleEnd());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("rootSquashConfiguration")) {
                this.rootSquashConfiguration(model.getRootSquashConfiguration());
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
     * Lustre file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Lustre file system.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Lustre file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Lustre file system.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The availability domain the file system is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain the file system is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My Lustre file system}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My Lustre file system}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Short description of the Lustre file system. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemDescription")
    private final String fileSystemDescription;

    /**
     * Short description of the Lustre file system. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getFileSystemDescription() {
        return fileSystemDescription;
    }

    /**
     * The date and time the Lustre file system was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2024-04-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Lustre file system was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2024-04-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Lustre file system was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2024-04-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the Lustre file system was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2024-04-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Lustre file system. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of the Lustre file system. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Lustre file system.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the Lustre file system in more detail. For
     * example, can be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the Lustre file system in more detail. For
     * example, can be used to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * A list of Network Security Group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this lustre file system. A maximum of 5 is allowed. Setting this to an empty array after
     * the list is created removes the lustre file system from all NSGs. For more information about
     * NSGs, see [Security
     * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of Network Security Group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this lustre file system. A maximum of 5 is allowed. Setting this to an empty array after
     * the list is created removes the lustre file system from all NSGs. For more information about
     * NSGs, see [Security
     * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the KMS
     * key used to encrypt the encryption keys associated with this file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the KMS
     * key used to encrypt the encryption keys associated with this file system.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /** Capacity of the Lustre file system in GB. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityInGBs")
    private final Integer capacityInGBs;

    /**
     * Capacity of the Lustre file system in GB.
     *
     * @return the value
     */
    public Integer getCapacityInGBs() {
        return capacityInGBs;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the Lustre file system is in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the Lustre file system is in.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents 125
     * megabytes per second per terabyte.
     */
    public enum PerformanceTier implements com.oracle.bmc.http.internal.BmcEnum {
        MbpsPerTb125("MBPS_PER_TB_125"),
        MbpsPerTb250("MBPS_PER_TB_250"),
        MbpsPerTb500("MBPS_PER_TB_500"),
        MbpsPerTb1000("MBPS_PER_TB_1000"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PerformanceTier.class);

        private final String value;
        private static java.util.Map<String, PerformanceTier> map;

        static {
            map = new java.util.HashMap<>();
            for (PerformanceTier v : PerformanceTier.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PerformanceTier(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PerformanceTier create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PerformanceTier', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents 125
     * megabytes per second per terabyte.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performanceTier")
    private final PerformanceTier performanceTier;

    /**
     * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents 125
     * megabytes per second per terabyte.
     *
     * @return the value
     */
    public PerformanceTier getPerformanceTier() {
        return performanceTier;
    }

    /**
     * The IPv4 address of MGS (Lustre Management Service) used by clients to mount the file system.
     * For example '10.0.0.4'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementServiceAddress")
    private final String managementServiceAddress;

    /**
     * The IPv4 address of MGS (Lustre Management Service) used by clients to mount the file system.
     * For example '10.0.0.4'.
     *
     * @return the value
     */
    public String getManagementServiceAddress() {
        return managementServiceAddress;
    }

    /**
     * The Lustre file system name. This is used in mount commands and other aspects of the client
     * command line interface. The default file system name is 'lustre'. The file system name is
     * limited to 8 characters. Allowed characters are lower and upper case English letters,
     * numbers, and '_'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemName")
    private final String fileSystemName;

    /**
     * The Lustre file system name. This is used in mount commands and other aspects of the client
     * command line interface. The default file system name is 'lustre'. The file system name is
     * limited to 8 characters. Allowed characters are lower and upper case English letters,
     * numbers, and '_'.
     *
     * @return the value
     */
    public String getFileSystemName() {
        return fileSystemName;
    }

    /**
     * Type of network used by clients to mount the file system.
     *
     * <p>Example: {@code tcp}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lnet")
    private final String lnet;

    /**
     * Type of network used by clients to mount the file system.
     *
     * <p>Example: {@code tcp}
     *
     * @return the value
     */
    public String getLnet() {
        return lnet;
    }

    /** Major version of Lustre running in the Lustre file system. Example: {@code 2.15} */
    @com.fasterxml.jackson.annotation.JsonProperty("majorVersion")
    private final String majorVersion;

    /**
     * Major version of Lustre running in the Lustre file system. Example: {@code 2.15}
     *
     * @return the value
     */
    public String getMajorVersion() {
        return majorVersion;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group in which the Lustre file system exists.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group in which the Lustre file system exists.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    /**
     * The date and time that the current billing cycle for the file system will end, expressed in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. After the current cycle
     * ends, this date is updated automatically to the next timestamp, which is 30 days later. File
     * systems deleted earlier than this time will still incur charges until the billing cycle ends.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBillingCycleEnd")
    private final java.util.Date timeBillingCycleEnd;

    /**
     * The date and time that the current billing cycle for the file system will end, expressed in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. After the current cycle
     * ends, this date is updated automatically to the next timestamp, which is 30 days later. File
     * systems deleted earlier than this time will still incur charges until the billing cycle ends.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeBillingCycleEnd() {
        return timeBillingCycleEnd;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rootSquashConfiguration")
    private final RootSquashConfiguration rootSquashConfiguration;

    public RootSquashConfiguration getRootSquashConfiguration() {
        return rootSquashConfiguration;
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
        sb.append("LustreFileSystem(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", fileSystemDescription=").append(String.valueOf(this.fileSystemDescription));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", capacityInGBs=").append(String.valueOf(this.capacityInGBs));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", performanceTier=").append(String.valueOf(this.performanceTier));
        sb.append(", managementServiceAddress=")
                .append(String.valueOf(this.managementServiceAddress));
        sb.append(", fileSystemName=").append(String.valueOf(this.fileSystemName));
        sb.append(", lnet=").append(String.valueOf(this.lnet));
        sb.append(", majorVersion=").append(String.valueOf(this.majorVersion));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", timeBillingCycleEnd=").append(String.valueOf(this.timeBillingCycleEnd));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", rootSquashConfiguration=")
                .append(String.valueOf(this.rootSquashConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LustreFileSystem)) {
            return false;
        }

        LustreFileSystem other = (LustreFileSystem) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.fileSystemDescription, other.fileSystemDescription)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.capacityInGBs, other.capacityInGBs)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.performanceTier, other.performanceTier)
                && java.util.Objects.equals(
                        this.managementServiceAddress, other.managementServiceAddress)
                && java.util.Objects.equals(this.fileSystemName, other.fileSystemName)
                && java.util.Objects.equals(this.lnet, other.lnet)
                && java.util.Objects.equals(this.majorVersion, other.majorVersion)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.timeBillingCycleEnd, other.timeBillingCycleEnd)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(
                        this.rootSquashConfiguration, other.rootSquashConfiguration)
                && super.equals(other);
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
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemDescription == null
                                ? 43
                                : this.fileSystemDescription.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityInGBs == null ? 43 : this.capacityInGBs.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.performanceTier == null ? 43 : this.performanceTier.hashCode());
        result =
                (result * PRIME)
                        + (this.managementServiceAddress == null
                                ? 43
                                : this.managementServiceAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemName == null ? 43 : this.fileSystemName.hashCode());
        result = (result * PRIME) + (this.lnet == null ? 43 : this.lnet.hashCode());
        result = (result * PRIME) + (this.majorVersion == null ? 43 : this.majorVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBillingCycleEnd == null
                                ? 43
                                : this.timeBillingCycleEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.rootSquashConfiguration == null
                                ? 43
                                : this.rootSquashConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
