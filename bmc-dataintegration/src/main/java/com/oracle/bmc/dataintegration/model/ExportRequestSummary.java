/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Export metadata object response summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExportRequestSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportRequestSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "objectKeys",
        "bucketName",
        "fileName",
        "objectStorageTenancyId",
        "objectStorageRegion",
        "areReferencesIncluded",
        "isObjectOverwriteEnabled",
        "filters",
        "status",
        "createdBy",
        "totalExportedObjectCount",
        "timeStartedInMillis",
        "timeEndedInMillis",
        "errorMessages",
        "exportedItems",
        "referencedItems",
        "name"
    })
    public ExportRequestSummary(
            String key,
            java.util.List<String> objectKeys,
            String bucketName,
            String fileName,
            String objectStorageTenancyId,
            String objectStorageRegion,
            Boolean areReferencesIncluded,
            Boolean isObjectOverwriteEnabled,
            java.util.List<String> filters,
            Status status,
            String createdBy,
            Integer totalExportedObjectCount,
            Long timeStartedInMillis,
            Long timeEndedInMillis,
            java.util.Map<String, String> errorMessages,
            java.util.List<ExportObjectMetadataSummary> exportedItems,
            String referencedItems,
            String name) {
        super();
        this.key = key;
        this.objectKeys = objectKeys;
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.objectStorageTenancyId = objectStorageTenancyId;
        this.objectStorageRegion = objectStorageRegion;
        this.areReferencesIncluded = areReferencesIncluded;
        this.isObjectOverwriteEnabled = isObjectOverwriteEnabled;
        this.filters = filters;
        this.status = status;
        this.createdBy = createdBy;
        this.totalExportedObjectCount = totalExportedObjectCount;
        this.timeStartedInMillis = timeStartedInMillis;
        this.timeEndedInMillis = timeEndedInMillis;
        this.errorMessages = errorMessages;
        this.exportedItems = exportedItems;
        this.referencedItems = referencedItems;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Export object request key */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Export object request key
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The list of the objects to be exported */
        @com.fasterxml.jackson.annotation.JsonProperty("objectKeys")
        private java.util.List<String> objectKeys;

        /**
         * The list of the objects to be exported
         *
         * @param objectKeys the value to set
         * @return this builder
         */
        public Builder objectKeys(java.util.List<String> objectKeys) {
            this.objectKeys = objectKeys;
            this.__explicitlySet__.add("objectKeys");
            return this;
        }
        /** The name of the Object Storage Bucket where the objects will be exported to */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the Object Storage Bucket where the objects will be exported to
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** Name of the exported zip file. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileName")
        private String fileName;

        /**
         * Name of the exported zip file.
         *
         * @param fileName the value to set
         * @return this builder
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            this.__explicitlySet__.add("fileName");
            return this;
        }
        /**
         * Optional parameter to point to object storage tenancy (if using Object Storage of
         * different tenancy)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageTenancyId")
        private String objectStorageTenancyId;

        /**
         * Optional parameter to point to object storage tenancy (if using Object Storage of
         * different tenancy)
         *
         * @param objectStorageTenancyId the value to set
         * @return this builder
         */
        public Builder objectStorageTenancyId(String objectStorageTenancyId) {
            this.objectStorageTenancyId = objectStorageTenancyId;
            this.__explicitlySet__.add("objectStorageTenancyId");
            return this;
        }
        /** Region of the object storage (if using object storage of different region) */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageRegion")
        private String objectStorageRegion;

        /**
         * Region of the object storage (if using object storage of different region)
         *
         * @param objectStorageRegion the value to set
         * @return this builder
         */
        public Builder objectStorageRegion(String objectStorageRegion) {
            this.objectStorageRegion = objectStorageRegion;
            this.__explicitlySet__.add("objectStorageRegion");
            return this;
        }
        /** Controls if the references will be exported along with the objects */
        @com.fasterxml.jackson.annotation.JsonProperty("areReferencesIncluded")
        private Boolean areReferencesIncluded;

        /**
         * Controls if the references will be exported along with the objects
         *
         * @param areReferencesIncluded the value to set
         * @return this builder
         */
        public Builder areReferencesIncluded(Boolean areReferencesIncluded) {
            this.areReferencesIncluded = areReferencesIncluded;
            this.__explicitlySet__.add("areReferencesIncluded");
            return this;
        }
        /**
         * Flag to control whether to overwrite the object if it is already present at the provided
         * object storage location.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isObjectOverwriteEnabled")
        private Boolean isObjectOverwriteEnabled;

        /**
         * Flag to control whether to overwrite the object if it is already present at the provided
         * object storage location.
         *
         * @param isObjectOverwriteEnabled the value to set
         * @return this builder
         */
        public Builder isObjectOverwriteEnabled(Boolean isObjectOverwriteEnabled) {
            this.isObjectOverwriteEnabled = isObjectOverwriteEnabled;
            this.__explicitlySet__.add("isObjectOverwriteEnabled");
            return this;
        }
        /** Export multiple objects based on filters. */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<String> filters;

        /**
         * Export multiple objects based on filters.
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(java.util.List<String> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }
        /** Export Objects request status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Export Objects request status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Name of the user who initiated export request. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * Name of the user who initiated export request.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** Number of objects that are exported. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalExportedObjectCount")
        private Integer totalExportedObjectCount;

        /**
         * Number of objects that are exported.
         *
         * @param totalExportedObjectCount the value to set
         * @return this builder
         */
        public Builder totalExportedObjectCount(Integer totalExportedObjectCount) {
            this.totalExportedObjectCount = totalExportedObjectCount;
            this.__explicitlySet__.add("totalExportedObjectCount");
            return this;
        }
        /** Time at which the request started getting processed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStartedInMillis")
        private Long timeStartedInMillis;

        /**
         * Time at which the request started getting processed.
         *
         * @param timeStartedInMillis the value to set
         * @return this builder
         */
        public Builder timeStartedInMillis(Long timeStartedInMillis) {
            this.timeStartedInMillis = timeStartedInMillis;
            this.__explicitlySet__.add("timeStartedInMillis");
            return this;
        }
        /** Time at which the request was completely processed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEndedInMillis")
        private Long timeEndedInMillis;

        /**
         * Time at which the request was completely processed.
         *
         * @param timeEndedInMillis the value to set
         * @return this builder
         */
        public Builder timeEndedInMillis(Long timeEndedInMillis) {
            this.timeEndedInMillis = timeEndedInMillis;
            this.__explicitlySet__.add("timeEndedInMillis");
            return this;
        }
        /** Contains key of the error */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessages")
        private java.util.Map<String, String> errorMessages;

        /**
         * Contains key of the error
         *
         * @param errorMessages the value to set
         * @return this builder
         */
        public Builder errorMessages(java.util.Map<String, String> errorMessages) {
            this.errorMessages = errorMessages;
            this.__explicitlySet__.add("errorMessages");
            return this;
        }
        /** The array of exported object details. */
        @com.fasterxml.jackson.annotation.JsonProperty("exportedItems")
        private java.util.List<ExportObjectMetadataSummary> exportedItems;

        /**
         * The array of exported object details.
         *
         * @param exportedItems the value to set
         * @return this builder
         */
        public Builder exportedItems(java.util.List<ExportObjectMetadataSummary> exportedItems) {
            this.exportedItems = exportedItems;
            this.__explicitlySet__.add("exportedItems");
            return this;
        }
        /** The array of exported referenced objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("referencedItems")
        private String referencedItems;

        /**
         * The array of exported referenced objects.
         *
         * @param referencedItems the value to set
         * @return this builder
         */
        public Builder referencedItems(String referencedItems) {
            this.referencedItems = referencedItems;
            this.__explicitlySet__.add("referencedItems");
            return this;
        }
        /** Name of the export request. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the export request.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportRequestSummary build() {
            ExportRequestSummary model =
                    new ExportRequestSummary(
                            this.key,
                            this.objectKeys,
                            this.bucketName,
                            this.fileName,
                            this.objectStorageTenancyId,
                            this.objectStorageRegion,
                            this.areReferencesIncluded,
                            this.isObjectOverwriteEnabled,
                            this.filters,
                            this.status,
                            this.createdBy,
                            this.totalExportedObjectCount,
                            this.timeStartedInMillis,
                            this.timeEndedInMillis,
                            this.errorMessages,
                            this.exportedItems,
                            this.referencedItems,
                            this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportRequestSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("objectKeys")) {
                this.objectKeys(model.getObjectKeys());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("fileName")) {
                this.fileName(model.getFileName());
            }
            if (model.wasPropertyExplicitlySet("objectStorageTenancyId")) {
                this.objectStorageTenancyId(model.getObjectStorageTenancyId());
            }
            if (model.wasPropertyExplicitlySet("objectStorageRegion")) {
                this.objectStorageRegion(model.getObjectStorageRegion());
            }
            if (model.wasPropertyExplicitlySet("areReferencesIncluded")) {
                this.areReferencesIncluded(model.getAreReferencesIncluded());
            }
            if (model.wasPropertyExplicitlySet("isObjectOverwriteEnabled")) {
                this.isObjectOverwriteEnabled(model.getIsObjectOverwriteEnabled());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("totalExportedObjectCount")) {
                this.totalExportedObjectCount(model.getTotalExportedObjectCount());
            }
            if (model.wasPropertyExplicitlySet("timeStartedInMillis")) {
                this.timeStartedInMillis(model.getTimeStartedInMillis());
            }
            if (model.wasPropertyExplicitlySet("timeEndedInMillis")) {
                this.timeEndedInMillis(model.getTimeEndedInMillis());
            }
            if (model.wasPropertyExplicitlySet("errorMessages")) {
                this.errorMessages(model.getErrorMessages());
            }
            if (model.wasPropertyExplicitlySet("exportedItems")) {
                this.exportedItems(model.getExportedItems());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Export object request key */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Export object request key
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The list of the objects to be exported */
    @com.fasterxml.jackson.annotation.JsonProperty("objectKeys")
    private final java.util.List<String> objectKeys;

    /**
     * The list of the objects to be exported
     *
     * @return the value
     */
    public java.util.List<String> getObjectKeys() {
        return objectKeys;
    }

    /** The name of the Object Storage Bucket where the objects will be exported to */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the Object Storage Bucket where the objects will be exported to
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** Name of the exported zip file. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    private final String fileName;

    /**
     * Name of the exported zip file.
     *
     * @return the value
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Optional parameter to point to object storage tenancy (if using Object Storage of different
     * tenancy)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageTenancyId")
    private final String objectStorageTenancyId;

    /**
     * Optional parameter to point to object storage tenancy (if using Object Storage of different
     * tenancy)
     *
     * @return the value
     */
    public String getObjectStorageTenancyId() {
        return objectStorageTenancyId;
    }

    /** Region of the object storage (if using object storage of different region) */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageRegion")
    private final String objectStorageRegion;

    /**
     * Region of the object storage (if using object storage of different region)
     *
     * @return the value
     */
    public String getObjectStorageRegion() {
        return objectStorageRegion;
    }

    /** Controls if the references will be exported along with the objects */
    @com.fasterxml.jackson.annotation.JsonProperty("areReferencesIncluded")
    private final Boolean areReferencesIncluded;

    /**
     * Controls if the references will be exported along with the objects
     *
     * @return the value
     */
    public Boolean getAreReferencesIncluded() {
        return areReferencesIncluded;
    }

    /**
     * Flag to control whether to overwrite the object if it is already present at the provided
     * object storage location.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isObjectOverwriteEnabled")
    private final Boolean isObjectOverwriteEnabled;

    /**
     * Flag to control whether to overwrite the object if it is already present at the provided
     * object storage location.
     *
     * @return the value
     */
    public Boolean getIsObjectOverwriteEnabled() {
        return isObjectOverwriteEnabled;
    }

    /** Export multiple objects based on filters. */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<String> filters;

    /**
     * Export multiple objects based on filters.
     *
     * @return the value
     */
    public java.util.List<String> getFilters() {
        return filters;
    }

    /** Export Objects request status. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Successful("SUCCESSFUL"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Queued("QUEUED"),

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
    /** Export Objects request status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Export Objects request status.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Name of the user who initiated export request. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * Name of the user who initiated export request.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** Number of objects that are exported. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalExportedObjectCount")
    private final Integer totalExportedObjectCount;

    /**
     * Number of objects that are exported.
     *
     * @return the value
     */
    public Integer getTotalExportedObjectCount() {
        return totalExportedObjectCount;
    }

    /** Time at which the request started getting processed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStartedInMillis")
    private final Long timeStartedInMillis;

    /**
     * Time at which the request started getting processed.
     *
     * @return the value
     */
    public Long getTimeStartedInMillis() {
        return timeStartedInMillis;
    }

    /** Time at which the request was completely processed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEndedInMillis")
    private final Long timeEndedInMillis;

    /**
     * Time at which the request was completely processed.
     *
     * @return the value
     */
    public Long getTimeEndedInMillis() {
        return timeEndedInMillis;
    }

    /** Contains key of the error */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessages")
    private final java.util.Map<String, String> errorMessages;

    /**
     * Contains key of the error
     *
     * @return the value
     */
    public java.util.Map<String, String> getErrorMessages() {
        return errorMessages;
    }

    /** The array of exported object details. */
    @com.fasterxml.jackson.annotation.JsonProperty("exportedItems")
    private final java.util.List<ExportObjectMetadataSummary> exportedItems;

    /**
     * The array of exported object details.
     *
     * @return the value
     */
    public java.util.List<ExportObjectMetadataSummary> getExportedItems() {
        return exportedItems;
    }

    /** The array of exported referenced objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("referencedItems")
    private final String referencedItems;

    /**
     * The array of exported referenced objects.
     *
     * @return the value
     */
    public String getReferencedItems() {
        return referencedItems;
    }

    /** Name of the export request. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the export request.
     *
     * @return the value
     */
    public String getName() {
        return name;
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
        sb.append("ExportRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", objectKeys=").append(String.valueOf(this.objectKeys));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", fileName=").append(String.valueOf(this.fileName));
        sb.append(", objectStorageTenancyId=").append(String.valueOf(this.objectStorageTenancyId));
        sb.append(", objectStorageRegion=").append(String.valueOf(this.objectStorageRegion));
        sb.append(", areReferencesIncluded=").append(String.valueOf(this.areReferencesIncluded));
        sb.append(", isObjectOverwriteEnabled=")
                .append(String.valueOf(this.isObjectOverwriteEnabled));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", totalExportedObjectCount=")
                .append(String.valueOf(this.totalExportedObjectCount));
        sb.append(", timeStartedInMillis=").append(String.valueOf(this.timeStartedInMillis));
        sb.append(", timeEndedInMillis=").append(String.valueOf(this.timeEndedInMillis));
        sb.append(", errorMessages=").append(String.valueOf(this.errorMessages));
        sb.append(", exportedItems=").append(String.valueOf(this.exportedItems));
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
        if (!(o instanceof ExportRequestSummary)) {
            return false;
        }

        ExportRequestSummary other = (ExportRequestSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.objectKeys, other.objectKeys)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.fileName, other.fileName)
                && java.util.Objects.equals(
                        this.objectStorageTenancyId, other.objectStorageTenancyId)
                && java.util.Objects.equals(this.objectStorageRegion, other.objectStorageRegion)
                && java.util.Objects.equals(this.areReferencesIncluded, other.areReferencesIncluded)
                && java.util.Objects.equals(
                        this.isObjectOverwriteEnabled, other.isObjectOverwriteEnabled)
                && java.util.Objects.equals(this.filters, other.filters)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(
                        this.totalExportedObjectCount, other.totalExportedObjectCount)
                && java.util.Objects.equals(this.timeStartedInMillis, other.timeStartedInMillis)
                && java.util.Objects.equals(this.timeEndedInMillis, other.timeEndedInMillis)
                && java.util.Objects.equals(this.errorMessages, other.errorMessages)
                && java.util.Objects.equals(this.exportedItems, other.exportedItems)
                && java.util.Objects.equals(this.referencedItems, other.referencedItems)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.objectKeys == null ? 43 : this.objectKeys.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.fileName == null ? 43 : this.fileName.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageTenancyId == null
                                ? 43
                                : this.objectStorageTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageRegion == null
                                ? 43
                                : this.objectStorageRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.areReferencesIncluded == null
                                ? 43
                                : this.areReferencesIncluded.hashCode());
        result =
                (result * PRIME)
                        + (this.isObjectOverwriteEnabled == null
                                ? 43
                                : this.isObjectOverwriteEnabled.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.totalExportedObjectCount == null
                                ? 43
                                : this.totalExportedObjectCount.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartedInMillis == null
                                ? 43
                                : this.timeStartedInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEndedInMillis == null ? 43 : this.timeEndedInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.errorMessages == null ? 43 : this.errorMessages.hashCode());
        result =
                (result * PRIME)
                        + (this.exportedItems == null ? 43 : this.exportedItems.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedItems == null ? 43 : this.referencedItems.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
