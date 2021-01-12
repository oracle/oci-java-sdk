/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * A file system and the path that you can use to mount it. Each export
 * resource belongs to exactly one export set.
 * <p>
 * The export's path attribute is not a path in the
 * referenced file system, but the value used by clients for the path
 * component of the remotetarget argument when mounting the file
 * system.
 * <p>
 * The path must start with a slash (/) followed by a sequence of zero or more
 * slash-separated path elements. For any two export resources associated with
 * the same export set, except those in a 'DELETED' state, the path element
 * sequence for the first export resource can't contain the
 * complete path element sequence of the second export resource.
 * <p>
 *
 * For example, the following are acceptable:
 * <p>
 * /example and /path
 *   * /example1 and /example2
 *   * /example and /example1
 * <p>
 * The following examples are not acceptable:
 *   * /example and /example/path
 *   * / and /example
 * <p>
 * Paths may not end in a slash (/). No path element can be a period (.)
 * or two periods in sequence (..). All path elements must be 255 bytes or less.
 * <p>
 * No two non-'DELETED' export resources in the same export set can
 * reference the same file system.
 * <p>
 * Use `exportOptions` to control access to an export. For more information, see
 * [Export Options](https://docs.cloud.oracle.com/Content/File/Tasks/exportoptions.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Export.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Export {
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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Export build() {
            Export __instance__ =
                    new Export(
                            exportOptions,
                            exportSetId,
                            fileSystemId,
                            id,
                            lifecycleState,
                            path,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Export o) {
            Builder copiedBuilder =
                    exportOptions(o.getExportOptions())
                            .exportSetId(o.getExportSetId())
                            .fileSystemId(o.getFileSystemId())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .path(o.getPath())
                            .timeCreated(o.getTimeCreated());

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
     * Policies that apply to NFS requests made through this
     * export. `exportOptions` contains a sequential list of
     * `ClientOptions`. Each `ClientOptions` item defines the
     * export options that are applied to a specified
     * set of clients.
     * <p>
     * For each NFS request, the first `ClientOptions` option
     * in the list whose `source` attribute matches the source
     * IP address of the request is applied.
     * <p>
     * If a client source IP address does not match the `source`
     * property of any `ClientOptions` in the list, then the
     * export will be invisible to that client. This export will
     * not be returned by `MOUNTPROC_EXPORT` calls made by the client
     * and any attempt to mount or access the file system through
     * this export will result in an error.
     * <p>
     **Exports without defined `ClientOptions` are invisible to all clients.**
     * <p>
     * If one export is invisible to a particular client, associated file
     * systems may still be accessible through other exports on the same
     * or different mount targets.
     * To completely deny client access to a file system, be sure that the client
     * source IP address is not included in any export for any mount target
     * associated with the file system.
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
     * The OCID of this export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The current state of this export.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of this export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Path used to access the associated file system.
     * <p>
     * Avoid entering confidential information.
     * <p>
     * Example: `/accounting`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * The date and time the export was created, expressed
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
