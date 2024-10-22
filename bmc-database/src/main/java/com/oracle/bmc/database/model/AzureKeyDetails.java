/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for Azure encryption key. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AzureKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "provider")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AzureKeyDetails extends AutonomousDatabaseEncryptionKeyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Azure vault URI */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultUri")
        private String vaultUri;

        /**
         * Azure vault URI
         *
         * @param vaultUri the value to set
         * @return this builder
         */
        public Builder vaultUri(String vaultUri) {
            this.vaultUri = vaultUri;
            this.__explicitlySet__.add("vaultUri");
            return this;
        }
        /** Azure key name */
        @com.fasterxml.jackson.annotation.JsonProperty("keyName")
        private String keyName;

        /**
         * Azure key name
         *
         * @param keyName the value to set
         * @return this builder
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            this.__explicitlySet__.add("keyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AzureKeyDetails build() {
            AzureKeyDetails model = new AzureKeyDetails(this.vaultUri, this.keyName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AzureKeyDetails model) {
            if (model.wasPropertyExplicitlySet("vaultUri")) {
                this.vaultUri(model.getVaultUri());
            }
            if (model.wasPropertyExplicitlySet("keyName")) {
                this.keyName(model.getKeyName());
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
    public AzureKeyDetails(String vaultUri, String keyName) {
        super();
        this.vaultUri = vaultUri;
        this.keyName = keyName;
    }

    /** Azure vault URI */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultUri")
    private final String vaultUri;

    /**
     * Azure vault URI
     *
     * @return the value
     */
    public String getVaultUri() {
        return vaultUri;
    }

    /** Azure key name */
    @com.fasterxml.jackson.annotation.JsonProperty("keyName")
    private final String keyName;

    /**
     * Azure key name
     *
     * @return the value
     */
    public String getKeyName() {
        return keyName;
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
        sb.append("AzureKeyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vaultUri=").append(String.valueOf(this.vaultUri));
        sb.append(", keyName=").append(String.valueOf(this.keyName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AzureKeyDetails)) {
            return false;
        }

        AzureKeyDetails other = (AzureKeyDetails) o;
        return java.util.Objects.equals(this.vaultUri, other.vaultUri)
                && java.util.Objects.equals(this.keyName, other.keyName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vaultUri == null ? 43 : this.vaultUri.hashCode());
        result = (result * PRIME) + (this.keyName == null ? 43 : this.keyName.hashCode());
        return result;
    }
}
