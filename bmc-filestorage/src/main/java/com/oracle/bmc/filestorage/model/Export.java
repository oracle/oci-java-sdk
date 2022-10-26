/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * A file system and the path that you can use to mount it. Each export resource belongs to exactly
 * one export set.
 *
 * <p>The export's path attribute is not a path in the referenced file system, but the value used by
 * clients for the path component of the remotetarget argument when mounting the file system.
 *
 * <p>The path must start with a slash (/) followed by a sequence of zero or more slash-separated
 * path elements. For any two export resources associated with the same export set, except those in
 * a 'DELETED' state, the path element sequence for the first export resource can't contain the
 * complete path element sequence of the second export resource.
 *
 * <p>For example, the following are acceptable:
 *
 * <p>/example and /path * /example1 and /example2 * /example and /example1
 *
 * <p>The following examples are not acceptable: * /example and /example/path * / and /example
 *
 * <p>Paths may not end in a slash (/). No path element can be a period (.) or two periods in
 * sequence (..). All path elements must be 255 bytes or less.
 *
 * <p>No two non-'DELETED' export resources in the same export set can reference the same file
 * system.
 *
 * <p>Use {@code exportOptions} to control access to an export. For more information, see [Export
 * Options](https://docs.cloud.oracle.com/Content/File/Tasks/exportoptions.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Export.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Export extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exportOptions",
        "exportSetId",
        "fileSystemId",
        "id",
        "lifecycleState",
        "path",
        "timeCreated"
    })
    public Export(
            java.util.List<ClientOptions> exportOptions,
            String exportSetId,
            String fileSystemId,
            String id,
            LifecycleState lifecycleState,
            String path,
            java.util.Date timeCreated) {
        super();
        this.exportOptions = exportOptions;
        this.exportSetId = exportSetId;
        this.fileSystemId = fileSystemId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.path = path;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Policies that apply to NFS requests made through this export. {@code exportOptions}
         * contains a sequential list of {@code ClientOptions}. Each {@code ClientOptions} item
         * defines the export options that are applied to a specified set of clients.
         *
         * <p>For each NFS request, the first {@code ClientOptions} option in the list whose {@code
         * source} attribute matches the source IP address of the request is applied.
         *
         * <p>If a client source IP address does not match the {@code source} property of any {@code
         * ClientOptions} in the list, then the export will be invisible to that client. This export
         * will not be returned by {@code MOUNTPROC_EXPORT} calls made by the client and any attempt
         * to mount or access the file system through this export will result in an error.
         *
         * <p>*Exports without defined {@code ClientOptions} are invisible to all clients.**
         *
         * <p>If one export is invisible to a particular client, associated file systems may still
         * be accessible through other exports on the same or different mount targets. To completely
         * deny client access to a file system, be sure that the client source IP address is not
         * included in any export for any mount target associated with the file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
        private java.util.List<ClientOptions> exportOptions;

        /**
         * Policies that apply to NFS requests made through this export. {@code exportOptions}
         * contains a sequential list of {@code ClientOptions}. Each {@code ClientOptions} item
         * defines the export options that are applied to a specified set of clients.
         *
         * <p>For each NFS request, the first {@code ClientOptions} option in the list whose {@code
         * source} attribute matches the source IP address of the request is applied.
         *
         * <p>If a client source IP address does not match the {@code source} property of any {@code
         * ClientOptions} in the list, then the export will be invisible to that client. This export
         * will not be returned by {@code MOUNTPROC_EXPORT} calls made by the client and any attempt
         * to mount or access the file system through this export will result in an error.
         *
         * <p>*Exports without defined {@code ClientOptions} are invisible to all clients.**
         *
         * <p>If one export is invisible to a particular client, associated file systems may still
         * be accessible through other exports on the same or different mount targets. To completely
         * deny client access to a file system, be sure that the client source IP address is not
         * included in any export for any mount target associated with the file system.
         *
         * @param exportOptions the value to set
         * @return this builder
         */
        public Builder exportOptions(java.util.List<ClientOptions> exportOptions) {
            this.exportOptions = exportOptions;
            this.__explicitlySet__.add("exportOptions");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's export set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
        private String exportSetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's export set.
         *
         * @param exportSetId the value to set
         * @return this builder
         */
        public Builder exportSetId(String exportSetId) {
            this.exportSetId = exportSetId;
            this.__explicitlySet__.add("exportSetId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
        private String fileSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's file system.
         *
         * @param fileSystemId the value to set
         * @return this builder
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            this.__explicitlySet__.add("fileSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The current state of this export. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of this export.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Path used to access the associated file system.
         *
         * <p>Avoid entering confidential information.
         *
         * <p>Example: {@code /accounting}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Path used to access the associated file system.
         *
         * <p>Avoid entering confidential information.
         *
         * <p>Example: {@code /accounting}
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * The date and time the export was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the export was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Export build() {
            Export model =
                    new Export(
                            this.exportOptions,
                            this.exportSetId,
                            this.fileSystemId,
                            this.id,
                            this.lifecycleState,
                            this.path,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Export model) {
            if (model.wasPropertyExplicitlySet("exportOptions")) {
                this.exportOptions(model.getExportOptions());
            }
            if (model.wasPropertyExplicitlySet("exportSetId")) {
                this.exportSetId(model.getExportSetId());
            }
            if (model.wasPropertyExplicitlySet("fileSystemId")) {
                this.fileSystemId(model.getFileSystemId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Policies that apply to NFS requests made through this export. {@code exportOptions} contains
     * a sequential list of {@code ClientOptions}. Each {@code ClientOptions} item defines the
     * export options that are applied to a specified set of clients.
     *
     * <p>For each NFS request, the first {@code ClientOptions} option in the list whose {@code
     * source} attribute matches the source IP address of the request is applied.
     *
     * <p>If a client source IP address does not match the {@code source} property of any {@code
     * ClientOptions} in the list, then the export will be invisible to that client. This export
     * will not be returned by {@code MOUNTPROC_EXPORT} calls made by the client and any attempt to
     * mount or access the file system through this export will result in an error.
     *
     * <p>*Exports without defined {@code ClientOptions} are invisible to all clients.**
     *
     * <p>If one export is invisible to a particular client, associated file systems may still be
     * accessible through other exports on the same or different mount targets. To completely deny
     * client access to a file system, be sure that the client source IP address is not included in
     * any export for any mount target associated with the file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
    private final java.util.List<ClientOptions> exportOptions;

    /**
     * Policies that apply to NFS requests made through this export. {@code exportOptions} contains
     * a sequential list of {@code ClientOptions}. Each {@code ClientOptions} item defines the
     * export options that are applied to a specified set of clients.
     *
     * <p>For each NFS request, the first {@code ClientOptions} option in the list whose {@code
     * source} attribute matches the source IP address of the request is applied.
     *
     * <p>If a client source IP address does not match the {@code source} property of any {@code
     * ClientOptions} in the list, then the export will be invisible to that client. This export
     * will not be returned by {@code MOUNTPROC_EXPORT} calls made by the client and any attempt to
     * mount or access the file system through this export will result in an error.
     *
     * <p>*Exports without defined {@code ClientOptions} are invisible to all clients.**
     *
     * <p>If one export is invisible to a particular client, associated file systems may still be
     * accessible through other exports on the same or different mount targets. To completely deny
     * client access to a file system, be sure that the client source IP address is not included in
     * any export for any mount target associated with the file system.
     *
     * @return the value
     */
    public java.util.List<ClientOptions> getExportOptions() {
        return exportOptions;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's export set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
    private final String exportSetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's export set.
     *
     * @return the value
     */
    public String getExportSetId() {
        return exportSetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
    private final String fileSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's file system.
     *
     * @return the value
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current state of this export. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
    /** The current state of this export. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of this export.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Path used to access the associated file system.
     *
     * <p>Avoid entering confidential information.
     *
     * <p>Example: {@code /accounting}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Path used to access the associated file system.
     *
     * <p>Avoid entering confidential information.
     *
     * <p>Example: {@code /accounting}
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * The date and time the export was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the export was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Export(");
        sb.append("super=").append(super.toString());
        sb.append("exportOptions=").append(String.valueOf(this.exportOptions));
        sb.append(", exportSetId=").append(String.valueOf(this.exportSetId));
        sb.append(", fileSystemId=").append(String.valueOf(this.fileSystemId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Export)) {
            return false;
        }

        Export other = (Export) o;
        return java.util.Objects.equals(this.exportOptions, other.exportOptions)
                && java.util.Objects.equals(this.exportSetId, other.exportSetId)
                && java.util.Objects.equals(this.fileSystemId, other.fileSystemId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exportOptions == null ? 43 : this.exportOptions.hashCode());
        result = (result * PRIME) + (this.exportSetId == null ? 43 : this.exportSetId.hashCode());
        result = (result * PRIME) + (this.fileSystemId == null ? 43 : this.fileSystemId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
