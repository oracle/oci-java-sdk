/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Import metadata object response. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImportRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportRequest extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "bucketName",
        "fileName",
        "objectStorageTenancyId",
        "objectStorageRegion",
        "objectKeyForImport",
        "areDataAssetReferencesIncluded",
        "importConflictResolution",
        "status",
        "createdBy",
        "totalImportedObjectCount",
        "timeStartedInMillis",
        "timeEndedInMillis",
        "errorMessages",
        "importedObjects",
        "name"
    })
    public ImportRequest(
            String key,
            String bucketName,
            String fileName,
            String objectStorageTenancyId,
            String objectStorageRegion,
            String objectKeyForImport,
            Boolean areDataAssetReferencesIncluded,
            ImportConflictResolution importConflictResolution,
            Status status,
            String createdBy,
            Integer totalImportedObjectCount,
            Long timeStartedInMillis,
            Long timeEndedInMillis,
            java.util.Map<String, String> errorMessages,
            java.util.List<ImportObjectMetadataSummary> importedObjects,
            String name) {
        super();
        this.key = key;
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.objectStorageTenancyId = objectStorageTenancyId;
        this.objectStorageRegion = objectStorageRegion;
        this.objectKeyForImport = objectKeyForImport;
        this.areDataAssetReferencesIncluded = areDataAssetReferencesIncluded;
        this.importConflictResolution = importConflictResolution;
        this.status = status;
        this.createdBy = createdBy;
        this.totalImportedObjectCount = totalImportedObjectCount;
        this.timeStartedInMillis = timeStartedInMillis;
        this.timeEndedInMillis = timeEndedInMillis;
        this.errorMessages = errorMessages;
        this.importedObjects = importedObjects;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Import object request key */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Import object request key
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The name of the Object Storage Bucket where the objects will be imported from */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the Object Storage Bucket where the objects will be imported from
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** Name of the zip file from which objects will be imported. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileName")
        private String fileName;

        /**
         * Name of the zip file from which objects will be imported.
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
        /** Key of the object inside which all the objects will be imported */
        @com.fasterxml.jackson.annotation.JsonProperty("objectKeyForImport")
        private String objectKeyForImport;

        /**
         * Key of the object inside which all the objects will be imported
         *
         * @param objectKeyForImport the value to set
         * @return this builder
         */
        public Builder objectKeyForImport(String objectKeyForImport) {
            this.objectKeyForImport = objectKeyForImport;
            this.__explicitlySet__.add("objectKeyForImport");
            return this;
        }
        /** This field controls if the data asset references will be included during import. */
        @com.fasterxml.jackson.annotation.JsonProperty("areDataAssetReferencesIncluded")
        private Boolean areDataAssetReferencesIncluded;

        /**
         * This field controls if the data asset references will be included during import.
         *
         * @param areDataAssetReferencesIncluded the value to set
         * @return this builder
         */
        public Builder areDataAssetReferencesIncluded(Boolean areDataAssetReferencesIncluded) {
            this.areDataAssetReferencesIncluded = areDataAssetReferencesIncluded;
            this.__explicitlySet__.add("areDataAssetReferencesIncluded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importConflictResolution")
        private ImportConflictResolution importConflictResolution;

        public Builder importConflictResolution(ImportConflictResolution importConflictResolution) {
            this.importConflictResolution = importConflictResolution;
            this.__explicitlySet__.add("importConflictResolution");
            return this;
        }
        /** Import Objects request status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Import Objects request status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Name of the user who initiated import request. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * Name of the user who initiated import request.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** Number of objects that are imported. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalImportedObjectCount")
        private Integer totalImportedObjectCount;

        /**
         * Number of objects that are imported.
         *
         * @param totalImportedObjectCount the value to set
         * @return this builder
         */
        public Builder totalImportedObjectCount(Integer totalImportedObjectCount) {
            this.totalImportedObjectCount = totalImportedObjectCount;
            this.__explicitlySet__.add("totalImportedObjectCount");
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
        /** The array of imported object details. */
        @com.fasterxml.jackson.annotation.JsonProperty("importedObjects")
        private java.util.List<ImportObjectMetadataSummary> importedObjects;

        /**
         * The array of imported object details.
         *
         * @param importedObjects the value to set
         * @return this builder
         */
        public Builder importedObjects(
                java.util.List<ImportObjectMetadataSummary> importedObjects) {
            this.importedObjects = importedObjects;
            this.__explicitlySet__.add("importedObjects");
            return this;
        }
        /** Name of the import request. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the import request.
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

        public ImportRequest build() {
            ImportRequest model =
                    new ImportRequest(
                            this.key,
                            this.bucketName,
                            this.fileName,
                            this.objectStorageTenancyId,
                            this.objectStorageRegion,
                            this.objectKeyForImport,
                            this.areDataAssetReferencesIncluded,
                            this.importConflictResolution,
                            this.status,
                            this.createdBy,
                            this.totalImportedObjectCount,
                            this.timeStartedInMillis,
                            this.timeEndedInMillis,
                            this.errorMessages,
                            this.importedObjects,
                            this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportRequest model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
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
            if (model.wasPropertyExplicitlySet("objectKeyForImport")) {
                this.objectKeyForImport(model.getObjectKeyForImport());
            }
            if (model.wasPropertyExplicitlySet("areDataAssetReferencesIncluded")) {
                this.areDataAssetReferencesIncluded(model.getAreDataAssetReferencesIncluded());
            }
            if (model.wasPropertyExplicitlySet("importConflictResolution")) {
                this.importConflictResolution(model.getImportConflictResolution());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("totalImportedObjectCount")) {
                this.totalImportedObjectCount(model.getTotalImportedObjectCount());
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
            if (model.wasPropertyExplicitlySet("importedObjects")) {
                this.importedObjects(model.getImportedObjects());
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

    /** Import object request key */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Import object request key
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The name of the Object Storage Bucket where the objects will be imported from */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the Object Storage Bucket where the objects will be imported from
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** Name of the zip file from which objects will be imported. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    private final String fileName;

    /**
     * Name of the zip file from which objects will be imported.
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

    /** Key of the object inside which all the objects will be imported */
    @com.fasterxml.jackson.annotation.JsonProperty("objectKeyForImport")
    private final String objectKeyForImport;

    /**
     * Key of the object inside which all the objects will be imported
     *
     * @return the value
     */
    public String getObjectKeyForImport() {
        return objectKeyForImport;
    }

    /** This field controls if the data asset references will be included during import. */
    @com.fasterxml.jackson.annotation.JsonProperty("areDataAssetReferencesIncluded")
    private final Boolean areDataAssetReferencesIncluded;

    /**
     * This field controls if the data asset references will be included during import.
     *
     * @return the value
     */
    public Boolean getAreDataAssetReferencesIncluded() {
        return areDataAssetReferencesIncluded;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("importConflictResolution")
    private final ImportConflictResolution importConflictResolution;

    public ImportConflictResolution getImportConflictResolution() {
        return importConflictResolution;
    }

    /** Import Objects request status. */
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
    /** Import Objects request status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Import Objects request status.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Name of the user who initiated import request. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * Name of the user who initiated import request.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** Number of objects that are imported. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalImportedObjectCount")
    private final Integer totalImportedObjectCount;

    /**
     * Number of objects that are imported.
     *
     * @return the value
     */
    public Integer getTotalImportedObjectCount() {
        return totalImportedObjectCount;
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

    /** The array of imported object details. */
    @com.fasterxml.jackson.annotation.JsonProperty("importedObjects")
    private final java.util.List<ImportObjectMetadataSummary> importedObjects;

    /**
     * The array of imported object details.
     *
     * @return the value
     */
    public java.util.List<ImportObjectMetadataSummary> getImportedObjects() {
        return importedObjects;
    }

    /** Name of the import request. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the import request.
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
        sb.append("ImportRequest(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", fileName=").append(String.valueOf(this.fileName));
        sb.append(", objectStorageTenancyId=").append(String.valueOf(this.objectStorageTenancyId));
        sb.append(", objectStorageRegion=").append(String.valueOf(this.objectStorageRegion));
        sb.append(", objectKeyForImport=").append(String.valueOf(this.objectKeyForImport));
        sb.append(", areDataAssetReferencesIncluded=")
                .append(String.valueOf(this.areDataAssetReferencesIncluded));
        sb.append(", importConflictResolution=")
                .append(String.valueOf(this.importConflictResolution));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", totalImportedObjectCount=")
                .append(String.valueOf(this.totalImportedObjectCount));
        sb.append(", timeStartedInMillis=").append(String.valueOf(this.timeStartedInMillis));
        sb.append(", timeEndedInMillis=").append(String.valueOf(this.timeEndedInMillis));
        sb.append(", errorMessages=").append(String.valueOf(this.errorMessages));
        sb.append(", importedObjects=").append(String.valueOf(this.importedObjects));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportRequest)) {
            return false;
        }

        ImportRequest other = (ImportRequest) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.fileName, other.fileName)
                && java.util.Objects.equals(
                        this.objectStorageTenancyId, other.objectStorageTenancyId)
                && java.util.Objects.equals(this.objectStorageRegion, other.objectStorageRegion)
                && java.util.Objects.equals(this.objectKeyForImport, other.objectKeyForImport)
                && java.util.Objects.equals(
                        this.areDataAssetReferencesIncluded, other.areDataAssetReferencesIncluded)
                && java.util.Objects.equals(
                        this.importConflictResolution, other.importConflictResolution)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(
                        this.totalImportedObjectCount, other.totalImportedObjectCount)
                && java.util.Objects.equals(this.timeStartedInMillis, other.timeStartedInMillis)
                && java.util.Objects.equals(this.timeEndedInMillis, other.timeEndedInMillis)
                && java.util.Objects.equals(this.errorMessages, other.errorMessages)
                && java.util.Objects.equals(this.importedObjects, other.importedObjects)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
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
                        + (this.objectKeyForImport == null
                                ? 43
                                : this.objectKeyForImport.hashCode());
        result =
                (result * PRIME)
                        + (this.areDataAssetReferencesIncluded == null
                                ? 43
                                : this.areDataAssetReferencesIncluded.hashCode());
        result =
                (result * PRIME)
                        + (this.importConflictResolution == null
                                ? 43
                                : this.importConflictResolution.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.totalImportedObjectCount == null
                                ? 43
                                : this.totalImportedObjectCount.hashCode());
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
                        + (this.importedObjects == null ? 43 : this.importedObjects.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
