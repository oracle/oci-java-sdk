/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The promotion/unpromotion status of a DRG <br>
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
        builder = DrgPromotionStatusResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrgPromotionStatusResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "drgId",
        "drgPromotionStatus",
        "rpcPromotionStatus",
        "vcPromotionStatus",
        "ipsecPromotionStatus"
    })
    public DrgPromotionStatusResponse(
            String drgId,
            DrgPromotionStatus drgPromotionStatus,
            java.util.Map<String, String> rpcPromotionStatus,
            java.util.Map<String, String> vcPromotionStatus,
            java.util.Map<String, String> ipsecPromotionStatus) {
        super();
        this.drgId = drgId;
        this.drgPromotionStatus = drgPromotionStatus;
        this.rpcPromotionStatus = rpcPromotionStatus;
        this.vcPromotionStatus = vcPromotionStatus;
        this.ipsecPromotionStatus = ipsecPromotionStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the DRG */
        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        /**
         * OCID of the DRG
         *
         * @param drgId the value to set
         * @return this builder
         */
        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }
        /** The promotion status of the DRG */
        @com.fasterxml.jackson.annotation.JsonProperty("drgPromotionStatus")
        private DrgPromotionStatus drgPromotionStatus;

        /**
         * The promotion status of the DRG
         *
         * @param drgPromotionStatus the value to set
         * @return this builder
         */
        public Builder drgPromotionStatus(DrgPromotionStatus drgPromotionStatus) {
            this.drgPromotionStatus = drgPromotionStatus;
            this.__explicitlySet__.add("drgPromotionStatus");
            return this;
        }
        /**
         * A map of the promotion status of each RPC connection on this DRG {conn_id ->
         * promo_status}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rpcPromotionStatus")
        private java.util.Map<String, String> rpcPromotionStatus;

        /**
         * A map of the promotion status of each RPC connection on this DRG {conn_id ->
         * promo_status}
         *
         * @param rpcPromotionStatus the value to set
         * @return this builder
         */
        public Builder rpcPromotionStatus(java.util.Map<String, String> rpcPromotionStatus) {
            this.rpcPromotionStatus = rpcPromotionStatus;
            this.__explicitlySet__.add("rpcPromotionStatus");
            return this;
        }
        /** A map of the promotion status of each VC on this DRG {conn_id -> promo_status} */
        @com.fasterxml.jackson.annotation.JsonProperty("vcPromotionStatus")
        private java.util.Map<String, String> vcPromotionStatus;

        /**
         * A map of the promotion status of each VC on this DRG {conn_id -> promo_status}
         *
         * @param vcPromotionStatus the value to set
         * @return this builder
         */
        public Builder vcPromotionStatus(java.util.Map<String, String> vcPromotionStatus) {
            this.vcPromotionStatus = vcPromotionStatus;
            this.__explicitlySet__.add("vcPromotionStatus");
            return this;
        }
        /**
         * A map of the promotion status of each IPSec connection on this DRG {conn_id ->
         * promo_status}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipsecPromotionStatus")
        private java.util.Map<String, String> ipsecPromotionStatus;

        /**
         * A map of the promotion status of each IPSec connection on this DRG {conn_id ->
         * promo_status}
         *
         * @param ipsecPromotionStatus the value to set
         * @return this builder
         */
        public Builder ipsecPromotionStatus(java.util.Map<String, String> ipsecPromotionStatus) {
            this.ipsecPromotionStatus = ipsecPromotionStatus;
            this.__explicitlySet__.add("ipsecPromotionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgPromotionStatusResponse build() {
            DrgPromotionStatusResponse model =
                    new DrgPromotionStatusResponse(
                            this.drgId,
                            this.drgPromotionStatus,
                            this.rpcPromotionStatus,
                            this.vcPromotionStatus,
                            this.ipsecPromotionStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgPromotionStatusResponse model) {
            if (model.wasPropertyExplicitlySet("drgId")) {
                this.drgId(model.getDrgId());
            }
            if (model.wasPropertyExplicitlySet("drgPromotionStatus")) {
                this.drgPromotionStatus(model.getDrgPromotionStatus());
            }
            if (model.wasPropertyExplicitlySet("rpcPromotionStatus")) {
                this.rpcPromotionStatus(model.getRpcPromotionStatus());
            }
            if (model.wasPropertyExplicitlySet("vcPromotionStatus")) {
                this.vcPromotionStatus(model.getVcPromotionStatus());
            }
            if (model.wasPropertyExplicitlySet("ipsecPromotionStatus")) {
                this.ipsecPromotionStatus(model.getIpsecPromotionStatus());
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

    /** OCID of the DRG */
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    private final String drgId;

    /**
     * OCID of the DRG
     *
     * @return the value
     */
    public String getDrgId() {
        return drgId;
    }

    /** The promotion status of the DRG */
    public enum DrgPromotionStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Unpromoted("UNPROMOTED"),
        Promoting("PROMOTING"),
        Promoted("PROMOTED"),
        Unpromoting("UNPROMOTING"),
        ;

        private final String value;
        private static java.util.Map<String, DrgPromotionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DrgPromotionStatus v : DrgPromotionStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        DrgPromotionStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DrgPromotionStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DrgPromotionStatus: " + key);
        }
    };
    /** The promotion status of the DRG */
    @com.fasterxml.jackson.annotation.JsonProperty("drgPromotionStatus")
    private final DrgPromotionStatus drgPromotionStatus;

    /**
     * The promotion status of the DRG
     *
     * @return the value
     */
    public DrgPromotionStatus getDrgPromotionStatus() {
        return drgPromotionStatus;
    }

    /**
     * A map of the promotion status of each RPC connection on this DRG {conn_id -> promo_status}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rpcPromotionStatus")
    private final java.util.Map<String, String> rpcPromotionStatus;

    /**
     * A map of the promotion status of each RPC connection on this DRG {conn_id -> promo_status}
     *
     * @return the value
     */
    public java.util.Map<String, String> getRpcPromotionStatus() {
        return rpcPromotionStatus;
    }

    /** A map of the promotion status of each VC on this DRG {conn_id -> promo_status} */
    @com.fasterxml.jackson.annotation.JsonProperty("vcPromotionStatus")
    private final java.util.Map<String, String> vcPromotionStatus;

    /**
     * A map of the promotion status of each VC on this DRG {conn_id -> promo_status}
     *
     * @return the value
     */
    public java.util.Map<String, String> getVcPromotionStatus() {
        return vcPromotionStatus;
    }

    /**
     * A map of the promotion status of each IPSec connection on this DRG {conn_id -> promo_status}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipsecPromotionStatus")
    private final java.util.Map<String, String> ipsecPromotionStatus;

    /**
     * A map of the promotion status of each IPSec connection on this DRG {conn_id -> promo_status}
     *
     * @return the value
     */
    public java.util.Map<String, String> getIpsecPromotionStatus() {
        return ipsecPromotionStatus;
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
        sb.append("DrgPromotionStatusResponse(");
        sb.append("super=").append(super.toString());
        sb.append("drgId=").append(String.valueOf(this.drgId));
        sb.append(", drgPromotionStatus=").append(String.valueOf(this.drgPromotionStatus));
        sb.append(", rpcPromotionStatus=").append(String.valueOf(this.rpcPromotionStatus));
        sb.append(", vcPromotionStatus=").append(String.valueOf(this.vcPromotionStatus));
        sb.append(", ipsecPromotionStatus=").append(String.valueOf(this.ipsecPromotionStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgPromotionStatusResponse)) {
            return false;
        }

        DrgPromotionStatusResponse other = (DrgPromotionStatusResponse) o;
        return java.util.Objects.equals(this.drgId, other.drgId)
                && java.util.Objects.equals(this.drgPromotionStatus, other.drgPromotionStatus)
                && java.util.Objects.equals(this.rpcPromotionStatus, other.rpcPromotionStatus)
                && java.util.Objects.equals(this.vcPromotionStatus, other.vcPromotionStatus)
                && java.util.Objects.equals(this.ipsecPromotionStatus, other.ipsecPromotionStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.drgId == null ? 43 : this.drgId.hashCode());
        result =
                (result * PRIME)
                        + (this.drgPromotionStatus == null
                                ? 43
                                : this.drgPromotionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.rpcPromotionStatus == null
                                ? 43
                                : this.rpcPromotionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.vcPromotionStatus == null ? 43 : this.vcPromotionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.ipsecPromotionStatus == null
                                ? 43
                                : this.ipsecPromotionStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
