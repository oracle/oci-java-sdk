/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * An allocation of [Oracle Cloud VMware Solution](https://docs.oracle.com/iaas/Content/VMware/Concepts/ocvsoverview.htm)
 * Bring-Your-Own-License (BYOL).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ByolAllocationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ByolAllocationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "lifecycleState",
        "softwareType",
        "allocatedUnits",
        "availableUnits",
        "timeTermStart",
        "timeTermEnd",
        "byolId",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ByolAllocationSummary(
            String id,
            String compartmentId,
            String displayName,
            ByolAllocation.LifecycleState lifecycleState,
            ByolAllocation.SoftwareType softwareType,
            Integer allocatedUnits,
            Integer availableUnits,
            java.util.Date timeTermStart,
            java.util.Date timeTermEnd,
            String byolId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.softwareType = softwareType;
        this.allocatedUnits = allocatedUnits;
        this.availableUnits = availableUnits;
        this.timeTermStart = timeTermStart;
        this.timeTermEnd = timeTermEnd;
        this.byolId = byolId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL Allocation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL Allocation.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the BYOL Allocation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the BYOL Allocation.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A descriptive name for the BYOL Allocation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the BYOL Allocation.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The current state of the BYOL Allocation.
         * Accepted values are:
         * - CREATING
         * - ACTIVE
         * - INACTIVE
         * - UPDATING
         * - DELETING
         * - DELETED
         * - FAILED
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ByolAllocation.LifecycleState lifecycleState;

        /**
         * The current state of the BYOL Allocation.
         * Accepted values are:
         * - CREATING
         * - ACTIVE
         * - INACTIVE
         * - UPDATING
         * - DELETING
         * - DELETED
         * - FAILED
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ByolAllocation.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The type of VMware software the BYOL Allocation applies to.
         * Supported values:
         * - VCF (VMware Cloud Foundation)
         * - VSAN (VMware vSAN)
         * - VDEFEND (VMware vDefend Firewall)
         * - AVI_LOAD_BALANCER (VMware Avi Load Balancer)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareType")
        private ByolAllocation.SoftwareType softwareType;

        /**
         * The type of VMware software the BYOL Allocation applies to.
         * Supported values:
         * - VCF (VMware Cloud Foundation)
         * - VSAN (VMware vSAN)
         * - VDEFEND (VMware vDefend Firewall)
         * - AVI_LOAD_BALANCER (VMware Avi Load Balancer)
         *
         * @param softwareType the value to set
         * @return this builder
         **/
        public Builder softwareType(ByolAllocation.SoftwareType softwareType) {
            this.softwareType = softwareType;
            this.__explicitlySet__.add("softwareType");
            return this;
        }
        /**
         * The quantity of licensed units that allocated to this region.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allocatedUnits")
        private Integer allocatedUnits;

        /**
         * The quantity of licensed units that allocated to this region.
         *
         * @param allocatedUnits the value to set
         * @return this builder
         **/
        public Builder allocatedUnits(Integer allocatedUnits) {
            this.allocatedUnits = allocatedUnits;
            this.__explicitlySet__.add("allocatedUnits");
            return this;
        }
        /**
         * The quantity of licensed units that not yet consumed by resources.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableUnits")
        private Integer availableUnits;

        /**
         * The quantity of licensed units that not yet consumed by resources.
         *
         * @param availableUnits the value to set
         * @return this builder
         **/
        public Builder availableUnits(Integer availableUnits) {
            this.availableUnits = availableUnits;
            this.__explicitlySet__.add("availableUnits");
            return this;
        }
        /**
         * The date and time when the BYOL Allocation becomes active. VMware software functionality cannot begin before this time.
         * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTermStart")
        private java.util.Date timeTermStart;

        /**
         * The date and time when the BYOL Allocation becomes active. VMware software functionality cannot begin before this time.
         * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeTermStart the value to set
         * @return this builder
         **/
        public Builder timeTermStart(java.util.Date timeTermStart) {
            this.timeTermStart = timeTermStart;
            this.__explicitlySet__.add("timeTermStart");
            return this;
        }
        /**
         * The date and time when the BYOL Allocation expires and becomes inactive.
         * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTermEnd")
        private java.util.Date timeTermEnd;

        /**
         * The date and time when the BYOL Allocation expires and becomes inactive.
         * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeTermEnd the value to set
         * @return this builder
         **/
        public Builder timeTermEnd(java.util.Date timeTermEnd) {
            this.timeTermEnd = timeTermEnd;
            this.__explicitlySet__.add("timeTermEnd");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL resource from which this BYOL Allocation is derived.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("byolId")
        private String byolId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL resource from which this BYOL Allocation is derived.
         *
         * @param byolId the value to set
         * @return this builder
         **/
        public Builder byolId(String byolId) {
            this.byolId = byolId;
            this.__explicitlySet__.add("byolId");
            return this;
        }
        /**
         * The date and time the BYOL Allocation was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the BYOL Allocation was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the BYOL Allocation was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the BYOL Allocation was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ByolAllocationSummary build() {
            ByolAllocationSummary model =
                    new ByolAllocationSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.lifecycleState,
                            this.softwareType,
                            this.allocatedUnits,
                            this.availableUnits,
                            this.timeTermStart,
                            this.timeTermEnd,
                            this.byolId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ByolAllocationSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("softwareType")) {
                this.softwareType(model.getSoftwareType());
            }
            if (model.wasPropertyExplicitlySet("allocatedUnits")) {
                this.allocatedUnits(model.getAllocatedUnits());
            }
            if (model.wasPropertyExplicitlySet("availableUnits")) {
                this.availableUnits(model.getAvailableUnits());
            }
            if (model.wasPropertyExplicitlySet("timeTermStart")) {
                this.timeTermStart(model.getTimeTermStart());
            }
            if (model.wasPropertyExplicitlySet("timeTermEnd")) {
                this.timeTermEnd(model.getTimeTermEnd());
            }
            if (model.wasPropertyExplicitlySet("byolId")) {
                this.byolId(model.getByolId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL Allocation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL Allocation.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the BYOL Allocation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the BYOL Allocation.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A descriptive name for the BYOL Allocation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the BYOL Allocation.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The current state of the BYOL Allocation.
     * Accepted values are:
     * - CREATING
     * - ACTIVE
     * - INACTIVE
     * - UPDATING
     * - DELETING
     * - DELETED
     * - FAILED
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ByolAllocation.LifecycleState lifecycleState;

    /**
     * The current state of the BYOL Allocation.
     * Accepted values are:
     * - CREATING
     * - ACTIVE
     * - INACTIVE
     * - UPDATING
     * - DELETING
     * - DELETED
     * - FAILED
     *
     * @return the value
     **/
    public ByolAllocation.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The type of VMware software the BYOL Allocation applies to.
     * Supported values:
     * - VCF (VMware Cloud Foundation)
     * - VSAN (VMware vSAN)
     * - VDEFEND (VMware vDefend Firewall)
     * - AVI_LOAD_BALANCER (VMware Avi Load Balancer)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareType")
    private final ByolAllocation.SoftwareType softwareType;

    /**
     * The type of VMware software the BYOL Allocation applies to.
     * Supported values:
     * - VCF (VMware Cloud Foundation)
     * - VSAN (VMware vSAN)
     * - VDEFEND (VMware vDefend Firewall)
     * - AVI_LOAD_BALANCER (VMware Avi Load Balancer)
     *
     * @return the value
     **/
    public ByolAllocation.SoftwareType getSoftwareType() {
        return softwareType;
    }

    /**
     * The quantity of licensed units that allocated to this region.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedUnits")
    private final Integer allocatedUnits;

    /**
     * The quantity of licensed units that allocated to this region.
     *
     * @return the value
     **/
    public Integer getAllocatedUnits() {
        return allocatedUnits;
    }

    /**
     * The quantity of licensed units that not yet consumed by resources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableUnits")
    private final Integer availableUnits;

    /**
     * The quantity of licensed units that not yet consumed by resources.
     *
     * @return the value
     **/
    public Integer getAvailableUnits() {
        return availableUnits;
    }

    /**
     * The date and time when the BYOL Allocation becomes active. VMware software functionality cannot begin before this time.
     * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTermStart")
    private final java.util.Date timeTermStart;

    /**
     * The date and time when the BYOL Allocation becomes active. VMware software functionality cannot begin before this time.
     * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeTermStart() {
        return timeTermStart;
    }

    /**
     * The date and time when the BYOL Allocation expires and becomes inactive.
     * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTermEnd")
    private final java.util.Date timeTermEnd;

    /**
     * The date and time when the BYOL Allocation expires and becomes inactive.
     * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeTermEnd() {
        return timeTermEnd;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL resource from which this BYOL Allocation is derived.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("byolId")
    private final String byolId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL resource from which this BYOL Allocation is derived.
     *
     * @return the value
     **/
    public String getByolId() {
        return byolId;
    }

    /**
     * The date and time the BYOL Allocation was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the BYOL Allocation was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the BYOL Allocation was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the BYOL Allocation was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ByolAllocationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", softwareType=").append(String.valueOf(this.softwareType));
        sb.append(", allocatedUnits=").append(String.valueOf(this.allocatedUnits));
        sb.append(", availableUnits=").append(String.valueOf(this.availableUnits));
        sb.append(", timeTermStart=").append(String.valueOf(this.timeTermStart));
        sb.append(", timeTermEnd=").append(String.valueOf(this.timeTermEnd));
        sb.append(", byolId=").append(String.valueOf(this.byolId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof ByolAllocationSummary)) {
            return false;
        }

        ByolAllocationSummary other = (ByolAllocationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.softwareType, other.softwareType)
                && java.util.Objects.equals(this.allocatedUnits, other.allocatedUnits)
                && java.util.Objects.equals(this.availableUnits, other.availableUnits)
                && java.util.Objects.equals(this.timeTermStart, other.timeTermStart)
                && java.util.Objects.equals(this.timeTermEnd, other.timeTermEnd)
                && java.util.Objects.equals(this.byolId, other.byolId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.softwareType == null ? 43 : this.softwareType.hashCode());
        result =
                (result * PRIME)
                        + (this.allocatedUnits == null ? 43 : this.allocatedUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.availableUnits == null ? 43 : this.availableUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTermStart == null ? 43 : this.timeTermStart.hashCode());
        result = (result * PRIME) + (this.timeTermEnd == null ? 43 : this.timeTermEnd.hashCode());
        result = (result * PRIME) + (this.byolId == null ? 43 : this.byolId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
