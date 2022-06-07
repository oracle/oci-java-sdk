/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImportManifest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImportManifest {
    @Deprecated
    @java.beans.ConstructorProperties({
        "version",
        "exportType",
        "exportDetails",
        "timestamp",
        "md5",
        "signature"
    })
    public ImportManifest(
            String version,
            String exportType,
            Object exportDetails,
            java.util.Date timestamp,
            String md5,
            String signature) {
        super();
        this.version = version;
        this.exportType = exportType;
        this.exportDetails = exportDetails;
        this.timestamp = timestamp;
        this.md5 = md5;
        this.signature = signature;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * the version of the export tool that was used to generate the manifest
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    public String getVersion() {
        return version;
    }

    /**
     * the type of application that the export tool was executed against to generate this manifest
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportType")
    private final String exportType;

    public String getExportType() {
        return exportType;
    }

    /**
     * application specific details as parsed from various sources of the application that was exported
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportDetails")
    private final Object exportDetails;

    public Object getExportDetails() {
        return exportDetails;
    }

    /**
     * when this manifest was generated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * the MD5 hash of the export artifact archive that was produced by the export tool and should be used with this manifest
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("md5")
    private final String md5;

    public String getMd5() {
        return md5;
    }

    /**
     * a sha1 hash of all the fields of this manifest (excluding the signature)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    private final String signature;

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ImportManifest(");
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", exportType=").append(String.valueOf(this.exportType));
        sb.append(", exportDetails=").append(String.valueOf(this.exportDetails));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", md5=").append(String.valueOf(this.md5));
        sb.append(", signature=").append(String.valueOf(this.signature));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportManifest)) {
            return false;
        }

        ImportManifest other = (ImportManifest) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.exportType, other.exportType)
                && java.util.Objects.equals(this.exportDetails, other.exportDetails)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.md5, other.md5)
                && java.util.Objects.equals(this.signature, other.signature)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.exportType == null ? 43 : this.exportType.hashCode());
        result =
                (result * PRIME)
                        + (this.exportDetails == null ? 43 : this.exportDetails.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.md5 == null ? 43 : this.md5.hashCode());
        result = (result * PRIME) + (this.signature == null ? 43 : this.signature.hashCode());
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
