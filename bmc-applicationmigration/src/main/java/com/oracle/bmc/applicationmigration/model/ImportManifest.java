/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Manifest describing details about an import source
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImportManifest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ImportManifest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportType")
        private String exportType;

        public Builder exportType(String exportType) {
            this.exportType = exportType;
            this.__explicitlySet__.add("exportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportDetails")
        private Object exportDetails;

        public Builder exportDetails(Object exportDetails) {
            this.exportDetails = exportDetails;
            this.__explicitlySet__.add("exportDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("md5")
        private String md5;

        public Builder md5(String md5) {
            this.md5 = md5;
            this.__explicitlySet__.add("md5");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signature")
        private String signature;

        public Builder signature(String signature) {
            this.signature = signature;
            this.__explicitlySet__.add("signature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportManifest build() {
            ImportManifest __instance__ =
                    new ImportManifest(
                            version, exportType, exportDetails, timestamp, md5, signature);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportManifest o) {
            Builder copiedBuilder =
                    version(o.getVersion())
                            .exportType(o.getExportType())
                            .exportDetails(o.getExportDetails())
                            .timestamp(o.getTimestamp())
                            .md5(o.getMd5())
                            .signature(o.getSignature());

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
     * the version of the export tool that was used to generate the manifest
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * the type of application that the export tool was executed against to generate this manifest
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportType")
    String exportType;

    /**
     * application specific details as parsed from various sources of the application that was exported
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportDetails")
    Object exportDetails;

    /**
     * when this manifest was generated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

    /**
     * the MD5 hash of the export artifact archive that was produced by the export tool and should be used with this manifest
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("md5")
    String md5;

    /**
     * a sha1 hash of all the fields of this manifest (excluding the signature)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    String signature;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
