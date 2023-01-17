/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Information about a binary artifact of Java. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JavaArtifact.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JavaArtifact extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "artifactId",
        "artifactDescription",
        "artifactContentType",
        "approximateFileSizeInBytes",
        "sha256"
    })
    public JavaArtifact(
            Long artifactId,
            String artifactDescription,
            ArtifactContentType artifactContentType,
            Long approximateFileSizeInBytes,
            String sha256) {
        super();
        this.artifactId = artifactId;
        this.artifactDescription = artifactDescription;
        this.artifactContentType = artifactContentType;
        this.approximateFileSizeInBytes = approximateFileSizeInBytes;
        this.sha256 = sha256;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
        private Long artifactId;

        /**
         * Unique identifier for the artifact.
         *
         * @param artifactId the value to set
         * @return this builder
         */
        public Builder artifactId(Long artifactId) {
            this.artifactId = artifactId;
            this.__explicitlySet__.add("artifactId");
            return this;
        }
        /**
         * Description of the binary artifact. Typically includes the OS, architecture, and
         * installer type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactDescription")
        private String artifactDescription;

        /**
         * Description of the binary artifact. Typically includes the OS, architecture, and
         * installer type.
         *
         * @param artifactDescription the value to set
         * @return this builder
         */
        public Builder artifactDescription(String artifactDescription) {
            this.artifactDescription = artifactDescription;
            this.__explicitlySet__.add("artifactDescription");
            return this;
        }
        /** Product content type of this artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactContentType")
        private ArtifactContentType artifactContentType;

        /**
         * Product content type of this artifact.
         *
         * @param artifactContentType the value to set
         * @return this builder
         */
        public Builder artifactContentType(ArtifactContentType artifactContentType) {
            this.artifactContentType = artifactContentType;
            this.__explicitlySet__.add("artifactContentType");
            return this;
        }
        /** Approximate compressed file size in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateFileSizeInBytes")
        private Long approximateFileSizeInBytes;

        /**
         * Approximate compressed file size in bytes.
         *
         * @param approximateFileSizeInBytes the value to set
         * @return this builder
         */
        public Builder approximateFileSizeInBytes(Long approximateFileSizeInBytes) {
            this.approximateFileSizeInBytes = approximateFileSizeInBytes;
            this.__explicitlySet__.add("approximateFileSizeInBytes");
            return this;
        }
        /** SHA256 checksum of the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("sha256")
        private String sha256;

        /**
         * SHA256 checksum of the artifact.
         *
         * @param sha256 the value to set
         * @return this builder
         */
        public Builder sha256(String sha256) {
            this.sha256 = sha256;
            this.__explicitlySet__.add("sha256");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaArtifact build() {
            JavaArtifact model =
                    new JavaArtifact(
                            this.artifactId,
                            this.artifactDescription,
                            this.artifactContentType,
                            this.approximateFileSizeInBytes,
                            this.sha256);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaArtifact model) {
            if (model.wasPropertyExplicitlySet("artifactId")) {
                this.artifactId(model.getArtifactId());
            }
            if (model.wasPropertyExplicitlySet("artifactDescription")) {
                this.artifactDescription(model.getArtifactDescription());
            }
            if (model.wasPropertyExplicitlySet("artifactContentType")) {
                this.artifactContentType(model.getArtifactContentType());
            }
            if (model.wasPropertyExplicitlySet("approximateFileSizeInBytes")) {
                this.approximateFileSizeInBytes(model.getApproximateFileSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("sha256")) {
                this.sha256(model.getSha256());
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

    /** Unique identifier for the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
    private final Long artifactId;

    /**
     * Unique identifier for the artifact.
     *
     * @return the value
     */
    public Long getArtifactId() {
        return artifactId;
    }

    /**
     * Description of the binary artifact. Typically includes the OS, architecture, and installer
     * type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactDescription")
    private final String artifactDescription;

    /**
     * Description of the binary artifact. Typically includes the OS, architecture, and installer
     * type.
     *
     * @return the value
     */
    public String getArtifactDescription() {
        return artifactDescription;
    }

    /** Product content type of this artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactContentType")
    private final ArtifactContentType artifactContentType;

    /**
     * Product content type of this artifact.
     *
     * @return the value
     */
    public ArtifactContentType getArtifactContentType() {
        return artifactContentType;
    }

    /** Approximate compressed file size in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateFileSizeInBytes")
    private final Long approximateFileSizeInBytes;

    /**
     * Approximate compressed file size in bytes.
     *
     * @return the value
     */
    public Long getApproximateFileSizeInBytes() {
        return approximateFileSizeInBytes;
    }

    /** SHA256 checksum of the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("sha256")
    private final String sha256;

    /**
     * SHA256 checksum of the artifact.
     *
     * @return the value
     */
    public String getSha256() {
        return sha256;
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
        sb.append("JavaArtifact(");
        sb.append("super=").append(super.toString());
        sb.append("artifactId=").append(String.valueOf(this.artifactId));
        sb.append(", artifactDescription=").append(String.valueOf(this.artifactDescription));
        sb.append(", artifactContentType=").append(String.valueOf(this.artifactContentType));
        sb.append(", approximateFileSizeInBytes=")
                .append(String.valueOf(this.approximateFileSizeInBytes));
        sb.append(", sha256=").append(String.valueOf(this.sha256));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaArtifact)) {
            return false;
        }

        JavaArtifact other = (JavaArtifact) o;
        return java.util.Objects.equals(this.artifactId, other.artifactId)
                && java.util.Objects.equals(this.artifactDescription, other.artifactDescription)
                && java.util.Objects.equals(this.artifactContentType, other.artifactContentType)
                && java.util.Objects.equals(
                        this.approximateFileSizeInBytes, other.approximateFileSizeInBytes)
                && java.util.Objects.equals(this.sha256, other.sha256)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.artifactId == null ? 43 : this.artifactId.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactDescription == null
                                ? 43
                                : this.artifactDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactContentType == null
                                ? 43
                                : this.artifactContentType.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateFileSizeInBytes == null
                                ? 43
                                : this.approximateFileSizeInBytes.hashCode());
        result = (result * PRIME) + (this.sha256 == null ? 43 : this.sha256.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
