/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Details for a custom endpoint for the integration instance (update). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateCustomEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateCustomEndpointDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hostname", "certificateSecretId"})
    public UpdateCustomEndpointDetails(String hostname, String certificateSecretId) {
        super();
        this.hostname = hostname;
        this.certificateSecretId = certificateSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A custom hostname to be used for the integration instance URL, in FQDN format. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * A custom hostname to be used for the integration instance URL, in FQDN format.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * Optional OCID of a vault/secret containing a private SSL certificate bundle to be used
         * for the custom hostname. All certificates should be stored in a single base64 encoded
         * secret. Note the update will fail if this is not a valid certificate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretId")
        private String certificateSecretId;

        /**
         * Optional OCID of a vault/secret containing a private SSL certificate bundle to be used
         * for the custom hostname. All certificates should be stored in a single base64 encoded
         * secret. Note the update will fail if this is not a valid certificate.
         *
         * @param certificateSecretId the value to set
         * @return this builder
         */
        public Builder certificateSecretId(String certificateSecretId) {
            this.certificateSecretId = certificateSecretId;
            this.__explicitlySet__.add("certificateSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCustomEndpointDetails build() {
            UpdateCustomEndpointDetails model =
                    new UpdateCustomEndpointDetails(this.hostname, this.certificateSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCustomEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("certificateSecretId")) {
                this.certificateSecretId(model.getCertificateSecretId());
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

    /** A custom hostname to be used for the integration instance URL, in FQDN format. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * A custom hostname to be used for the integration instance URL, in FQDN format.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Optional OCID of a vault/secret containing a private SSL certificate bundle to be used for
     * the custom hostname. All certificates should be stored in a single base64 encoded secret.
     * Note the update will fail if this is not a valid certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretId")
    private final String certificateSecretId;

    /**
     * Optional OCID of a vault/secret containing a private SSL certificate bundle to be used for
     * the custom hostname. All certificates should be stored in a single base64 encoded secret.
     * Note the update will fail if this is not a valid certificate.
     *
     * @return the value
     */
    public String getCertificateSecretId() {
        return certificateSecretId;
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
        sb.append("UpdateCustomEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostname=").append(String.valueOf(this.hostname));
        sb.append(", certificateSecretId=").append(String.valueOf(this.certificateSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCustomEndpointDetails)) {
            return false;
        }

        UpdateCustomEndpointDetails other = (UpdateCustomEndpointDetails) o;
        return java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.certificateSecretId, other.certificateSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateSecretId == null
                                ? 43
                                : this.certificateSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
