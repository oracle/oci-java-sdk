/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A file associated with a package
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SoftwarePackageFile.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SoftwarePackageFile {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checksum")
        private String checksum;

        public Builder checksum(String checksum) {
            this.checksum = checksum;
            this.__explicitlySet__.add("checksum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
        private String checksumType;

        public Builder checksumType(String checksumType) {
            this.checksumType = checksumType;
            this.__explicitlySet__.add("checksumType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwarePackageFile build() {
            SoftwarePackageFile __instance__ =
                    new SoftwarePackageFile(
                            path, type, timeModified, checksum, checksumType, sizeInBytes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwarePackageFile o) {
            Builder copiedBuilder =
                    path(o.getPath())
                            .type(o.getType())
                            .timeModified(o.getTimeModified())
                            .checksum(o.getChecksum())
                            .checksumType(o.getChecksumType())
                            .sizeInBytes(o.getSizeInBytes());

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
     * file path
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * type of the file
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    String type;

    /**
     * The date and time of the last modification to this file, as described
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    java.util.Date timeModified;

    /**
     * checksum of the file
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksum")
    String checksum;

    /**
     * type of the checksum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
    String checksumType;

    /**
     * size of the file in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    Long sizeInBytes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
