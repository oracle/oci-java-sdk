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
        builder = UpdateVirtualCircuitDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateVirtualCircuitDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bandwidthShapeName",
        "crossConnectMappings",
        "isTransportMode",
        "customerBgpAsn",
        "displayName",
        "gatewayId",
        "providerState",
        "referenceComment"
    })
    public UpdateVirtualCircuitDetails(
            String bandwidthShapeName,
            java.util.List<CrossConnectMapping> crossConnectMappings,
            Boolean isTransportMode,
            Integer customerBgpAsn,
            String displayName,
            String gatewayId,
            ProviderState providerState,
            String referenceComment) {
        super();
        this.bandwidthShapeName = bandwidthShapeName;
        this.crossConnectMappings = crossConnectMappings;
        this.isTransportMode = isTransportMode;
        this.customerBgpAsn = customerBgpAsn;
        this.displayName = displayName;
        this.gatewayId = gatewayId;
        this.providerState = providerState;
        this.referenceComment = referenceComment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The provisioned data rate of the connection. To get a list of the available bandwidth
         * levels (that is, shapes), see {@link
         * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
         * listFastConnectProviderVirtualCircuitBandwidthShapes}. To be updated only by the customer
         * who owns the virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        /**
         * The provisioned data rate of the connection. To get a list of the available bandwidth
         * levels (that is, shapes), see {@link
         * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
         * listFastConnectProviderVirtualCircuitBandwidthShapes}. To be updated only by the customer
         * who owns the virtual circuit.
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
         * An array of mappings, each containing properties for a cross-connect or cross-connect
         * group associated with this virtual circuit.
         *
         * <p>The customer and provider can update different properties in the mapping depending on
         * the situation. See the description of the {@link CrossConnectMapping}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
        private java.util.List<CrossConnectMapping> crossConnectMappings;

        /**
         * An array of mappings, each containing properties for a cross-connect or cross-connect
         * group associated with this virtual circuit.
         *
         * <p>The customer and provider can update different properties in the mapping depending on
         * the situation. See the description of the {@link CrossConnectMapping}.
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
         * The BGP ASN of the network at the other end of the BGP session from Oracle.
         *
         * <p>If the BGP session is from the customer's edge router to Oracle, the required value is
         * the customer's ASN, and it can be updated only by the customer.
         *
         * <p>If the BGP session is from the provider's edge router to Oracle, the required value is
         * the provider's ASN, and it can be updated only by the provider.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private Integer customerBgpAsn;

        /**
         * The BGP ASN of the network at the other end of the BGP session from Oracle.
         *
         * <p>If the BGP session is from the customer's edge router to Oracle, the required value is
         * the customer's ASN, and it can be updated only by the customer.
         *
         * <p>If the BGP session is from the provider's edge router to Oracle, the required value is
         * the provider's ASN, and it can be updated only by the provider.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@link Drg} that this private virtual circuit uses.
         *
         * <p>To be updated only by the customer who owns the virtual circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
        private String gatewayId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@link Drg} that this private virtual circuit uses.
         *
         * <p>To be updated only by the customer who owns the virtual circuit.
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
         * The provider's state in relation to this virtual circuit. Relevant only if the customer
         * is using FastConnect via a provider. ACTIVE means the provider has provisioned the
         * virtual circuit from their end. INACTIVE means the provider has not yet provisioned the
         * virtual circuit, or has de-provisioned it.
         *
         * <p>To be updated only by the provider.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerState")
        private ProviderState providerState;

        /**
         * The provider's state in relation to this virtual circuit. Relevant only if the customer
         * is using FastConnect via a provider. ACTIVE means the provider has provisioned the
         * virtual circuit from their end. INACTIVE means the provider has not yet provisioned the
         * virtual circuit, or has de-provisioned it.
         *
         * <p>To be updated only by the provider.
         *
         * @param providerState the value to set
         * @return this builder
         */
        public Builder providerState(ProviderState providerState) {
            this.providerState = providerState;
            this.__explicitlySet__.add("providerState");
            return this;
        }
        /**
         * Provider-supplied reference information about this virtual circuit. Relevant only if the
         * customer is using FastConnect via a provider.
         *
         * <p>To be updated only by the provider.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
        private String referenceComment;

        /**
         * Provider-supplied reference information about this virtual circuit. Relevant only if the
         * customer is using FastConnect via a provider.
         *
         * <p>To be updated only by the provider.
         *
         * @param referenceComment the value to set
         * @return this builder
         */
        public Builder referenceComment(String referenceComment) {
            this.referenceComment = referenceComment;
            this.__explicitlySet__.add("referenceComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVirtualCircuitDetails build() {
            UpdateVirtualCircuitDetails model =
                    new UpdateVirtualCircuitDetails(
                            this.bandwidthShapeName,
                            this.crossConnectMappings,
                            this.isTransportMode,
                            this.customerBgpAsn,
                            this.displayName,
                            this.gatewayId,
                            this.providerState,
                            this.referenceComment);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVirtualCircuitDetails model) {
            if (model.wasPropertyExplicitlySet("bandwidthShapeName")) {
                this.bandwidthShapeName(model.getBandwidthShapeName());
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
            if (model.wasPropertyExplicitlySet("providerState")) {
                this.providerState(model.getProviderState());
            }
            if (model.wasPropertyExplicitlySet("referenceComment")) {
                this.referenceComment(model.getReferenceComment());
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
     * listFastConnectProviderVirtualCircuitBandwidthShapes}. To be updated only by the customer who
     * owns the virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
    private final String bandwidthShapeName;

    /**
     * The provisioned data rate of the connection. To get a list of the available bandwidth levels
     * (that is, shapes), see {@link
     * #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest)
     * listFastConnectProviderVirtualCircuitBandwidthShapes}. To be updated only by the customer who
     * owns the virtual circuit.
     *
     * @return the value
     */
    public String getBandwidthShapeName() {
        return bandwidthShapeName;
    }

    /**
     * An array of mappings, each containing properties for a cross-connect or cross-connect group
     * associated with this virtual circuit.
     *
     * <p>The customer and provider can update different properties in the mapping depending on the
     * situation. See the description of the {@link CrossConnectMapping}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectMappings")
    private final java.util.List<CrossConnectMapping> crossConnectMappings;

    /**
     * An array of mappings, each containing properties for a cross-connect or cross-connect group
     * associated with this virtual circuit.
     *
     * <p>The customer and provider can update different properties in the mapping depending on the
     * situation. See the description of the {@link CrossConnectMapping}.
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
     * The BGP ASN of the network at the other end of the BGP session from Oracle.
     *
     * <p>If the BGP session is from the customer's edge router to Oracle, the required value is the
     * customer's ASN, and it can be updated only by the customer.
     *
     * <p>If the BGP session is from the provider's edge router to Oracle, the required value is the
     * provider's ASN, and it can be updated only by the provider.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    private final Integer customerBgpAsn;

    /**
     * The BGP ASN of the network at the other end of the BGP session from Oracle.
     *
     * <p>If the BGP session is from the customer's edge router to Oracle, the required value is the
     * customer's ASN, and it can be updated only by the customer.
     *
     * <p>If the BGP session is from the provider's edge router to Oracle, the required value is the
     * provider's ASN, and it can be updated only by the provider.
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@link Drg} that this private virtual circuit uses.
     *
     * <p>To be updated only by the customer who owns the virtual circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayId")
    private final String gatewayId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@link Drg} that this private virtual circuit uses.
     *
     * <p>To be updated only by the customer who owns the virtual circuit.
     *
     * @return the value
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * The provider's state in relation to this virtual circuit. Relevant only if the customer is
     * using FastConnect via a provider. ACTIVE means the provider has provisioned the virtual
     * circuit from their end. INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     *
     * <p>To be updated only by the provider.
     */
    public enum ProviderState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, ProviderState> map;

        static {
            map = new java.util.HashMap<>();
            for (ProviderState v : ProviderState.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProviderState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProviderState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProviderState: " + key);
        }
    };
    /**
     * The provider's state in relation to this virtual circuit. Relevant only if the customer is
     * using FastConnect via a provider. ACTIVE means the provider has provisioned the virtual
     * circuit from their end. INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     *
     * <p>To be updated only by the provider.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerState")
    private final ProviderState providerState;

    /**
     * The provider's state in relation to this virtual circuit. Relevant only if the customer is
     * using FastConnect via a provider. ACTIVE means the provider has provisioned the virtual
     * circuit from their end. INACTIVE means the provider has not yet provisioned the virtual
     * circuit, or has de-provisioned it.
     *
     * <p>To be updated only by the provider.
     *
     * @return the value
     */
    public ProviderState getProviderState() {
        return providerState;
    }

    /**
     * Provider-supplied reference information about this virtual circuit. Relevant only if the
     * customer is using FastConnect via a provider.
     *
     * <p>To be updated only by the provider.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceComment")
    private final String referenceComment;

    /**
     * Provider-supplied reference information about this virtual circuit. Relevant only if the
     * customer is using FastConnect via a provider.
     *
     * <p>To be updated only by the provider.
     *
     * @return the value
     */
    public String getReferenceComment() {
        return referenceComment;
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
        sb.append("UpdateVirtualCircuitDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bandwidthShapeName=").append(String.valueOf(this.bandwidthShapeName));
        sb.append(", crossConnectMappings=").append(String.valueOf(this.crossConnectMappings));
        sb.append(", isTransportMode=").append(String.valueOf(this.isTransportMode));
        sb.append(", customerBgpAsn=").append(String.valueOf(this.customerBgpAsn));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", gatewayId=").append(String.valueOf(this.gatewayId));
        sb.append(", providerState=").append(String.valueOf(this.providerState));
        sb.append(", referenceComment=").append(String.valueOf(this.referenceComment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVirtualCircuitDetails)) {
            return false;
        }

        UpdateVirtualCircuitDetails other = (UpdateVirtualCircuitDetails) o;
        return java.util.Objects.equals(this.bandwidthShapeName, other.bandwidthShapeName)
                && java.util.Objects.equals(this.crossConnectMappings, other.crossConnectMappings)
                && java.util.Objects.equals(this.isTransportMode, other.isTransportMode)
                && java.util.Objects.equals(this.customerBgpAsn, other.customerBgpAsn)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.gatewayId, other.gatewayId)
                && java.util.Objects.equals(this.providerState, other.providerState)
                && java.util.Objects.equals(this.referenceComment, other.referenceComment)
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
        result =
                (result * PRIME)
                        + (this.providerState == null ? 43 : this.providerState.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceComment == null ? 43 : this.referenceComment.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
