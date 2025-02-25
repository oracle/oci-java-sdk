/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Information about a {@code ByoipRange} resource.
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
    builder = ByoipRangeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ByoipRangeSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "byoipRangeVcnIpv6Allocations",
        "cidrBlock",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "ipv6CidrBlock",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated"
    })
    public ByoipRangeSummary(
            java.util.List<ByoipRangeVcnIpv6AllocationSummary> byoipRangeVcnIpv6Allocations,
            String cidrBlock,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            String ipv6CidrBlock,
            ByoipRange.LifecycleState lifecycleState,
            ByoipRange.LifecycleDetails lifecycleDetails,
            java.util.Date timeCreated) {
        super();
        this.byoipRangeVcnIpv6Allocations = byoipRangeVcnIpv6Allocations;
        this.cidrBlock = cidrBlock;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of {@code ByoipRangeVcnIpv6AllocationSummary} objects.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("byoipRangeVcnIpv6Allocations")
        private java.util.List<ByoipRangeVcnIpv6AllocationSummary> byoipRangeVcnIpv6Allocations;

        /**
         * A list of {@code ByoipRangeVcnIpv6AllocationSummary} objects.
         *
         * @param byoipRangeVcnIpv6Allocations the value to set
         * @return this builder
         **/
        public Builder byoipRangeVcnIpv6Allocations(
                java.util.List<ByoipRangeVcnIpv6AllocationSummary> byoipRangeVcnIpv6Allocations) {
            this.byoipRangeVcnIpv6Allocations = byoipRangeVcnIpv6Allocations;
            this.__explicitlySet__.add("byoipRangeVcnIpv6Allocations");
            return this;
        }
        /**
         * The public IPv4 address range you are importing to the Oracle cloud.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * The public IPv4 address range you are importing to the Oracle cloud.
         * @param cidrBlock the value to set
         * @return this builder
         **/
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code ByoipRange} resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code ByoipRange} resource.
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The IPv6 CIDR block being imported to the Oracle cloud. This CIDR block must be /48 or larger, and can  be subdivided into sub-ranges used
         * across multiple VCNs. A BYOIPv6 prefix can be assigned across multiple VCNs, and each VCN must be /64 or larger. You may specify
         * a ULA or private IPv6 prefix of /64 or larger to use in the VCN. IPv6-enabled subnets will remain a fixed /64 in size.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        /**
         * The IPv6 CIDR block being imported to the Oracle cloud. This CIDR block must be /48 or larger, and can  be subdivided into sub-ranges used
         * across multiple VCNs. A BYOIPv6 prefix can be assigned across multiple VCNs, and each VCN must be /64 or larger. You may specify
         * a ULA or private IPv6 prefix of /64 or larger to use in the VCN. IPv6-enabled subnets will remain a fixed /64 in size.
         *
         * @param ipv6CidrBlock the value to set
         * @return this builder
         **/
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }
        /**
         * The {@code ByoipRange} resource's current state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ByoipRange.LifecycleState lifecycleState;

        /**
         * The {@code ByoipRange} resource's current state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ByoipRange.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The Byoip Range's current lifeCycle substate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private ByoipRange.LifecycleDetails lifecycleDetails;

        /**
         * The Byoip Range's current lifeCycle substate.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(ByoipRange.LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the {@code ByoipRange} resource was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the {@code ByoipRange} resource was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ByoipRangeSummary build() {
            ByoipRangeSummary model =
                    new ByoipRangeSummary(
                            this.byoipRangeVcnIpv6Allocations,
                            this.cidrBlock,
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.ipv6CidrBlock,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ByoipRangeSummary model) {
            if (model.wasPropertyExplicitlySet("byoipRangeVcnIpv6Allocations")) {
                this.byoipRangeVcnIpv6Allocations(model.getByoipRangeVcnIpv6Allocations());
            }
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ipv6CidrBlock")) {
                this.ipv6CidrBlock(model.getIpv6CidrBlock());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * A list of {@code ByoipRangeVcnIpv6AllocationSummary} objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("byoipRangeVcnIpv6Allocations")
    private final java.util.List<ByoipRangeVcnIpv6AllocationSummary> byoipRangeVcnIpv6Allocations;

    /**
     * A list of {@code ByoipRangeVcnIpv6AllocationSummary} objects.
     *
     * @return the value
     **/
    public java.util.List<ByoipRangeVcnIpv6AllocationSummary> getByoipRangeVcnIpv6Allocations() {
        return byoipRangeVcnIpv6Allocations;
    }

    /**
     * The public IPv4 address range you are importing to the Oracle cloud.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * The public IPv4 address range you are importing to the Oracle cloud.
     * @return the value
     **/
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code ByoipRange} resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code ByoipRange} resource.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The IPv6 CIDR block being imported to the Oracle cloud. This CIDR block must be /48 or larger, and can  be subdivided into sub-ranges used
     * across multiple VCNs. A BYOIPv6 prefix can be assigned across multiple VCNs, and each VCN must be /64 or larger. You may specify
     * a ULA or private IPv6 prefix of /64 or larger to use in the VCN. IPv6-enabled subnets will remain a fixed /64 in size.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    private final String ipv6CidrBlock;

    /**
     * The IPv6 CIDR block being imported to the Oracle cloud. This CIDR block must be /48 or larger, and can  be subdivided into sub-ranges used
     * across multiple VCNs. A BYOIPv6 prefix can be assigned across multiple VCNs, and each VCN must be /64 or larger. You may specify
     * a ULA or private IPv6 prefix of /64 or larger to use in the VCN. IPv6-enabled subnets will remain a fixed /64 in size.
     *
     * @return the value
     **/
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * The {@code ByoipRange} resource's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ByoipRange.LifecycleState lifecycleState;

    /**
     * The {@code ByoipRange} resource's current state.
     * @return the value
     **/
    public ByoipRange.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The Byoip Range's current lifeCycle substate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final ByoipRange.LifecycleDetails lifecycleDetails;

    /**
     * The Byoip Range's current lifeCycle substate.
     * @return the value
     **/
    public ByoipRange.LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the {@code ByoipRange} resource was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the {@code ByoipRange} resource was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("ByoipRangeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("byoipRangeVcnIpv6Allocations=")
                .append(String.valueOf(this.byoipRangeVcnIpv6Allocations));
        sb.append(", cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", ipv6CidrBlock=").append(String.valueOf(this.ipv6CidrBlock));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ByoipRangeSummary)) {
            return false;
        }

        ByoipRangeSummary other = (ByoipRangeSummary) o;
        return java.util.Objects.equals(
                        this.byoipRangeVcnIpv6Allocations, other.byoipRangeVcnIpv6Allocations)
                && java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ipv6CidrBlock, other.ipv6CidrBlock)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.byoipRangeVcnIpv6Allocations == null
                                ? 43
                                : this.byoipRangeVcnIpv6Allocations.hashCode());
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlock == null ? 43 : this.ipv6CidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
