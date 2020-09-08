/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementAgentImageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ManagementAgentImageSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformTypes platformType;

        public Builder platformType(PlatformTypes platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformName")
        private String platformName;

        public Builder platformName(String platformName) {
            this.platformName = platformName;
            this.__explicitlySet__.add("platformName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private java.math.BigDecimal size;

        public Builder size(java.math.BigDecimal size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checksum")
        private String checksum;

        public Builder checksum(String checksum) {
            this.checksum = checksum;
            this.__explicitlySet__.add("checksum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectUrl")
        private String objectUrl;

        public Builder objectUrl(String objectUrl) {
            this.objectUrl = objectUrl;
            this.__explicitlySet__.add("objectUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

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

    /**
     * Agent image resource id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Agent image platform type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    PlatformTypes platformType;

    /**
     * Agent image platform display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformName")
    String platformName;

    /**
     * Agent image version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * Agent image size in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    java.math.BigDecimal size;

    /**
     * Agent image content SHA256 Hash
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksum")
    String checksum;

    /**
     * Object storage URL for download
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectUrl")
    String objectUrl;

    /**
     * The current state of Management Agent Image
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
