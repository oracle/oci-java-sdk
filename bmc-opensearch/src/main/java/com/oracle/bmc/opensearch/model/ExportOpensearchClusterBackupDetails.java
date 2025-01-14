/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Information about the cluster backup to export. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExportOpensearchClusterBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportOpensearchClusterBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "objectStorageNamespace",
        "objectStorageBucketName",
        "objectStoragePrefix",
        "snapshotName",
        "repositoryName",
        "prefix",
        "freeformTags",
        "definedTags"
    })
    public ExportOpensearchClusterBackupDetails(
            String compartmentId,
            String objectStorageNamespace,
            String objectStorageBucketName,
            String objectStoragePrefix,
            String snapshotName,
            String repositoryName,
            String prefix,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.objectStorageNamespace = objectStorageNamespace;
        this.objectStorageBucketName = objectStorageBucketName;
        this.objectStoragePrefix = objectStoragePrefix;
        this.snapshotName = snapshotName;
        this.repositoryName = repositoryName;
        this.prefix = prefix;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment where the Object Storage resources for the cluster backup are
         * located.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the Object Storage resources for the cluster backup are
         * located.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The Object Storage namespace for the cluster backup export operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
        private String objectStorageNamespace;

        /**
         * The Object Storage namespace for the cluster backup export operation.
         *
         * @param objectStorageNamespace the value to set
         * @return this builder
         */
        public Builder objectStorageNamespace(String objectStorageNamespace) {
            this.objectStorageNamespace = objectStorageNamespace;
            this.__explicitlySet__.add("objectStorageNamespace");
            return this;
        }
        /** The name of the Object Storage bucket for the cluster backup export operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucketName")
        private String objectStorageBucketName;

        /**
         * The name of the Object Storage bucket for the cluster backup export operation.
         *
         * @param objectStorageBucketName the value to set
         * @return this builder
         */
        public Builder objectStorageBucketName(String objectStorageBucketName) {
            this.objectStorageBucketName = objectStorageBucketName;
            this.__explicitlySet__.add("objectStorageBucketName");
            return this;
        }
        /** The prefix within the Object Storage bucket for the cluster backup export operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStoragePrefix")
        private String objectStoragePrefix;

        /**
         * The prefix within the Object Storage bucket for the cluster backup export operation.
         *
         * @param objectStoragePrefix the value to set
         * @return this builder
         */
        public Builder objectStoragePrefix(String objectStoragePrefix) {
            this.objectStoragePrefix = objectStoragePrefix;
            this.__explicitlySet__.add("objectStoragePrefix");
            return this;
        }
        /** The name of the snapshot for the cluster backup export operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotName")
        private String snapshotName;

        /**
         * The name of the snapshot for the cluster backup export operation.
         *
         * @param snapshotName the value to set
         * @return this builder
         */
        public Builder snapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            this.__explicitlySet__.add("snapshotName");
            return this;
        }
        /**
         * The name of the repository containing the snapshots for the cluster backup export
         * operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryName")
        private String repositoryName;

        /**
         * The name of the repository containing the snapshots for the cluster backup export
         * operation.
         *
         * @param repositoryName the value to set
         * @return this builder
         */
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            this.__explicitlySet__.add("repositoryName");
            return this;
        }
        /** The prefix within object storage bucket for the cluster backup export operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * The prefix within object storage bucket for the cluster backup export operation.
         *
         * @param prefix the value to set
         * @return this builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportOpensearchClusterBackupDetails build() {
            ExportOpensearchClusterBackupDetails model =
                    new ExportOpensearchClusterBackupDetails(
                            this.compartmentId,
                            this.objectStorageNamespace,
                            this.objectStorageBucketName,
                            this.objectStoragePrefix,
                            this.snapshotName,
                            this.repositoryName,
                            this.prefix,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportOpensearchClusterBackupDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("objectStorageNamespace")) {
                this.objectStorageNamespace(model.getObjectStorageNamespace());
            }
            if (model.wasPropertyExplicitlySet("objectStorageBucketName")) {
                this.objectStorageBucketName(model.getObjectStorageBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectStoragePrefix")) {
                this.objectStoragePrefix(model.getObjectStoragePrefix());
            }
            if (model.wasPropertyExplicitlySet("snapshotName")) {
                this.snapshotName(model.getSnapshotName());
            }
            if (model.wasPropertyExplicitlySet("repositoryName")) {
                this.repositoryName(model.getRepositoryName());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The OCID of the compartment where the Object Storage resources for the cluster backup are
     * located.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the Object Storage resources for the cluster backup are
     * located.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The Object Storage namespace for the cluster backup export operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
    private final String objectStorageNamespace;

    /**
     * The Object Storage namespace for the cluster backup export operation.
     *
     * @return the value
     */
    public String getObjectStorageNamespace() {
        return objectStorageNamespace;
    }

    /** The name of the Object Storage bucket for the cluster backup export operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucketName")
    private final String objectStorageBucketName;

    /**
     * The name of the Object Storage bucket for the cluster backup export operation.
     *
     * @return the value
     */
    public String getObjectStorageBucketName() {
        return objectStorageBucketName;
    }

    /** The prefix within the Object Storage bucket for the cluster backup export operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStoragePrefix")
    private final String objectStoragePrefix;

    /**
     * The prefix within the Object Storage bucket for the cluster backup export operation.
     *
     * @return the value
     */
    public String getObjectStoragePrefix() {
        return objectStoragePrefix;
    }

    /** The name of the snapshot for the cluster backup export operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotName")
    private final String snapshotName;

    /**
     * The name of the snapshot for the cluster backup export operation.
     *
     * @return the value
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    /**
     * The name of the repository containing the snapshots for the cluster backup export operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryName")
    private final String repositoryName;

    /**
     * The name of the repository containing the snapshots for the cluster backup export operation.
     *
     * @return the value
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /** The prefix within object storage bucket for the cluster backup export operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * The prefix within object storage bucket for the cluster backup export operation.
     *
     * @return the value
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("ExportOpensearchClusterBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", objectStorageNamespace=").append(String.valueOf(this.objectStorageNamespace));
        sb.append(", objectStorageBucketName=")
                .append(String.valueOf(this.objectStorageBucketName));
        sb.append(", objectStoragePrefix=").append(String.valueOf(this.objectStoragePrefix));
        sb.append(", snapshotName=").append(String.valueOf(this.snapshotName));
        sb.append(", repositoryName=").append(String.valueOf(this.repositoryName));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportOpensearchClusterBackupDetails)) {
            return false;
        }

        ExportOpensearchClusterBackupDetails other = (ExportOpensearchClusterBackupDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.objectStorageNamespace, other.objectStorageNamespace)
                && java.util.Objects.equals(
                        this.objectStorageBucketName, other.objectStorageBucketName)
                && java.util.Objects.equals(this.objectStoragePrefix, other.objectStoragePrefix)
                && java.util.Objects.equals(this.snapshotName, other.snapshotName)
                && java.util.Objects.equals(this.repositoryName, other.repositoryName)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageNamespace == null
                                ? 43
                                : this.objectStorageNamespace.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageBucketName == null
                                ? 43
                                : this.objectStorageBucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStoragePrefix == null
                                ? 43
                                : this.objectStoragePrefix.hashCode());
        result = (result * PRIME) + (this.snapshotName == null ? 43 : this.snapshotName.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryName == null ? 43 : this.repositoryName.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
