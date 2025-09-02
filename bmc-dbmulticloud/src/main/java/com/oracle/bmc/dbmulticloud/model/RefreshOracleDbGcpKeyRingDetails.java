/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Details for to refresh Oracle DB GCP Key Ring resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RefreshOracleDbGcpKeyRingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RefreshOracleDbGcpKeyRingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"oracleDbGcpConnectorId"})
    public RefreshOracleDbGcpKeyRingDetails(String oracleDbGcpConnectorId) {
        super();
        this.oracleDbGcpConnectorId = oracleDbGcpConnectorId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB GCP Connector resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleDbGcpConnectorId")
        private String oracleDbGcpConnectorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB GCP Connector resource.
         *
         * @param oracleDbGcpConnectorId the value to set
         * @return this builder
         */
        public Builder oracleDbGcpConnectorId(String oracleDbGcpConnectorId) {
            this.oracleDbGcpConnectorId = oracleDbGcpConnectorId;
            this.__explicitlySet__.add("oracleDbGcpConnectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RefreshOracleDbGcpKeyRingDetails build() {
            RefreshOracleDbGcpKeyRingDetails model =
                    new RefreshOracleDbGcpKeyRingDetails(this.oracleDbGcpConnectorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RefreshOracleDbGcpKeyRingDetails model) {
            if (model.wasPropertyExplicitlySet("oracleDbGcpConnectorId")) {
                this.oracleDbGcpConnectorId(model.getOracleDbGcpConnectorId());
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
     * Oracle DB GCP Connector resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleDbGcpConnectorId")
    private final String oracleDbGcpConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB GCP Connector resource.
     *
     * @return the value
     */
    public String getOracleDbGcpConnectorId() {
        return oracleDbGcpConnectorId;
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
        sb.append("RefreshOracleDbGcpKeyRingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("oracleDbGcpConnectorId=").append(String.valueOf(this.oracleDbGcpConnectorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefreshOracleDbGcpKeyRingDetails)) {
            return false;
        }

        RefreshOracleDbGcpKeyRingDetails other = (RefreshOracleDbGcpKeyRingDetails) o;
        return java.util.Objects.equals(this.oracleDbGcpConnectorId, other.oracleDbGcpConnectorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.oracleDbGcpConnectorId == null
                                ? 43
                                : this.oracleDbGcpConnectorId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
