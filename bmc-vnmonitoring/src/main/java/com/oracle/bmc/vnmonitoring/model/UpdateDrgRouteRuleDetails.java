/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Details used to update a route rule in the DRG route table. <br>
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
        builder = UpdateDrgRouteRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDrgRouteRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "destination",
        "destinationType",
        "nextHopDrgAttachmentId"
    })
    public UpdateDrgRouteRuleDetails(
            String id,
            String destination,
            DestinationType destinationType,
            String nextHopDrgAttachmentId) {
        super();
        this.id = id;
        this.destination = destination;
        this.destinationType = destinationType;
        this.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Oracle-assigned ID of each DRG route rule to update. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Oracle-assigned ID of each DRG route rule to update.
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
         * The range of IP addresses used for matching when routing traffic.
         *
         * <p>Potential values: * IP address range in CIDR notation. Can be an IPv4 or IPv6 CIDR.
         * For example: {@code 192.168.1.0/24} or {@code 2001:0db8:0123:45::/56}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        /**
         * The range of IP addresses used for matching when routing traffic.
         *
         * <p>Potential values: * IP address range in CIDR notation. Can be an IPv4 or IPv6 CIDR.
         * For example: {@code 192.168.1.0/24} or {@code 2001:0db8:0123:45::/56}.
         *
         * @param destination the value to set
         * @return this builder
         */
        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }
        /**
         * Type of destination for the rule. Allowed values: * {@code CIDR_BLOCK}: If the rule's
         * {@code destination} is an IP address range in CIDR notation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private DestinationType destinationType;

        /**
         * Type of destination for the rule. Allowed values: * {@code CIDR_BLOCK}: If the rule's
         * {@code destination} is an IP address range in CIDR notation.
         *
         * @param destinationType the value to set
         * @return this builder
         */
        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * next hop DRG attachment. The next hop DRG attachment is responsible for reaching the
         * network destination.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
        private String nextHopDrgAttachmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * next hop DRG attachment. The next hop DRG attachment is responsible for reaching the
         * network destination.
         *
         * @param nextHopDrgAttachmentId the value to set
         * @return this builder
         */
        public Builder nextHopDrgAttachmentId(String nextHopDrgAttachmentId) {
            this.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
            this.__explicitlySet__.add("nextHopDrgAttachmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrgRouteRuleDetails build() {
            UpdateDrgRouteRuleDetails model =
                    new UpdateDrgRouteRuleDetails(
                            this.id,
                            this.destination,
                            this.destinationType,
                            this.nextHopDrgAttachmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrgRouteRuleDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("destination")) {
                this.destination(model.getDestination());
            }
            if (model.wasPropertyExplicitlySet("destinationType")) {
                this.destinationType(model.getDestinationType());
            }
            if (model.wasPropertyExplicitlySet("nextHopDrgAttachmentId")) {
                this.nextHopDrgAttachmentId(model.getNextHopDrgAttachmentId());
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

    /** The Oracle-assigned ID of each DRG route rule to update. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Oracle-assigned ID of each DRG route rule to update.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The range of IP addresses used for matching when routing traffic.
     *
     * <p>Potential values: * IP address range in CIDR notation. Can be an IPv4 or IPv6 CIDR. For
     * example: {@code 192.168.1.0/24} or {@code 2001:0db8:0123:45::/56}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final String destination;

    /**
     * The range of IP addresses used for matching when routing traffic.
     *
     * <p>Potential values: * IP address range in CIDR notation. Can be an IPv4 or IPv6 CIDR. For
     * example: {@code 192.168.1.0/24} or {@code 2001:0db8:0123:45::/56}.
     *
     * @return the value
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Type of destination for the rule. Allowed values: * {@code CIDR_BLOCK}: If the rule's {@code
     * destination} is an IP address range in CIDR notation.
     */
    public enum DestinationType implements com.oracle.bmc.http.internal.BmcEnum {
        CidrBlock("CIDR_BLOCK"),
        ;

        private final String value;
        private static java.util.Map<String, DestinationType> map;

        static {
            map = new java.util.HashMap<>();
            for (DestinationType v : DestinationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DestinationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DestinationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DestinationType: " + key);
        }
    };
    /**
     * Type of destination for the rule. Allowed values: * {@code CIDR_BLOCK}: If the rule's {@code
     * destination} is an IP address range in CIDR notation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    private final DestinationType destinationType;

    /**
     * Type of destination for the rule. Allowed values: * {@code CIDR_BLOCK}: If the rule's {@code
     * destination} is an IP address range in CIDR notation.
     *
     * @return the value
     */
    public DestinationType getDestinationType() {
        return destinationType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next
     * hop DRG attachment. The next hop DRG attachment is responsible for reaching the network
     * destination.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
    private final String nextHopDrgAttachmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next
     * hop DRG attachment. The next hop DRG attachment is responsible for reaching the network
     * destination.
     *
     * @return the value
     */
    public String getNextHopDrgAttachmentId() {
        return nextHopDrgAttachmentId;
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
        sb.append("UpdateDrgRouteRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append(", destinationType=").append(String.valueOf(this.destinationType));
        sb.append(", nextHopDrgAttachmentId=").append(String.valueOf(this.nextHopDrgAttachmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrgRouteRuleDetails)) {
            return false;
        }

        UpdateDrgRouteRuleDetails other = (UpdateDrgRouteRuleDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(this.destinationType, other.destinationType)
                && java.util.Objects.equals(
                        this.nextHopDrgAttachmentId, other.nextHopDrgAttachmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationType == null ? 43 : this.destinationType.hashCode());
        result =
                (result * PRIME)
                        + (this.nextHopDrgAttachmentId == null
                                ? 43
                                : this.nextHopDrgAttachmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
