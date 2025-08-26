/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Summary information for a compute GPU memory fabric. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeGpuMemoryFabricSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeGpuMemoryFabricSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "computeHpcIslandId",
        "computeNetworkBlockId",
        "computeLocalBlockId",
        "lifecycleState",
        "fabricHealth",
        "totalHostCount",
        "availableHostCount",
        "healthyHostCount",
        "timeCreated",
        "definedTags",
        "freeformTags",
        "systemTags",
        "displayName"
    })
    public ComputeGpuMemoryFabricSummary(
            String id,
            String compartmentId,
            String computeHpcIslandId,
            String computeNetworkBlockId,
            String computeLocalBlockId,
            ComputeGpuMemoryFabric.LifecycleState lifecycleState,
            ComputeGpuMemoryFabric.FabricHealth fabricHealth,
            Long totalHostCount,
            Long availableHostCount,
            Long healthyHostCount,
            java.util.Date timeCreated,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String displayName) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.computeHpcIslandId = computeHpcIslandId;
        this.computeNetworkBlockId = computeNetworkBlockId;
        this.computeLocalBlockId = computeLocalBlockId;
        this.lifecycleState = lifecycleState;
        this.fabricHealth = fabricHealth;
        this.totalHostCount = totalHostCount;
        this.availableHostCount = availableHostCount;
        this.healthyHostCount = healthyHostCount;
        this.timeCreated = timeCreated;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Customer-unique GPU memory fabric
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Customer-unique GPU memory fabric
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * compartment. This should always be the root compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * compartment. This should always be the root compartment.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique HPC Island
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeHpcIslandId")
        private String computeHpcIslandId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique HPC Island
         *
         * @param computeHpcIslandId the value to set
         * @return this builder
         */
        public Builder computeHpcIslandId(String computeHpcIslandId) {
            this.computeHpcIslandId = computeHpcIslandId;
            this.__explicitlySet__.add("computeHpcIslandId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique Network Block
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeNetworkBlockId")
        private String computeNetworkBlockId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique Network Block
         *
         * @param computeNetworkBlockId the value to set
         * @return this builder
         */
        public Builder computeNetworkBlockId(String computeNetworkBlockId) {
            this.computeNetworkBlockId = computeNetworkBlockId;
            this.__explicitlySet__.add("computeNetworkBlockId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique Local Block
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeLocalBlockId")
        private String computeLocalBlockId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique Local Block
         *
         * @param computeLocalBlockId the value to set
         * @return this builder
         */
        public Builder computeLocalBlockId(String computeLocalBlockId) {
            this.computeLocalBlockId = computeLocalBlockId;
            this.__explicitlySet__.add("computeLocalBlockId");
            return this;
        }
        /** The lifecycle state of the GPU memory fabric */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ComputeGpuMemoryFabric.LifecycleState lifecycleState;

        /**
         * The lifecycle state of the GPU memory fabric
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ComputeGpuMemoryFabric.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The health state of the GPU memory fabric */
        @com.fasterxml.jackson.annotation.JsonProperty("fabricHealth")
        private ComputeGpuMemoryFabric.FabricHealth fabricHealth;

        /**
         * The health state of the GPU memory fabric
         *
         * @param fabricHealth the value to set
         * @return this builder
         */
        public Builder fabricHealth(ComputeGpuMemoryFabric.FabricHealth fabricHealth) {
            this.fabricHealth = fabricHealth;
            this.__explicitlySet__.add("fabricHealth");
            return this;
        }
        /** The total number of bare metal hosts located in this compute GPU memory fabric. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalHostCount")
        private Long totalHostCount;

        /**
         * The total number of bare metal hosts located in this compute GPU memory fabric.
         *
         * @param totalHostCount the value to set
         * @return this builder
         */
        public Builder totalHostCount(Long totalHostCount) {
            this.totalHostCount = totalHostCount;
            this.__explicitlySet__.add("totalHostCount");
            return this;
        }
        /**
         * The total number of available bare metal hosts located in this compute GPU memory fabric.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableHostCount")
        private Long availableHostCount;

        /**
         * The total number of available bare metal hosts located in this compute GPU memory fabric.
         *
         * @param availableHostCount the value to set
         * @return this builder
         */
        public Builder availableHostCount(Long availableHostCount) {
            this.availableHostCount = availableHostCount;
            this.__explicitlySet__.add("availableHostCount");
            return this;
        }
        /**
         * The total number of healthy bare metal hosts located in this compute GPU memory fabric.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("healthyHostCount")
        private Long healthyHostCount;

        /**
         * The total number of healthy bare metal hosts located in this compute GPU memory fabric.
         *
         * @param healthyHostCount the value to set
         * @return this builder
         */
        public Builder healthyHostCount(Long healthyHostCount) {
            this.healthyHostCount = healthyHostCount;
            this.__explicitlySet__.add("healthyHostCount");
            return this;
        }
        /**
         * The date and time that the compute GPU memory fabric record was created, in the format
         * defined by [RFC3339] (https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the compute GPU memory fabric record was created, in the format
         * defined by [RFC3339] (https://tools.ietf.org/html/rfc3339).
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * { "orcl-cloud": { "free-tier-retained": "true" } }}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * { "orcl-cloud": { "free-tier-retained": "true" } }}
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
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeGpuMemoryFabricSummary build() {
            ComputeGpuMemoryFabricSummary model =
                    new ComputeGpuMemoryFabricSummary(
                            this.id,
                            this.compartmentId,
                            this.computeHpcIslandId,
                            this.computeNetworkBlockId,
                            this.computeLocalBlockId,
                            this.lifecycleState,
                            this.fabricHealth,
                            this.totalHostCount,
                            this.availableHostCount,
                            this.healthyHostCount,
                            this.timeCreated,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags,
                            this.displayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeGpuMemoryFabricSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("computeHpcIslandId")) {
                this.computeHpcIslandId(model.getComputeHpcIslandId());
            }
            if (model.wasPropertyExplicitlySet("computeNetworkBlockId")) {
                this.computeNetworkBlockId(model.getComputeNetworkBlockId());
            }
            if (model.wasPropertyExplicitlySet("computeLocalBlockId")) {
                this.computeLocalBlockId(model.getComputeLocalBlockId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("fabricHealth")) {
                this.fabricHealth(model.getFabricHealth());
            }
            if (model.wasPropertyExplicitlySet("totalHostCount")) {
                this.totalHostCount(model.getTotalHostCount());
            }
            if (model.wasPropertyExplicitlySet("availableHostCount")) {
                this.availableHostCount(model.getAvailableHostCount());
            }
            if (model.wasPropertyExplicitlySet("healthyHostCount")) {
                this.healthyHostCount(model.getHealthyHostCount());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Customer-unique GPU memory fabric
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Customer-unique GPU memory fabric
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * compartment. This should always be the root compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * compartment. This should always be the root compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique HPC Island
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeHpcIslandId")
    private final String computeHpcIslandId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique HPC Island
     *
     * @return the value
     */
    public String getComputeHpcIslandId() {
        return computeHpcIslandId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique Network Block
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeNetworkBlockId")
    private final String computeNetworkBlockId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique Network Block
     *
     * @return the value
     */
    public String getComputeNetworkBlockId() {
        return computeNetworkBlockId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique Local Block
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeLocalBlockId")
    private final String computeLocalBlockId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique Local Block
     *
     * @return the value
     */
    public String getComputeLocalBlockId() {
        return computeLocalBlockId;
    }

    /** The lifecycle state of the GPU memory fabric */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ComputeGpuMemoryFabric.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the GPU memory fabric
     *
     * @return the value
     */
    public ComputeGpuMemoryFabric.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The health state of the GPU memory fabric */
    @com.fasterxml.jackson.annotation.JsonProperty("fabricHealth")
    private final ComputeGpuMemoryFabric.FabricHealth fabricHealth;

    /**
     * The health state of the GPU memory fabric
     *
     * @return the value
     */
    public ComputeGpuMemoryFabric.FabricHealth getFabricHealth() {
        return fabricHealth;
    }

    /** The total number of bare metal hosts located in this compute GPU memory fabric. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalHostCount")
    private final Long totalHostCount;

    /**
     * The total number of bare metal hosts located in this compute GPU memory fabric.
     *
     * @return the value
     */
    public Long getTotalHostCount() {
        return totalHostCount;
    }

    /** The total number of available bare metal hosts located in this compute GPU memory fabric. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableHostCount")
    private final Long availableHostCount;

    /**
     * The total number of available bare metal hosts located in this compute GPU memory fabric.
     *
     * @return the value
     */
    public Long getAvailableHostCount() {
        return availableHostCount;
    }

    /** The total number of healthy bare metal hosts located in this compute GPU memory fabric. */
    @com.fasterxml.jackson.annotation.JsonProperty("healthyHostCount")
    private final Long healthyHostCount;

    /**
     * The total number of healthy bare metal hosts located in this compute GPU memory fabric.
     *
     * @return the value
     */
    public Long getHealthyHostCount() {
        return healthyHostCount;
    }

    /**
     * The date and time that the compute GPU memory fabric record was created, in the format
     * defined by [RFC3339] (https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the compute GPU memory fabric record was created, in the format
     * defined by [RFC3339] (https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code {
     * "orcl-cloud": { "free-tier-retained": "true" } }}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code {
     * "orcl-cloud": { "free-tier-retained": "true" } }}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
        sb.append("ComputeGpuMemoryFabricSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", computeHpcIslandId=").append(String.valueOf(this.computeHpcIslandId));
        sb.append(", computeNetworkBlockId=").append(String.valueOf(this.computeNetworkBlockId));
        sb.append(", computeLocalBlockId=").append(String.valueOf(this.computeLocalBlockId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", fabricHealth=").append(String.valueOf(this.fabricHealth));
        sb.append(", totalHostCount=").append(String.valueOf(this.totalHostCount));
        sb.append(", availableHostCount=").append(String.valueOf(this.availableHostCount));
        sb.append(", healthyHostCount=").append(String.valueOf(this.healthyHostCount));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeGpuMemoryFabricSummary)) {
            return false;
        }

        ComputeGpuMemoryFabricSummary other = (ComputeGpuMemoryFabricSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.computeHpcIslandId, other.computeHpcIslandId)
                && java.util.Objects.equals(this.computeNetworkBlockId, other.computeNetworkBlockId)
                && java.util.Objects.equals(this.computeLocalBlockId, other.computeLocalBlockId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.fabricHealth, other.fabricHealth)
                && java.util.Objects.equals(this.totalHostCount, other.totalHostCount)
                && java.util.Objects.equals(this.availableHostCount, other.availableHostCount)
                && java.util.Objects.equals(this.healthyHostCount, other.healthyHostCount)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
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
                        + (this.computeHpcIslandId == null
                                ? 43
                                : this.computeHpcIslandId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeNetworkBlockId == null
                                ? 43
                                : this.computeNetworkBlockId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeLocalBlockId == null
                                ? 43
                                : this.computeLocalBlockId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.fabricHealth == null ? 43 : this.fabricHealth.hashCode());
        result =
                (result * PRIME)
                        + (this.totalHostCount == null ? 43 : this.totalHostCount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableHostCount == null
                                ? 43
                                : this.availableHostCount.hashCode());
        result =
                (result * PRIME)
                        + (this.healthyHostCount == null ? 43 : this.healthyHostCount.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
