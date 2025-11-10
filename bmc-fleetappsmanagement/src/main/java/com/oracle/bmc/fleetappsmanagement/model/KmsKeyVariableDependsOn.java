/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Depends on object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KmsKeyVariableDependsOn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KmsKeyVariableDependsOn
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "vaultId",
        "protectionMode",
        "algorithm",
        "length",
        "curveId"
    })
    public KmsKeyVariableDependsOn(
            String compartmentId,
            String vaultId,
            String protectionMode,
            String algorithm,
            Integer length,
            String curveId) {
        super();
        this.compartmentId = compartmentId;
        this.vaultId = vaultId;
        this.protectionMode = protectionMode;
        this.algorithm = algorithm;
        this.length = length;
        this.curveId = curveId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OCID of the Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * OCID of the Vault.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /** The KMS crypto protection mode string. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private String protectionMode;

        /**
         * The KMS crypto protection mode string.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(String protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /** Key cryptographic algorithm (RSA, AES, etc). */
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private String algorithm;

        /**
         * Key cryptographic algorithm (RSA, AES, etc).
         *
         * @param algorithm the value to set
         * @return this builder
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }
        /** Length of the cryptographic key in bits. */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        /**
         * Length of the cryptographic key in bits.
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /** Curve identifier for key creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("curveId")
        private String curveId;

        /**
         * Curve identifier for key creation.
         *
         * @param curveId the value to set
         * @return this builder
         */
        public Builder curveId(String curveId) {
            this.curveId = curveId;
            this.__explicitlySet__.add("curveId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KmsKeyVariableDependsOn build() {
            KmsKeyVariableDependsOn model =
                    new KmsKeyVariableDependsOn(
                            this.compartmentId,
                            this.vaultId,
                            this.protectionMode,
                            this.algorithm,
                            this.length,
                            this.curveId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KmsKeyVariableDependsOn model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("curveId")) {
                this.curveId(model.getCurveId());
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

    /** OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OCID of the Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * OCID of the Vault.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /** The KMS crypto protection mode string. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final String protectionMode;

    /**
     * The KMS crypto protection mode string.
     *
     * @return the value
     */
    public String getProtectionMode() {
        return protectionMode;
    }

    /** Key cryptographic algorithm (RSA, AES, etc). */
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final String algorithm;

    /**
     * Key cryptographic algorithm (RSA, AES, etc).
     *
     * @return the value
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /** Length of the cryptographic key in bits. */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    /**
     * Length of the cryptographic key in bits.
     *
     * @return the value
     */
    public Integer getLength() {
        return length;
    }

    /** Curve identifier for key creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("curveId")
    private final String curveId;

    /**
     * Curve identifier for key creation.
     *
     * @return the value
     */
    public String getCurveId() {
        return curveId;
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
        sb.append("KmsKeyVariableDependsOn(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", curveId=").append(String.valueOf(this.curveId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KmsKeyVariableDependsOn)) {
            return false;
        }

        KmsKeyVariableDependsOn other = (KmsKeyVariableDependsOn) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.curveId, other.curveId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.curveId == null ? 43 : this.curveId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
