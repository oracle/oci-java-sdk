/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Details for fetching a container image by its URI. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LookupContainerImageByUriDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LookupContainerImageByUriDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"imageUri"})
    public LookupContainerImageByUriDetails(String imageUri) {
        super();
        this.imageUri = imageUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The container image URI starting with the namespace. Example: namespace/reponame:version
         * Example:
         * namespace/reponame@sha256:50d858e0985ecc7f60418aaf0cc5ab587f42c2570a884095a9e8ccacd0f6545c
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageUri")
        private String imageUri;

        /**
         * The container image URI starting with the namespace. Example: namespace/reponame:version
         * Example:
         * namespace/reponame@sha256:50d858e0985ecc7f60418aaf0cc5ab587f42c2570a884095a9e8ccacd0f6545c
         *
         * @param imageUri the value to set
         * @return this builder
         */
        public Builder imageUri(String imageUri) {
            this.imageUri = imageUri;
            this.__explicitlySet__.add("imageUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LookupContainerImageByUriDetails build() {
            LookupContainerImageByUriDetails model =
                    new LookupContainerImageByUriDetails(this.imageUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LookupContainerImageByUriDetails model) {
            if (model.wasPropertyExplicitlySet("imageUri")) {
                this.imageUri(model.getImageUri());
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
     * The container image URI starting with the namespace. Example: namespace/reponame:version
     * Example:
     * namespace/reponame@sha256:50d858e0985ecc7f60418aaf0cc5ab587f42c2570a884095a9e8ccacd0f6545c
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageUri")
    private final String imageUri;

    /**
     * The container image URI starting with the namespace. Example: namespace/reponame:version
     * Example:
     * namespace/reponame@sha256:50d858e0985ecc7f60418aaf0cc5ab587f42c2570a884095a9e8ccacd0f6545c
     *
     * @return the value
     */
    public String getImageUri() {
        return imageUri;
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
        sb.append("LookupContainerImageByUriDetails(");
        sb.append("super=").append(super.toString());
        sb.append("imageUri=").append(String.valueOf(this.imageUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LookupContainerImageByUriDetails)) {
            return false;
        }

        LookupContainerImageByUriDetails other = (LookupContainerImageByUriDetails) o;
        return java.util.Objects.equals(this.imageUri, other.imageUri) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.imageUri == null ? 43 : this.imageUri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
