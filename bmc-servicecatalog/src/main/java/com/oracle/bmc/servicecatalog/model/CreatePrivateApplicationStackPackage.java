/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.model;

/**
 * An object for creating a private application stack package. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreatePrivateApplicationStackPackage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "packageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreatePrivateApplicationStackPackage extends CreatePrivateApplicationPackage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Base-64 payload of the Terraform zip package. */
        @com.fasterxml.jackson.annotation.JsonProperty("zipFileBase64Encoded")
        private String zipFileBase64Encoded;

        /**
         * Base-64 payload of the Terraform zip package.
         *
         * @param zipFileBase64Encoded the value to set
         * @return this builder
         */
        public Builder zipFileBase64Encoded(String zipFileBase64Encoded) {
            this.zipFileBase64Encoded = zipFileBase64Encoded;
            this.__explicitlySet__.add("zipFileBase64Encoded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePrivateApplicationStackPackage build() {
            CreatePrivateApplicationStackPackage model =
                    new CreatePrivateApplicationStackPackage(
                            this.version, this.zipFileBase64Encoded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePrivateApplicationStackPackage model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("zipFileBase64Encoded")) {
                this.zipFileBase64Encoded(model.getZipFileBase64Encoded());
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
    public CreatePrivateApplicationStackPackage(String version, String zipFileBase64Encoded) {
        super(version);
        this.zipFileBase64Encoded = zipFileBase64Encoded;
    }

    /** Base-64 payload of the Terraform zip package. */
    @com.fasterxml.jackson.annotation.JsonProperty("zipFileBase64Encoded")
    private final String zipFileBase64Encoded;

    /**
     * Base-64 payload of the Terraform zip package.
     *
     * @return the value
     */
    public String getZipFileBase64Encoded() {
        return zipFileBase64Encoded;
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
        sb.append("CreatePrivateApplicationStackPackage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", zipFileBase64Encoded=").append(String.valueOf(this.zipFileBase64Encoded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePrivateApplicationStackPackage)) {
            return false;
        }

        CreatePrivateApplicationStackPackage other = (CreatePrivateApplicationStackPackage) o;
        return java.util.Objects.equals(this.zipFileBase64Encoded, other.zipFileBase64Encoded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.zipFileBase64Encoded == null
                                ? 43
                                : this.zipFileBase64Encoded.hashCode());
        return result;
    }
}
