/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * An object defining the Secrets-in-Vault OCIDs representing the MACsec key.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MacsecKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MacsecKey extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "connectivityAssociationNameSecretId",
        "connectivityAssociationNameSecretVersion",
        "connectivityAssociationKeySecretId",
        "connectivityAssociationKeySecretVersion"
    })
    public MacsecKey(
            String connectivityAssociationNameSecretId,
            Long connectivityAssociationNameSecretVersion,
            String connectivityAssociationKeySecretId,
            Long connectivityAssociationKeySecretVersion) {
        super();
        this.connectivityAssociationNameSecretId = connectivityAssociationNameSecretId;
        this.connectivityAssociationNameSecretVersion = connectivityAssociationNameSecretVersion;
        this.connectivityAssociationKeySecretId = connectivityAssociationKeySecretId;
        this.connectivityAssociationKeySecretVersion = connectivityAssociationKeySecretVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity association Key Name (CKN) of this MACsec key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretId")
        private String connectivityAssociationNameSecretId;

        /**
         * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity association Key Name (CKN) of this MACsec key.
         * @param connectivityAssociationNameSecretId the value to set
         * @return this builder
         **/
        public Builder connectivityAssociationNameSecretId(
                String connectivityAssociationNameSecretId) {
            this.connectivityAssociationNameSecretId = connectivityAssociationNameSecretId;
            this.__explicitlySet__.add("connectivityAssociationNameSecretId");
            return this;
        }
        /**
         * The secret version of the connectivity association name secret in Vault.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretVersion")
        private Long connectivityAssociationNameSecretVersion;

        /**
         * The secret version of the connectivity association name secret in Vault.
         * @param connectivityAssociationNameSecretVersion the value to set
         * @return this builder
         **/
        public Builder connectivityAssociationNameSecretVersion(
                Long connectivityAssociationNameSecretVersion) {
            this.connectivityAssociationNameSecretVersion =
                    connectivityAssociationNameSecretVersion;
            this.__explicitlySet__.add("connectivityAssociationNameSecretVersion");
            return this;
        }
        /**
         * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity Association Key (CAK) of this MACsec key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretId")
        private String connectivityAssociationKeySecretId;

        /**
         * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity Association Key (CAK) of this MACsec key.
         * @param connectivityAssociationKeySecretId the value to set
         * @return this builder
         **/
        public Builder connectivityAssociationKeySecretId(
                String connectivityAssociationKeySecretId) {
            this.connectivityAssociationKeySecretId = connectivityAssociationKeySecretId;
            this.__explicitlySet__.add("connectivityAssociationKeySecretId");
            return this;
        }
        /**
         * The secret version of the {@code connectivityAssociationKey} secret in Vault.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretVersion")
        private Long connectivityAssociationKeySecretVersion;

        /**
         * The secret version of the {@code connectivityAssociationKey} secret in Vault.
         * @param connectivityAssociationKeySecretVersion the value to set
         * @return this builder
         **/
        public Builder connectivityAssociationKeySecretVersion(
                Long connectivityAssociationKeySecretVersion) {
            this.connectivityAssociationKeySecretVersion = connectivityAssociationKeySecretVersion;
            this.__explicitlySet__.add("connectivityAssociationKeySecretVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacsecKey build() {
            MacsecKey model =
                    new MacsecKey(
                            this.connectivityAssociationNameSecretId,
                            this.connectivityAssociationNameSecretVersion,
                            this.connectivityAssociationKeySecretId,
                            this.connectivityAssociationKeySecretVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacsecKey model) {
            if (model.wasPropertyExplicitlySet("connectivityAssociationNameSecretId")) {
                this.connectivityAssociationNameSecretId(
                        model.getConnectivityAssociationNameSecretId());
            }
            if (model.wasPropertyExplicitlySet("connectivityAssociationNameSecretVersion")) {
                this.connectivityAssociationNameSecretVersion(
                        model.getConnectivityAssociationNameSecretVersion());
            }
            if (model.wasPropertyExplicitlySet("connectivityAssociationKeySecretId")) {
                this.connectivityAssociationKeySecretId(
                        model.getConnectivityAssociationKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("connectivityAssociationKeySecretVersion")) {
                this.connectivityAssociationKeySecretVersion(
                        model.getConnectivityAssociationKeySecretVersion());
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
     * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity association Key Name (CKN) of this MACsec key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretId")
    private final String connectivityAssociationNameSecretId;

    /**
     * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity association Key Name (CKN) of this MACsec key.
     * @return the value
     **/
    public String getConnectivityAssociationNameSecretId() {
        return connectivityAssociationNameSecretId;
    }

    /**
     * The secret version of the connectivity association name secret in Vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretVersion")
    private final Long connectivityAssociationNameSecretVersion;

    /**
     * The secret version of the connectivity association name secret in Vault.
     * @return the value
     **/
    public Long getConnectivityAssociationNameSecretVersion() {
        return connectivityAssociationNameSecretVersion;
    }

    /**
     * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity Association Key (CAK) of this MACsec key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretId")
    private final String connectivityAssociationKeySecretId;

    /**
     * Secret [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity Association Key (CAK) of this MACsec key.
     * @return the value
     **/
    public String getConnectivityAssociationKeySecretId() {
        return connectivityAssociationKeySecretId;
    }

    /**
     * The secret version of the {@code connectivityAssociationKey} secret in Vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretVersion")
    private final Long connectivityAssociationKeySecretVersion;

    /**
     * The secret version of the {@code connectivityAssociationKey} secret in Vault.
     * @return the value
     **/
    public Long getConnectivityAssociationKeySecretVersion() {
        return connectivityAssociationKeySecretVersion;
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
        sb.append("MacsecKey(");
        sb.append("super=").append(super.toString());
        sb.append("connectivityAssociationNameSecretId=")
                .append(String.valueOf(this.connectivityAssociationNameSecretId));
        sb.append(", connectivityAssociationNameSecretVersion=")
                .append(String.valueOf(this.connectivityAssociationNameSecretVersion));
        sb.append(", connectivityAssociationKeySecretId=")
                .append(String.valueOf(this.connectivityAssociationKeySecretId));
        sb.append(", connectivityAssociationKeySecretVersion=")
                .append(String.valueOf(this.connectivityAssociationKeySecretVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MacsecKey)) {
            return false;
        }

        MacsecKey other = (MacsecKey) o;
        return java.util.Objects.equals(
                        this.connectivityAssociationNameSecretId,
                        other.connectivityAssociationNameSecretId)
                && java.util.Objects.equals(
                        this.connectivityAssociationNameSecretVersion,
                        other.connectivityAssociationNameSecretVersion)
                && java.util.Objects.equals(
                        this.connectivityAssociationKeySecretId,
                        other.connectivityAssociationKeySecretId)
                && java.util.Objects.equals(
                        this.connectivityAssociationKeySecretVersion,
                        other.connectivityAssociationKeySecretVersion)
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
                        + (this.connectivityAssociationNameSecretVersion == null
                                ? 43
                                : this.connectivityAssociationNameSecretVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.connectivityAssociationKeySecretId == null
                                ? 43
                                : this.connectivityAssociationKeySecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectivityAssociationKeySecretVersion == null
                                ? 43
                                : this.connectivityAssociationKeySecretVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
