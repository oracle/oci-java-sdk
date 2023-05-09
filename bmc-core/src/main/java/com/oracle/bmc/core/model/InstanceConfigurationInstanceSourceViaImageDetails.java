/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 *
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
    builder = InstanceConfigurationInstanceSourceViaImageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceConfigurationInstanceSourceViaImageDetails
        extends InstanceConfigurationInstanceSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The size of the boot volume in GBs. The minimum value is 50 GB and the maximum
         * value is 32,768 GB (32 TB).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
        private Long bootVolumeSizeInGBs;

        /**
         * The size of the boot volume in GBs. The minimum value is 50 GB and the maximum
         * value is 32,768 GB (32 TB).
         *
         * @param bootVolumeSizeInGBs the value to set
         * @return this builder
         **/
        public Builder bootVolumeSizeInGBs(Long bootVolumeSizeInGBs) {
            this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
            this.__explicitlySet__.add("bootVolumeSizeInGBs");
            return this;
        }
        /**
         * The OCID of the image used to boot the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The OCID of the image used to boot the instance.
         * @param imageId the value to set
         * @return this builder
         **/
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /**
         * The OCID of the Vault service key to assign as the master encryption key for the boot volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Vault service key to assign as the master encryption key for the boot volume.
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The number of volume performance units (VPUs) that will be applied to this volume per GB,
         * representing the Block Volume service's elastic performance options.
         * See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
         * <p>
         * Allowed values:
         * <p>
         * {@code 10}: Represents Balanced option.
         * <p>
         * {@code 20}: Represents Higher Performance option.
         * <p>
         * {@code 30}-{@code 120}: Represents the Ultra High Performance option.
         * <p>
         * For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeVpusPerGB")
        private Long bootVolumeVpusPerGB;

        /**
         * The number of volume performance units (VPUs) that will be applied to this volume per GB,
         * representing the Block Volume service's elastic performance options.
         * See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
         * <p>
         * Allowed values:
         * <p>
         * {@code 10}: Represents Balanced option.
         * <p>
         * {@code 20}: Represents Higher Performance option.
         * <p>
         * {@code 30}-{@code 120}: Represents the Ultra High Performance option.
         * <p>
         * For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
         *
         * @param bootVolumeVpusPerGB the value to set
         * @return this builder
         **/
        public Builder bootVolumeVpusPerGB(Long bootVolumeVpusPerGB) {
            this.bootVolumeVpusPerGB = bootVolumeVpusPerGB;
            this.__explicitlySet__.add("bootVolumeVpusPerGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationInstanceSourceViaImageDetails build() {
            InstanceConfigurationInstanceSourceViaImageDetails model =
                    new InstanceConfigurationInstanceSourceViaImageDetails(
                            this.bootVolumeSizeInGBs,
                            this.imageId,
                            this.kmsKeyId,
                            this.bootVolumeVpusPerGB);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationInstanceSourceViaImageDetails model) {
            if (model.wasPropertyExplicitlySet("bootVolumeSizeInGBs")) {
                this.bootVolumeSizeInGBs(model.getBootVolumeSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("bootVolumeVpusPerGB")) {
                this.bootVolumeVpusPerGB(model.getBootVolumeVpusPerGB());
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
    public InstanceConfigurationInstanceSourceViaImageDetails(
            Long bootVolumeSizeInGBs, String imageId, String kmsKeyId, Long bootVolumeVpusPerGB) {
        super();
        this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
        this.imageId = imageId;
        this.kmsKeyId = kmsKeyId;
        this.bootVolumeVpusPerGB = bootVolumeVpusPerGB;
    }

    /**
     * The size of the boot volume in GBs. The minimum value is 50 GB and the maximum
     * value is 32,768 GB (32 TB).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
    private final Long bootVolumeSizeInGBs;

    /**
     * The size of the boot volume in GBs. The minimum value is 50 GB and the maximum
     * value is 32,768 GB (32 TB).
     *
     * @return the value
     **/
    public Long getBootVolumeSizeInGBs() {
        return bootVolumeSizeInGBs;
    }

    /**
     * The OCID of the image used to boot the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The OCID of the image used to boot the instance.
     * @return the value
     **/
    public String getImageId() {
        return imageId;
    }

    /**
     * The OCID of the Vault service key to assign as the master encryption key for the boot volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Vault service key to assign as the master encryption key for the boot volume.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The number of volume performance units (VPUs) that will be applied to this volume per GB,
     * representing the Block Volume service's elastic performance options.
     * See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
     * <p>
     * Allowed values:
     * <p>
     * {@code 10}: Represents Balanced option.
     * <p>
     * {@code 20}: Represents Higher Performance option.
     * <p>
     * {@code 30}-{@code 120}: Represents the Ultra High Performance option.
     * <p>
     * For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeVpusPerGB")
    private final Long bootVolumeVpusPerGB;

    /**
     * The number of volume performance units (VPUs) that will be applied to this volume per GB,
     * representing the Block Volume service's elastic performance options.
     * See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
     * <p>
     * Allowed values:
     * <p>
     * {@code 10}: Represents Balanced option.
     * <p>
     * {@code 20}: Represents Higher Performance option.
     * <p>
     * {@code 30}-{@code 120}: Represents the Ultra High Performance option.
     * <p>
     * For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
     *
     * @return the value
     **/
    public Long getBootVolumeVpusPerGB() {
        return bootVolumeVpusPerGB;
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
        sb.append("InstanceConfigurationInstanceSourceViaImageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", bootVolumeSizeInGBs=").append(String.valueOf(this.bootVolumeSizeInGBs));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", bootVolumeVpusPerGB=").append(String.valueOf(this.bootVolumeVpusPerGB));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfigurationInstanceSourceViaImageDetails)) {
            return false;
        }

        InstanceConfigurationInstanceSourceViaImageDetails other =
                (InstanceConfigurationInstanceSourceViaImageDetails) o;
        return java.util.Objects.equals(this.bootVolumeSizeInGBs, other.bootVolumeSizeInGBs)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.bootVolumeVpusPerGB, other.bootVolumeVpusPerGB)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bootVolumeSizeInGBs == null
                                ? 43
                                : this.bootVolumeSizeInGBs.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.bootVolumeVpusPerGB == null
                                ? 43
                                : this.bootVolumeVpusPerGB.hashCode());
        return result;
    }
}
