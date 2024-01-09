/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * A summary of an entitlement. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EntitlementSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EntitlementSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "csi", "vendorName"})
    public EntitlementSummary(String compartmentId, String csi, String vendorName) {
        super();
        this.compartmentId = compartmentId;
        this.csi = csi;
        this.vendorName = vendorName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the tenancy containing the entitlement. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy containing the entitlement.
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
         * The Customer Support Identifier (CSI). CSI is a unique key given to a customer to unlock
         * software sources. It uniquely identifies the entitlement.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private String csi;

        /**
         * The Customer Support Identifier (CSI). CSI is a unique key given to a customer to unlock
         * software sources. It uniquely identifies the entitlement.
         *
         * @param csi the value to set
         * @return this builder
         */
        public Builder csi(String csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }
        /** The vendor for the entitlement. */
        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private String vendorName;

        /**
         * The vendor for the entitlement.
         *
         * @param vendorName the value to set
         * @return this builder
         */
        public Builder vendorName(String vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntitlementSummary build() {
            EntitlementSummary model =
                    new EntitlementSummary(this.compartmentId, this.csi, this.vendorName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntitlementSummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("csi")) {
                this.csi(model.getCsi());
            }
            if (model.wasPropertyExplicitlySet("vendorName")) {
                this.vendorName(model.getVendorName());
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

    /** The OCID of the tenancy containing the entitlement. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy containing the entitlement.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Customer Support Identifier (CSI). CSI is a unique key given to a customer to unlock
     * software sources. It uniquely identifies the entitlement.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    private final String csi;

    /**
     * The Customer Support Identifier (CSI). CSI is a unique key given to a customer to unlock
     * software sources. It uniquely identifies the entitlement.
     *
     * @return the value
     */
    public String getCsi() {
        return csi;
    }

    /** The vendor for the entitlement. */
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    private final String vendorName;

    /**
     * The vendor for the entitlement.
     *
     * @return the value
     */
    public String getVendorName() {
        return vendorName;
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
        sb.append("EntitlementSummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", csi=").append(String.valueOf(this.csi));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntitlementSummary)) {
            return false;
        }

        EntitlementSummary other = (EntitlementSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
