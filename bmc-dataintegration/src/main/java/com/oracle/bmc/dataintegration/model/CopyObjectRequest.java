/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Copy metadata object request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CopyObjectRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CopyObjectRequest extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "sourceWorkspaceId",
        "objectKeys",
        "copyConflictResolution",
        "copyMetadataObjectRequestStatus",
        "createdBy",
        "createdByName",
        "totalSourceObjectCount",
        "totalObjectsCopiedIntoTarget",
        "timeStartedInMillis",
        "timeEndedInMillis",
        "copiedItems",
        "referencedItems",
        "name"
    })
    public CopyObjectRequest(
            String key,
            String sourceWorkspaceId,
            java.util.List<String> objectKeys,
            CopyConflictResolution copyConflictResolution,
            CopyMetadataObjectRequestStatus copyMetadataObjectRequestStatus,
            String createdBy,
            String createdByName,
            Integer totalSourceObjectCount,
            Integer totalObjectsCopiedIntoTarget,
            Long timeStartedInMillis,
            Long timeEndedInMillis,
            java.util.List<CopyObjectMetadataSummary> copiedItems,
            java.util.List<CopyObjectMetadataSummary> referencedItems,
            String name) {
        super();
        this.key = key;
        this.sourceWorkspaceId = sourceWorkspaceId;
        this.objectKeys = objectKeys;
        this.copyConflictResolution = copyConflictResolution;
        this.copyMetadataObjectRequestStatus = copyMetadataObjectRequestStatus;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.totalSourceObjectCount = totalSourceObjectCount;
        this.totalObjectsCopiedIntoTarget = totalObjectsCopiedIntoTarget;
        this.timeStartedInMillis = timeStartedInMillis;
        this.timeEndedInMillis = timeEndedInMillis;
        this.copiedItems = copiedItems;
        this.referencedItems = referencedItems;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Copy object request key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Copy object request key.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The workspace id of the source from where we need to copy object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceWorkspaceId")
        private String sourceWorkspaceId;

        /**
         * The workspace id of the source from where we need to copy object.
         * @param sourceWorkspaceId the value to set
         * @return this builder
         **/
        public Builder sourceWorkspaceId(String sourceWorkspaceId) {
            this.sourceWorkspaceId = sourceWorkspaceId;
            this.__explicitlySet__.add("sourceWorkspaceId");
            return this;
        }
        /**
         * The list of the objects to be copied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectKeys")
        private java.util.List<String> objectKeys;

        /**
         * The list of the objects to be copied.
         * @param objectKeys the value to set
         * @return this builder
         **/
        public Builder objectKeys(java.util.List<String> objectKeys) {
            this.objectKeys = objectKeys;
            this.__explicitlySet__.add("objectKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("copyConflictResolution")
        private CopyConflictResolution copyConflictResolution;

        public Builder copyConflictResolution(CopyConflictResolution copyConflictResolution) {
            this.copyConflictResolution = copyConflictResolution;
            this.__explicitlySet__.add("copyConflictResolution");
            return this;
        }
        /**
         * Copy Object request status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("copyMetadataObjectRequestStatus")
        private CopyMetadataObjectRequestStatus copyMetadataObjectRequestStatus;

        /**
         * Copy Object request status.
         * @param copyMetadataObjectRequestStatus the value to set
         * @return this builder
         **/
        public Builder copyMetadataObjectRequestStatus(
                CopyMetadataObjectRequestStatus copyMetadataObjectRequestStatus) {
            this.copyMetadataObjectRequestStatus = copyMetadataObjectRequestStatus;
            this.__explicitlySet__.add("copyMetadataObjectRequestStatus");
            return this;
        }
        /**
         * OCID of the user who initiated copy request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * OCID of the user who initiated copy request.
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * Name of the user who created the copy object request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
        private String createdByName;

        /**
         * Name of the user who created the copy object request.
         * @param createdByName the value to set
         * @return this builder
         **/
        public Builder createdByName(String createdByName) {
            this.createdByName = createdByName;
            this.__explicitlySet__.add("createdByName");
            return this;
        }
        /**
         * Number of source objects to be copied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalSourceObjectCount")
        private Integer totalSourceObjectCount;

        /**
         * Number of source objects to be copied.
         * @param totalSourceObjectCount the value to set
         * @return this builder
         **/
        public Builder totalSourceObjectCount(Integer totalSourceObjectCount) {
            this.totalSourceObjectCount = totalSourceObjectCount;
            this.__explicitlySet__.add("totalSourceObjectCount");
            return this;
        }
        /**
         * Number of objects copied into the target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsCopiedIntoTarget")
        private Integer totalObjectsCopiedIntoTarget;

        /**
         * Number of objects copied into the target.
         * @param totalObjectsCopiedIntoTarget the value to set
         * @return this builder
         **/
        public Builder totalObjectsCopiedIntoTarget(Integer totalObjectsCopiedIntoTarget) {
            this.totalObjectsCopiedIntoTarget = totalObjectsCopiedIntoTarget;
            this.__explicitlySet__.add("totalObjectsCopiedIntoTarget");
            return this;
        }
        /**
         * Time at which the request started getting processed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStartedInMillis")
        private Long timeStartedInMillis;

        /**
         * Time at which the request started getting processed.
         * @param timeStartedInMillis the value to set
         * @return this builder
         **/
        public Builder timeStartedInMillis(Long timeStartedInMillis) {
            this.timeStartedInMillis = timeStartedInMillis;
            this.__explicitlySet__.add("timeStartedInMillis");
            return this;
        }
        /**
         * Time at which the request was completely processed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEndedInMillis")
        private Long timeEndedInMillis;

        /**
         * Time at which the request was completely processed.
         * @param timeEndedInMillis the value to set
         * @return this builder
         **/
        public Builder timeEndedInMillis(Long timeEndedInMillis) {
            this.timeEndedInMillis = timeEndedInMillis;
            this.__explicitlySet__.add("timeEndedInMillis");
            return this;
        }
        /**
         * The array of copy object details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("copiedItems")
        private java.util.List<CopyObjectMetadataSummary> copiedItems;

        /**
         * The array of copy object details.
         * @param copiedItems the value to set
         * @return this builder
         **/
        public Builder copiedItems(java.util.List<CopyObjectMetadataSummary> copiedItems) {
            this.copiedItems = copiedItems;
            this.__explicitlySet__.add("copiedItems");
            return this;
        }
        /**
         * The array of copied referenced objects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referencedItems")
        private java.util.List<CopyObjectMetadataSummary> referencedItems;

        /**
         * The array of copied referenced objects.
         * @param referencedItems the value to set
         * @return this builder
         **/
        public Builder referencedItems(java.util.List<CopyObjectMetadataSummary> referencedItems) {
            this.referencedItems = referencedItems;
            this.__explicitlySet__.add("referencedItems");
            return this;
        }
        /**
         * Name of the copy object request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the copy object request.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CopyObjectRequest build() {
            CopyObjectRequest model =
                    new CopyObjectRequest(
                            this.key,
                            this.sourceWorkspaceId,
                            this.objectKeys,
                            this.copyConflictResolution,
                            this.copyMetadataObjectRequestStatus,
                            this.createdBy,
                            this.createdByName,
                            this.totalSourceObjectCount,
                            this.totalObjectsCopiedIntoTarget,
                            this.timeStartedInMillis,
                            this.timeEndedInMillis,
                            this.copiedItems,
                            this.referencedItems,
                            this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CopyObjectRequest model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("sourceWorkspaceId")) {
                this.sourceWorkspaceId(model.getSourceWorkspaceId());
            }
            if (model.wasPropertyExplicitlySet("objectKeys")) {
                this.objectKeys(model.getObjectKeys());
            }
            if (model.wasPropertyExplicitlySet("copyConflictResolution")) {
                this.copyConflictResolution(model.getCopyConflictResolution());
            }
            if (model.wasPropertyExplicitlySet("copyMetadataObjectRequestStatus")) {
                this.copyMetadataObjectRequestStatus(model.getCopyMetadataObjectRequestStatus());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("createdByName")) {
                this.createdByName(model.getCreatedByName());
            }
            if (model.wasPropertyExplicitlySet("totalSourceObjectCount")) {
                this.totalSourceObjectCount(model.getTotalSourceObjectCount());
            }
            if (model.wasPropertyExplicitlySet("totalObjectsCopiedIntoTarget")) {
                this.totalObjectsCopiedIntoTarget(model.getTotalObjectsCopiedIntoTarget());
            }
            if (model.wasPropertyExplicitlySet("timeStartedInMillis")) {
                this.timeStartedInMillis(model.getTimeStartedInMillis());
            }
            if (model.wasPropertyExplicitlySet("timeEndedInMillis")) {
                this.timeEndedInMillis(model.getTimeEndedInMillis());
            }
            if (model.wasPropertyExplicitlySet("copiedItems")) {
                this.copiedItems(model.getCopiedItems());
            }
            if (model.wasPropertyExplicitlySet("referencedItems")) {
                this.referencedItems(model.getReferencedItems());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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
     * Copy object request key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Copy object request key.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The workspace id of the source from where we need to copy object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceWorkspaceId")
    private final String sourceWorkspaceId;

    /**
     * The workspace id of the source from where we need to copy object.
     * @return the value
     **/
    public String getSourceWorkspaceId() {
        return sourceWorkspaceId;
    }

    /**
     * The list of the objects to be copied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectKeys")
    private final java.util.List<String> objectKeys;

    /**
     * The list of the objects to be copied.
     * @return the value
     **/
    public java.util.List<String> getObjectKeys() {
        return objectKeys;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("copyConflictResolution")
    private final CopyConflictResolution copyConflictResolution;

    public CopyConflictResolution getCopyConflictResolution() {
        return copyConflictResolution;
    }

    /**
     * Copy Object request status.
     **/
    public enum CopyMetadataObjectRequestStatus {
        Successful("SUCCESSFUL"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),
        Queued("QUEUED"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CopyMetadataObjectRequestStatus.class);

        private final String value;
        private static java.util.Map<String, CopyMetadataObjectRequestStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (CopyMetadataObjectRequestStatus v : CopyMetadataObjectRequestStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CopyMetadataObjectRequestStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CopyMetadataObjectRequestStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CopyMetadataObjectRequestStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Copy Object request status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("copyMetadataObjectRequestStatus")
    private final CopyMetadataObjectRequestStatus copyMetadataObjectRequestStatus;

    /**
     * Copy Object request status.
     * @return the value
     **/
    public CopyMetadataObjectRequestStatus getCopyMetadataObjectRequestStatus() {
        return copyMetadataObjectRequestStatus;
    }

    /**
     * OCID of the user who initiated copy request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * OCID of the user who initiated copy request.
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Name of the user who created the copy object request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

    /**
     * Name of the user who created the copy object request.
     * @return the value
     **/
    public String getCreatedByName() {
        return createdByName;
    }

    /**
     * Number of source objects to be copied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSourceObjectCount")
    private final Integer totalSourceObjectCount;

    /**
     * Number of source objects to be copied.
     * @return the value
     **/
    public Integer getTotalSourceObjectCount() {
        return totalSourceObjectCount;
    }

    /**
     * Number of objects copied into the target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsCopiedIntoTarget")
    private final Integer totalObjectsCopiedIntoTarget;

    /**
     * Number of objects copied into the target.
     * @return the value
     **/
    public Integer getTotalObjectsCopiedIntoTarget() {
        return totalObjectsCopiedIntoTarget;
    }

    /**
     * Time at which the request started getting processed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStartedInMillis")
    private final Long timeStartedInMillis;

    /**
     * Time at which the request started getting processed.
     * @return the value
     **/
    public Long getTimeStartedInMillis() {
        return timeStartedInMillis;
    }

    /**
     * Time at which the request was completely processed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEndedInMillis")
    private final Long timeEndedInMillis;

    /**
     * Time at which the request was completely processed.
     * @return the value
     **/
    public Long getTimeEndedInMillis() {
        return timeEndedInMillis;
    }

    /**
     * The array of copy object details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("copiedItems")
    private final java.util.List<CopyObjectMetadataSummary> copiedItems;

    /**
     * The array of copy object details.
     * @return the value
     **/
    public java.util.List<CopyObjectMetadataSummary> getCopiedItems() {
        return copiedItems;
    }

    /**
     * The array of copied referenced objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedItems")
    private final java.util.List<CopyObjectMetadataSummary> referencedItems;

    /**
     * The array of copied referenced objects.
     * @return the value
     **/
    public java.util.List<CopyObjectMetadataSummary> getReferencedItems() {
        return referencedItems;
    }

    /**
     * Name of the copy object request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the copy object request.
     * @return the value
     **/
    public String getName() {
        return name;
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
        sb.append("CopyObjectRequest(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", sourceWorkspaceId=").append(String.valueOf(this.sourceWorkspaceId));
        sb.append(", objectKeys=").append(String.valueOf(this.objectKeys));
        sb.append(", copyConflictResolution=").append(String.valueOf(this.copyConflictResolution));
        sb.append(", copyMetadataObjectRequestStatus=")
                .append(String.valueOf(this.copyMetadataObjectRequestStatus));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", totalSourceObjectCount=").append(String.valueOf(this.totalSourceObjectCount));
        sb.append(", totalObjectsCopiedIntoTarget=")
                .append(String.valueOf(this.totalObjectsCopiedIntoTarget));
        sb.append(", timeStartedInMillis=").append(String.valueOf(this.timeStartedInMillis));
        sb.append(", timeEndedInMillis=").append(String.valueOf(this.timeEndedInMillis));
        sb.append(", copiedItems=").append(String.valueOf(this.copiedItems));
        sb.append(", referencedItems=").append(String.valueOf(this.referencedItems));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyObjectRequest)) {
            return false;
        }

        CopyObjectRequest other = (CopyObjectRequest) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.sourceWorkspaceId, other.sourceWorkspaceId)
                && java.util.Objects.equals(this.objectKeys, other.objectKeys)
                && java.util.Objects.equals(
                        this.copyConflictResolution, other.copyConflictResolution)
                && java.util.Objects.equals(
                        this.copyMetadataObjectRequestStatus, other.copyMetadataObjectRequestStatus)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.createdByName, other.createdByName)
                && java.util.Objects.equals(
                        this.totalSourceObjectCount, other.totalSourceObjectCount)
                && java.util.Objects.equals(
                        this.totalObjectsCopiedIntoTarget, other.totalObjectsCopiedIntoTarget)
                && java.util.Objects.equals(this.timeStartedInMillis, other.timeStartedInMillis)
                && java.util.Objects.equals(this.timeEndedInMillis, other.timeEndedInMillis)
                && java.util.Objects.equals(this.copiedItems, other.copiedItems)
                && java.util.Objects.equals(this.referencedItems, other.referencedItems)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceWorkspaceId == null ? 43 : this.sourceWorkspaceId.hashCode());
        result = (result * PRIME) + (this.objectKeys == null ? 43 : this.objectKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.copyConflictResolution == null
                                ? 43
                                : this.copyConflictResolution.hashCode());
        result =
                (result * PRIME)
                        + (this.copyMetadataObjectRequestStatus == null
                                ? 43
                                : this.copyMetadataObjectRequestStatus.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSourceObjectCount == null
                                ? 43
                                : this.totalSourceObjectCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalObjectsCopiedIntoTarget == null
                                ? 43
                                : this.totalObjectsCopiedIntoTarget.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartedInMillis == null
                                ? 43
                                : this.timeStartedInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEndedInMillis == null ? 43 : this.timeEndedInMillis.hashCode());
        result = (result * PRIME) + (this.copiedItems == null ? 43 : this.copiedItems.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedItems == null ? 43 : this.referencedItems.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
