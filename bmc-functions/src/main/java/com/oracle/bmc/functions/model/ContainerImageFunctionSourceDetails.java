/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Source details of a container image based function. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerImageFunctionSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerImageFunctionSourceDetails extends FunctionSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The qualified name of the Docker image to use in the function, including the image tag.
         * The image should be in the OCI Registry that is in the same region as the function
         * itself. Example: {@code phx.ocir.io/ten/functions/function:0.0.1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private String image;

        /**
         * The qualified name of the Docker image to use in the function, including the image tag.
         * The image should be in the OCI Registry that is in the same region as the function
         * itself. Example: {@code phx.ocir.io/ten/functions/function:0.0.1}
         *
         * @param image the value to set
         * @return this builder
         */
        public Builder image(String image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /**
         * The image digest for the version of the image that will be pulled when invoking this
         * function. If no value is specified, the digest currently associated with the image in the
         * OCI Registry will be used. Example: {@code
         * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
        private String imageDigest;

        /**
         * The image digest for the version of the image that will be pulled when invoking this
         * function. If no value is specified, the digest currently associated with the image in the
         * OCI Registry will be used. Example: {@code
         * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
         *
         * @param imageDigest the value to set
         * @return this builder
         */
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            this.__explicitlySet__.add("imageDigest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerImageFunctionSourceDetails build() {
            ContainerImageFunctionSourceDetails model =
                    new ContainerImageFunctionSourceDetails(this.image, this.imageDigest);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerImageFunctionSourceDetails model) {
            if (model.wasPropertyExplicitlySet("image")) {
                this.image(model.getImage());
            }
            if (model.wasPropertyExplicitlySet("imageDigest")) {
                this.imageDigest(model.getImageDigest());
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
    public ContainerImageFunctionSourceDetails(String image, String imageDigest) {
        super();
        this.image = image;
        this.imageDigest = imageDigest;
    }

    /**
     * The qualified name of the Docker image to use in the function, including the image tag. The
     * image should be in the OCI Registry that is in the same region as the function itself.
     * Example: {@code phx.ocir.io/ten/functions/function:0.0.1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final String image;

    /**
     * The qualified name of the Docker image to use in the function, including the image tag. The
     * image should be in the OCI Registry that is in the same region as the function itself.
     * Example: {@code phx.ocir.io/ten/functions/function:0.0.1}
     *
     * @return the value
     */
    public String getImage() {
        return image;
    }

    /**
     * The image digest for the version of the image that will be pulled when invoking this
     * function. If no value is specified, the digest currently associated with the image in the OCI
     * Registry will be used. Example: {@code
     * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
    private final String imageDigest;

    /**
     * The image digest for the version of the image that will be pulled when invoking this
     * function. If no value is specified, the digest currently associated with the image in the OCI
     * Registry will be used. Example: {@code
     * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
     *
     * @return the value
     */
    public String getImageDigest() {
        return imageDigest;
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
        sb.append("ContainerImageFunctionSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", imageDigest=").append(String.valueOf(this.imageDigest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerImageFunctionSourceDetails)) {
            return false;
        }

        ContainerImageFunctionSourceDetails other = (ContainerImageFunctionSourceDetails) o;
        return java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.imageDigest, other.imageDigest)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.image == null ? 43 : this.image.hashCode());
        result = (result * PRIME) + (this.imageDigest == null ? 43 : this.imageDigest.hashCode());
        return result;
    }
}
