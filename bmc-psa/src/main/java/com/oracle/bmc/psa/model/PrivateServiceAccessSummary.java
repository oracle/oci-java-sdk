/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psa.model;

/**
 * A summary of private service access information. This object is returned when listing private
 * service accesses. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PrivateServiceAccessSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivateServiceAccessSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "freeformTags",
        "systemTags",
        "securityAttributes",
        "displayName",
        "description",
        "id",
        "timeCreated",
        "timeUpdated",
        "vcnId",
        "subnetId",
        "vnicId",
        "lifecycleState",
        "serviceId",
        "nsgIds",
        "fqdns",
        "ipv4Ip"
    })
    public PrivateServiceAccessSummary(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            String displayName,
            String description,
            String id,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String vcnId,
            String subnetId,
            String vnicId,
            PrivateServiceAccess.LifecycleState lifecycleState,
            String serviceId,
            java.util.List<String> nsgIds,
            java.util.List<String> fqdns,
            String ipv4Ip) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
        this.securityAttributes = securityAttributes;
        this.displayName = displayName;
        this.description = description;
        this.id = id;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.vnicId = vnicId;
        this.lifecycleState = lifecycleState;
        this.serviceId = serviceId;
        this.nsgIds = nsgIds;
        this.fqdns = fqdns;
        this.ipv4Ip = ipv4Ip;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the private service access.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the private service access.
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
         * [Security
         * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * [Security
         * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
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
        /** A description of this private service access. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of this private service access.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private service access.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private service access.
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
         * The date and time the private service access was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the private service access was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * The date and time the PrivateServiceAccess was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the PrivateServiceAccess was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VCN that the private service access belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VCN that the private service access belongs to.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet that the private service access belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet that the private service access belongs to.
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
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private service access's VNIC, which resides in the private service access's VCN .
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private service access's VNIC, which resides in the private service access's VCN .
         *
         * @param vnicId the value to set
         * @return this builder
         */
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }
        /** The private service access's current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private PrivateServiceAccess.LifecycleState lifecycleState;

        /**
         * The private service access's current lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(PrivateServiceAccess.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** A unique service identifier for which the private service access was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceId")
        private String serviceId;

        /**
         * A unique service identifier for which the private service access was created.
         *
         * @param serviceId the value to set
         * @return this builder
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            this.__explicitlySet__.add("serviceId");
            return this;
        }
        /**
         * A list of the OCIDs of the network security groups that the private service access's VNIC
         * belongs to. For more information about NSGs, see {@link NetworkSecurityGroup}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups that the private service access's VNIC
         * belongs to. For more information about NSGs, see {@link NetworkSecurityGroup}.
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
         * The private service access IPv4 FQDNs, which are going to be used to access the service.
         *
         * <p>Example: {@code xyz.oraclecloud.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fqdns")
        private java.util.List<String> fqdns;

        /**
         * The private service access IPv4 FQDNs, which are going to be used to access the service.
         *
         * <p>Example: {@code xyz.oraclecloud.com}
         *
         * @param fqdns the value to set
         * @return this builder
         */
        public Builder fqdns(java.util.List<String> fqdns) {
            this.fqdns = fqdns;
            this.__explicitlySet__.add("fqdns");
            return this;
        }
        /**
         * The private IP address (in the consumer's VCN) that represents the access point for the
         * associated service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4Ip")
        private String ipv4Ip;

        /**
         * The private IP address (in the consumer's VCN) that represents the access point for the
         * associated service.
         *
         * @param ipv4Ip the value to set
         * @return this builder
         */
        public Builder ipv4Ip(String ipv4Ip) {
            this.ipv4Ip = ipv4Ip;
            this.__explicitlySet__.add("ipv4Ip");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateServiceAccessSummary build() {
            PrivateServiceAccessSummary model =
                    new PrivateServiceAccessSummary(
                            this.compartmentId,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags,
                            this.securityAttributes,
                            this.displayName,
                            this.description,
                            this.id,
                            this.timeCreated,
                            this.timeUpdated,
                            this.vcnId,
                            this.subnetId,
                            this.vnicId,
                            this.lifecycleState,
                            this.serviceId,
                            this.nsgIds,
                            this.fqdns,
                            this.ipv4Ip);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateServiceAccessSummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("serviceId")) {
                this.serviceId(model.getServiceId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("fqdns")) {
                this.fqdns(model.getFqdns());
            }
            if (model.wasPropertyExplicitlySet("ipv4Ip")) {
                this.ipv4Ip(model.getIpv4Ip());
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
     * compartment that contains the private service access.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the private service access.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * [Security
     * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm) (ZPR)
     * policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * [Security
     * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm) (ZPR)
     * policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
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

    /** A description of this private service access. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of this private service access.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * private service access.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * private service access.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The date and time the private service access was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the private service access was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the PrivateServiceAccess was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the PrivateServiceAccess was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN
     * that the private service access belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN
     * that the private service access belongs to.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet that the private service access belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet that the private service access belongs to.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * private service access's VNIC, which resides in the private service access's VCN .
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * private service access's VNIC, which resides in the private service access's VCN .
     *
     * @return the value
     */
    public String getVnicId() {
        return vnicId;
    }

    /** The private service access's current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final PrivateServiceAccess.LifecycleState lifecycleState;

    /**
     * The private service access's current lifecycle state.
     *
     * @return the value
     */
    public PrivateServiceAccess.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** A unique service identifier for which the private service access was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceId")
    private final String serviceId;

    /**
     * A unique service identifier for which the private service access was created.
     *
     * @return the value
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * A list of the OCIDs of the network security groups that the private service access's VNIC
     * belongs to. For more information about NSGs, see {@link NetworkSecurityGroup}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups that the private service access's VNIC
     * belongs to. For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The private service access IPv4 FQDNs, which are going to be used to access the service.
     *
     * <p>Example: {@code xyz.oraclecloud.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fqdns")
    private final java.util.List<String> fqdns;

    /**
     * The private service access IPv4 FQDNs, which are going to be used to access the service.
     *
     * <p>Example: {@code xyz.oraclecloud.com}
     *
     * @return the value
     */
    public java.util.List<String> getFqdns() {
        return fqdns;
    }

    /**
     * The private IP address (in the consumer's VCN) that represents the access point for the
     * associated service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4Ip")
    private final String ipv4Ip;

    /**
     * The private IP address (in the consumer's VCN) that represents the access point for the
     * associated service.
     *
     * @return the value
     */
    public String getIpv4Ip() {
        return ipv4Ip;
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
        sb.append("PrivateServiceAccessSummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", serviceId=").append(String.valueOf(this.serviceId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", fqdns=").append(String.valueOf(this.fqdns));
        sb.append(", ipv4Ip=").append(String.valueOf(this.ipv4Ip));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateServiceAccessSummary)) {
            return false;
        }

        PrivateServiceAccessSummary other = (PrivateServiceAccessSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.serviceId, other.serviceId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.fqdns, other.fqdns)
                && java.util.Objects.equals(this.ipv4Ip, other.ipv4Ip)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.serviceId == null ? 43 : this.serviceId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.fqdns == null ? 43 : this.fqdns.hashCode());
        result = (result * PRIME) + (this.ipv4Ip == null ? 43 : this.ipv4Ip.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
