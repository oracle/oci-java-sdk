/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Boarder Gateway Protocol (BGP) session status <br>
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
        builder = FlexTunnelBgpStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FlexTunnelBgpStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"flexTunnelId", "bgpSessionStatus", "bgpSessionStatusIpv6"})
    public FlexTunnelBgpStatus(
            String flexTunnelId,
            BgpSessionStatus bgpSessionStatus,
            BgpSessionStatusIpv6 bgpSessionStatusIpv6) {
        super();
        this.flexTunnelId = flexTunnelId;
        this.bgpSessionStatus = bgpSessionStatus;
        this.bgpSessionStatusIpv6 = bgpSessionStatusIpv6;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * flex tunnel.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("flexTunnelId")
        private String flexTunnelId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * flex tunnel.
         *
         * @param flexTunnelId the value to set
         * @return this builder
         */
        public Builder flexTunnelId(String flexTunnelId) {
            this.flexTunnelId = flexTunnelId;
            this.__explicitlySet__.add("flexTunnelId");
            return this;
        }
        /** The state of the IPv4 BGP session associated with the flex tunnel. */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionStatus")
        private BgpSessionStatus bgpSessionStatus;

        /**
         * The state of the IPv4 BGP session associated with the flex tunnel.
         *
         * @param bgpSessionStatus the value to set
         * @return this builder
         */
        public Builder bgpSessionStatus(BgpSessionStatus bgpSessionStatus) {
            this.bgpSessionStatus = bgpSessionStatus;
            this.__explicitlySet__.add("bgpSessionStatus");
            return this;
        }
        /** The state of the IPv6 BGP session associated with the flex tunnel. */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionStatusIpv6")
        private BgpSessionStatusIpv6 bgpSessionStatusIpv6;

        /**
         * The state of the IPv6 BGP session associated with the flex tunnel.
         *
         * @param bgpSessionStatusIpv6 the value to set
         * @return this builder
         */
        public Builder bgpSessionStatusIpv6(BgpSessionStatusIpv6 bgpSessionStatusIpv6) {
            this.bgpSessionStatusIpv6 = bgpSessionStatusIpv6;
            this.__explicitlySet__.add("bgpSessionStatusIpv6");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FlexTunnelBgpStatus build() {
            FlexTunnelBgpStatus model =
                    new FlexTunnelBgpStatus(
                            this.flexTunnelId, this.bgpSessionStatus, this.bgpSessionStatusIpv6);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FlexTunnelBgpStatus model) {
            if (model.wasPropertyExplicitlySet("flexTunnelId")) {
                this.flexTunnelId(model.getFlexTunnelId());
            }
            if (model.wasPropertyExplicitlySet("bgpSessionStatus")) {
                this.bgpSessionStatus(model.getBgpSessionStatus());
            }
            if (model.wasPropertyExplicitlySet("bgpSessionStatusIpv6")) {
                this.bgpSessionStatusIpv6(model.getBgpSessionStatusIpv6());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the flex
     * tunnel.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flexTunnelId")
    private final String flexTunnelId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the flex
     * tunnel.
     *
     * @return the value
     */
    public String getFlexTunnelId() {
        return flexTunnelId;
    }

    /** The state of the IPv4 BGP session associated with the flex tunnel. */
    public enum BgpSessionStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Up("UP"),
        Down("DOWN"),
        ;

        private final String value;
        private static java.util.Map<String, BgpSessionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpSessionStatus v : BgpSessionStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        BgpSessionStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpSessionStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BgpSessionStatus: " + key);
        }
    };
    /** The state of the IPv4 BGP session associated with the flex tunnel. */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionStatus")
    private final BgpSessionStatus bgpSessionStatus;

    /**
     * The state of the IPv4 BGP session associated with the flex tunnel.
     *
     * @return the value
     */
    public BgpSessionStatus getBgpSessionStatus() {
        return bgpSessionStatus;
    }

    /** The state of the IPv6 BGP session associated with the flex tunnel. */
    public enum BgpSessionStatusIpv6 implements com.oracle.bmc.http.internal.BmcEnum {
        Up("UP"),
        Down("DOWN"),
        ;

        private final String value;
        private static java.util.Map<String, BgpSessionStatusIpv6> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpSessionStatusIpv6 v : BgpSessionStatusIpv6.values()) {
                map.put(v.getValue(), v);
            }
        }

        BgpSessionStatusIpv6(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpSessionStatusIpv6 create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BgpSessionStatusIpv6: " + key);
        }
    };
    /** The state of the IPv6 BGP session associated with the flex tunnel. */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionStatusIpv6")
    private final BgpSessionStatusIpv6 bgpSessionStatusIpv6;

    /**
     * The state of the IPv6 BGP session associated with the flex tunnel.
     *
     * @return the value
     */
    public BgpSessionStatusIpv6 getBgpSessionStatusIpv6() {
        return bgpSessionStatusIpv6;
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
        sb.append("FlexTunnelBgpStatus(");
        sb.append("super=").append(super.toString());
        sb.append("flexTunnelId=").append(String.valueOf(this.flexTunnelId));
        sb.append(", bgpSessionStatus=").append(String.valueOf(this.bgpSessionStatus));
        sb.append(", bgpSessionStatusIpv6=").append(String.valueOf(this.bgpSessionStatusIpv6));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlexTunnelBgpStatus)) {
            return false;
        }

        FlexTunnelBgpStatus other = (FlexTunnelBgpStatus) o;
        return java.util.Objects.equals(this.flexTunnelId, other.flexTunnelId)
                && java.util.Objects.equals(this.bgpSessionStatus, other.bgpSessionStatus)
                && java.util.Objects.equals(this.bgpSessionStatusIpv6, other.bgpSessionStatusIpv6)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.flexTunnelId == null ? 43 : this.flexTunnelId.hashCode());
        result =
                (result * PRIME)
                        + (this.bgpSessionStatus == null ? 43 : this.bgpSessionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.bgpSessionStatusIpv6 == null
                                ? 43
                                : this.bgpSessionStatusIpv6.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
