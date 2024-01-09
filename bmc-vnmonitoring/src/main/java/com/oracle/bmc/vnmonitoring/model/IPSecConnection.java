/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * A connection between a DRG and CPE. This connection consists of multiple IPSec tunnels. Creating
 * this connection is one of the steps required when setting up a Site-to-Site VPN.
 *
 * <p>*Important:** Each tunnel in an IPSec connection can use either static routing or BGP dynamic
 * routing (see the {@link IPSecConnectionTunnel} object's {@code routing} attribute). Originally
 * only static routing was supported and every IPSec connection was required to have at least one
 * static route configured. To maintain backward compatibility in the API when support for BPG
 * dynamic routing was introduced, the API accepts an empty list of static routes if you configure
 * both of the IPSec tunnels to use BGP dynamic routing. If you switch a tunnel's routing from
 * {@code BGP} to {@code STATIC}, you must first ensure that the IPSec connection is configured with
 * at least one valid CIDR block static route. Oracle uses the IPSec connection's static routes when
 * routing a tunnel's traffic *only* if that tunnel's {@code routing} attribute = {@code STATIC}.
 * Otherwise the static routes are ignored.
 *
 * <p>For more information about the workflow for setting up an IPSec connection, see [Site-to-Site
 * VPN Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IPSecConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IPSecConnection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "cpeId",
        "definedTags",
        "displayName",
        "drgId",
        "freeformTags",
        "id",
        "lifecycleState",
        "cpeLocalIdentifier",
        "cpeLocalIdentifierType",
        "staticRoutes",
        "timeCreated",
        "transportType"
    })
    public IPSecConnection(
            String compartmentId,
            String cpeId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String drgId,
            java.util.Map<String, String> freeformTags,
            String id,
            LifecycleState lifecycleState,
            String cpeLocalIdentifier,
            CpeLocalIdentifierType cpeLocalIdentifierType,
            java.util.List<String> staticRoutes,
            java.util.Date timeCreated,
            TransportType transportType) {
        super();
        this.compartmentId = compartmentId;
        this.cpeId = cpeId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.drgId = drgId;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.cpeLocalIdentifier = cpeLocalIdentifier;
        this.cpeLocalIdentifierType = cpeLocalIdentifierType;
        this.staticRoutes = staticRoutes;
        this.timeCreated = timeCreated;
        this.transportType = transportType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the IPSec connection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the IPSec connection.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the {@link Cpe} object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeId")
        private String cpeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the {@link Cpe} object.
         *
         * @param cpeId the value to set
         * @return this builder
         */
        public Builder cpeId(String cpeId) {
            this.cpeId = cpeId;
            this.__explicitlySet__.add("cpeId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DRG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DRG.
         *
         * @param drgId the value to set
         * @return this builder
         */
        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * The IPSec connection's Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The IPSec connection's Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The IPSec connection's current state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The IPSec connection's current state.
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
         * Your identifier for your CPE device. Can be either an IP address or a hostname
         * (specifically, the fully qualified domain name (FQDN)). The type of identifier here must
         * correspond to the value for {@code cpeLocalIdentifierType}.
         *
         * <p>If you don't provide a value when creating the IPSec connection, the {@code ipAddress}
         * attribute for the {@link Cpe} object specified by {@code cpeId} is used as the {@code
         * cpeLocalIdentifier}.
         *
         * <p>For information about why you'd provide this value, see [If Your CPE Is Behind a NAT
         * Device](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm#nat).
         *
         * <p>Example IP address: {@code 10.0.3.3}
         *
         * <p>Example hostname: {@code cpe.example.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifier")
        private String cpeLocalIdentifier;

        /**
         * Your identifier for your CPE device. Can be either an IP address or a hostname
         * (specifically, the fully qualified domain name (FQDN)). The type of identifier here must
         * correspond to the value for {@code cpeLocalIdentifierType}.
         *
         * <p>If you don't provide a value when creating the IPSec connection, the {@code ipAddress}
         * attribute for the {@link Cpe} object specified by {@code cpeId} is used as the {@code
         * cpeLocalIdentifier}.
         *
         * <p>For information about why you'd provide this value, see [If Your CPE Is Behind a NAT
         * Device](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm#nat).
         *
         * <p>Example IP address: {@code 10.0.3.3}
         *
         * <p>Example hostname: {@code cpe.example.com}
         *
         * @param cpeLocalIdentifier the value to set
         * @return this builder
         */
        public Builder cpeLocalIdentifier(String cpeLocalIdentifier) {
            this.cpeLocalIdentifier = cpeLocalIdentifier;
            this.__explicitlySet__.add("cpeLocalIdentifier");
            return this;
        }
        /**
         * The type of identifier for your CPE device. The value here must correspond to the value
         * for {@code cpeLocalIdentifier}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifierType")
        private CpeLocalIdentifierType cpeLocalIdentifierType;

        /**
         * The type of identifier for your CPE device. The value here must correspond to the value
         * for {@code cpeLocalIdentifier}.
         *
         * @param cpeLocalIdentifierType the value to set
         * @return this builder
         */
        public Builder cpeLocalIdentifierType(CpeLocalIdentifierType cpeLocalIdentifierType) {
            this.cpeLocalIdentifierType = cpeLocalIdentifierType;
            this.__explicitlySet__.add("cpeLocalIdentifierType");
            return this;
        }
        /**
         * Static routes to the CPE. The CIDR must not be a multicast address or class E address.
         *
         * <p>Used for routing a given IPSec tunnel's traffic only if the tunnel is using static
         * routing. If you configure at least one tunnel to use static routing, then you must
         * provide at least one valid static route. If you configure both tunnels to use BGP dynamic
         * routing, you can provide an empty list for the static routes.
         *
         * <p>The CIDR can be either IPv4 or IPv6. IPv6 addressing is supported for all commercial
         * and government regions. See [IPv6
         * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 10.0.1.0/24}
         *
         * <p>Example: {@code 2001:db8::/32}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
        private java.util.List<String> staticRoutes;

        /**
         * Static routes to the CPE. The CIDR must not be a multicast address or class E address.
         *
         * <p>Used for routing a given IPSec tunnel's traffic only if the tunnel is using static
         * routing. If you configure at least one tunnel to use static routing, then you must
         * provide at least one valid static route. If you configure both tunnels to use BGP dynamic
         * routing, you can provide an empty list for the static routes.
         *
         * <p>The CIDR can be either IPv4 or IPv6. IPv6 addressing is supported for all commercial
         * and government regions. See [IPv6
         * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 10.0.1.0/24}
         *
         * <p>Example: {@code 2001:db8::/32}
         *
         * @param staticRoutes the value to set
         * @return this builder
         */
        public Builder staticRoutes(java.util.List<String> staticRoutes) {
            this.staticRoutes = staticRoutes;
            this.__explicitlySet__.add("staticRoutes");
            return this;
        }
        /**
         * The date and time the IPSec connection was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the IPSec connection was created, in the format defined by
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
        /** The transport type used for the IPSec connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        /**
         * The transport type used for the IPSec connection.
         *
         * @param transportType the value to set
         * @return this builder
         */
        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IPSecConnection build() {
            IPSecConnection model =
                    new IPSecConnection(
                            this.compartmentId,
                            this.cpeId,
                            this.definedTags,
                            this.displayName,
                            this.drgId,
                            this.freeformTags,
                            this.id,
                            this.lifecycleState,
                            this.cpeLocalIdentifier,
                            this.cpeLocalIdentifierType,
                            this.staticRoutes,
                            this.timeCreated,
                            this.transportType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IPSecConnection model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("cpeId")) {
                this.cpeId(model.getCpeId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("drgId")) {
                this.drgId(model.getDrgId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("cpeLocalIdentifier")) {
                this.cpeLocalIdentifier(model.getCpeLocalIdentifier());
            }
            if (model.wasPropertyExplicitlySet("cpeLocalIdentifierType")) {
                this.cpeLocalIdentifierType(model.getCpeLocalIdentifierType());
            }
            if (model.wasPropertyExplicitlySet("staticRoutes")) {
                this.staticRoutes(model.getStaticRoutes());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the IPSec connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the IPSec connection.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the {@link Cpe} object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeId")
    private final String cpeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the {@link Cpe} object.
     *
     * @return the value
     */
    public String getCpeId() {
        return cpeId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DRG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    private final String drgId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DRG.
     *
     * @return the value
     */
    public String getDrgId() {
        return drgId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The IPSec connection's Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The IPSec connection's Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The IPSec connection's current state. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /** The IPSec connection's current state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The IPSec connection's current state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Your identifier for your CPE device. Can be either an IP address or a hostname (specifically,
     * the fully qualified domain name (FQDN)). The type of identifier here must correspond to the
     * value for {@code cpeLocalIdentifierType}.
     *
     * <p>If you don't provide a value when creating the IPSec connection, the {@code ipAddress}
     * attribute for the {@link Cpe} object specified by {@code cpeId} is used as the {@code
     * cpeLocalIdentifier}.
     *
     * <p>For information about why you'd provide this value, see [If Your CPE Is Behind a NAT
     * Device](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm#nat).
     *
     * <p>Example IP address: {@code 10.0.3.3}
     *
     * <p>Example hostname: {@code cpe.example.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifier")
    private final String cpeLocalIdentifier;

    /**
     * Your identifier for your CPE device. Can be either an IP address or a hostname (specifically,
     * the fully qualified domain name (FQDN)). The type of identifier here must correspond to the
     * value for {@code cpeLocalIdentifierType}.
     *
     * <p>If you don't provide a value when creating the IPSec connection, the {@code ipAddress}
     * attribute for the {@link Cpe} object specified by {@code cpeId} is used as the {@code
     * cpeLocalIdentifier}.
     *
     * <p>For information about why you'd provide this value, see [If Your CPE Is Behind a NAT
     * Device](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm#nat).
     *
     * <p>Example IP address: {@code 10.0.3.3}
     *
     * <p>Example hostname: {@code cpe.example.com}
     *
     * @return the value
     */
    public String getCpeLocalIdentifier() {
        return cpeLocalIdentifier;
    }

    /**
     * The type of identifier for your CPE device. The value here must correspond to the value for
     * {@code cpeLocalIdentifier}.
     */
    public enum CpeLocalIdentifierType implements com.oracle.bmc.http.internal.BmcEnum {
        IpAddress("IP_ADDRESS"),
        Hostname("HOSTNAME"),
        ;

        private final String value;
        private static java.util.Map<String, CpeLocalIdentifierType> map;

        static {
            map = new java.util.HashMap<>();
            for (CpeLocalIdentifierType v : CpeLocalIdentifierType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CpeLocalIdentifierType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CpeLocalIdentifierType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CpeLocalIdentifierType: " + key);
        }
    };
    /**
     * The type of identifier for your CPE device. The value here must correspond to the value for
     * {@code cpeLocalIdentifier}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifierType")
    private final CpeLocalIdentifierType cpeLocalIdentifierType;

    /**
     * The type of identifier for your CPE device. The value here must correspond to the value for
     * {@code cpeLocalIdentifier}.
     *
     * @return the value
     */
    public CpeLocalIdentifierType getCpeLocalIdentifierType() {
        return cpeLocalIdentifierType;
    }

    /**
     * Static routes to the CPE. The CIDR must not be a multicast address or class E address.
     *
     * <p>Used for routing a given IPSec tunnel's traffic only if the tunnel is using static
     * routing. If you configure at least one tunnel to use static routing, then you must provide at
     * least one valid static route. If you configure both tunnels to use BGP dynamic routing, you
     * can provide an empty list for the static routes.
     *
     * <p>The CIDR can be either IPv4 or IPv6. IPv6 addressing is supported for all commercial and
     * government regions. See [IPv6
     * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 10.0.1.0/24}
     *
     * <p>Example: {@code 2001:db8::/32}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
    private final java.util.List<String> staticRoutes;

    /**
     * Static routes to the CPE. The CIDR must not be a multicast address or class E address.
     *
     * <p>Used for routing a given IPSec tunnel's traffic only if the tunnel is using static
     * routing. If you configure at least one tunnel to use static routing, then you must provide at
     * least one valid static route. If you configure both tunnels to use BGP dynamic routing, you
     * can provide an empty list for the static routes.
     *
     * <p>The CIDR can be either IPv4 or IPv6. IPv6 addressing is supported for all commercial and
     * government regions. See [IPv6
     * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 10.0.1.0/24}
     *
     * <p>Example: {@code 2001:db8::/32}
     *
     * @return the value
     */
    public java.util.List<String> getStaticRoutes() {
        return staticRoutes;
    }

    /**
     * The date and time the IPSec connection was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the IPSec connection was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The transport type used for the IPSec connection. */
    public enum TransportType implements com.oracle.bmc.http.internal.BmcEnum {
        Internet("INTERNET"),
        Fastconnect("FASTCONNECT"),
        ;

        private final String value;
        private static java.util.Map<String, TransportType> map;

        static {
            map = new java.util.HashMap<>();
            for (TransportType v : TransportType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TransportType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TransportType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TransportType: " + key);
        }
    };
    /** The transport type used for the IPSec connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final TransportType transportType;

    /**
     * The transport type used for the IPSec connection.
     *
     * @return the value
     */
    public TransportType getTransportType() {
        return transportType;
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
        sb.append("IPSecConnection(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", cpeId=").append(String.valueOf(this.cpeId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", drgId=").append(String.valueOf(this.drgId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", cpeLocalIdentifier=").append(String.valueOf(this.cpeLocalIdentifier));
        sb.append(", cpeLocalIdentifierType=").append(String.valueOf(this.cpeLocalIdentifierType));
        sb.append(", staticRoutes=").append(String.valueOf(this.staticRoutes));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IPSecConnection)) {
            return false;
        }

        IPSecConnection other = (IPSecConnection) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.cpeId, other.cpeId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.drgId, other.drgId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.cpeLocalIdentifier, other.cpeLocalIdentifier)
                && java.util.Objects.equals(
                        this.cpeLocalIdentifierType, other.cpeLocalIdentifierType)
                && java.util.Objects.equals(this.staticRoutes, other.staticRoutes)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.cpeId == null ? 43 : this.cpeId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.drgId == null ? 43 : this.drgId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.cpeLocalIdentifier == null
                                ? 43
                                : this.cpeLocalIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.cpeLocalIdentifierType == null
                                ? 43
                                : this.cpeLocalIdentifierType.hashCode());
        result = (result * PRIME) + (this.staticRoutes == null ? 43 : this.staticRoutes.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
