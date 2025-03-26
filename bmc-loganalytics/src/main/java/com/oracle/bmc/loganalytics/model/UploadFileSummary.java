/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details of Upload File.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UploadFileSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UploadFileSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "reference",
        "name",
        "status",
        "totalChunks",
        "chunksConsumed",
        "chunksSuccess",
        "chunksFail",
        "timeStarted",
        "sourceName",
        "entityType",
        "entityName",
        "logNamespace",
        "logGroupId",
        "logGroupName",
        "failureDetails"
    })
    public UploadFileSummary(
            String reference,
            String name,
            Status status,
            java.math.BigDecimal totalChunks,
            java.math.BigDecimal chunksConsumed,
            java.math.BigDecimal chunksSuccess,
            java.math.BigDecimal chunksFail,
            java.util.Date timeStarted,
            String sourceName,
            String entityType,
            String entityName,
            String logNamespace,
            String logGroupId,
            String logGroupName,
            String failureDetails) {
        super();
        this.reference = reference;
        this.name = name;
        this.status = status;
        this.totalChunks = totalChunks;
        this.chunksConsumed = chunksConsumed;
        this.chunksSuccess = chunksSuccess;
        this.chunksFail = chunksFail;
        this.timeStarted = timeStarted;
        this.sourceName = sourceName;
        this.entityType = entityType;
        this.entityName = entityName;
        this.logNamespace = logNamespace;
        this.logGroupId = logGroupId;
        this.logGroupName = logGroupName;
        this.failureDetails = failureDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique internal identifier to refer upload file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reference")
        private String reference;

        /**
         * Unique internal identifier to refer upload file.
         * @param reference the value to set
         * @return this builder
         **/
        public Builder reference(String reference) {
            this.reference = reference;
            this.__explicitlySet__.add("reference");
            return this;
        }
        /**
         * Name of the file
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the file
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Processing status of the file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Processing status of the file.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Number of estimated chunks for this file. A chunk is a portion of the log file used for the processing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalChunks")
        private java.math.BigDecimal totalChunks;

        /**
         * Number of estimated chunks for this file. A chunk is a portion of the log file used for the processing.
         * @param totalChunks the value to set
         * @return this builder
         **/
        public Builder totalChunks(java.math.BigDecimal totalChunks) {
            this.totalChunks = totalChunks;
            this.__explicitlySet__.add("totalChunks");
            return this;
        }
        /**
         * Number of chunks processed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chunksConsumed")
        private java.math.BigDecimal chunksConsumed;

        /**
         * Number of chunks processed.
         * @param chunksConsumed the value to set
         * @return this builder
         **/
        public Builder chunksConsumed(java.math.BigDecimal chunksConsumed) {
            this.chunksConsumed = chunksConsumed;
            this.__explicitlySet__.add("chunksConsumed");
            return this;
        }
        /**
         * Number of chunks processed successfully.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chunksSuccess")
        private java.math.BigDecimal chunksSuccess;

        /**
         * Number of chunks processed successfully.
         * @param chunksSuccess the value to set
         * @return this builder
         **/
        public Builder chunksSuccess(java.math.BigDecimal chunksSuccess) {
            this.chunksSuccess = chunksSuccess;
            this.__explicitlySet__.add("chunksSuccess");
            return this;
        }
        /**
         * Number of chunks failed processing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chunksFail")
        private java.math.BigDecimal chunksFail;

        /**
         * Number of chunks failed processing.
         * @param chunksFail the value to set
         * @return this builder
         **/
        public Builder chunksFail(java.math.BigDecimal chunksFail) {
            this.chunksFail = chunksFail;
            this.__explicitlySet__.add("chunksFail");
            return this;
        }
        /**
         * The time when this file processing started.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time when this file processing started.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Name of the log source used for processing this file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * Name of the log source used for processing this file.
         * @param sourceName the value to set
         * @return this builder
         **/
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /**
         * Name of the entity type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * Name of the entity type.
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * Name of the entity associated with the file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * Name of the entity associated with the file.
         * @param entityName the value to set
         * @return this builder
         **/
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /**
         * (Deprecated) Name of the log namespace associated with the file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logNamespace")
        private String logNamespace;

        /**
         * (Deprecated) Name of the log namespace associated with the file.
         * @param logNamespace the value to set
         * @return this builder
         **/
        public Builder logNamespace(String logNamespace) {
            this.logNamespace = logNamespace;
            this.__explicitlySet__.add("logNamespace");
            return this;
        }
        /**
         * Log group OCID associated with the file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * Log group OCID associated with the file.
         * @param logGroupId the value to set
         * @return this builder
         **/
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }
        /**
         * Name of the log group associated with the file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupName")
        private String logGroupName;

        /**
         * Name of the log group associated with the file.
         * @param logGroupName the value to set
         * @return this builder
         **/
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = logGroupName;
            this.__explicitlySet__.add("logGroupName");
            return this;
        }
        /**
         * The details about upload processing failure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
        private String failureDetails;

        /**
         * The details about upload processing failure.
         * @param failureDetails the value to set
         * @return this builder
         **/
        public Builder failureDetails(String failureDetails) {
            this.failureDetails = failureDetails;
            this.__explicitlySet__.add("failureDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadFileSummary build() {
            UploadFileSummary model =
                    new UploadFileSummary(
                            this.reference,
                            this.name,
                            this.status,
                            this.totalChunks,
                            this.chunksConsumed,
                            this.chunksSuccess,
                            this.chunksFail,
                            this.timeStarted,
                            this.sourceName,
                            this.entityType,
                            this.entityName,
                            this.logNamespace,
                            this.logGroupId,
                            this.logGroupName,
                            this.failureDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadFileSummary model) {
            if (model.wasPropertyExplicitlySet("reference")) {
                this.reference(model.getReference());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("totalChunks")) {
                this.totalChunks(model.getTotalChunks());
            }
            if (model.wasPropertyExplicitlySet("chunksConsumed")) {
                this.chunksConsumed(model.getChunksConsumed());
            }
            if (model.wasPropertyExplicitlySet("chunksSuccess")) {
                this.chunksSuccess(model.getChunksSuccess());
            }
            if (model.wasPropertyExplicitlySet("chunksFail")) {
                this.chunksFail(model.getChunksFail());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
            }
            if (model.wasPropertyExplicitlySet("logNamespace")) {
                this.logNamespace(model.getLogNamespace());
            }
            if (model.wasPropertyExplicitlySet("logGroupId")) {
                this.logGroupId(model.getLogGroupId());
            }
            if (model.wasPropertyExplicitlySet("logGroupName")) {
                this.logGroupName(model.getLogGroupName());
            }
            if (model.wasPropertyExplicitlySet("failureDetails")) {
                this.failureDetails(model.getFailureDetails());
            }
            return this;
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
     * Unique internal identifier to refer upload file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    private final String reference;

    /**
     * Unique internal identifier to refer upload file.
     * @return the value
     **/
    public String getReference() {
        return reference;
    }

    /**
     * Name of the file
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the file
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Processing status of the file.
     **/
    public enum Status {
        InProgress("IN_PROGRESS"),
        Successful("SUCCESSFUL"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * Processing status of the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Processing status of the file.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Number of estimated chunks for this file. A chunk is a portion of the log file used for the processing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalChunks")
    private final java.math.BigDecimal totalChunks;

    /**
     * Number of estimated chunks for this file. A chunk is a portion of the log file used for the processing.
     * @return the value
     **/
    public java.math.BigDecimal getTotalChunks() {
        return totalChunks;
    }

    /**
     * Number of chunks processed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunksConsumed")
    private final java.math.BigDecimal chunksConsumed;

    /**
     * Number of chunks processed.
     * @return the value
     **/
    public java.math.BigDecimal getChunksConsumed() {
        return chunksConsumed;
    }

    /**
     * Number of chunks processed successfully.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunksSuccess")
    private final java.math.BigDecimal chunksSuccess;

    /**
     * Number of chunks processed successfully.
     * @return the value
     **/
    public java.math.BigDecimal getChunksSuccess() {
        return chunksSuccess;
    }

    /**
     * Number of chunks failed processing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunksFail")
    private final java.math.BigDecimal chunksFail;

    /**
     * Number of chunks failed processing.
     * @return the value
     **/
    public java.math.BigDecimal getChunksFail() {
        return chunksFail;
    }

    /**
     * The time when this file processing started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time when this file processing started.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Name of the log source used for processing this file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * Name of the log source used for processing this file.
     * @return the value
     **/
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Name of the entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * Name of the entity type.
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
    }

    /**
     * Name of the entity associated with the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * Name of the entity associated with the file.
     * @return the value
     **/
    public String getEntityName() {
        return entityName;
    }

    /**
     * (Deprecated) Name of the log namespace associated with the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logNamespace")
    private final String logNamespace;

    /**
     * (Deprecated) Name of the log namespace associated with the file.
     * @return the value
     **/
    public String getLogNamespace() {
        return logNamespace;
    }

    /**
     * Log group OCID associated with the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * Log group OCID associated with the file.
     * @return the value
     **/
    public String getLogGroupId() {
        return logGroupId;
    }

    /**
     * Name of the log group associated with the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupName")
    private final String logGroupName;

    /**
     * Name of the log group associated with the file.
     * @return the value
     **/
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * The details about upload processing failure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
    private final String failureDetails;

    /**
     * The details about upload processing failure.
     * @return the value
     **/
    public String getFailureDetails() {
        return failureDetails;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UploadFileSummary(");
        sb.append("super=").append(super.toString());
        sb.append("reference=").append(String.valueOf(this.reference));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", totalChunks=").append(String.valueOf(this.totalChunks));
        sb.append(", chunksConsumed=").append(String.valueOf(this.chunksConsumed));
        sb.append(", chunksSuccess=").append(String.valueOf(this.chunksSuccess));
        sb.append(", chunksFail=").append(String.valueOf(this.chunksFail));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", logNamespace=").append(String.valueOf(this.logNamespace));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", logGroupName=").append(String.valueOf(this.logGroupName));
        sb.append(", failureDetails=").append(String.valueOf(this.failureDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadFileSummary)) {
            return false;
        }

        UploadFileSummary other = (UploadFileSummary) o;
        return java.util.Objects.equals(this.reference, other.reference)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.totalChunks, other.totalChunks)
                && java.util.Objects.equals(this.chunksConsumed, other.chunksConsumed)
                && java.util.Objects.equals(this.chunksSuccess, other.chunksSuccess)
                && java.util.Objects.equals(this.chunksFail, other.chunksFail)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.logNamespace, other.logNamespace)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.logGroupName, other.logGroupName)
                && java.util.Objects.equals(this.failureDetails, other.failureDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reference == null ? 43 : this.reference.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.totalChunks == null ? 43 : this.totalChunks.hashCode());
        result =
                (result * PRIME)
                        + (this.chunksConsumed == null ? 43 : this.chunksConsumed.hashCode());
        result =
                (result * PRIME)
                        + (this.chunksSuccess == null ? 43 : this.chunksSuccess.hashCode());
        result = (result * PRIME) + (this.chunksFail == null ? 43 : this.chunksFail.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result = (result * PRIME) + (this.logNamespace == null ? 43 : this.logNamespace.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.logGroupName == null ? 43 : this.logGroupName.hashCode());
        result =
                (result * PRIME)
                        + (this.failureDetails == null ? 43 : this.failureDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
