/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SnapshotDatasetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SnapshotDatasetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SnapshotDatasetDetails build() {
            SnapshotDatasetDetails __instance__ =
                    new SnapshotDatasetDetails(
                            areAnnotationsIncluded, areUnannotatedRecordsIncluded, exportDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SnapshotDatasetDetails o) {
            Builder copiedBuilder =
                    areAnnotationsIncluded(o.getAreAnnotationsIncluded())
                            .areUnannotatedRecordsIncluded(o.getAreUnannotatedRecordsIncluded())
                            .exportDetails(o.getExportDetails());

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
     * Whether annotations are to be included in the export dataset digest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areAnnotationsIncluded")
    Boolean areAnnotationsIncluded;

    /**
     * Whether to include records that have yet to be annotated in the export dataset digest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areUnannotatedRecordsIncluded")
    Boolean areUnannotatedRecordsIncluded;

    @com.fasterxml.jackson.annotation.JsonProperty("exportDetails")
    ObjectStorageSnapshotExportDetails exportDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
