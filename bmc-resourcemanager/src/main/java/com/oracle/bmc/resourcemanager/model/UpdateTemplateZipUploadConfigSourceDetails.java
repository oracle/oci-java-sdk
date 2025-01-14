/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Update details for a configuration zip file. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateTemplateZipUploadConfigSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "templateConfigSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateTemplateZipUploadConfigSourceDetails
        extends UpdateTemplateConfigSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("zipFileBase64Encoded")
        private String zipFileBase64Encoded;

        public Builder zipFileBase64Encoded(String zipFileBase64Encoded) {
            this.zipFileBase64Encoded = zipFileBase64Encoded;
            this.__explicitlySet__.add("zipFileBase64Encoded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTemplateZipUploadConfigSourceDetails build() {
            UpdateTemplateZipUploadConfigSourceDetails model =
                    new UpdateTemplateZipUploadConfigSourceDetails(this.zipFileBase64Encoded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTemplateZipUploadConfigSourceDetails model) {
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
    public UpdateTemplateZipUploadConfigSourceDetails(String zipFileBase64Encoded) {
        super();
        this.zipFileBase64Encoded = zipFileBase64Encoded;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("zipFileBase64Encoded")
    private final String zipFileBase64Encoded;

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
        sb.append("UpdateTemplateZipUploadConfigSourceDetails(");
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
        if (!(o instanceof UpdateTemplateZipUploadConfigSourceDetails)) {
            return false;
        }

        UpdateTemplateZipUploadConfigSourceDetails other =
                (UpdateTemplateZipUploadConfigSourceDetails) o;
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
