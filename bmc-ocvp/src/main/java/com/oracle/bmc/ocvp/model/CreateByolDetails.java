/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The details to create a BYOL.
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
    builder = CreateByolDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateByolDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "softwareType",
        "totalUnits",
        "timeTermStart",
        "timeTermEnd",
        "entitlementKey",
        "siteId",
        "freeformTags",
        "definedTags"
    })
    public CreateByolDetails(
            String compartmentId,
            String displayName,
            String description,
            Byol.SoftwareType softwareType,
            Integer totalUnits,
            java.util.Date timeTermStart,
            java.util.Date timeTermEnd,
            String entitlementKey,
            String siteId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.softwareType = softwareType;
        this.totalUnits = totalUnits;
        this.timeTermStart = timeTermStart;
        this.timeTermEnd = timeTermEnd;
        this.entitlementKey = entitlementKey;
        this.siteId = siteId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the BYOL.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the BYOL.
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
         * A descriptive name for the BYOL.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the BYOL.
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
         * A description of the BYOL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the BYOL.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The type of VMware software the BYOL applies to.
         * Supported values:
         * - VCF (VMware Cloud Foundation)
         * - VSAN (VMware vSAN)
         * - VDEFEND (VMware vDefend Firewall)
         * - AVI_LOAD_BALANCER (VMware Avi Load Balancer)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareType")
        private Byol.SoftwareType softwareType;

        /**
         * The type of VMware software the BYOL applies to.
         * Supported values:
         * - VCF (VMware Cloud Foundation)
         * - VSAN (VMware vSAN)
         * - VDEFEND (VMware vDefend Firewall)
         * - AVI_LOAD_BALANCER (VMware Avi Load Balancer)
         *
         * @param softwareType the value to set
         * @return this builder
         **/
        public Builder softwareType(Byol.SoftwareType softwareType) {
            this.softwareType = softwareType;
            this.__explicitlySet__.add("softwareType");
            return this;
        }
        /**
         * Total quantity of licensed units for the specified {@code softwareType}:
         * <p>
         * - VCF, VDEFEND: number of OCPUs
         * - VSAN: storage capacity in TiB (tebibytes)
         * - AVI_LOAD_BALANCER: number of instances
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalUnits")
        private Integer totalUnits;

        /**
         * Total quantity of licensed units for the specified {@code softwareType}:
         * <p>
         * - VCF, VDEFEND: number of OCPUs
         * - VSAN: storage capacity in TiB (tebibytes)
         * - AVI_LOAD_BALANCER: number of instances
         *
         * @param totalUnits the value to set
         * @return this builder
         **/
        public Builder totalUnits(Integer totalUnits) {
            this.totalUnits = totalUnits;
            this.__explicitlySet__.add("totalUnits");
            return this;
        }
        /**
         * The date and time when the BYOL becomes active. VMware software functionality cannot begin before this time.
         * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTermStart")
        private java.util.Date timeTermStart;

        /**
         * The date and time when the BYOL becomes active. VMware software functionality cannot begin before this time.
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
         * The date and time when the BYOL expires and becomes inactive.
         * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTermEnd")
        private java.util.Date timeTermEnd;

        /**
         * The date and time when the BYOL expires and becomes inactive.
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
         * The Broadcom-supplied identifier of a BYOL license.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitlementKey")
        private String entitlementKey;

        /**
         * The Broadcom-supplied identifier of a BYOL license.
         *
         * @param entitlementKey the value to set
         * @return this builder
         **/
        public Builder entitlementKey(String entitlementKey) {
            this.entitlementKey = entitlementKey;
            this.__explicitlySet__.add("entitlementKey");
            return this;
        }
        /**
         * The hyperscaler identifier in Broadcom systems.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("siteId")
        private String siteId;

        /**
         * The hyperscaler identifier in Broadcom systems.
         *
         * @param siteId the value to set
         * @return this builder
         **/
        public Builder siteId(String siteId) {
            this.siteId = siteId;
            this.__explicitlySet__.add("siteId");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateByolDetails build() {
            CreateByolDetails model =
                    new CreateByolDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.softwareType,
                            this.totalUnits,
                            this.timeTermStart,
                            this.timeTermEnd,
                            this.entitlementKey,
                            this.siteId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateByolDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("softwareType")) {
                this.softwareType(model.getSoftwareType());
            }
            if (model.wasPropertyExplicitlySet("totalUnits")) {
                this.totalUnits(model.getTotalUnits());
            }
            if (model.wasPropertyExplicitlySet("timeTermStart")) {
                this.timeTermStart(model.getTimeTermStart());
            }
            if (model.wasPropertyExplicitlySet("timeTermEnd")) {
                this.timeTermEnd(model.getTimeTermEnd());
            }
            if (model.wasPropertyExplicitlySet("entitlementKey")) {
                this.entitlementKey(model.getEntitlementKey());
            }
            if (model.wasPropertyExplicitlySet("siteId")) {
                this.siteId(model.getSiteId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the BYOL.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the BYOL.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A descriptive name for the BYOL.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the BYOL.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A description of the BYOL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the BYOL.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The type of VMware software the BYOL applies to.
     * Supported values:
     * - VCF (VMware Cloud Foundation)
     * - VSAN (VMware vSAN)
     * - VDEFEND (VMware vDefend Firewall)
     * - AVI_LOAD_BALANCER (VMware Avi Load Balancer)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareType")
    private final Byol.SoftwareType softwareType;

    /**
     * The type of VMware software the BYOL applies to.
     * Supported values:
     * - VCF (VMware Cloud Foundation)
     * - VSAN (VMware vSAN)
     * - VDEFEND (VMware vDefend Firewall)
     * - AVI_LOAD_BALANCER (VMware Avi Load Balancer)
     *
     * @return the value
     **/
    public Byol.SoftwareType getSoftwareType() {
        return softwareType;
    }

    /**
     * Total quantity of licensed units for the specified {@code softwareType}:
     * <p>
     * - VCF, VDEFEND: number of OCPUs
     * - VSAN: storage capacity in TiB (tebibytes)
     * - AVI_LOAD_BALANCER: number of instances
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalUnits")
    private final Integer totalUnits;

    /**
     * Total quantity of licensed units for the specified {@code softwareType}:
     * <p>
     * - VCF, VDEFEND: number of OCPUs
     * - VSAN: storage capacity in TiB (tebibytes)
     * - AVI_LOAD_BALANCER: number of instances
     *
     * @return the value
     **/
    public Integer getTotalUnits() {
        return totalUnits;
    }

    /**
     * The date and time when the BYOL becomes active. VMware software functionality cannot begin before this time.
     * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTermStart")
    private final java.util.Date timeTermStart;

    /**
     * The date and time when the BYOL becomes active. VMware software functionality cannot begin before this time.
     * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeTermStart() {
        return timeTermStart;
    }

    /**
     * The date and time when the BYOL expires and becomes inactive.
     * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTermEnd")
    private final java.util.Date timeTermEnd;

    /**
     * The date and time when the BYOL expires and becomes inactive.
     * In the format defined by[RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeTermEnd() {
        return timeTermEnd;
    }

    /**
     * The Broadcom-supplied identifier of a BYOL license.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitlementKey")
    private final String entitlementKey;

    /**
     * The Broadcom-supplied identifier of a BYOL license.
     *
     * @return the value
     **/
    public String getEntitlementKey() {
        return entitlementKey;
    }

    /**
     * The hyperscaler identifier in Broadcom systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("siteId")
    private final String siteId;

    /**
     * The hyperscaler identifier in Broadcom systems.
     *
     * @return the value
     **/
    public String getSiteId() {
        return siteId;
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
        sb.append("CreateByolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", softwareType=").append(String.valueOf(this.softwareType));
        sb.append(", totalUnits=").append(String.valueOf(this.totalUnits));
        sb.append(", timeTermStart=").append(String.valueOf(this.timeTermStart));
        sb.append(", timeTermEnd=").append(String.valueOf(this.timeTermEnd));
        sb.append(", entitlementKey=").append(String.valueOf(this.entitlementKey));
        sb.append(", siteId=").append(String.valueOf(this.siteId));
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
        if (!(o instanceof CreateByolDetails)) {
            return false;
        }

        CreateByolDetails other = (CreateByolDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.softwareType, other.softwareType)
                && java.util.Objects.equals(this.totalUnits, other.totalUnits)
                && java.util.Objects.equals(this.timeTermStart, other.timeTermStart)
                && java.util.Objects.equals(this.timeTermEnd, other.timeTermEnd)
                && java.util.Objects.equals(this.entitlementKey, other.entitlementKey)
                && java.util.Objects.equals(this.siteId, other.siteId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result = (result * PRIME) + (this.softwareType == null ? 43 : this.softwareType.hashCode());
        result = (result * PRIME) + (this.totalUnits == null ? 43 : this.totalUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTermStart == null ? 43 : this.timeTermStart.hashCode());
        result = (result * PRIME) + (this.timeTermEnd == null ? 43 : this.timeTermEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.entitlementKey == null ? 43 : this.entitlementKey.hashCode());
        result = (result * PRIME) + (this.siteId == null ? 43 : this.siteId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
