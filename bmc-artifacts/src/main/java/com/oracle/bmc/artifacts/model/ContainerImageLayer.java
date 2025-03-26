/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * The container image layer metadata.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerImageLayer.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ContainerImageLayer extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"digest", "sizeInBytes", "timeCreated"})
    public ContainerImageLayer(String digest, Long sizeInBytes, java.util.Date timeCreated) {
        super();
        this.digest = digest;
        this.sizeInBytes = sizeInBytes;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The sha256 digest of the image layer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("digest")
        private String digest;

        /**
         * The sha256 digest of the image layer.
         * @param digest the value to set
         * @return this builder
         **/
        public Builder digest(String digest) {
            this.digest = digest;
            this.__explicitlySet__.add("digest");
            return this;
        }
        /**
         * The size of the layer in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * The size of the layer in bytes.
         * @param sizeInBytes the value to set
         * @return this builder
         **/
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /**
         * An RFC 3339 timestamp indicating when the layer was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * An RFC 3339 timestamp indicating when the layer was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerImageLayer build() {
            ContainerImageLayer model =
                    new ContainerImageLayer(this.digest, this.sizeInBytes, this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerImageLayer model) {
            if (model.wasPropertyExplicitlySet("digest")) {
                this.digest(model.getDigest());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The sha256 digest of the image layer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    private final String digest;

    /**
     * The sha256 digest of the image layer.
     * @return the value
     **/
    public String getDigest() {
        return digest;
    }

    /**
     * The size of the layer in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * The size of the layer in bytes.
     * @return the value
     **/
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * An RFC 3339 timestamp indicating when the layer was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An RFC 3339 timestamp indicating when the layer was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("ContainerImageLayer(");
        sb.append("super=").append(super.toString());
        sb.append("digest=").append(String.valueOf(this.digest));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerImageLayer)) {
            return false;
        }

        ContainerImageLayer other = (ContainerImageLayer) o;
        return java.util.Objects.equals(this.digest, other.digest)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.digest == null ? 43 : this.digest.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
