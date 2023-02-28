/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Artifact destination details for importing to destination bucket <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ArtifactImportDetailsObjectStorage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "artifactSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ArtifactImportDetailsObjectStorage extends ArtifactImportDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Object Storage namespace used for the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace used for the request.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The name of the bucket. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBucket")
        private String destinationBucket;

        /**
         * The name of the bucket. Avoid entering confidential information.
         *
         * @param destinationBucket the value to set
         * @return this builder
         */
        public Builder destinationBucket(String destinationBucket) {
            this.destinationBucket = destinationBucket;
            this.__explicitlySet__.add("destinationBucket");
            return this;
        }
        /** The name of the object resulting from the copy operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectName")
        private String destinationObjectName;

        /**
         * The name of the object resulting from the copy operation.
         *
         * @param destinationObjectName the value to set
         * @return this builder
         */
        public Builder destinationObjectName(String destinationObjectName) {
            this.destinationObjectName = destinationObjectName;
            this.__explicitlySet__.add("destinationObjectName");
            return this;
        }
        /** Region in which OSS bucket is present */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationRegion")
        private String destinationRegion;

        /**
         * Region in which OSS bucket is present
         *
         * @param destinationRegion the value to set
         * @return this builder
         */
        public Builder destinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            this.__explicitlySet__.add("destinationRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ArtifactImportDetailsObjectStorage build() {
            ArtifactImportDetailsObjectStorage model =
                    new ArtifactImportDetailsObjectStorage(
                            this.namespace,
                            this.destinationBucket,
                            this.destinationObjectName,
                            this.destinationRegion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ArtifactImportDetailsObjectStorage model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("destinationBucket")) {
                this.destinationBucket(model.getDestinationBucket());
            }
            if (model.wasPropertyExplicitlySet("destinationObjectName")) {
                this.destinationObjectName(model.getDestinationObjectName());
            }
            if (model.wasPropertyExplicitlySet("destinationRegion")) {
                this.destinationRegion(model.getDestinationRegion());
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
    public ArtifactImportDetailsObjectStorage(
            String namespace,
            String destinationBucket,
            String destinationObjectName,
            String destinationRegion) {
        super();
        this.namespace = namespace;
        this.destinationBucket = destinationBucket;
        this.destinationObjectName = destinationObjectName;
        this.destinationRegion = destinationRegion;
    }

    /** The Object Storage namespace used for the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace used for the request.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The name of the bucket. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBucket")
    private final String destinationBucket;

    /**
     * The name of the bucket. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDestinationBucket() {
        return destinationBucket;
    }

    /** The name of the object resulting from the copy operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationObjectName")
    private final String destinationObjectName;

    /**
     * The name of the object resulting from the copy operation.
     *
     * @return the value
     */
    public String getDestinationObjectName() {
        return destinationObjectName;
    }

    /** Region in which OSS bucket is present */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationRegion")
    private final String destinationRegion;

    /**
     * Region in which OSS bucket is present
     *
     * @return the value
     */
    public String getDestinationRegion() {
        return destinationRegion;
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
        sb.append("ArtifactImportDetailsObjectStorage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", destinationBucket=").append(String.valueOf(this.destinationBucket));
        sb.append(", destinationObjectName=").append(String.valueOf(this.destinationObjectName));
        sb.append(", destinationRegion=").append(String.valueOf(this.destinationRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArtifactImportDetailsObjectStorage)) {
            return false;
        }

        ArtifactImportDetailsObjectStorage other = (ArtifactImportDetailsObjectStorage) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.destinationBucket, other.destinationBucket)
                && java.util.Objects.equals(this.destinationObjectName, other.destinationObjectName)
                && java.util.Objects.equals(this.destinationRegion, other.destinationRegion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBucket == null ? 43 : this.destinationBucket.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationObjectName == null
                                ? 43
                                : this.destinationObjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationRegion == null ? 43 : this.destinationRegion.hashCode());
        return result;
    }
}
