/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * OCI Object Storage bucket will be used to store Data Pump dump files for the migration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOracleNfsDataTransferMediumDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOracleNfsDataTransferMediumDetails
        extends CreateOracleDataTransferMediumDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucket")
        private CreateObjectStoreBucket objectStorageBucket;

        public Builder objectStorageBucket(CreateObjectStoreBucket objectStorageBucket) {
            this.objectStorageBucket = objectStorageBucket;
            this.__explicitlySet__.add("objectStorageBucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private HostDumpTransferDetails source;

        public Builder source(HostDumpTransferDetails source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private HostDumpTransferDetails target;

        public Builder target(HostDumpTransferDetails target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /**
         * OCID of the shared storage mount target
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sharedStorageMountTargetId")
        private String sharedStorageMountTargetId;

        /**
         * OCID of the shared storage mount target
         *
         * @param sharedStorageMountTargetId the value to set
         * @return this builder
         **/
        public Builder sharedStorageMountTargetId(String sharedStorageMountTargetId) {
            this.sharedStorageMountTargetId = sharedStorageMountTargetId;
            this.__explicitlySet__.add("sharedStorageMountTargetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOracleNfsDataTransferMediumDetails build() {
            CreateOracleNfsDataTransferMediumDetails model =
                    new CreateOracleNfsDataTransferMediumDetails(
                            this.objectStorageBucket,
                            this.source,
                            this.target,
                            this.sharedStorageMountTargetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOracleNfsDataTransferMediumDetails model) {
            if (model.wasPropertyExplicitlySet("objectStorageBucket")) {
                this.objectStorageBucket(model.getObjectStorageBucket());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("sharedStorageMountTargetId")) {
                this.sharedStorageMountTargetId(model.getSharedStorageMountTargetId());
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
    public CreateOracleNfsDataTransferMediumDetails(
            CreateObjectStoreBucket objectStorageBucket,
            HostDumpTransferDetails source,
            HostDumpTransferDetails target,
            String sharedStorageMountTargetId) {
        super();
        this.objectStorageBucket = objectStorageBucket;
        this.source = source;
        this.target = target;
        this.sharedStorageMountTargetId = sharedStorageMountTargetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucket")
    private final CreateObjectStoreBucket objectStorageBucket;

    public CreateObjectStoreBucket getObjectStorageBucket() {
        return objectStorageBucket;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final HostDumpTransferDetails source;

    public HostDumpTransferDetails getSource() {
        return source;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final HostDumpTransferDetails target;

    public HostDumpTransferDetails getTarget() {
        return target;
    }

    /**
     * OCID of the shared storage mount target
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharedStorageMountTargetId")
    private final String sharedStorageMountTargetId;

    /**
     * OCID of the shared storage mount target
     *
     * @return the value
     **/
    public String getSharedStorageMountTargetId() {
        return sharedStorageMountTargetId;
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
        sb.append("CreateOracleNfsDataTransferMediumDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", objectStorageBucket=").append(String.valueOf(this.objectStorageBucket));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", sharedStorageMountTargetId=")
                .append(String.valueOf(this.sharedStorageMountTargetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOracleNfsDataTransferMediumDetails)) {
            return false;
        }

        CreateOracleNfsDataTransferMediumDetails other =
                (CreateOracleNfsDataTransferMediumDetails) o;
        return java.util.Objects.equals(this.objectStorageBucket, other.objectStorageBucket)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(
                        this.sharedStorageMountTargetId, other.sharedStorageMountTargetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.objectStorageBucket == null
                                ? 43
                                : this.objectStorageBucket.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result =
                (result * PRIME)
                        + (this.sharedStorageMountTargetId == null
                                ? 43
                                : this.sharedStorageMountTargetId.hashCode());
        return result;
    }
}
