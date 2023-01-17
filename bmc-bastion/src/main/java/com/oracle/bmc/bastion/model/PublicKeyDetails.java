/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * Public key details for a bastion session.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PublicKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PublicKeyDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"publicKeyContent"})
    public PublicKeyDetails(String publicKeyContent) {
        super();
        this.publicKeyContent = publicKeyContent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The public key in OpenSSH format of the SSH key pair for the session. When you connect to the session, you must provide the private key of the same SSH key pair.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicKeyContent")
        private String publicKeyContent;

        /**
         * The public key in OpenSSH format of the SSH key pair for the session. When you connect to the session, you must provide the private key of the same SSH key pair.
         * @param publicKeyContent the value to set
         * @return this builder
         **/
        public Builder publicKeyContent(String publicKeyContent) {
            this.publicKeyContent = publicKeyContent;
            this.__explicitlySet__.add("publicKeyContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublicKeyDetails build() {
            PublicKeyDetails model = new PublicKeyDetails(this.publicKeyContent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublicKeyDetails model) {
            if (model.wasPropertyExplicitlySet("publicKeyContent")) {
                this.publicKeyContent(model.getPublicKeyContent());
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
     * The public key in OpenSSH format of the SSH key pair for the session. When you connect to the session, you must provide the private key of the same SSH key pair.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKeyContent")
    private final String publicKeyContent;

    /**
     * The public key in OpenSSH format of the SSH key pair for the session. When you connect to the session, you must provide the private key of the same SSH key pair.
     * @return the value
     **/
    public String getPublicKeyContent() {
        return publicKeyContent;
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
        sb.append("PublicKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("publicKeyContent=").append(String.valueOf(this.publicKeyContent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublicKeyDetails)) {
            return false;
        }

        PublicKeyDetails other = (PublicKeyDetails) o;
        return java.util.Objects.equals(this.publicKeyContent, other.publicKeyContent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.publicKeyContent == null ? 43 : this.publicKeyContent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
