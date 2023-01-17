/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Description of the VM target asset.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateVmTargetAssetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateVmTargetAssetDetails extends UpdateTargetAssetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isExcludedFromExecution")
        private Boolean isExcludedFromExecution;

        public Builder isExcludedFromExecution(Boolean isExcludedFromExecution) {
            this.isExcludedFromExecution = isExcludedFromExecution;
            this.__explicitlySet__.add("isExcludedFromExecution");
            return this;
        }
        /**
         * Preferred VM shape type that you provided.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preferredShapeType")
        private VmTargetAsset.PreferredShapeType preferredShapeType;

        /**
         * Preferred VM shape type that you provided.
         * @param preferredShapeType the value to set
         * @return this builder
         **/
        public Builder preferredShapeType(VmTargetAsset.PreferredShapeType preferredShapeType) {
            this.preferredShapeType = preferredShapeType;
            this.__explicitlySet__.add("preferredShapeType");
            return this;
        }
        /**
         * Performance of the block volumes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumesPerformance")
        private Integer blockVolumesPerformance;

        /**
         * Performance of the block volumes.
         * @param blockVolumesPerformance the value to set
         * @return this builder
         **/
        public Builder blockVolumesPerformance(Integer blockVolumesPerformance) {
            this.blockVolumesPerformance = blockVolumesPerformance;
            this.__explicitlySet__.add("blockVolumesPerformance");
            return this;
        }
        /**
         * Microsoft license for VM configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
        private String msLicense;

        /**
         * Microsoft license for VM configuration.
         * @param msLicense the value to set
         * @return this builder
         **/
        public Builder msLicense(String msLicense) {
            this.msLicense = msLicense;
            this.__explicitlySet__.add("msLicense");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userSpec")
        private LaunchInstanceDetails userSpec;

        public Builder userSpec(LaunchInstanceDetails userSpec) {
            this.userSpec = userSpec;
            this.__explicitlySet__.add("userSpec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVmTargetAssetDetails build() {
            UpdateVmTargetAssetDetails model =
                    new UpdateVmTargetAssetDetails(
                            this.isExcludedFromExecution,
                            this.preferredShapeType,
                            this.blockVolumesPerformance,
                            this.msLicense,
                            this.userSpec);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVmTargetAssetDetails model) {
            if (model.wasPropertyExplicitlySet("isExcludedFromExecution")) {
                this.isExcludedFromExecution(model.getIsExcludedFromExecution());
            }
            if (model.wasPropertyExplicitlySet("preferredShapeType")) {
                this.preferredShapeType(model.getPreferredShapeType());
            }
            if (model.wasPropertyExplicitlySet("blockVolumesPerformance")) {
                this.blockVolumesPerformance(model.getBlockVolumesPerformance());
            }
            if (model.wasPropertyExplicitlySet("msLicense")) {
                this.msLicense(model.getMsLicense());
            }
            if (model.wasPropertyExplicitlySet("userSpec")) {
                this.userSpec(model.getUserSpec());
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
    public UpdateVmTargetAssetDetails(
            Boolean isExcludedFromExecution,
            VmTargetAsset.PreferredShapeType preferredShapeType,
            Integer blockVolumesPerformance,
            String msLicense,
            LaunchInstanceDetails userSpec) {
        super(isExcludedFromExecution);
        this.preferredShapeType = preferredShapeType;
        this.blockVolumesPerformance = blockVolumesPerformance;
        this.msLicense = msLicense;
        this.userSpec = userSpec;
    }

    /**
     * Preferred VM shape type that you provided.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferredShapeType")
    private final VmTargetAsset.PreferredShapeType preferredShapeType;

    /**
     * Preferred VM shape type that you provided.
     * @return the value
     **/
    public VmTargetAsset.PreferredShapeType getPreferredShapeType() {
        return preferredShapeType;
    }

    /**
     * Performance of the block volumes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumesPerformance")
    private final Integer blockVolumesPerformance;

    /**
     * Performance of the block volumes.
     * @return the value
     **/
    public Integer getBlockVolumesPerformance() {
        return blockVolumesPerformance;
    }

    /**
     * Microsoft license for VM configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
    private final String msLicense;

    /**
     * Microsoft license for VM configuration.
     * @return the value
     **/
    public String getMsLicense() {
        return msLicense;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userSpec")
    private final LaunchInstanceDetails userSpec;

    public LaunchInstanceDetails getUserSpec() {
        return userSpec;
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
        sb.append("UpdateVmTargetAssetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", preferredShapeType=").append(String.valueOf(this.preferredShapeType));
        sb.append(", blockVolumesPerformance=")
                .append(String.valueOf(this.blockVolumesPerformance));
        sb.append(", msLicense=").append(String.valueOf(this.msLicense));
        sb.append(", userSpec=").append(String.valueOf(this.userSpec));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVmTargetAssetDetails)) {
            return false;
        }

        UpdateVmTargetAssetDetails other = (UpdateVmTargetAssetDetails) o;
        return java.util.Objects.equals(this.preferredShapeType, other.preferredShapeType)
                && java.util.Objects.equals(
                        this.blockVolumesPerformance, other.blockVolumesPerformance)
                && java.util.Objects.equals(this.msLicense, other.msLicense)
                && java.util.Objects.equals(this.userSpec, other.userSpec)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.preferredShapeType == null
                                ? 43
                                : this.preferredShapeType.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumesPerformance == null
                                ? 43
                                : this.blockVolumesPerformance.hashCode());
        result = (result * PRIME) + (this.msLicense == null ? 43 : this.msLicense.hashCode());
        result = (result * PRIME) + (this.userSpec == null ? 43 : this.userSpec.hashCode());
        return result;
    }
}
