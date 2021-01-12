/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * The details for a software package
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SoftwarePackage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SoftwarePackage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedDate")
        private String lastModifiedDate;

        public Builder lastModifiedDate(String lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            this.__explicitlySet__.add("lastModifiedDate");
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
        private java.util.List<SoftwarePackageDependency> dependencies;

        public Builder dependencies(java.util.List<SoftwarePackageDependency> dependencies) {
            this.dependencies = dependencies;
            this.__explicitlySet__.add("dependencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("files")
        private java.util.List<SoftwarePackageFile> files;

        public Builder files(java.util.List<SoftwarePackageFile> files) {
            this.files = files;
            this.__explicitlySet__.add("files");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceId> softwareSources;

        public Builder softwareSources(java.util.List<SoftwareSourceId> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwarePackage build() {
            SoftwarePackage __instance__ =
                    new SoftwarePackage(
                            displayName,
                            name,
                            type,
                            version,
                            architecture,
                            lastModifiedDate,
                            checksum,
                            checksumType,
                            description,
                            sizeInBytes,
                            dependencies,
                            files,
                            softwareSources);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwarePackage o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .name(o.getName())
                            .type(o.getType())
                            .version(o.getVersion())
                            .architecture(o.getArchitecture())
                            .lastModifiedDate(o.getLastModifiedDate())
                            .checksum(o.getChecksum())
                            .checksumType(o.getChecksumType())
                            .description(o.getDescription())
                            .sizeInBytes(o.getSizeInBytes())
                            .dependencies(o.getDependencies())
                            .files(o.getFiles())
                            .softwareSources(o.getSoftwareSources());

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
     * Package name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Unique identifier for the package. NOTE - This is not an OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Type of the package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    String type;

    /**
     * Version of the package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * the architecture for which this software was built
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    String architecture;

    /**
     * date of the last update to the package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedDate")
    String lastModifiedDate;

    /**
     * checksum of the package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksum")
    String checksum;

    /**
     * type of the checksum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
    String checksumType;

    /**
     * description of the package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * size of the package in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    Long sizeInBytes;

    /**
     * list of dependencies for the software package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    java.util.List<SoftwarePackageDependency> dependencies;

    /**
     * list of files for the software package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("files")
    java.util.List<SoftwarePackageFile> files;

    /**
     * list of software sources that provide the software package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    java.util.List<SoftwareSourceId> softwareSources;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
