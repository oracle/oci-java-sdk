/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * AWS EBS volume related properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwsEbsProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwsEbsProperties
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "attachments",
        "availabilityZone",
        "isEncrypted",
        "iops",
        "isMultiAttachEnabled",
        "sizeInGiBs",
        "status",
        "tags",
        "throughput",
        "volumeKey",
        "volumeType"
    })
    public AwsEbsProperties(
            java.util.List<VolumeAttachment> attachments,
            String availabilityZone,
            Boolean isEncrypted,
            Integer iops,
            Boolean isMultiAttachEnabled,
            Integer sizeInGiBs,
            String status,
            java.util.List<Tag> tags,
            Integer throughput,
            String volumeKey,
            String volumeType) {
        super();
        this.attachments = attachments;
        this.availabilityZone = availabilityZone;
        this.isEncrypted = isEncrypted;
        this.iops = iops;
        this.isMultiAttachEnabled = isMultiAttachEnabled;
        this.sizeInGiBs = sizeInGiBs;
        this.status = status;
        this.tags = tags;
        this.throughput = throughput;
        this.volumeKey = volumeKey;
        this.volumeType = volumeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Information about the volume attachments. */
        @com.fasterxml.jackson.annotation.JsonProperty("attachments")
        private java.util.List<VolumeAttachment> attachments;

        /**
         * Information about the volume attachments.
         *
         * @param attachments the value to set
         * @return this builder
         */
        public Builder attachments(java.util.List<VolumeAttachment> attachments) {
            this.attachments = attachments;
            this.__explicitlySet__.add("attachments");
            return this;
        }
        /** The Availability Zone for the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityZone")
        private String availabilityZone;

        /**
         * The Availability Zone for the volume.
         *
         * @param availabilityZone the value to set
         * @return this builder
         */
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            this.__explicitlySet__.add("availabilityZone");
            return this;
        }
        /** Indicates whether the volume is encrypted. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
        private Boolean isEncrypted;

        /**
         * Indicates whether the volume is encrypted.
         *
         * @param isEncrypted the value to set
         * @return this builder
         */
        public Builder isEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            this.__explicitlySet__.add("isEncrypted");
            return this;
        }
        /** The number of I/O operations per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("iops")
        private Integer iops;

        /**
         * The number of I/O operations per second.
         *
         * @param iops the value to set
         * @return this builder
         */
        public Builder iops(Integer iops) {
            this.iops = iops;
            this.__explicitlySet__.add("iops");
            return this;
        }
        /** Indicates whether Amazon EBS Multi-Attach is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiAttachEnabled")
        private Boolean isMultiAttachEnabled;

        /**
         * Indicates whether Amazon EBS Multi-Attach is enabled.
         *
         * @param isMultiAttachEnabled the value to set
         * @return this builder
         */
        public Builder isMultiAttachEnabled(Boolean isMultiAttachEnabled) {
            this.isMultiAttachEnabled = isMultiAttachEnabled;
            this.__explicitlySet__.add("isMultiAttachEnabled");
            return this;
        }
        /** The size of the volume, in GiBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGiBs")
        private Integer sizeInGiBs;

        /**
         * The size of the volume, in GiBs.
         *
         * @param sizeInGiBs the value to set
         * @return this builder
         */
        public Builder sizeInGiBs(Integer sizeInGiBs) {
            this.sizeInGiBs = sizeInGiBs;
            this.__explicitlySet__.add("sizeInGiBs");
            return this;
        }
        /** The volume state. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The volume state.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Any tags assigned to the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        /**
         * Any tags assigned to the volume.
         *
         * @param tags the value to set
         * @return this builder
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }
        /** The throughput that the volume supports, in MiB/s. */
        @com.fasterxml.jackson.annotation.JsonProperty("throughput")
        private Integer throughput;

        /**
         * The throughput that the volume supports, in MiB/s.
         *
         * @param throughput the value to set
         * @return this builder
         */
        public Builder throughput(Integer throughput) {
            this.throughput = throughput;
            this.__explicitlySet__.add("throughput");
            return this;
        }
        /** The ID of the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeKey")
        private String volumeKey;

        /**
         * The ID of the volume.
         *
         * @param volumeKey the value to set
         * @return this builder
         */
        public Builder volumeKey(String volumeKey) {
            this.volumeKey = volumeKey;
            this.__explicitlySet__.add("volumeKey");
            return this;
        }
        /** The volume type. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeType")
        private String volumeType;

        /**
         * The volume type.
         *
         * @param volumeType the value to set
         * @return this builder
         */
        public Builder volumeType(String volumeType) {
            this.volumeType = volumeType;
            this.__explicitlySet__.add("volumeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwsEbsProperties build() {
            AwsEbsProperties model =
                    new AwsEbsProperties(
                            this.attachments,
                            this.availabilityZone,
                            this.isEncrypted,
                            this.iops,
                            this.isMultiAttachEnabled,
                            this.sizeInGiBs,
                            this.status,
                            this.tags,
                            this.throughput,
                            this.volumeKey,
                            this.volumeType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwsEbsProperties model) {
            if (model.wasPropertyExplicitlySet("attachments")) {
                this.attachments(model.getAttachments());
            }
            if (model.wasPropertyExplicitlySet("availabilityZone")) {
                this.availabilityZone(model.getAvailabilityZone());
            }
            if (model.wasPropertyExplicitlySet("isEncrypted")) {
                this.isEncrypted(model.getIsEncrypted());
            }
            if (model.wasPropertyExplicitlySet("iops")) {
                this.iops(model.getIops());
            }
            if (model.wasPropertyExplicitlySet("isMultiAttachEnabled")) {
                this.isMultiAttachEnabled(model.getIsMultiAttachEnabled());
            }
            if (model.wasPropertyExplicitlySet("sizeInGiBs")) {
                this.sizeInGiBs(model.getSizeInGiBs());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
            }
            if (model.wasPropertyExplicitlySet("throughput")) {
                this.throughput(model.getThroughput());
            }
            if (model.wasPropertyExplicitlySet("volumeKey")) {
                this.volumeKey(model.getVolumeKey());
            }
            if (model.wasPropertyExplicitlySet("volumeType")) {
                this.volumeType(model.getVolumeType());
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

    /** Information about the volume attachments. */
    @com.fasterxml.jackson.annotation.JsonProperty("attachments")
    private final java.util.List<VolumeAttachment> attachments;

    /**
     * Information about the volume attachments.
     *
     * @return the value
     */
    public java.util.List<VolumeAttachment> getAttachments() {
        return attachments;
    }

    /** The Availability Zone for the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityZone")
    private final String availabilityZone;

    /**
     * The Availability Zone for the volume.
     *
     * @return the value
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /** Indicates whether the volume is encrypted. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
    private final Boolean isEncrypted;

    /**
     * Indicates whether the volume is encrypted.
     *
     * @return the value
     */
    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    /** The number of I/O operations per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("iops")
    private final Integer iops;

    /**
     * The number of I/O operations per second.
     *
     * @return the value
     */
    public Integer getIops() {
        return iops;
    }

    /** Indicates whether Amazon EBS Multi-Attach is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiAttachEnabled")
    private final Boolean isMultiAttachEnabled;

    /**
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     *
     * @return the value
     */
    public Boolean getIsMultiAttachEnabled() {
        return isMultiAttachEnabled;
    }

    /** The size of the volume, in GiBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGiBs")
    private final Integer sizeInGiBs;

    /**
     * The size of the volume, in GiBs.
     *
     * @return the value
     */
    public Integer getSizeInGiBs() {
        return sizeInGiBs;
    }

    /** The volume state. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The volume state.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** Any tags assigned to the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tag> tags;

    /**
     * Any tags assigned to the volume.
     *
     * @return the value
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /** The throughput that the volume supports, in MiB/s. */
    @com.fasterxml.jackson.annotation.JsonProperty("throughput")
    private final Integer throughput;

    /**
     * The throughput that the volume supports, in MiB/s.
     *
     * @return the value
     */
    public Integer getThroughput() {
        return throughput;
    }

    /** The ID of the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeKey")
    private final String volumeKey;

    /**
     * The ID of the volume.
     *
     * @return the value
     */
    public String getVolumeKey() {
        return volumeKey;
    }

    /** The volume type. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeType")
    private final String volumeType;

    /**
     * The volume type.
     *
     * @return the value
     */
    public String getVolumeType() {
        return volumeType;
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
        sb.append("AwsEbsProperties(");
        sb.append("super=").append(super.toString());
        sb.append("attachments=").append(String.valueOf(this.attachments));
        sb.append(", availabilityZone=").append(String.valueOf(this.availabilityZone));
        sb.append(", isEncrypted=").append(String.valueOf(this.isEncrypted));
        sb.append(", iops=").append(String.valueOf(this.iops));
        sb.append(", isMultiAttachEnabled=").append(String.valueOf(this.isMultiAttachEnabled));
        sb.append(", sizeInGiBs=").append(String.valueOf(this.sizeInGiBs));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", throughput=").append(String.valueOf(this.throughput));
        sb.append(", volumeKey=").append(String.valueOf(this.volumeKey));
        sb.append(", volumeType=").append(String.valueOf(this.volumeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwsEbsProperties)) {
            return false;
        }

        AwsEbsProperties other = (AwsEbsProperties) o;
        return java.util.Objects.equals(this.attachments, other.attachments)
                && java.util.Objects.equals(this.availabilityZone, other.availabilityZone)
                && java.util.Objects.equals(this.isEncrypted, other.isEncrypted)
                && java.util.Objects.equals(this.iops, other.iops)
                && java.util.Objects.equals(this.isMultiAttachEnabled, other.isMultiAttachEnabled)
                && java.util.Objects.equals(this.sizeInGiBs, other.sizeInGiBs)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.throughput, other.throughput)
                && java.util.Objects.equals(this.volumeKey, other.volumeKey)
                && java.util.Objects.equals(this.volumeType, other.volumeType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.attachments == null ? 43 : this.attachments.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityZone == null ? 43 : this.availabilityZone.hashCode());
        result = (result * PRIME) + (this.isEncrypted == null ? 43 : this.isEncrypted.hashCode());
        result = (result * PRIME) + (this.iops == null ? 43 : this.iops.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiAttachEnabled == null
                                ? 43
                                : this.isMultiAttachEnabled.hashCode());
        result = (result * PRIME) + (this.sizeInGiBs == null ? 43 : this.sizeInGiBs.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.throughput == null ? 43 : this.throughput.hashCode());
        result = (result * PRIME) + (this.volumeKey == null ? 43 : this.volumeKey.hashCode());
        result = (result * PRIME) + (this.volumeType == null ? 43 : this.volumeType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
