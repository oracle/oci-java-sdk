/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Certificates. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCertificateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCertificateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "certificateContent"})
    public CreateCertificateDetails(String key, String certificateContent) {
        super();
        this.key = key;
        this.certificateContent = certificateContent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier key (unique name in the scope of the deployment) of the certificate being
         * referenced. It must be 1 to 32 characters long, must contain only alphanumeric characters
         * and must start with a letter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The identifier key (unique name in the scope of the deployment) of the certificate being
         * referenced. It must be 1 to 32 characters long, must contain only alphanumeric characters
         * and must start with a letter.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** A PEM-encoded SSL certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateContent")
        private String certificateContent;

        /**
         * A PEM-encoded SSL certificate.
         *
         * @param certificateContent the value to set
         * @return this builder
         */
        public Builder certificateContent(String certificateContent) {
            this.certificateContent = certificateContent;
            this.__explicitlySet__.add("certificateContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCertificateDetails build() {
            CreateCertificateDetails model =
                    new CreateCertificateDetails(this.key, this.certificateContent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("certificateContent")) {
                this.certificateContent(model.getCertificateContent());
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
     * The identifier key (unique name in the scope of the deployment) of the certificate being
     * referenced. It must be 1 to 32 characters long, must contain only alphanumeric characters and
     * must start with a letter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The identifier key (unique name in the scope of the deployment) of the certificate being
     * referenced. It must be 1 to 32 characters long, must contain only alphanumeric characters and
     * must start with a letter.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** A PEM-encoded SSL certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateContent")
    private final String certificateContent;

    /**
     * A PEM-encoded SSL certificate.
     *
     * @return the value
     */
    public String getCertificateContent() {
        return certificateContent;
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
        sb.append("CreateCertificateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", certificateContent=").append(String.valueOf(this.certificateContent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCertificateDetails)) {
            return false;
        }

        CreateCertificateDetails other = (CreateCertificateDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.certificateContent, other.certificateContent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateContent == null
                                ? 43
                                : this.certificateContent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
