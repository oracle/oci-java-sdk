/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Container configuration based on image stored in OCI Container Registry.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PipelineOcirContainerConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "containerType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PipelineOcirContainerConfigurationDetails
        extends PipelineContainerConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The full path to the Oracle Container Repository (OCIR) registry, image, and tag in a canonical format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private String image;

        /**
         * The full path to the Oracle Container Repository (OCIR) registry, image, and tag in a canonical format.
         *
         * @param image the value to set
         * @return this builder
         **/
        public Builder image(String image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /**
         * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a list of strings.
         * Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only command to run in the absence of an {@code ENTRYPOINT}.
         * The combined size of {@code CMD} and {@code ENTRYPOINT} must be less than 2048 bytes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cmd")
        private java.util.List<String> cmd;

        /**
         * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a list of strings.
         * Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only command to run in the absence of an {@code ENTRYPOINT}.
         * The combined size of {@code CMD} and {@code ENTRYPOINT} must be less than 2048 bytes.
         *
         * @param cmd the value to set
         * @return this builder
         **/
        public Builder cmd(java.util.List<String> cmd) {
            this.cmd = cmd;
            this.__explicitlySet__.add("cmd");
            return this;
        }
        /**
         * The container image run [ENTRYPOINT](https://docs.docker.com/engine/reference/builder/#entrypoint) as a list of strings.
         * Accept the {@code CMD} as extra arguments.
         * The combined size of {@code CMD} and {@code ENTRYPOINT} must be less than 2048 bytes.
         * More information on how {@code CMD} and {@code ENTRYPOINT} interact are [here](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entrypoint")
        private java.util.List<String> entrypoint;

        /**
         * The container image run [ENTRYPOINT](https://docs.docker.com/engine/reference/builder/#entrypoint) as a list of strings.
         * Accept the {@code CMD} as extra arguments.
         * The combined size of {@code CMD} and {@code ENTRYPOINT} must be less than 2048 bytes.
         * More information on how {@code CMD} and {@code ENTRYPOINT} interact are [here](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact).
         *
         * @param entrypoint the value to set
         * @return this builder
         **/
        public Builder entrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            this.__explicitlySet__.add("entrypoint");
            return this;
        }
        /**
         * The digest of the container image. For example,
         * {@code sha256:881303a6b2738834d795a32b4a98eb0e5e3d1cad590a712d1e04f9b2fa90a030}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
        private String imageDigest;

        /**
         * The digest of the container image. For example,
         * {@code sha256:881303a6b2738834d795a32b4a98eb0e5e3d1cad590a712d1e04f9b2fa90a030}
         *
         * @param imageDigest the value to set
         * @return this builder
         **/
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            this.__explicitlySet__.add("imageDigest");
            return this;
        }
        /**
         * OCID of the container image signature
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageSignatureId")
        private String imageSignatureId;

        /**
         * OCID of the container image signature
         * @param imageSignatureId the value to set
         * @return this builder
         **/
        public Builder imageSignatureId(String imageSignatureId) {
            this.imageSignatureId = imageSignatureId;
            this.__explicitlySet__.add("imageSignatureId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineOcirContainerConfigurationDetails build() {
            PipelineOcirContainerConfigurationDetails model =
                    new PipelineOcirContainerConfigurationDetails(
                            this.image,
                            this.cmd,
                            this.entrypoint,
                            this.imageDigest,
                            this.imageSignatureId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineOcirContainerConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("image")) {
                this.image(model.getImage());
            }
            if (model.wasPropertyExplicitlySet("cmd")) {
                this.cmd(model.getCmd());
            }
            if (model.wasPropertyExplicitlySet("entrypoint")) {
                this.entrypoint(model.getEntrypoint());
            }
            if (model.wasPropertyExplicitlySet("imageDigest")) {
                this.imageDigest(model.getImageDigest());
            }
            if (model.wasPropertyExplicitlySet("imageSignatureId")) {
                this.imageSignatureId(model.getImageSignatureId());
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

    @Deprecated
    public PipelineOcirContainerConfigurationDetails(
            String image,
            java.util.List<String> cmd,
            java.util.List<String> entrypoint,
            String imageDigest,
            String imageSignatureId) {
        super();
        this.image = image;
        this.cmd = cmd;
        this.entrypoint = entrypoint;
        this.imageDigest = imageDigest;
        this.imageSignatureId = imageSignatureId;
    }

    /**
     * The full path to the Oracle Container Repository (OCIR) registry, image, and tag in a canonical format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final String image;

    /**
     * The full path to the Oracle Container Repository (OCIR) registry, image, and tag in a canonical format.
     *
     * @return the value
     **/
    public String getImage() {
        return image;
    }

    /**
     * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a list of strings.
     * Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only command to run in the absence of an {@code ENTRYPOINT}.
     * The combined size of {@code CMD} and {@code ENTRYPOINT} must be less than 2048 bytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cmd")
    private final java.util.List<String> cmd;

    /**
     * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a list of strings.
     * Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only command to run in the absence of an {@code ENTRYPOINT}.
     * The combined size of {@code CMD} and {@code ENTRYPOINT} must be less than 2048 bytes.
     *
     * @return the value
     **/
    public java.util.List<String> getCmd() {
        return cmd;
    }

    /**
     * The container image run [ENTRYPOINT](https://docs.docker.com/engine/reference/builder/#entrypoint) as a list of strings.
     * Accept the {@code CMD} as extra arguments.
     * The combined size of {@code CMD} and {@code ENTRYPOINT} must be less than 2048 bytes.
     * More information on how {@code CMD} and {@code ENTRYPOINT} interact are [here](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entrypoint")
    private final java.util.List<String> entrypoint;

    /**
     * The container image run [ENTRYPOINT](https://docs.docker.com/engine/reference/builder/#entrypoint) as a list of strings.
     * Accept the {@code CMD} as extra arguments.
     * The combined size of {@code CMD} and {@code ENTRYPOINT} must be less than 2048 bytes.
     * More information on how {@code CMD} and {@code ENTRYPOINT} interact are [here](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact).
     *
     * @return the value
     **/
    public java.util.List<String> getEntrypoint() {
        return entrypoint;
    }

    /**
     * The digest of the container image. For example,
     * {@code sha256:881303a6b2738834d795a32b4a98eb0e5e3d1cad590a712d1e04f9b2fa90a030}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
    private final String imageDigest;

    /**
     * The digest of the container image. For example,
     * {@code sha256:881303a6b2738834d795a32b4a98eb0e5e3d1cad590a712d1e04f9b2fa90a030}
     *
     * @return the value
     **/
    public String getImageDigest() {
        return imageDigest;
    }

    /**
     * OCID of the container image signature
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageSignatureId")
    private final String imageSignatureId;

    /**
     * OCID of the container image signature
     * @return the value
     **/
    public String getImageSignatureId() {
        return imageSignatureId;
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
        sb.append("PipelineOcirContainerConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", cmd=").append(String.valueOf(this.cmd));
        sb.append(", entrypoint=").append(String.valueOf(this.entrypoint));
        sb.append(", imageDigest=").append(String.valueOf(this.imageDigest));
        sb.append(", imageSignatureId=").append(String.valueOf(this.imageSignatureId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineOcirContainerConfigurationDetails)) {
            return false;
        }

        PipelineOcirContainerConfigurationDetails other =
                (PipelineOcirContainerConfigurationDetails) o;
        return java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.cmd, other.cmd)
                && java.util.Objects.equals(this.entrypoint, other.entrypoint)
                && java.util.Objects.equals(this.imageDigest, other.imageDigest)
                && java.util.Objects.equals(this.imageSignatureId, other.imageSignatureId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.image == null ? 43 : this.image.hashCode());
        result = (result * PRIME) + (this.cmd == null ? 43 : this.cmd.hashCode());
        result = (result * PRIME) + (this.entrypoint == null ? 43 : this.entrypoint.hashCode());
        result = (result * PRIME) + (this.imageDigest == null ? 43 : this.imageDigest.hashCode());
        result =
                (result * PRIME)
                        + (this.imageSignatureId == null ? 43 : this.imageSignatureId.hashCode());
        return result;
    }
}
