/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Details needed when adding a DRG route rule.
 *
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
    builder = AddDrgRouteRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddDrgRouteRuleDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"destinationType", "destination", "nextHopDrgAttachmentId"})
    public AddDrgRouteRuleDetails(
            DestinationType destinationType, String destination, String nextHopDrgAttachmentId) {
        super();
        this.destinationType = destinationType;
        this.destination = destination;
        this.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of destination for the rule.
         * Allowed values:
         *   * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private DestinationType destinationType;

        /**
         * Type of destination for the rule.
         * Allowed values:
         *   * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
         *
         * @param destinationType the value to set
         * @return this builder
         **/
        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }
        /**
         * This is the range of IP addresses used for matching when routing
         * traffic. Only CIDR_BLOCK values are allowed.
         * <p>
         * Potential values:
         *   * IP address range in CIDR notation. This can be an IPv4 or IPv6 CIDR. For example: {@code 192.168.1.0/24}
         *   or {@code 2001:0db8:0123:45::/56}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        /**
         * This is the range of IP addresses used for matching when routing
         * traffic. Only CIDR_BLOCK values are allowed.
         * <p>
         * Potential values:
         *   * IP address range in CIDR notation. This can be an IPv4 or IPv6 CIDR. For example: {@code 192.168.1.0/24}
         *   or {@code 2001:0db8:0123:45::/56}.
         *
         * @param destination the value to set
         * @return this builder
         **/
        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible
         * for reaching the network destination.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
        private String nextHopDrgAttachmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible
         * for reaching the network destination.
         *
         * @param nextHopDrgAttachmentId the value to set
         * @return this builder
         **/
        public Builder nextHopDrgAttachmentId(String nextHopDrgAttachmentId) {
            this.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
            this.__explicitlySet__.add("nextHopDrgAttachmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddDrgRouteRuleDetails build() {
            AddDrgRouteRuleDetails model =
                    new AddDrgRouteRuleDetails(
                            this.destinationType, this.destination, this.nextHopDrgAttachmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddDrgRouteRuleDetails model) {
            if (model.wasPropertyExplicitlySet("destinationType")) {
                this.destinationType(model.getDestinationType());
            }
            if (model.wasPropertyExplicitlySet("destination")) {
                this.destination(model.getDestination());
            }
            if (model.wasPropertyExplicitlySet("nextHopDrgAttachmentId")) {
                this.nextHopDrgAttachmentId(model.getNextHopDrgAttachmentId());
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
     * Type of destination for the rule.
     * Allowed values:
     *   * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
     *
     **/
    public enum DestinationType {
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
     * Type of destination for the rule.
     * Allowed values:
     *   * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    private final DestinationType destinationType;

    /**
     * Type of destination for the rule.
     * Allowed values:
     *   * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
     *
     * @return the value
     **/
    public DestinationType getDestinationType() {
        return destinationType;
    }

    /**
     * This is the range of IP addresses used for matching when routing
     * traffic. Only CIDR_BLOCK values are allowed.
     * <p>
     * Potential values:
     *   * IP address range in CIDR notation. This can be an IPv4 or IPv6 CIDR. For example: {@code 192.168.1.0/24}
     *   or {@code 2001:0db8:0123:45::/56}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final String destination;

    /**
     * This is the range of IP addresses used for matching when routing
     * traffic. Only CIDR_BLOCK values are allowed.
     * <p>
     * Potential values:
     *   * IP address range in CIDR notation. This can be an IPv4 or IPv6 CIDR. For example: {@code 192.168.1.0/24}
     *   or {@code 2001:0db8:0123:45::/56}.
     *
     * @return the value
     **/
    public String getDestination() {
        return destination;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible
     * for reaching the network destination.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
    private final String nextHopDrgAttachmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible
     * for reaching the network destination.
     *
     * @return the value
     **/
    public String getNextHopDrgAttachmentId() {
        return nextHopDrgAttachmentId;
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
        sb.append("AddDrgRouteRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("destinationType=").append(String.valueOf(this.destinationType));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append(", nextHopDrgAttachmentId=").append(String.valueOf(this.nextHopDrgAttachmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddDrgRouteRuleDetails)) {
            return false;
        }

        AddDrgRouteRuleDetails other = (AddDrgRouteRuleDetails) o;
        return java.util.Objects.equals(this.destinationType, other.destinationType)
                && java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(
                        this.nextHopDrgAttachmentId, other.nextHopDrgAttachmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.destinationType == null ? 43 : this.destinationType.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result =
                (result * PRIME)
                        + (this.nextHopDrgAttachmentId == null
                                ? 43
                                : this.nextHopDrgAttachmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
