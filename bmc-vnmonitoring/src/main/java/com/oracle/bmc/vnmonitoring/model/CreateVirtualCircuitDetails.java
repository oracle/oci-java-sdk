/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateVirtualCircuitDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVirtualCircuitDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bandwidthShapeName",
        "compartmentId",
        "crossConnectMappings",
        "isTransportMode",
        "customerBgpAsn",
        "displayName",
        "gatewayId",
        "providerName",
        "providerServiceId",
        "providerServiceName",
        "publicPrefixes",
        "region",
        "type"
    })
    public CreateVirtualCircuitDetails(
            String bandwidthShapeName,
            String compartmentId,
            java.util.List<CrossConnectMapping> crossConnectMappings,
            Boolean isTransportMode,
            Integer customerBgpAsn,
            String displayName,
            String gatewayId,
            String providerName,
            String providerServiceId,
            String providerServiceName,
            java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes,
            String region,
            Type type) {
        super();
        this.bandwidthShapeName = bandwidthShapeName;
        this.compartmentId = compartmentId;
        this.crossConnectMappings = crossConnectMappings;
        this.isTransportMode = isTransportMode;
        this.customerBgpAsn = customerBgpAsn;
        this.displayName = displayName;
        this.gatewayId = gatewayId;
        this.providerName = providerName;
        this.providerServiceId = providerServiceId;
        this.providerServiceName = providerServiceName;
        this.publicPrefixes = publicPrefixes;
        this.region = region;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The provisioned data rate of the connection. To get a list of the available bandwidth
         * levels (that is, shapes), see {@link
         * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
         * listFastConnectProviderVirtualCircuitBandwidthShapes}.
         *
         * <p>Example: {@code 10 Gbps}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        /**
         * The provisioned data rate of the connection. To get a list of the available bandwidth
         * levels (that is, shapes), see {@link
         * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
         * listFastConnectProviderVirtualCircuitBandwidthShapes}.
         *
         * <p>Example: {@code 10 Gbps}
         *
         * @param bandwidthShapeName the value to set
         * @return this builder
         */
        public Builder bandwidthShapeName(String bandwidthShapeName) {
            this.bandwidthShapeName = bandwidthShapeName;
            this.__explicitlySet__.add("bandwidthShapeName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to contain the virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to contain the virtual circuit.
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
         * Create a {@code CrossConnectMapping} for each cross-connect or cross-connect group this
         * virtual circuit will run on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
        private java.util.List<CrossConnectMapping> crossConnectMappings;

        /**
         * Create a {@code CrossConnectMapping} for each cross-connect or cross-connect group this
         * virtual circuit will run on.
         *
         * @param crossConnectMappings the value to set
         * @return this builder
         */
        public Builder crossConnectMappings(
                java.util.List<CrossConnectMapping> crossConnectMappings) {
            this.crossConnectMappings = crossConnectMappings;
            this.__explicitlySet__.add("crossConnectMappings");
            return this;
        }
        /**
         * Set to {@code true} for the virtual circuit to carry only encrypted traffic, or set to
         * {@code false} for the virtual circuit to carry unencrypted traffic. If this is not set,
         * the default is {@code false}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isTransportMode")
        private Boolean isTransportMode;

        /**
         * Set to {@code true} for the virtual circuit to carry only encrypted traffic, or set to
         * {@code false} for the virtual circuit to carry unencrypted traffic. If this is not set,
         * the default is {@code false}.
         *
         * @param isTransportMode the value to set
         * @return this builder
         */
        public Builder isTransportMode(Boolean isTransportMode) {
            this.isTransportMode = isTransportMode;
            this.__explicitlySet__.add("isTransportMode");
            return this;
        }
        /**
         * Your BGP ASN (either public or private). Provide this value only if there's a BGP session
         * that goes from your edge router to Oracle. Otherwise, leave this empty or null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        /**
         * Your BGP ASN (either public or private). Provide this value only if there's a BGP session
         * that goes from your edge router to Oracle. Otherwise, leave this empty or null.
         *
         * @param customerBgpAsn the value to set
         * @return this builder
         */
        public Builder customerBgpAsn(Integer customerBgpAsn) {
            this.customerBgpAsn = customerBgpAsn;
            this.__explicitlySet__.add("customerBgpAsn");
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
         * For private virtual circuits only. The
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@link Drg} that this virtual circuit uses.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
        private String gatewayId;

        /**
         * For private virtual circuits only. The
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@link Drg} that this virtual circuit uses.
         *
         * @param gatewayId the value to set
         * @return this builder
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            this.__explicitlySet__.add("gatewayId");
            return this;
        }
        /**
         * Deprecated. Instead use {@code providerServiceId}. To get a list of the provider names,
         * see {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
         * listFastConnectProviderServices}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        /**
         * Deprecated. Instead use {@code providerServiceId}. To get a list of the provider names,
         * see {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
         * listFastConnectProviderServices}.
         *
         * @param providerName the value to set
         * @return this builder
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * service offered by the provider (if you're connecting via a provider). To get a list of
         * the available service offerings, see {@link
         * #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
         * listFastConnectProviderServices}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceId")
        private String providerServiceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * service offered by the provider (if you're connecting via a provider). To get a list of
         * the available service offerings, see {@link
         * #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
         * listFastConnectProviderServices}.
         *
         * @param providerServiceId the value to set
         * @return this builder
         */
        public Builder providerServiceId(String providerServiceId) {
            this.providerServiceId = providerServiceId;
            this.__explicitlySet__.add("providerServiceId");
            return this;
        }
        /**
         * Deprecated. Instead use {@code providerServiceId}. To get a list of the provider names,
         * see {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
         * listFastConnectProviderServices}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
        private String providerServiceName;

        /**
         * Deprecated. Instead use {@code providerServiceId}. To get a list of the provider names,
         * see {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
         * listFastConnectProviderServices}.
         *
         * @param providerServiceName the value to set
         * @return this builder
         */
        public Builder providerServiceName(String providerServiceName) {
            this.providerServiceName = providerServiceName;
            this.__explicitlySet__.add("providerServiceName");
            return this;
        }
        /**
         * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to
         * advertise across the connection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
        private java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes;

        /**
         * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to
         * advertise across the connection.
         *
         * @param publicPrefixes the value to set
         * @return this builder
         */
        public Builder publicPrefixes(
                java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes) {
            this.publicPrefixes = publicPrefixes;
            this.__explicitlySet__.add("publicPrefixes");
            return this;
        }
        /**
         * The Oracle Cloud Infrastructure region where this virtual circuit is located. Example:
         * {@code phx}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The Oracle Cloud Infrastructure region where this virtual circuit is located. Example:
         * {@code phx}
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The type of IP addresses used in this virtual circuit. PRIVATE means [RFC
         * 1918](https://tools.ietf.org/html/rfc1918) addresses (10.0.0.0/8, 172.16/12, and
         * 192.168/16).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of IP addresses used in this virtual circuit. PRIVATE means [RFC
         * 1918](https://tools.ietf.org/html/rfc1918) addresses (10.0.0.0/8, 172.16/12, and
         * 192.168/16).
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVirtualCircuitDetails build() {
            CreateVirtualCircuitDetails model =
                    new CreateVirtualCircuitDetails(
                            this.bandwidthShapeName,
                            this.compartmentId,
                            this.crossConnectMappings,
                            this.isTransportMode,
                            this.customerBgpAsn,
                            this.displayName,
                            this.gatewayId,
                            this.providerName,
                            this.providerServiceId,
                            this.providerServiceName,
                            this.publicPrefixes,
                            this.region,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVirtualCircuitDetails model) {
            if (model.wasPropertyExplicitlySet("bandwidthShapeName")) {
                this.bandwidthShapeName(model.getBandwidthShapeName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("crossConnectMappings")) {
                this.crossConnectMappings(model.getCrossConnectMappings());
            }
            if (model.wasPropertyExplicitlySet("isTransportMode")) {
                this.isTransportMode(model.getIsTransportMode());
            }
            if (model.wasPropertyExplicitlySet("customerBgpAsn")) {
                this.customerBgpAsn(model.getCustomerBgpAsn());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("gatewayId")) {
                this.gatewayId(model.getGatewayId());
            }
            if (model.wasPropertyExplicitlySet("providerName")) {
                this.providerName(model.getProviderName());
            }
            if (model.wasPropertyExplicitlySet("providerServiceId")) {
                this.providerServiceId(model.getProviderServiceId());
            }
            if (model.wasPropertyExplicitlySet("providerServiceName")) {
                this.providerServiceName(model.getProviderServiceName());
            }
            if (model.wasPropertyExplicitlySet("publicPrefixes")) {
                this.publicPrefixes(model.getPublicPrefixes());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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
     * The provisioned data rate of the connection. To get a list of the available bandwidth levels
     * (that is, shapes), see {@link
     * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
     * listFastConnectProviderVirtualCircuitBandwidthShapes}.
     *
     * <p>Example: {@code 10 Gbps}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
    private final String bandwidthShapeName;

    /**
     * The provisioned data rate of the connection. To get a list of the available bandwidth levels
     * (that is, shapes), see {@link
     * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
     * listFastConnectProviderVirtualCircuitBandwidthShapes}.
     *
     * <p>Example: {@code 10 Gbps}
     *
     * @return the value
     */
    public String getBandwidthShapeName() {
        return bandwidthShapeName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to contain the virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to contain the virtual circuit.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Create a {@code CrossConnectMapping} for each cross-connect or cross-connect group this
     * virtual circuit will run on.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
    private final java.util.List<CrossConnectMapping> crossConnectMappings;

    /**
     * Create a {@code CrossConnectMapping} for each cross-connect or cross-connect group this
     * virtual circuit will run on.
     *
     * @return the value
     */
    public java.util.List<CrossConnectMapping> getCrossConnectMappings() {
        return crossConnectMappings;
    }

    /**
     * Set to {@code true} for the virtual circuit to carry only encrypted traffic, or set to {@code
     * false} for the virtual circuit to carry unencrypted traffic. If this is not set, the default
     * is {@code false}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isTransportMode")
    private final Boolean isTransportMode;

    /**
     * Set to {@code true} for the virtual circuit to carry only encrypted traffic, or set to {@code
     * false} for the virtual circuit to carry unencrypted traffic. If this is not set, the default
     * is {@code false}.
     *
     * @return the value
     */
    public Boolean getIsTransportMode() {
        return isTransportMode;
    }

    /**
     * Your BGP ASN (either public or private). Provide this value only if there's a BGP session
     * that goes from your edge router to Oracle. Otherwise, leave this empty or null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    private final Integer customerBgpAsn;

    /**
     * Your BGP ASN (either public or private). Provide this value only if there's a BGP session
     * that goes from your edge router to Oracle. Otherwise, leave this empty or null.
     *
     * @return the value
     */
    public Integer getCustomerBgpAsn() {
        return customerBgpAsn;
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
     * For private virtual circuits only. The
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@link
     * Drg} that this virtual circuit uses.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
    private final String gatewayId;

    /**
     * For private virtual circuits only. The
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@link
     * Drg} that this virtual circuit uses.
     *
     * @return the value
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * Deprecated. Instead use {@code providerServiceId}. To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
     * listFastConnectProviderServices}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    /**
     * Deprecated. Instead use {@code providerServiceId}. To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
     * listFastConnectProviderServices}.
     *
     * @return the value
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * service offered by the provider (if you're connecting via a provider). To get a list of the
     * available service offerings, see {@link
     * #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
     * listFastConnectProviderServices}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceId")
    private final String providerServiceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * service offered by the provider (if you're connecting via a provider). To get a list of the
     * available service offerings, see {@link
     * #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
     * listFastConnectProviderServices}.
     *
     * @return the value
     */
    public String getProviderServiceId() {
        return providerServiceId;
    }

    /**
     * Deprecated. Instead use {@code providerServiceId}. To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
     * listFastConnectProviderServices}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
    private final String providerServiceName;

    /**
     * Deprecated. Instead use {@code providerServiceId}. To get a list of the provider names, see
     * {@link #listFastConnectProviderServices(ListFastConnectProviderServicesRequest)
     * listFastConnectProviderServices}.
     *
     * @return the value
     */
    public String getProviderServiceName() {
        return providerServiceName;
    }

    /**
     * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to advertise
     * across the connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicPrefixes")
    private final java.util.List<CreateVirtualCircuitPublicPrefixDetails> publicPrefixes;

    /**
     * For a public virtual circuit. The public IP prefixes (CIDRs) the customer wants to advertise
     * across the connection.
     *
     * @return the value
     */
    public java.util.List<CreateVirtualCircuitPublicPrefixDetails> getPublicPrefixes() {
        return publicPrefixes;
    }

    /**
     * The Oracle Cloud Infrastructure region where this virtual circuit is located. Example: {@code
     * phx}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The Oracle Cloud Infrastructure region where this virtual circuit is located. Example: {@code
     * phx}
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The type of IP addresses used in this virtual circuit. PRIVATE means [RFC
     * 1918](https://tools.ietf.org/html/rfc1918) addresses (10.0.0.0/8, 172.16/12, and 192.168/16).
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Public("PUBLIC"),
        Private("PRIVATE"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * The type of IP addresses used in this virtual circuit. PRIVATE means [RFC
     * 1918](https://tools.ietf.org/html/rfc1918) addresses (10.0.0.0/8, 172.16/12, and 192.168/16).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of IP addresses used in this virtual circuit. PRIVATE means [RFC
     * 1918](https://tools.ietf.org/html/rfc1918) addresses (10.0.0.0/8, 172.16/12, and 192.168/16).
     *
     * @return the value
     */
    public Type getType() {
        return type;
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
        sb.append("CreateVirtualCircuitDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bandwidthShapeName=").append(String.valueOf(this.bandwidthShapeName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", crossConnectMappings=").append(String.valueOf(this.crossConnectMappings));
        sb.append(", isTransportMode=").append(String.valueOf(this.isTransportMode));
        sb.append(", customerBgpAsn=").append(String.valueOf(this.customerBgpAsn));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", gatewayId=").append(String.valueOf(this.gatewayId));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", providerServiceId=").append(String.valueOf(this.providerServiceId));
        sb.append(", providerServiceName=").append(String.valueOf(this.providerServiceName));
        sb.append(", publicPrefixes=").append(String.valueOf(this.publicPrefixes));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVirtualCircuitDetails)) {
            return false;
        }

        CreateVirtualCircuitDetails other = (CreateVirtualCircuitDetails) o;
        return java.util.Objects.equals(this.bandwidthShapeName, other.bandwidthShapeName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.crossConnectMappings, other.crossConnectMappings)
                && java.util.Objects.equals(this.isTransportMode, other.isTransportMode)
                && java.util.Objects.equals(this.customerBgpAsn, other.customerBgpAsn)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.gatewayId, other.gatewayId)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.providerServiceId, other.providerServiceId)
                && java.util.Objects.equals(this.providerServiceName, other.providerServiceName)
                && java.util.Objects.equals(this.publicPrefixes, other.publicPrefixes)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bandwidthShapeName == null
                                ? 43
                                : this.bandwidthShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.crossConnectMappings == null
                                ? 43
                                : this.crossConnectMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.isTransportMode == null ? 43 : this.isTransportMode.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpAsn == null ? 43 : this.customerBgpAsn.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.gatewayId == null ? 43 : this.gatewayId.hashCode());
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceId == null ? 43 : this.providerServiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceName == null
                                ? 43
                                : this.providerServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.publicPrefixes == null ? 43 : this.publicPrefixes.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
