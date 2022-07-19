/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Supported Agent downloads
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementAgentImageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementAgentImageSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "platformType",
        "platformName",
        "packageType",
        "packageArchitectureType",
        "version",
        "size",
        "checksum",
        "objectUrl",
        "lifecycleState"
    })
    public ManagementAgentImageSummary(
            String id,
            PlatformTypes platformType,
            String platformName,
            PackageTypes packageType,
            ArchitectureTypes packageArchitectureType,
            String version,
            java.math.BigDecimal size,
            String checksum,
            String objectUrl,
            LifecycleStates lifecycleState) {
        super();
        this.id = id;
        this.platformType = platformType;
        this.platformName = platformName;
        this.packageType = packageType;
        this.packageArchitectureType = packageArchitectureType;
        this.version = version;
        this.size = size;
        this.checksum = checksum;
        this.objectUrl = objectUrl;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Agent image resource id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Agent image resource id
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Agent image platform type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformTypes platformType;

        /**
         * Agent image platform type
         * @param platformType the value to set
         * @return this builder
         **/
        public Builder platformType(PlatformTypes platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }
        /**
         * Agent image platform display name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platformName")
        private String platformName;

        /**
         * Agent image platform display name
         * @param platformName the value to set
         * @return this builder
         **/
        public Builder platformName(String platformName) {
            this.platformName = platformName;
            this.__explicitlySet__.add("platformName");
            return this;
        }
        /**
         * The installation package type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageTypes packageType;

        /**
         * The installation package type
         * @param packageType the value to set
         * @return this builder
         **/
        public Builder packageType(PackageTypes packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /**
         * The installation package target architecture type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageArchitectureType")
        private ArchitectureTypes packageArchitectureType;

        /**
         * The installation package target architecture type
         * @param packageArchitectureType the value to set
         * @return this builder
         **/
        public Builder packageArchitectureType(ArchitectureTypes packageArchitectureType) {
            this.packageArchitectureType = packageArchitectureType;
            this.__explicitlySet__.add("packageArchitectureType");
            return this;
        }
        /**
         * Agent image version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Agent image version
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Agent image size in bytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private java.math.BigDecimal size;

        /**
         * Agent image size in bytes
         * @param size the value to set
         * @return this builder
         **/
        public Builder size(java.math.BigDecimal size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }
        /**
         * Agent image content SHA256 Hash
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("checksum")
        private String checksum;

        /**
         * Agent image content SHA256 Hash
         * @param checksum the value to set
         * @return this builder
         **/
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            this.__explicitlySet__.add("checksum");
            return this;
        }
        /**
         * Object storage URL for download
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectUrl")
        private String objectUrl;

        /**
         * Object storage URL for download
         * @param objectUrl the value to set
         * @return this builder
         **/
        public Builder objectUrl(String objectUrl) {
            this.objectUrl = objectUrl;
            this.__explicitlySet__.add("objectUrl");
            return this;
        }
        /**
         * The current state of Management Agent Image
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of Management Agent Image
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgentImageSummary build() {
            ManagementAgentImageSummary __instance__ =
                    new ManagementAgentImageSummary(
                            id,
                            platformType,
                            platformName,
                            packageType,
                            packageArchitectureType,
                            version,
                            size,
                            checksum,
                            objectUrl,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgentImageSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .platformType(o.getPlatformType())
                            .platformName(o.getPlatformName())
                            .packageType(o.getPackageType())
                            .packageArchitectureType(o.getPackageArchitectureType())
                            .version(o.getVersion())
                            .size(o.getSize())
                            .checksum(o.getChecksum())
                            .objectUrl(o.getObjectUrl())
                            .lifecycleState(o.getLifecycleState());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Agent image resource id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Agent image resource id
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Agent image platform type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformTypes platformType;

    /**
     * Agent image platform type
     * @return the value
     **/
    public PlatformTypes getPlatformType() {
        return platformType;
    }

    /**
     * Agent image platform display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformName")
    private final String platformName;

    /**
     * Agent image platform display name
     * @return the value
     **/
    public String getPlatformName() {
        return platformName;
    }

    /**
     * The installation package type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageTypes packageType;

    /**
     * The installation package type
     * @return the value
     **/
    public PackageTypes getPackageType() {
        return packageType;
    }

    /**
     * The installation package target architecture type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageArchitectureType")
    private final ArchitectureTypes packageArchitectureType;

    /**
     * The installation package target architecture type
     * @return the value
     **/
    public ArchitectureTypes getPackageArchitectureType() {
        return packageArchitectureType;
    }

    /**
     * Agent image version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Agent image version
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Agent image size in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final java.math.BigDecimal size;

    /**
     * Agent image size in bytes
     * @return the value
     **/
    public java.math.BigDecimal getSize() {
        return size;
    }

    /**
     * Agent image content SHA256 Hash
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksum")
    private final String checksum;

    /**
     * Agent image content SHA256 Hash
     * @return the value
     **/
    public String getChecksum() {
        return checksum;
    }

    /**
     * Object storage URL for download
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectUrl")
    private final String objectUrl;

    /**
     * Object storage URL for download
     * @return the value
     **/
    public String getObjectUrl() {
        return objectUrl;
    }

    /**
     * The current state of Management Agent Image
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of Management Agent Image
     * @return the value
     **/
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
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
        sb.append("ManagementAgentImageSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(", platformName=").append(String.valueOf(this.platformName));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", packageArchitectureType=")
                .append(String.valueOf(this.packageArchitectureType));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", checksum=").append(String.valueOf(this.checksum));
        sb.append(", objectUrl=").append(String.valueOf(this.objectUrl));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementAgentImageSummary)) {
            return false;
        }

        ManagementAgentImageSummary other = (ManagementAgentImageSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.platformName, other.platformName)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(
                        this.packageArchitectureType, other.packageArchitectureType)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(this.checksum, other.checksum)
                && java.util.Objects.equals(this.objectUrl, other.objectUrl)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result = (result * PRIME) + (this.platformName == null ? 43 : this.platformName.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result =
                (result * PRIME)
                        + (this.packageArchitectureType == null
                                ? 43
                                : this.packageArchitectureType.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.checksum == null ? 43 : this.checksum.hashCode());
        result = (result * PRIME) + (this.objectUrl == null ? 43 : this.objectUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
