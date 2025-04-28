/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details of import object. <br>
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
        builder = CreateImportRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateImportRequestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bucketName",
        "fileName",
        "objectStorageTenancyId",
        "objectStorageRegion",
        "objectKeyForImport",
        "areDataAssetReferencesIncluded",
        "importConflictResolution"
    })
    public CreateImportRequestDetails(
            String bucketName,
            String fileName,
            String objectStorageTenancyId,
            String objectStorageRegion,
            String objectKeyForImport,
            Boolean areDataAssetReferencesIncluded,
            ImportConflictResolution importConflictResolution) {
        super();
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.objectStorageTenancyId = objectStorageTenancyId;
        this.objectStorageRegion = objectStorageRegion;
        this.objectKeyForImport = objectKeyForImport;
        this.areDataAssetReferencesIncluded = areDataAssetReferencesIncluded;
        this.importConflictResolution = importConflictResolution;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the Object Storage bucket where the object will be imported from. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Name of the Object Storage bucket where the object will be imported from.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** Name of the zip file to be imported. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileName")
        private String fileName;

        /**
         * Name of the zip file to be imported.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateImportRequestDetails build() {
            CreateImportRequestDetails model =
                    new CreateImportRequestDetails(
                            this.bucketName,
                            this.fileName,
                            this.objectStorageTenancyId,
                            this.objectStorageRegion,
                            this.objectKeyForImport,
                            this.areDataAssetReferencesIncluded,
                            this.importConflictResolution);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateImportRequestDetails model) {
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

    /** Name of the Object Storage bucket where the object will be imported from. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Name of the Object Storage bucket where the object will be imported from.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** Name of the zip file to be imported. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    private final String fileName;

    /**
     * Name of the zip file to be imported.
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
        sb.append("CreateImportRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", fileName=").append(String.valueOf(this.fileName));
        sb.append(", objectStorageTenancyId=").append(String.valueOf(this.objectStorageTenancyId));
        sb.append(", objectStorageRegion=").append(String.valueOf(this.objectStorageRegion));
        sb.append(", objectKeyForImport=").append(String.valueOf(this.objectKeyForImport));
        sb.append(", areDataAssetReferencesIncluded=")
                .append(String.valueOf(this.areDataAssetReferencesIncluded));
        sb.append(", importConflictResolution=")
                .append(String.valueOf(this.importConflictResolution));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateImportRequestDetails)) {
            return false;
        }

        CreateImportRequestDetails other = (CreateImportRequestDetails) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.fileName, other.fileName)
                && java.util.Objects.equals(
                        this.objectStorageTenancyId, other.objectStorageTenancyId)
                && java.util.Objects.equals(this.objectStorageRegion, other.objectStorageRegion)
                && java.util.Objects.equals(this.objectKeyForImport, other.objectKeyForImport)
                && java.util.Objects.equals(
                        this.areDataAssetReferencesIncluded, other.areDataAssetReferencesIncluded)
                && java.util.Objects.equals(
                        this.importConflictResolution, other.importConflictResolution)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
