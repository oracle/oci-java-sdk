/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The details of IDCS configured as OpenID setting in OpenSearch. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdcsSecret.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdcsSecret extends SecretDetail {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The URL represent authentication url of the IDCS. */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsUrl")
        private String idcsUrl;

        /**
         * The URL represent authentication url of the IDCS.
         *
         * @param idcsUrl the value to set
         * @return this builder
         */
        public Builder idcsUrl(String idcsUrl) {
            this.idcsUrl = idcsUrl;
            this.__explicitlySet__.add("idcsUrl");
            return this;
        }
        /** The IDCS Connect clientId. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * The IDCS Connect clientId.
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * secret for client secret.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
        private String vaultSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * secret for client secret.
         *
         * @param vaultSecretId the value to set
         * @return this builder
         */
        public Builder vaultSecretId(String vaultSecretId) {
            this.vaultSecretId = vaultSecretId;
            this.__explicitlySet__.add("vaultSecretId");
            return this;
        }
        /** Fully qualified scope url */
        @com.fasterxml.jackson.annotation.JsonProperty("scopeUrl")
        private String scopeUrl;

        /**
         * Fully qualified scope url
         *
         * @param scopeUrl the value to set
         * @return this builder
         */
        public Builder scopeUrl(String scopeUrl) {
            this.scopeUrl = scopeUrl;
            this.__explicitlySet__.add("scopeUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdcsSecret build() {
            IdcsSecret model =
                    new IdcsSecret(this.idcsUrl, this.clientId, this.vaultSecretId, this.scopeUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdcsSecret model) {
            if (model.wasPropertyExplicitlySet("idcsUrl")) {
                this.idcsUrl(model.getIdcsUrl());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("vaultSecretId")) {
                this.vaultSecretId(model.getVaultSecretId());
            }
            if (model.wasPropertyExplicitlySet("scopeUrl")) {
                this.scopeUrl(model.getScopeUrl());
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
    public IdcsSecret(String idcsUrl, String clientId, String vaultSecretId, String scopeUrl) {
        super();
        this.idcsUrl = idcsUrl;
        this.clientId = clientId;
        this.vaultSecretId = vaultSecretId;
        this.scopeUrl = scopeUrl;
    }

    /** The URL represent authentication url of the IDCS. */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsUrl")
    private final String idcsUrl;

    /**
     * The URL represent authentication url of the IDCS.
     *
     * @return the value
     */
    public String getIdcsUrl() {
        return idcsUrl;
    }

    /** The IDCS Connect clientId. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * The IDCS Connect clientId.
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * secret for client secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
    private final String vaultSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * secret for client secret.
     *
     * @return the value
     */
    public String getVaultSecretId() {
        return vaultSecretId;
    }

    /** Fully qualified scope url */
    @com.fasterxml.jackson.annotation.JsonProperty("scopeUrl")
    private final String scopeUrl;

    /**
     * Fully qualified scope url
     *
     * @return the value
     */
    public String getScopeUrl() {
        return scopeUrl;
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
        sb.append("IdcsSecret(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", idcsUrl=").append(String.valueOf(this.idcsUrl));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", vaultSecretId=").append(String.valueOf(this.vaultSecretId));
        sb.append(", scopeUrl=").append(String.valueOf(this.scopeUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdcsSecret)) {
            return false;
        }

        IdcsSecret other = (IdcsSecret) o;
        return java.util.Objects.equals(this.idcsUrl, other.idcsUrl)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.vaultSecretId, other.vaultSecretId)
                && java.util.Objects.equals(this.scopeUrl, other.scopeUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.idcsUrl == null ? 43 : this.idcsUrl.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result =
                (result * PRIME)
                        + (this.vaultSecretId == null ? 43 : this.vaultSecretId.hashCode());
        result = (result * PRIME) + (this.scopeUrl == null ? 43 : this.scopeUrl.hashCode());
        return result;
    }
}
