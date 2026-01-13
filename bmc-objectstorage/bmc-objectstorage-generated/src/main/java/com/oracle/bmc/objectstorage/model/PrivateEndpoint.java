/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * A private endpoint makes your service accessible through a private IP in the customer's private
 * network. A private endpoint has a name and is associated with a namespace and a single
 * compartment. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PrivateEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivateEndpoint
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "namespace",
        "compartmentId",
        "createdBy",
        "timeCreated",
        "timeModified",
        "subnetId",
        "privateEndpointIp",
        "prefix",
        "additionalPrefixes",
        "nsgIds",
        "fqdns",
        "etag",
        "lifecycleState",
        "accessTargets",
        "freeformTags",
        "definedTags",
        "id"
    })
    public PrivateEndpoint(
            String name,
            String namespace,
            String compartmentId,
            String createdBy,
            java.util.Date timeCreated,
            java.util.Date timeModified,
            String subnetId,
            String privateEndpointIp,
            String prefix,
            java.util.List<String> additionalPrefixes,
            java.util.List<String> nsgIds,
            Fqdns fqdns,
            String etag,
            LifecycleState lifecycleState,
            java.util.List<AccessTargetDetails> accessTargets,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String id) {
        super();
        this.name = name;
        this.namespace = namespace;
        this.compartmentId = compartmentId;
        this.createdBy = createdBy;
        this.timeCreated = timeCreated;
        this.timeModified = timeModified;
        this.subnetId = subnetId;
        this.privateEndpointIp = privateEndpointIp;
        this.prefix = prefix;
        this.additionalPrefixes = additionalPrefixes;
        this.nsgIds = nsgIds;
        this.fqdns = fqdns;
        this.etag = etag;
        this.lifecycleState = lifecycleState;
        this.accessTargets = accessTargets;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.id = id;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This name associated with the endpoint. Valid characters are uppercase or lowercase
         * letters, numbers, hyphens, underscores, and periods. Example: my-new-private-endpoint1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * This name associated with the endpoint. Valid characters are uppercase or lowercase
         * letters, numbers, hyphens, underscores, and periods. Example: my-new-private-endpoint1
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The Object Storage namespace associated with the private enpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace associated with the private enpoint.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The compartment which is associated with the Private Endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment which is associated with the Private Endpoint.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * user who created the Private Endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * user who created the Private Endpoint.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The date and time the Private Endpoint was created, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Private Endpoint was created, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
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
         * The date and time the Private Endpoint was updated, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The date and time the Private Endpoint was updated, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         *
         * @param timeModified the value to set
         * @return this builder
         */
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }
        /** The OCID of the customer's subnet where the private endpoint VNIC will reside. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the customer's subnet where the private endpoint VNIC will reside.
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
         * The private IP address to assign to this private endpoint. If you provide a value, it
         * must be an available IP address in the customer's subnet. If it's not available, an error
         * is returned.
         *
         * <p>If you do not provide a value, an available IP address in the subnet is automatically
         * chosen.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        /**
         * The private IP address to assign to this private endpoint. If you provide a value, it
         * must be an available IP address in the customer's subnet. If it's not available, an error
         * is returned.
         *
         * <p>If you do not provide a value, an available IP address in the subnet is automatically
         * chosen.
         *
         * @param privateEndpointIp the value to set
         * @return this builder
         */
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }
        /**
         * A prefix to use for the private endpoint. The customer VCN's DNS records are updated with
         * this prefix. The prefix input from the customer will be the first sub-domain in the
         * endpointFqdn. Example: If the prefix chosen is "abc", then the endpointFqdn will be
         * 'abc.private.objectstorage.<region>.oraclecloud.com'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * A prefix to use for the private endpoint. The customer VCN's DNS records are updated with
         * this prefix. The prefix input from the customer will be the first sub-domain in the
         * endpointFqdn. Example: If the prefix chosen is "abc", then the endpointFqdn will be
         * 'abc.private.objectstorage.<region>.oraclecloud.com'
         *
         * @param prefix the value to set
         * @return this builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * A list of additional prefix that you can provide along with any other prefix. These
         * resulting endpointFqdn's are added to the customer VCN's DNS record.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalPrefixes")
        private java.util.List<String> additionalPrefixes;

        /**
         * A list of additional prefix that you can provide along with any other prefix. These
         * resulting endpointFqdn's are added to the customer VCN's DNS record.
         *
         * @param additionalPrefixes the value to set
         * @return this builder
         */
        public Builder additionalPrefixes(java.util.List<String> additionalPrefixes) {
            this.additionalPrefixes = additionalPrefixes;
            this.__explicitlySet__.add("additionalPrefixes");
            return this;
        }
        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the private endpoint's
         * VNIC to. For more information about NSGs, see {@link NetworkSecurityGroup}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the private endpoint's
         * VNIC to. For more information about NSGs, see {@link NetworkSecurityGroup}.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fqdns")
        private Fqdns fqdns;

        public Builder fqdns(Fqdns fqdns) {
            this.fqdns = fqdns;
            this.__explicitlySet__.add("fqdns");
            return this;
        }
        /** The entity tag (ETag) for the Private Endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        /**
         * The entity tag (ETag) for the Private Endpoint.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }
        /** The Private Endpoint's lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The Private Endpoint's lifecycle state.
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
         * A list of targets that can be accessed by the private endpoint. At least one or more
         * access targets is required for a private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessTargets")
        private java.util.List<AccessTargetDetails> accessTargets;

        /**
         * A list of targets that can be accessed by the private endpoint. At least one or more
         * access targets is required for a private endpoint.
         *
         * @param accessTargets the value to set
         * @return this builder
         */
        public Builder accessTargets(java.util.List<AccessTargetDetails> accessTargets) {
            this.accessTargets = accessTargets;
            this.__explicitlySet__.add("accessTargets");
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * PrivateEndpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * PrivateEndpoint.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateEndpoint build() {
            PrivateEndpoint model =
                    new PrivateEndpoint(
                            this.name,
                            this.namespace,
                            this.compartmentId,
                            this.createdBy,
                            this.timeCreated,
                            this.timeModified,
                            this.subnetId,
                            this.privateEndpointIp,
                            this.prefix,
                            this.additionalPrefixes,
                            this.nsgIds,
                            this.fqdns,
                            this.etag,
                            this.lifecycleState,
                            this.accessTargets,
                            this.freeformTags,
                            this.definedTags,
                            this.id);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateEndpoint model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIp")) {
                this.privateEndpointIp(model.getPrivateEndpointIp());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("additionalPrefixes")) {
                this.additionalPrefixes(model.getAdditionalPrefixes());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("fqdns")) {
                this.fqdns(model.getFqdns());
            }
            if (model.wasPropertyExplicitlySet("etag")) {
                this.etag(model.getEtag());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("accessTargets")) {
                this.accessTargets(model.getAccessTargets());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
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
     * This name associated with the endpoint. Valid characters are uppercase or lowercase letters,
     * numbers, hyphens, underscores, and periods. Example: my-new-private-endpoint1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * This name associated with the endpoint. Valid characters are uppercase or lowercase letters,
     * numbers, hyphens, underscores, and periods. Example: my-new-private-endpoint1
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The Object Storage namespace associated with the private enpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace associated with the private enpoint.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The compartment which is associated with the Private Endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment which is associated with the Private Endpoint.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user
     * who created the Private Endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user
     * who created the Private Endpoint.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The date and time the Private Endpoint was created, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Private Endpoint was created, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Private Endpoint was updated, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The date and time the Private Endpoint was updated, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     *
     * @return the value
     */
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    /** The OCID of the customer's subnet where the private endpoint VNIC will reside. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the customer's subnet where the private endpoint VNIC will reside.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The private IP address to assign to this private endpoint. If you provide a value, it must be
     * an available IP address in the customer's subnet. If it's not available, an error is
     * returned.
     *
     * <p>If you do not provide a value, an available IP address in the subnet is automatically
     * chosen.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    private final String privateEndpointIp;

    /**
     * The private IP address to assign to this private endpoint. If you provide a value, it must be
     * an available IP address in the customer's subnet. If it's not available, an error is
     * returned.
     *
     * <p>If you do not provide a value, an available IP address in the subnet is automatically
     * chosen.
     *
     * @return the value
     */
    public String getPrivateEndpointIp() {
        return privateEndpointIp;
    }

    /**
     * A prefix to use for the private endpoint. The customer VCN's DNS records are updated with
     * this prefix. The prefix input from the customer will be the first sub-domain in the
     * endpointFqdn. Example: If the prefix chosen is "abc", then the endpointFqdn will be
     * 'abc.private.objectstorage.<region>.oraclecloud.com'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * A prefix to use for the private endpoint. The customer VCN's DNS records are updated with
     * this prefix. The prefix input from the customer will be the first sub-domain in the
     * endpointFqdn. Example: If the prefix chosen is "abc", then the endpointFqdn will be
     * 'abc.private.objectstorage.<region>.oraclecloud.com'
     *
     * @return the value
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * A list of additional prefix that you can provide along with any other prefix. These resulting
     * endpointFqdn's are added to the customer VCN's DNS record.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalPrefixes")
    private final java.util.List<String> additionalPrefixes;

    /**
     * A list of additional prefix that you can provide along with any other prefix. These resulting
     * endpointFqdn's are added to the customer VCN's DNS record.
     *
     * @return the value
     */
    public java.util.List<String> getAdditionalPrefixes() {
        return additionalPrefixes;
    }

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the private endpoint's VNIC
     * to. For more information about NSGs, see {@link NetworkSecurityGroup}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the private endpoint's VNIC
     * to. For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fqdns")
    private final Fqdns fqdns;

    public Fqdns getFqdns() {
        return fqdns;
    }

    /** The entity tag (ETag) for the Private Endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

    /**
     * The entity tag (ETag) for the Private Endpoint.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The Private Endpoint's lifecycle state. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
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
    /** The Private Endpoint's lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The Private Endpoint's lifecycle state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A list of targets that can be accessed by the private endpoint. At least one or more access
     * targets is required for a private endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessTargets")
    private final java.util.List<AccessTargetDetails> accessTargets;

    /**
     * A list of targets that can be accessed by the private endpoint. At least one or more access
     * targets is required for a private endpoint.
     *
     * @return the value
     */
    public java.util.List<AccessTargetDetails> getAccessTargets() {
        return accessTargets;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * PrivateEndpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * PrivateEndpoint.
     *
     * @return the value
     */
    public String getId() {
        return id;
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
        sb.append("PrivateEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", additionalPrefixes=").append(String.valueOf(this.additionalPrefixes));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", fqdns=").append(String.valueOf(this.fqdns));
        sb.append(", etag=").append(String.valueOf(this.etag));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", accessTargets=").append(String.valueOf(this.accessTargets));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateEndpoint)) {
            return false;
        }

        PrivateEndpoint other = (PrivateEndpoint) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.additionalPrefixes, other.additionalPrefixes)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.fqdns, other.fqdns)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.accessTargets, other.accessTargets)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.id, other.id)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalPrefixes == null
                                ? 43
                                : this.additionalPrefixes.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.fqdns == null ? 43 : this.fqdns.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.accessTargets == null ? 43 : this.accessTargets.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
