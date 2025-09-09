/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Summary information for the specified mount target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MountTargetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MountTargetSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "displayName",
        "exportSetId",
        "id",
        "lifecycleState",
        "privateIpIds",
        "mountTargetIpv6Ids",
        "subnetId",
        "nsgIds",
        "timeBillingCycleEnd",
        "observedThroughput",
        "requestedThroughput",
        "reservedStorageCapacity",
        "timeCreated",
        "locks",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MountTargetSummary(
            String availabilityDomain,
            String compartmentId,
            String displayName,
            String exportSetId,
            String id,
            LifecycleState lifecycleState,
            java.util.List<String> privateIpIds,
            java.util.List<String> mountTargetIpv6Ids,
            String subnetId,
            java.util.List<String> nsgIds,
            java.util.Date timeBillingCycleEnd,
            Long observedThroughput,
            Long requestedThroughput,
            Long reservedStorageCapacity,
            java.util.Date timeCreated,
            java.util.List<ResourceLock> locks,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.exportSetId = exportSetId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.privateIpIds = privateIpIds;
        this.mountTargetIpv6Ids = mountTargetIpv6Ids;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.timeBillingCycleEnd = timeBillingCycleEnd;
        this.observedThroughput = observedThroughput;
        this.requestedThroughput = requestedThroughput;
        this.reservedStorageCapacity = reservedStorageCapacity;
        this.timeCreated = timeCreated;
        this.locks = locks;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain the mount target is in. May be unset as a blank or NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain the mount target is in. May be unset as a blank or NULL value.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the mount target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the mount target.
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
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My mount target}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My mount target}
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated export set. Controls what file systems will be exported using Network File
         * System (NFS) protocol on this mount target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
        private String exportSetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated export set. Controls what file systems will be exported using Network File
         * System (NFS) protocol on this mount target.
         *
         * @param exportSetId the value to set
         * @return this builder
         */
        public Builder exportSetId(String exportSetId) {
            this.exportSetId = exportSetId;
            this.__explicitlySet__.add("exportSetId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * mount target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * mount target.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The current state of the mount target. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the mount target.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The OCIDs of the private IP addresses associated with this mount target. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIpIds")
        private java.util.List<String> privateIpIds;

        /**
         * The OCIDs of the private IP addresses associated with this mount target.
         *
         * @param privateIpIds the value to set
         * @return this builder
         */
        public Builder privateIpIds(java.util.List<String> privateIpIds) {
            this.privateIpIds = privateIpIds;
            this.__explicitlySet__.add("privateIpIds");
            return this;
        }
        /** The OCIDs of the IPv6 addresses associated with this mount target. */
        @com.fasterxml.jackson.annotation.JsonProperty("mountTargetIpv6Ids")
        private java.util.List<String> mountTargetIpv6Ids;

        /**
         * The OCIDs of the IPv6 addresses associated with this mount target.
         *
         * @param mountTargetIpv6Ids the value to set
         * @return this builder
         */
        public Builder mountTargetIpv6Ids(java.util.List<String> mountTargetIpv6Ids) {
            this.mountTargetIpv6Ids = mountTargetIpv6Ids;
            this.__explicitlySet__.add("mountTargetIpv6Ids");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the mount target is in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the mount target is in.
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
         * A list of Network Security Group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this mount target. A maximum of 5 is allowed. Setting this to an empty array after
         * the list is created removes the mount target from all NSGs. For more information about
         * NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of Network Security Group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this mount target. A maximum of 5 is allowed. Setting this to an empty array after
         * the list is created removes the mount target from all NSGs. For more information about
         * NSGs, see [Security
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
         * The date and time the mount target current billing cycle will end, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. Once a cycle ends, it is
         * updated automatically to next timestamp which is after 30 days.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBillingCycleEnd")
        private java.util.Date timeBillingCycleEnd;

        /**
         * The date and time the mount target current billing cycle will end, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. Once a cycle ends, it is
         * updated automatically to next timestamp which is after 30 days.
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
        /**
         * Current billed throughput for mount target in Gbps. This corresponds to shape of mount
         * target. Available shapes and corresponding throughput are listed at [Mount Target
         * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("observedThroughput")
        private Long observedThroughput;

        /**
         * Current billed throughput for mount target in Gbps. This corresponds to shape of mount
         * target. Available shapes and corresponding throughput are listed at [Mount Target
         * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
         *
         * @param observedThroughput the value to set
         * @return this builder
         */
        public Builder observedThroughput(Long observedThroughput) {
            this.observedThroughput = observedThroughput;
            this.__explicitlySet__.add("observedThroughput");
            return this;
        }
        /** - New throughput for mount target at the end of billing cycle in Gbps. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestedThroughput")
        private Long requestedThroughput;

        /**
         * - New throughput for mount target at the end of billing cycle in Gbps.
         *
         * @param requestedThroughput the value to set
         * @return this builder
         */
        public Builder requestedThroughput(Long requestedThroughput) {
            this.requestedThroughput = requestedThroughput;
            this.__explicitlySet__.add("requestedThroughput");
            return this;
        }
        /**
         * - Reserved capacity (GB) associated with this mount target. Reserved capacity depends on
         * observedThroughput value of mount target. Value is listed at [Mount Target
         * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedStorageCapacity")
        private Long reservedStorageCapacity;

        /**
         * - Reserved capacity (GB) associated with this mount target. Reserved capacity depends on
         * observedThroughput value of mount target. Value is listed at [Mount Target
         * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
         *
         * @param reservedStorageCapacity the value to set
         * @return this builder
         */
        public Builder reservedStorageCapacity(Long reservedStorageCapacity) {
            this.reservedStorageCapacity = reservedStorageCapacity;
            this.__explicitlySet__.add("reservedStorageCapacity");
            return this;
        }
        /**
         * The date and time the mount target was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the mount target was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
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
        /**
         * System tags for this resource. System tags are applied to resources by internal OCI
         * services.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. System tags are applied to resources by internal OCI
         * services.
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MountTargetSummary build() {
            MountTargetSummary model =
                    new MountTargetSummary(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.displayName,
                            this.exportSetId,
                            this.id,
                            this.lifecycleState,
                            this.privateIpIds,
                            this.mountTargetIpv6Ids,
                            this.subnetId,
                            this.nsgIds,
                            this.timeBillingCycleEnd,
                            this.observedThroughput,
                            this.requestedThroughput,
                            this.reservedStorageCapacity,
                            this.timeCreated,
                            this.locks,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MountTargetSummary model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("exportSetId")) {
                this.exportSetId(model.getExportSetId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("privateIpIds")) {
                this.privateIpIds(model.getPrivateIpIds());
            }
            if (model.wasPropertyExplicitlySet("mountTargetIpv6Ids")) {
                this.mountTargetIpv6Ids(model.getMountTargetIpv6Ids());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("timeBillingCycleEnd")) {
                this.timeBillingCycleEnd(model.getTimeBillingCycleEnd());
            }
            if (model.wasPropertyExplicitlySet("observedThroughput")) {
                this.observedThroughput(model.getObservedThroughput());
            }
            if (model.wasPropertyExplicitlySet("requestedThroughput")) {
                this.requestedThroughput(model.getRequestedThroughput());
            }
            if (model.wasPropertyExplicitlySet("reservedStorageCapacity")) {
                this.reservedStorageCapacity(model.getReservedStorageCapacity());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
     * The availability domain the mount target is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain the mount target is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the mount target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the mount target.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My mount target}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My mount target}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated export set. Controls what file systems will be exported using Network File System
     * (NFS) protocol on this mount target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
    private final String exportSetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated export set. Controls what file systems will be exported using Network File System
     * (NFS) protocol on this mount target.
     *
     * @return the value
     */
    public String getExportSetId() {
        return exportSetId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * mount target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * mount target.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current state of the mount target. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Updating("UPDATING"),

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
    /** The current state of the mount target. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the mount target.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The OCIDs of the private IP addresses associated with this mount target. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIpIds")
    private final java.util.List<String> privateIpIds;

    /**
     * The OCIDs of the private IP addresses associated with this mount target.
     *
     * @return the value
     */
    public java.util.List<String> getPrivateIpIds() {
        return privateIpIds;
    }

    /** The OCIDs of the IPv6 addresses associated with this mount target. */
    @com.fasterxml.jackson.annotation.JsonProperty("mountTargetIpv6Ids")
    private final java.util.List<String> mountTargetIpv6Ids;

    /**
     * The OCIDs of the IPv6 addresses associated with this mount target.
     *
     * @return the value
     */
    public java.util.List<String> getMountTargetIpv6Ids() {
        return mountTargetIpv6Ids;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the mount target is in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the mount target is in.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * A list of Network Security Group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this mount target. A maximum of 5 is allowed. Setting this to an empty array after the
     * list is created removes the mount target from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of Network Security Group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this mount target. A maximum of 5 is allowed. Setting this to an empty array after the
     * list is created removes the mount target from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The date and time the mount target current billing cycle will end, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. Once a cycle ends, it is updated
     * automatically to next timestamp which is after 30 days.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBillingCycleEnd")
    private final java.util.Date timeBillingCycleEnd;

    /**
     * The date and time the mount target current billing cycle will end, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. Once a cycle ends, it is updated
     * automatically to next timestamp which is after 30 days.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeBillingCycleEnd() {
        return timeBillingCycleEnd;
    }

    /**
     * Current billed throughput for mount target in Gbps. This corresponds to shape of mount
     * target. Available shapes and corresponding throughput are listed at [Mount Target
     * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedThroughput")
    private final Long observedThroughput;

    /**
     * Current billed throughput for mount target in Gbps. This corresponds to shape of mount
     * target. Available shapes and corresponding throughput are listed at [Mount Target
     * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
     *
     * @return the value
     */
    public Long getObservedThroughput() {
        return observedThroughput;
    }

    /** - New throughput for mount target at the end of billing cycle in Gbps. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedThroughput")
    private final Long requestedThroughput;

    /**
     * - New throughput for mount target at the end of billing cycle in Gbps.
     *
     * @return the value
     */
    public Long getRequestedThroughput() {
        return requestedThroughput;
    }

    /**
     * - Reserved capacity (GB) associated with this mount target. Reserved capacity depends on
     * observedThroughput value of mount target. Value is listed at [Mount Target
     * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedStorageCapacity")
    private final Long reservedStorageCapacity;

    /**
     * - Reserved capacity (GB) associated with this mount target. Reserved capacity depends on
     * observedThroughput value of mount target. Value is listed at [Mount Target
     * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
     *
     * @return the value
     */
    public Long getReservedStorageCapacity() {
        return reservedStorageCapacity;
    }

    /**
     * The date and time the mount target was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the mount target was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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

    /**
     * System tags for this resource. System tags are applied to resources by internal OCI services.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. System tags are applied to resources by internal OCI services.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("MountTargetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", exportSetId=").append(String.valueOf(this.exportSetId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", privateIpIds=").append(String.valueOf(this.privateIpIds));
        sb.append(", mountTargetIpv6Ids=").append(String.valueOf(this.mountTargetIpv6Ids));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", timeBillingCycleEnd=").append(String.valueOf(this.timeBillingCycleEnd));
        sb.append(", observedThroughput=").append(String.valueOf(this.observedThroughput));
        sb.append(", requestedThroughput=").append(String.valueOf(this.requestedThroughput));
        sb.append(", reservedStorageCapacity=")
                .append(String.valueOf(this.reservedStorageCapacity));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MountTargetSummary)) {
            return false;
        }

        MountTargetSummary other = (MountTargetSummary) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.exportSetId, other.exportSetId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.privateIpIds, other.privateIpIds)
                && java.util.Objects.equals(this.mountTargetIpv6Ids, other.mountTargetIpv6Ids)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.timeBillingCycleEnd, other.timeBillingCycleEnd)
                && java.util.Objects.equals(this.observedThroughput, other.observedThroughput)
                && java.util.Objects.equals(this.requestedThroughput, other.requestedThroughput)
                && java.util.Objects.equals(
                        this.reservedStorageCapacity, other.reservedStorageCapacity)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.locks, other.locks)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.exportSetId == null ? 43 : this.exportSetId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.privateIpIds == null ? 43 : this.privateIpIds.hashCode());
        result =
                (result * PRIME)
                        + (this.mountTargetIpv6Ids == null
                                ? 43
                                : this.mountTargetIpv6Ids.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBillingCycleEnd == null
                                ? 43
                                : this.timeBillingCycleEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.observedThroughput == null
                                ? 43
                                : this.observedThroughput.hashCode());
        result =
                (result * PRIME)
                        + (this.requestedThroughput == null
                                ? 43
                                : this.requestedThroughput.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedStorageCapacity == null
                                ? 43
                                : this.reservedStorageCapacity.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
