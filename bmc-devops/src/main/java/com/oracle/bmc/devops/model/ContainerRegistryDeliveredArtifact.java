/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of the container registry artifacts delivered through the Deliver Artifacts stage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerRegistryDeliveredArtifact.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "artifactType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerRegistryDeliveredArtifact extends DeliveredArtifact {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
        private String deployArtifactId;

        public Builder deployArtifactId(String deployArtifactId) {
            this.deployArtifactId = deployArtifactId;
            this.__explicitlySet__.add("deployArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputArtifactName")
        private String outputArtifactName;

        public Builder outputArtifactName(String outputArtifactName) {
            this.outputArtifactName = outputArtifactName;
            this.__explicitlySet__.add("outputArtifactName");
            return this;
        }
        /** The hash of the container registry artifact pushed by the Deliver Artifacts stage. */
        @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifactHash")
        private String deliveredArtifactHash;

        /**
         * The hash of the container registry artifact pushed by the Deliver Artifacts stage.
         *
         * @param deliveredArtifactHash the value to set
         * @return this builder
         */
        public Builder deliveredArtifactHash(String deliveredArtifactHash) {
            this.deliveredArtifactHash = deliveredArtifactHash;
            this.__explicitlySet__.add("deliveredArtifactHash");
            return this;
        }
        /** The imageUri of the OCIR artifact pushed by the DeliverArtifactStage */
        @com.fasterxml.jackson.annotation.JsonProperty("imageUri")
        private String imageUri;

        /**
         * The imageUri of the OCIR artifact pushed by the DeliverArtifactStage
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

        public ContainerRegistryDeliveredArtifact build() {
            ContainerRegistryDeliveredArtifact model =
                    new ContainerRegistryDeliveredArtifact(
                            this.deployArtifactId,
                            this.outputArtifactName,
                            this.deliveredArtifactHash,
                            this.imageUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerRegistryDeliveredArtifact model) {
            if (model.wasPropertyExplicitlySet("deployArtifactId")) {
                this.deployArtifactId(model.getDeployArtifactId());
            }
            if (model.wasPropertyExplicitlySet("outputArtifactName")) {
                this.outputArtifactName(model.getOutputArtifactName());
            }
            if (model.wasPropertyExplicitlySet("deliveredArtifactHash")) {
                this.deliveredArtifactHash(model.getDeliveredArtifactHash());
            }
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

    @Deprecated
    public ContainerRegistryDeliveredArtifact(
            String deployArtifactId,
            String outputArtifactName,
            String deliveredArtifactHash,
            String imageUri) {
        super(deployArtifactId, outputArtifactName);
        this.deliveredArtifactHash = deliveredArtifactHash;
        this.imageUri = imageUri;
    }

    /** The hash of the container registry artifact pushed by the Deliver Artifacts stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifactHash")
    private final String deliveredArtifactHash;

    /**
     * The hash of the container registry artifact pushed by the Deliver Artifacts stage.
     *
     * @return the value
     */
    public String getDeliveredArtifactHash() {
        return deliveredArtifactHash;
    }

    /** The imageUri of the OCIR artifact pushed by the DeliverArtifactStage */
    @com.fasterxml.jackson.annotation.JsonProperty("imageUri")
    private final String imageUri;

    /**
     * The imageUri of the OCIR artifact pushed by the DeliverArtifactStage
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
        sb.append("ContainerRegistryDeliveredArtifact(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", deliveredArtifactHash=").append(String.valueOf(this.deliveredArtifactHash));
        sb.append(", imageUri=").append(String.valueOf(this.imageUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerRegistryDeliveredArtifact)) {
            return false;
        }

        ContainerRegistryDeliveredArtifact other = (ContainerRegistryDeliveredArtifact) o;
        return java.util.Objects.equals(this.deliveredArtifactHash, other.deliveredArtifactHash)
                && java.util.Objects.equals(this.imageUri, other.imageUri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.deliveredArtifactHash == null
                                ? 43
                                : this.deliveredArtifactHash.hashCode());
        result = (result * PRIME) + (this.imageUri == null ? 43 : this.imageUri.hashCode());
        return result;
    }
}
