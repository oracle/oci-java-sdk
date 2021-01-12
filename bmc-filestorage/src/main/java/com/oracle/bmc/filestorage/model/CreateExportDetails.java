/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for creating the export.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateExportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateExportDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
        private java.util.List<ClientOptions> exportOptions;

        public Builder exportOptions(java.util.List<ClientOptions> exportOptions) {
            this.exportOptions = exportOptions;
            this.__explicitlySet__.add("exportOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
        private String exportSetId;

        public Builder exportSetId(String exportSetId) {
            this.exportSetId = exportSetId;
            this.__explicitlySet__.add("exportSetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
        private String fileSystemId;

        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            this.__explicitlySet__.add("fileSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExportDetails build() {
            CreateExportDetails __instance__ =
                    new CreateExportDetails(exportOptions, exportSetId, fileSystemId, path);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExportDetails o) {
            Builder copiedBuilder =
                    exportOptions(o.getExportOptions())
                            .exportSetId(o.getExportSetId())
                            .fileSystemId(o.getFileSystemId())
                            .path(o.getPath());

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
     * Export options for the new export. If left unspecified,
     * defaults to:
     * <p>
     * [
     *          {
     *             \"source\" : \"0.0.0.0/0\",
     *             \"requirePrivilegedSourcePort\" : false,
     *             \"access\" : \"READ_WRITE\",
     *             \"identitySquash\" : \"NONE\"
     *           }
     *        ]
     * <p>
     **Note:** Mount targets do not have Internet-routable IP
     *   addresses.  Therefore they will not be reachable from the
     *   Internet, even if an associated `ClientOptions` item has
     *   a source of `0.0.0.0/0`.
     * <p>
     **If set to the empty array then the export will not be
     *   visible to any clients.**
     * <p>
     * The export's `exportOptions` can be changed after creation
     *   using the `UpdateExport` operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
    java.util.List<ClientOptions> exportOptions;

    /**
     * The OCID of this export's export set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
    String exportSetId;

    /**
     * The OCID of this export's file system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
    String fileSystemId;

    /**
     * Path used to access the associated file system.
     * <p>
     * Avoid entering confidential information.
     * <p>
     * Example: `/mediafiles`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
