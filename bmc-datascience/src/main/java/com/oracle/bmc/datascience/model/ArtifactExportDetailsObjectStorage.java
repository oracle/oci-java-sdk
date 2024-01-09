/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Model artifact source details for exporting artifact to service bucket <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ArtifactExportDetailsObjectStorage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "artifactSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ArtifactExportDetailsObjectStorage extends ArtifactExportDetails {
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
        @com.fasterxml.jackson.annotation.JsonProperty("sourceBucket")
        private String sourceBucket;

        /**
         * The name of the bucket. Avoid entering confidential information.
         *
         * @param sourceBucket the value to set
         * @return this builder
         */
        public Builder sourceBucket(String sourceBucket) {
            this.sourceBucket = sourceBucket;
            this.__explicitlySet__.add("sourceBucket");
            return this;
        }
        /** The name of the object resulting from the copy operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
        private String sourceObjectName;

        /**
         * The name of the object resulting from the copy operation.
         *
         * @param sourceObjectName the value to set
         * @return this builder
         */
        public Builder sourceObjectName(String sourceObjectName) {
            this.sourceObjectName = sourceObjectName;
            this.__explicitlySet__.add("sourceObjectName");
            return this;
        }
        /** Region in which OSS bucket is present */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
        private String sourceRegion;

        /**
         * Region in which OSS bucket is present
         *
         * @param sourceRegion the value to set
         * @return this builder
         */
        public Builder sourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            this.__explicitlySet__.add("sourceRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ArtifactExportDetailsObjectStorage build() {
            ArtifactExportDetailsObjectStorage model =
                    new ArtifactExportDetailsObjectStorage(
                            this.namespace,
                            this.sourceBucket,
                            this.sourceObjectName,
                            this.sourceRegion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ArtifactExportDetailsObjectStorage model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("sourceBucket")) {
                this.sourceBucket(model.getSourceBucket());
            }
            if (model.wasPropertyExplicitlySet("sourceObjectName")) {
                this.sourceObjectName(model.getSourceObjectName());
            }
            if (model.wasPropertyExplicitlySet("sourceRegion")) {
                this.sourceRegion(model.getSourceRegion());
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
    public ArtifactExportDetailsObjectStorage(
            String namespace, String sourceBucket, String sourceObjectName, String sourceRegion) {
        super();
        this.namespace = namespace;
        this.sourceBucket = sourceBucket;
        this.sourceObjectName = sourceObjectName;
        this.sourceRegion = sourceRegion;
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
    @com.fasterxml.jackson.annotation.JsonProperty("sourceBucket")
    private final String sourceBucket;

    /**
     * The name of the bucket. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getSourceBucket() {
        return sourceBucket;
    }

    /** The name of the object resulting from the copy operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectName")
    private final String sourceObjectName;

    /**
     * The name of the object resulting from the copy operation.
     *
     * @return the value
     */
    public String getSourceObjectName() {
        return sourceObjectName;
    }

    /** Region in which OSS bucket is present */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
    private final String sourceRegion;

    /**
     * Region in which OSS bucket is present
     *
     * @return the value
     */
    public String getSourceRegion() {
        return sourceRegion;
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
        sb.append("ArtifactExportDetailsObjectStorage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", sourceBucket=").append(String.valueOf(this.sourceBucket));
        sb.append(", sourceObjectName=").append(String.valueOf(this.sourceObjectName));
        sb.append(", sourceRegion=").append(String.valueOf(this.sourceRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArtifactExportDetailsObjectStorage)) {
            return false;
        }

        ArtifactExportDetailsObjectStorage other = (ArtifactExportDetailsObjectStorage) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.sourceBucket, other.sourceBucket)
                && java.util.Objects.equals(this.sourceObjectName, other.sourceObjectName)
                && java.util.Objects.equals(this.sourceRegion, other.sourceRegion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.sourceBucket == null ? 43 : this.sourceBucket.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceObjectName == null ? 43 : this.sourceObjectName.hashCode());
        result = (result * PRIME) + (this.sourceRegion == null ? 43 : this.sourceRegion.hashCode());
        return result;
    }
}
