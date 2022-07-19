/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the OCIR details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OcirDeployArtifactSource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployArtifactSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OcirDeployArtifactSource extends DeployArtifactSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies OCIR image path - optionally include tag.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageUri")
        private String imageUri;

        /**
         * Specifies OCIR image path - optionally include tag.
         * @param imageUri the value to set
         * @return this builder
         **/
        public Builder imageUri(String imageUri) {
            this.imageUri = imageUri;
            this.__explicitlySet__.add("imageUri");
            return this;
        }
        /**
         * Specifies image digest for the version of the image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
        private String imageDigest;

        /**
         * Specifies image digest for the version of the image.
         * @param imageDigest the value to set
         * @return this builder
         **/
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            this.__explicitlySet__.add("imageDigest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OcirDeployArtifactSource build() {
            OcirDeployArtifactSource __instance__ =
                    new OcirDeployArtifactSource(imageUri, imageDigest);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OcirDeployArtifactSource o) {
            Builder copiedBuilder = imageUri(o.getImageUri()).imageDigest(o.getImageDigest());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @Deprecated
    public OcirDeployArtifactSource(String imageUri, String imageDigest) {
        super();
        this.imageUri = imageUri;
        this.imageDigest = imageDigest;
    }

    /**
     * Specifies OCIR image path - optionally include tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageUri")
    private final String imageUri;

    /**
     * Specifies OCIR image path - optionally include tag.
     * @return the value
     **/
    public String getImageUri() {
        return imageUri;
    }

    /**
     * Specifies image digest for the version of the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
    private final String imageDigest;

    /**
     * Specifies image digest for the version of the image.
     * @return the value
     **/
    public String getImageDigest() {
        return imageDigest;
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
        sb.append("OcirDeployArtifactSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", imageUri=").append(String.valueOf(this.imageUri));
        sb.append(", imageDigest=").append(String.valueOf(this.imageDigest));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OcirDeployArtifactSource)) {
            return false;
        }

        OcirDeployArtifactSource other = (OcirDeployArtifactSource) o;
        return java.util.Objects.equals(this.imageUri, other.imageUri)
                && java.util.Objects.equals(this.imageDigest, other.imageDigest)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.imageUri == null ? 43 : this.imageUri.hashCode());
        result = (result * PRIME) + (this.imageDigest == null ? 43 : this.imageDigest.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
