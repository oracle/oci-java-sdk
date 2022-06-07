/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservice.model;

/**
 * Allows outputting the latest records paired with annotations and write them to object storage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SnapshotDatasetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SnapshotDatasetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "areAnnotationsIncluded",
        "areUnannotatedRecordsIncluded",
        "exportDetails",
        "exportFormat"
    })
    public SnapshotDatasetDetails(
            Boolean areAnnotationsIncluded,
            Boolean areUnannotatedRecordsIncluded,
            ObjectStorageSnapshotExportDetails exportDetails,
            ExportFormat exportFormat) {
        super();
        this.areAnnotationsIncluded = areAnnotationsIncluded;
        this.areUnannotatedRecordsIncluded = areUnannotatedRecordsIncluded;
        this.exportDetails = exportDetails;
        this.exportFormat = exportFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("areAnnotationsIncluded")
        private Boolean areAnnotationsIncluded;

        public Builder areAnnotationsIncluded(Boolean areAnnotationsIncluded) {
            this.areAnnotationsIncluded = areAnnotationsIncluded;
            this.__explicitlySet__.add("areAnnotationsIncluded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("areUnannotatedRecordsIncluded")
        private Boolean areUnannotatedRecordsIncluded;

        public Builder areUnannotatedRecordsIncluded(Boolean areUnannotatedRecordsIncluded) {
            this.areUnannotatedRecordsIncluded = areUnannotatedRecordsIncluded;
            this.__explicitlySet__.add("areUnannotatedRecordsIncluded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportDetails")
        private ObjectStorageSnapshotExportDetails exportDetails;

        public Builder exportDetails(ObjectStorageSnapshotExportDetails exportDetails) {
            this.exportDetails = exportDetails;
            this.__explicitlySet__.add("exportDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportFormat")
        private ExportFormat exportFormat;

        public Builder exportFormat(ExportFormat exportFormat) {
            this.exportFormat = exportFormat;
            this.__explicitlySet__.add("exportFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SnapshotDatasetDetails build() {
            SnapshotDatasetDetails __instance__ =
                    new SnapshotDatasetDetails(
                            areAnnotationsIncluded,
                            areUnannotatedRecordsIncluded,
                            exportDetails,
                            exportFormat);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SnapshotDatasetDetails o) {
            Builder copiedBuilder =
                    areAnnotationsIncluded(o.getAreAnnotationsIncluded())
                            .areUnannotatedRecordsIncluded(o.getAreUnannotatedRecordsIncluded())
                            .exportDetails(o.getExportDetails())
                            .exportFormat(o.getExportFormat());

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
     * Whether annotations are to be included in the export dataset digest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areAnnotationsIncluded")
    private final Boolean areAnnotationsIncluded;

    public Boolean getAreAnnotationsIncluded() {
        return areAnnotationsIncluded;
    }

    /**
     * Whether to include records that have yet to be annotated in the export dataset digest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areUnannotatedRecordsIncluded")
    private final Boolean areUnannotatedRecordsIncluded;

    public Boolean getAreUnannotatedRecordsIncluded() {
        return areUnannotatedRecordsIncluded;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exportDetails")
    private final ObjectStorageSnapshotExportDetails exportDetails;

    public ObjectStorageSnapshotExportDetails getExportDetails() {
        return exportDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exportFormat")
    private final ExportFormat exportFormat;

    public ExportFormat getExportFormat() {
        return exportFormat;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SnapshotDatasetDetails(");
        sb.append("areAnnotationsIncluded=").append(String.valueOf(this.areAnnotationsIncluded));
        sb.append(", areUnannotatedRecordsIncluded=")
                .append(String.valueOf(this.areUnannotatedRecordsIncluded));
        sb.append(", exportDetails=").append(String.valueOf(this.exportDetails));
        sb.append(", exportFormat=").append(String.valueOf(this.exportFormat));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SnapshotDatasetDetails)) {
            return false;
        }

        SnapshotDatasetDetails other = (SnapshotDatasetDetails) o;
        return java.util.Objects.equals(this.areAnnotationsIncluded, other.areAnnotationsIncluded)
                && java.util.Objects.equals(
                        this.areUnannotatedRecordsIncluded, other.areUnannotatedRecordsIncluded)
                && java.util.Objects.equals(this.exportDetails, other.exportDetails)
                && java.util.Objects.equals(this.exportFormat, other.exportFormat)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.areAnnotationsIncluded == null
                                ? 43
                                : this.areAnnotationsIncluded.hashCode());
        result =
                (result * PRIME)
                        + (this.areUnannotatedRecordsIncluded == null
                                ? 43
                                : this.areUnannotatedRecordsIncluded.hashCode());
        result =
                (result * PRIME)
                        + (this.exportDetails == null ? 43 : this.exportDetails.hashCode());
        result = (result * PRIME) + (this.exportFormat == null ? 43 : this.exportFormat.hashCode());
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
