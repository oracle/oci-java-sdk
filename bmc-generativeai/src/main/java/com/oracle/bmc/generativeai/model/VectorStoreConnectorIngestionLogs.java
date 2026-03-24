/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * A Log object that gives the ingestion status of a File from a datasource read by a
 * VectorStoreConnector <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VectorStoreConnectorIngestionLogs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VectorStoreConnectorIngestionLogs
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "fileId",
        "vectorStoreConnectorFileSyncId",
        "filePath",
        "fileSizeInBytes",
        "totalChunksCreated",
        "durationInSeconds",
        "status",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public VectorStoreConnectorIngestionLogs(
            String fileId,
            String vectorStoreConnectorFileSyncId,
            String filePath,
            Integer fileSizeInBytes,
            Integer totalChunksCreated,
            Integer durationInSeconds,
            Status status,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.fileId = fileId;
        this.vectorStoreConnectorFileSyncId = vectorStoreConnectorFileSyncId;
        this.filePath = filePath;
        this.fileSizeInBytes = fileSizeInBytes;
        this.totalChunksCreated = totalChunksCreated;
        this.durationInSeconds = durationInSeconds;
        this.status = status;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An identifier that identifies a File ingested to a VectorStore. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileId")
        private String fileId;

        /**
         * An identifier that identifies a File ingested to a VectorStore.
         *
         * @param fileId the value to set
         * @return this builder
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            this.__explicitlySet__.add("fileId");
            return this;
        }
        /**
         * An identifier that identifies the FileSync operation that added this file for ingestion.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vectorStoreConnectorFileSyncId")
        private String vectorStoreConnectorFileSyncId;

        /**
         * An identifier that identifies the FileSync operation that added this file for ingestion.
         *
         * @param vectorStoreConnectorFileSyncId the value to set
         * @return this builder
         */
        public Builder vectorStoreConnectorFileSyncId(String vectorStoreConnectorFileSyncId) {
            this.vectorStoreConnectorFileSyncId = vectorStoreConnectorFileSyncId;
            this.__explicitlySet__.add("vectorStoreConnectorFileSyncId");
            return this;
        }
        /** The path where the file was located in the datasource. */
        @com.fasterxml.jackson.annotation.JsonProperty("filePath")
        private String filePath;

        /**
         * The path where the file was located in the datasource.
         *
         * @param filePath the value to set
         * @return this builder
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            this.__explicitlySet__.add("filePath");
            return this;
        }
        /** The size of the file. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSizeInBytes")
        private Integer fileSizeInBytes;

        /**
         * The size of the file.
         *
         * @param fileSizeInBytes the value to set
         * @return this builder
         */
        public Builder fileSizeInBytes(Integer fileSizeInBytes) {
            this.fileSizeInBytes = fileSizeInBytes;
            this.__explicitlySet__.add("fileSizeInBytes");
            return this;
        }
        /** The total number of chunks created from the File. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalChunksCreated")
        private Integer totalChunksCreated;

        /**
         * The total number of chunks created from the File.
         *
         * @param totalChunksCreated the value to set
         * @return this builder
         */
        public Builder totalChunksCreated(Integer totalChunksCreated) {
            this.totalChunksCreated = totalChunksCreated;
            this.__explicitlySet__.add("totalChunksCreated");
            return this;
        }
        /** The duration taken(in seconds) to ingest the File. */
        @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
        private Integer durationInSeconds;

        /**
         * The duration taken(in seconds) to ingest the File.
         *
         * @param durationInSeconds the value to set
         * @return this builder
         */
        public Builder durationInSeconds(Integer durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            this.__explicitlySet__.add("durationInSeconds");
            return this;
        }
        /** The current status of ingestion for the File */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current status of ingestion for the File
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VectorStoreConnectorIngestionLogs build() {
            VectorStoreConnectorIngestionLogs model =
                    new VectorStoreConnectorIngestionLogs(
                            this.fileId,
                            this.vectorStoreConnectorFileSyncId,
                            this.filePath,
                            this.fileSizeInBytes,
                            this.totalChunksCreated,
                            this.durationInSeconds,
                            this.status,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VectorStoreConnectorIngestionLogs model) {
            if (model.wasPropertyExplicitlySet("fileId")) {
                this.fileId(model.getFileId());
            }
            if (model.wasPropertyExplicitlySet("vectorStoreConnectorFileSyncId")) {
                this.vectorStoreConnectorFileSyncId(model.getVectorStoreConnectorFileSyncId());
            }
            if (model.wasPropertyExplicitlySet("filePath")) {
                this.filePath(model.getFilePath());
            }
            if (model.wasPropertyExplicitlySet("fileSizeInBytes")) {
                this.fileSizeInBytes(model.getFileSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("totalChunksCreated")) {
                this.totalChunksCreated(model.getTotalChunksCreated());
            }
            if (model.wasPropertyExplicitlySet("durationInSeconds")) {
                this.durationInSeconds(model.getDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** An identifier that identifies a File ingested to a VectorStore. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileId")
    private final String fileId;

    /**
     * An identifier that identifies a File ingested to a VectorStore.
     *
     * @return the value
     */
    public String getFileId() {
        return fileId;
    }

    /** An identifier that identifies the FileSync operation that added this file for ingestion. */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorStoreConnectorFileSyncId")
    private final String vectorStoreConnectorFileSyncId;

    /**
     * An identifier that identifies the FileSync operation that added this file for ingestion.
     *
     * @return the value
     */
    public String getVectorStoreConnectorFileSyncId() {
        return vectorStoreConnectorFileSyncId;
    }

    /** The path where the file was located in the datasource. */
    @com.fasterxml.jackson.annotation.JsonProperty("filePath")
    private final String filePath;

    /**
     * The path where the file was located in the datasource.
     *
     * @return the value
     */
    public String getFilePath() {
        return filePath;
    }

    /** The size of the file. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSizeInBytes")
    private final Integer fileSizeInBytes;

    /**
     * The size of the file.
     *
     * @return the value
     */
    public Integer getFileSizeInBytes() {
        return fileSizeInBytes;
    }

    /** The total number of chunks created from the File. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalChunksCreated")
    private final Integer totalChunksCreated;

    /**
     * The total number of chunks created from the File.
     *
     * @return the value
     */
    public Integer getTotalChunksCreated() {
        return totalChunksCreated;
    }

    /** The duration taken(in seconds) to ingest the File. */
    @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
    private final Integer durationInSeconds;

    /**
     * The duration taken(in seconds) to ingest the File.
     *
     * @return the value
     */
    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    /** The current status of ingestion for the File */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Completed("COMPLETED"),
        Cancelled("CANCELLED"),
        Failed("FAILED"),
        Queued("QUEUED"),
        InProgress("IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current status of ingestion for the File */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status of ingestion for the File
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("VectorStoreConnectorIngestionLogs(");
        sb.append("super=").append(super.toString());
        sb.append("fileId=").append(String.valueOf(this.fileId));
        sb.append(", vectorStoreConnectorFileSyncId=")
                .append(String.valueOf(this.vectorStoreConnectorFileSyncId));
        sb.append(", filePath=").append(String.valueOf(this.filePath));
        sb.append(", fileSizeInBytes=").append(String.valueOf(this.fileSizeInBytes));
        sb.append(", totalChunksCreated=").append(String.valueOf(this.totalChunksCreated));
        sb.append(", durationInSeconds=").append(String.valueOf(this.durationInSeconds));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VectorStoreConnectorIngestionLogs)) {
            return false;
        }

        VectorStoreConnectorIngestionLogs other = (VectorStoreConnectorIngestionLogs) o;
        return java.util.Objects.equals(this.fileId, other.fileId)
                && java.util.Objects.equals(
                        this.vectorStoreConnectorFileSyncId, other.vectorStoreConnectorFileSyncId)
                && java.util.Objects.equals(this.filePath, other.filePath)
                && java.util.Objects.equals(this.fileSizeInBytes, other.fileSizeInBytes)
                && java.util.Objects.equals(this.totalChunksCreated, other.totalChunksCreated)
                && java.util.Objects.equals(this.durationInSeconds, other.durationInSeconds)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fileId == null ? 43 : this.fileId.hashCode());
        result =
                (result * PRIME)
                        + (this.vectorStoreConnectorFileSyncId == null
                                ? 43
                                : this.vectorStoreConnectorFileSyncId.hashCode());
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSizeInBytes == null ? 43 : this.fileSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.totalChunksCreated == null
                                ? 43
                                : this.totalChunksCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInSeconds == null ? 43 : this.durationInSeconds.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
