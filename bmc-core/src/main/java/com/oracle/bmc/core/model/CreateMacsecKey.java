/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines the secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s
 * held in Vault that represent the MACsec key. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateMacsecKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMacsecKey
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "connectivityAssociationNameSecretId",
        "connectivityAssociationKeySecretId"
    })
    public CreateMacsecKey(
            String connectivityAssociationNameSecretId, String connectivityAssociationKeySecretId) {
        super();
        this.connectivityAssociationNameSecretId = connectivityAssociationNameSecretId;
        this.connectivityAssociationKeySecretId = connectivityAssociationKeySecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * containing the Connectivity association Key Name (CKN) of this MACsec key.
         *
         * <p>NOTE: Only the latest secret version will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretId")
        private String connectivityAssociationNameSecretId;

        /**
         * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * containing the Connectivity association Key Name (CKN) of this MACsec key.
         *
         * <p>NOTE: Only the latest secret version will be used.
         *
         * @param connectivityAssociationNameSecretId the value to set
         * @return this builder
         */
        public Builder connectivityAssociationNameSecretId(
                String connectivityAssociationNameSecretId) {
            this.connectivityAssociationNameSecretId = connectivityAssociationNameSecretId;
            this.__explicitlySet__.add("connectivityAssociationNameSecretId");
            return this;
        }
        /**
         * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * containing the Connectivity Association Key (CAK) of this MACsec key.
         *
         * <p>NOTE: Only the latest secret version will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretId")
        private String connectivityAssociationKeySecretId;

        /**
         * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * containing the Connectivity Association Key (CAK) of this MACsec key.
         *
         * <p>NOTE: Only the latest secret version will be used.
         *
         * @param connectivityAssociationKeySecretId the value to set
         * @return this builder
         */
        public Builder connectivityAssociationKeySecretId(
                String connectivityAssociationKeySecretId) {
            this.connectivityAssociationKeySecretId = connectivityAssociationKeySecretId;
            this.__explicitlySet__.add("connectivityAssociationKeySecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMacsecKey build() {
            CreateMacsecKey model =
                    new CreateMacsecKey(
                            this.connectivityAssociationNameSecretId,
                            this.connectivityAssociationKeySecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMacsecKey model) {
            if (model.wasPropertyExplicitlySet("connectivityAssociationNameSecretId")) {
                this.connectivityAssociationNameSecretId(
                        model.getConnectivityAssociationNameSecretId());
            }
            if (model.wasPropertyExplicitlySet("connectivityAssociationKeySecretId")) {
                this.connectivityAssociationKeySecretId(
                        model.getConnectivityAssociationKeySecretId());
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
     * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * containing the Connectivity association Key Name (CKN) of this MACsec key.
     *
     * <p>NOTE: Only the latest secret version will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretId")
    private final String connectivityAssociationNameSecretId;

    /**
     * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * containing the Connectivity association Key Name (CKN) of this MACsec key.
     *
     * <p>NOTE: Only the latest secret version will be used.
     *
     * @return the value
     */
    public String getConnectivityAssociationNameSecretId() {
        return connectivityAssociationNameSecretId;
    }

    /**
     * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * containing the Connectivity Association Key (CAK) of this MACsec key.
     *
     * <p>NOTE: Only the latest secret version will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretId")
    private final String connectivityAssociationKeySecretId;

    /**
     * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * containing the Connectivity Association Key (CAK) of this MACsec key.
     *
     * <p>NOTE: Only the latest secret version will be used.
     *
     * @return the value
     */
    public String getConnectivityAssociationKeySecretId() {
        return connectivityAssociationKeySecretId;
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
        sb.append("CreateMacsecKey(");
        sb.append("super=").append(super.toString());
        sb.append("connectivityAssociationNameSecretId=")
                .append(String.valueOf(this.connectivityAssociationNameSecretId));
        sb.append(", connectivityAssociationKeySecretId=")
                .append(String.valueOf(this.connectivityAssociationKeySecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMacsecKey)) {
            return false;
        }

        CreateMacsecKey other = (CreateMacsecKey) o;
        return java.util.Objects.equals(
                        this.connectivityAssociationNameSecretId,
                        other.connectivityAssociationNameSecretId)
                && java.util.Objects.equals(
                        this.connectivityAssociationKeySecretId,
                        other.connectivityAssociationKeySecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectivityAssociationNameSecretId == null
                                ? 43
                                : this.connectivityAssociationNameSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectivityAssociationKeySecretId == null
                                ? 43
                                : this.connectivityAssociationKeySecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
