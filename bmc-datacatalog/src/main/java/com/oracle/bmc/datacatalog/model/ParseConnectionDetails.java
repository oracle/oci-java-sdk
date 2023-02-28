/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Parse connections from the connection metadata and Oracle wallet file. An error will be returned
 * if more than one of connectionPayload, walletSecretId or walletSecretName are present in the
 * request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ParseConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ParseConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "connectionDetail",
        "connectionPayload",
        "walletSecretId",
        "walletSecretName"
    })
    public ParseConnectionDetails(
            Connection connectionDetail,
            byte[] connectionPayload,
            String walletSecretId,
            String walletSecretName) {
        super();
        this.connectionDetail = connectionDetail;
        this.connectionPayload = connectionPayload;
        this.walletSecretId = walletSecretId;
        this.walletSecretName = walletSecretName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetail")
        private Connection connectionDetail;

        public Builder connectionDetail(Connection connectionDetail) {
            this.connectionDetail = connectionDetail;
            this.__explicitlySet__.add("connectionDetail");
            return this;
        }
        /** The information used to parse the connection from the wallet file payload. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionPayload")
        private byte[] connectionPayload;

        /**
         * The information used to parse the connection from the wallet file payload.
         *
         * @param connectionPayload the value to set
         * @return this builder
         */
        public Builder connectionPayload(byte[] connectionPayload) {
            this.connectionPayload = connectionPayload;
            this.__explicitlySet__.add("connectionPayload");
            return this;
        }
        /** OCID of the OCI Vault secret holding the Oracle wallet to parse. */
        @com.fasterxml.jackson.annotation.JsonProperty("walletSecretId")
        private String walletSecretId;

        /**
         * OCID of the OCI Vault secret holding the Oracle wallet to parse.
         *
         * @param walletSecretId the value to set
         * @return this builder
         */
        public Builder walletSecretId(String walletSecretId) {
            this.walletSecretId = walletSecretId;
            this.__explicitlySet__.add("walletSecretId");
            return this;
        }
        /** Name of the OCI Vault secret holding the Oracle wallet to parse. */
        @com.fasterxml.jackson.annotation.JsonProperty("walletSecretName")
        private String walletSecretName;

        /**
         * Name of the OCI Vault secret holding the Oracle wallet to parse.
         *
         * @param walletSecretName the value to set
         * @return this builder
         */
        public Builder walletSecretName(String walletSecretName) {
            this.walletSecretName = walletSecretName;
            this.__explicitlySet__.add("walletSecretName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParseConnectionDetails build() {
            ParseConnectionDetails model =
                    new ParseConnectionDetails(
                            this.connectionDetail,
                            this.connectionPayload,
                            this.walletSecretId,
                            this.walletSecretName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParseConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("connectionDetail")) {
                this.connectionDetail(model.getConnectionDetail());
            }
            if (model.wasPropertyExplicitlySet("connectionPayload")) {
                this.connectionPayload(model.getConnectionPayload());
            }
            if (model.wasPropertyExplicitlySet("walletSecretId")) {
                this.walletSecretId(model.getWalletSecretId());
            }
            if (model.wasPropertyExplicitlySet("walletSecretName")) {
                this.walletSecretName(model.getWalletSecretName());
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

    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetail")
    private final Connection connectionDetail;

    public Connection getConnectionDetail() {
        return connectionDetail;
    }

    /** The information used to parse the connection from the wallet file payload. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionPayload")
    private final byte[] connectionPayload;

    /**
     * The information used to parse the connection from the wallet file payload.
     *
     * @return the value
     */
    public byte[] getConnectionPayload() {
        return connectionPayload;
    }

    /** OCID of the OCI Vault secret holding the Oracle wallet to parse. */
    @com.fasterxml.jackson.annotation.JsonProperty("walletSecretId")
    private final String walletSecretId;

    /**
     * OCID of the OCI Vault secret holding the Oracle wallet to parse.
     *
     * @return the value
     */
    public String getWalletSecretId() {
        return walletSecretId;
    }

    /** Name of the OCI Vault secret holding the Oracle wallet to parse. */
    @com.fasterxml.jackson.annotation.JsonProperty("walletSecretName")
    private final String walletSecretName;

    /**
     * Name of the OCI Vault secret holding the Oracle wallet to parse.
     *
     * @return the value
     */
    public String getWalletSecretName() {
        return walletSecretName;
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
        sb.append("ParseConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("connectionDetail=").append(String.valueOf(this.connectionDetail));
        sb.append(", connectionPayload=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.connectionPayload)
                                : (String.valueOf(this.connectionPayload)
                                        + (this.connectionPayload != null
                                                ? " (byte[" + this.connectionPayload.length + "])"
                                                : ""))));
        sb.append(", walletSecretId=").append(String.valueOf(this.walletSecretId));
        sb.append(", walletSecretName=").append(String.valueOf(this.walletSecretName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParseConnectionDetails)) {
            return false;
        }

        ParseConnectionDetails other = (ParseConnectionDetails) o;
        return java.util.Objects.equals(this.connectionDetail, other.connectionDetail)
                && java.util.Arrays.equals(this.connectionPayload, other.connectionPayload)
                && java.util.Objects.equals(this.walletSecretId, other.walletSecretId)
                && java.util.Objects.equals(this.walletSecretName, other.walletSecretName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionDetail == null ? 43 : this.connectionDetail.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.connectionPayload);
        result =
                (result * PRIME)
                        + (this.walletSecretId == null ? 43 : this.walletSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.walletSecretName == null ? 43 : this.walletSecretName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
