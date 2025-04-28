/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * API key created on user's behalf. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateBdsApiKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateBdsApiKeyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "userId",
        "passphrase",
        "defaultRegion",
        "keyAlias",
        "domainOcid"
    })
    public CreateBdsApiKeyDetails(
            String userId,
            String passphrase,
            String defaultRegion,
            String keyAlias,
            String domainOcid) {
        super();
        this.userId = userId;
        this.passphrase = passphrase;
        this.defaultRegion = defaultRegion;
        this.keyAlias = keyAlias;
        this.domainOcid = domainOcid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the user for whom this new generated API key pair will be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCID of the user for whom this new generated API key pair will be created.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * Base64 passphrase used to secure the private key which will be created on user behalf.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
        private String passphrase;

        /**
         * Base64 passphrase used to secure the private key which will be created on user behalf.
         *
         * @param passphrase the value to set
         * @return this builder
         */
        public Builder passphrase(String passphrase) {
            this.passphrase = passphrase;
            this.__explicitlySet__.add("passphrase");
            return this;
        }
        /**
         * The name of the region to establish the Object Storage endpoint. See
         * https://docs.oracle.com/en-us/iaas/api/#/en/identity/20160918/Region/ for additional
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultRegion")
        private String defaultRegion;

        /**
         * The name of the region to establish the Object Storage endpoint. See
         * https://docs.oracle.com/en-us/iaas/api/#/en/identity/20160918/Region/ for additional
         * information.
         *
         * @param defaultRegion the value to set
         * @return this builder
         */
        public Builder defaultRegion(String defaultRegion) {
            this.defaultRegion = defaultRegion;
            this.__explicitlySet__.add("defaultRegion");
            return this;
        }
        /**
         * User friendly identifier used to uniquely differentiate between different API keys
         * associated with this Big Data Service cluster. Only ASCII alphanumeric characters with no
         * spaces allowed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyAlias")
        private String keyAlias;

        /**
         * User friendly identifier used to uniquely differentiate between different API keys
         * associated with this Big Data Service cluster. Only ASCII alphanumeric characters with no
         * spaces allowed.
         *
         * @param keyAlias the value to set
         * @return this builder
         */
        public Builder keyAlias(String keyAlias) {
            this.keyAlias = keyAlias;
            this.__explicitlySet__.add("keyAlias");
            return this;
        }
        /**
         * Identity domain OCID , where user is present. For default domain , this field will be
         * optional.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domainOcid")
        private String domainOcid;

        /**
         * Identity domain OCID , where user is present. For default domain , this field will be
         * optional.
         *
         * @param domainOcid the value to set
         * @return this builder
         */
        public Builder domainOcid(String domainOcid) {
            this.domainOcid = domainOcid;
            this.__explicitlySet__.add("domainOcid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBdsApiKeyDetails build() {
            CreateBdsApiKeyDetails model =
                    new CreateBdsApiKeyDetails(
                            this.userId,
                            this.passphrase,
                            this.defaultRegion,
                            this.keyAlias,
                            this.domainOcid);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBdsApiKeyDetails model) {
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("passphrase")) {
                this.passphrase(model.getPassphrase());
            }
            if (model.wasPropertyExplicitlySet("defaultRegion")) {
                this.defaultRegion(model.getDefaultRegion());
            }
            if (model.wasPropertyExplicitlySet("keyAlias")) {
                this.keyAlias(model.getKeyAlias());
            }
            if (model.wasPropertyExplicitlySet("domainOcid")) {
                this.domainOcid(model.getDomainOcid());
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

    /** The OCID of the user for whom this new generated API key pair will be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCID of the user for whom this new generated API key pair will be created.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /** Base64 passphrase used to secure the private key which will be created on user behalf. */
    @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
    private final String passphrase;

    /**
     * Base64 passphrase used to secure the private key which will be created on user behalf.
     *
     * @return the value
     */
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * The name of the region to establish the Object Storage endpoint. See
     * https://docs.oracle.com/en-us/iaas/api/#/en/identity/20160918/Region/ for additional
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultRegion")
    private final String defaultRegion;

    /**
     * The name of the region to establish the Object Storage endpoint. See
     * https://docs.oracle.com/en-us/iaas/api/#/en/identity/20160918/Region/ for additional
     * information.
     *
     * @return the value
     */
    public String getDefaultRegion() {
        return defaultRegion;
    }

    /**
     * User friendly identifier used to uniquely differentiate between different API keys associated
     * with this Big Data Service cluster. Only ASCII alphanumeric characters with no spaces
     * allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyAlias")
    private final String keyAlias;

    /**
     * User friendly identifier used to uniquely differentiate between different API keys associated
     * with this Big Data Service cluster. Only ASCII alphanumeric characters with no spaces
     * allowed.
     *
     * @return the value
     */
    public String getKeyAlias() {
        return keyAlias;
    }

    /**
     * Identity domain OCID , where user is present. For default domain , this field will be
     * optional.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domainOcid")
    private final String domainOcid;

    /**
     * Identity domain OCID , where user is present. For default domain , this field will be
     * optional.
     *
     * @return the value
     */
    public String getDomainOcid() {
        return domainOcid;
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
        sb.append("CreateBdsApiKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("userId=").append(String.valueOf(this.userId));
        sb.append(", passphrase=").append("<redacted>");
        sb.append(", defaultRegion=").append(String.valueOf(this.defaultRegion));
        sb.append(", keyAlias=").append(String.valueOf(this.keyAlias));
        sb.append(", domainOcid=").append(String.valueOf(this.domainOcid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBdsApiKeyDetails)) {
            return false;
        }

        CreateBdsApiKeyDetails other = (CreateBdsApiKeyDetails) o;
        return java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.passphrase, other.passphrase)
                && java.util.Objects.equals(this.defaultRegion, other.defaultRegion)
                && java.util.Objects.equals(this.keyAlias, other.keyAlias)
                && java.util.Objects.equals(this.domainOcid, other.domainOcid)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.passphrase == null ? 43 : this.passphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultRegion == null ? 43 : this.defaultRegion.hashCode());
        result = (result * PRIME) + (this.keyAlias == null ? 43 : this.keyAlias.hashCode());
        result = (result * PRIME) + (this.domainOcid == null ? 43 : this.domainOcid.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
