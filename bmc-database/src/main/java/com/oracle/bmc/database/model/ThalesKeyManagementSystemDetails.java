/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of Thales CAKM to be used by Autonomous VM Cluster for key management. <br>
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
        builder = ThalesKeyManagementSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "keyManagementSystem")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ThalesKeyManagementSystemDetails extends KeyManagementSystemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isExclusive")
        private Boolean isExclusive;

        public Builder isExclusive(Boolean isExclusive) {
            this.isExclusive = isExclusive;
            this.__explicitlySet__.add("isExclusive");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * key store of Oracle Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
        private String keyStoreId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * key store of Oracle Vault.
         *
         * @param keyStoreId the value to set
         * @return this builder
         */
        public Builder keyStoreId(String keyStoreId) {
            this.keyStoreId = keyStoreId;
            this.__explicitlySet__.add("keyStoreId");
            return this;
        }
        /** Thales HSM Port. Default is 9000. */
        @com.fasterxml.jackson.annotation.JsonProperty("thalesHsmPort")
        private Integer thalesHsmPort;

        /**
         * Thales HSM Port. Default is 9000.
         *
         * @param thalesHsmPort the value to set
         * @return this builder
         */
        public Builder thalesHsmPort(Integer thalesHsmPort) {
            this.thalesHsmPort = thalesHsmPort;
            this.__explicitlySet__.add("thalesHsmPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThalesKeyManagementSystemDetails build() {
            ThalesKeyManagementSystemDetails model =
                    new ThalesKeyManagementSystemDetails(
                            this.isExclusive, this.keyStoreId, this.thalesHsmPort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThalesKeyManagementSystemDetails model) {
            if (model.wasPropertyExplicitlySet("isExclusive")) {
                this.isExclusive(model.getIsExclusive());
            }
            if (model.wasPropertyExplicitlySet("keyStoreId")) {
                this.keyStoreId(model.getKeyStoreId());
            }
            if (model.wasPropertyExplicitlySet("thalesHsmPort")) {
                this.thalesHsmPort(model.getThalesHsmPort());
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

    @Deprecated
    public ThalesKeyManagementSystemDetails(
            Boolean isExclusive, String keyStoreId, Integer thalesHsmPort) {
        super(isExclusive);
        this.keyStoreId = keyStoreId;
        this.thalesHsmPort = thalesHsmPort;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key
     * store of Oracle Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
    private final String keyStoreId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key
     * store of Oracle Vault.
     *
     * @return the value
     */
    public String getKeyStoreId() {
        return keyStoreId;
    }

    /** Thales HSM Port. Default is 9000. */
    @com.fasterxml.jackson.annotation.JsonProperty("thalesHsmPort")
    private final Integer thalesHsmPort;

    /**
     * Thales HSM Port. Default is 9000.
     *
     * @return the value
     */
    public Integer getThalesHsmPort() {
        return thalesHsmPort;
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
        sb.append("ThalesKeyManagementSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", keyStoreId=").append(String.valueOf(this.keyStoreId));
        sb.append(", thalesHsmPort=").append(String.valueOf(this.thalesHsmPort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThalesKeyManagementSystemDetails)) {
            return false;
        }

        ThalesKeyManagementSystemDetails other = (ThalesKeyManagementSystemDetails) o;
        return java.util.Objects.equals(this.keyStoreId, other.keyStoreId)
                && java.util.Objects.equals(this.thalesHsmPort, other.thalesHsmPort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.keyStoreId == null ? 43 : this.keyStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.thalesHsmPort == null ? 43 : this.thalesHsmPort.hashCode());
        return result;
    }
}
