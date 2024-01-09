/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details of export request. Export is supported using three ways. First, when objectKeys are
 * provided, export of those objects take place. Second, when filter are provided, all the objects
 * based on the filter provided are exported. Third, when neither objectKeys nor filters are
 * provided, we export all the design objects for the workspace. <br>
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
        builder = CreateExportRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateExportRequestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bucketName",
        "fileName",
        "objectStorageTenancyId",
        "objectStorageRegion",
        "isObjectOverwriteEnabled",
        "objectKeys",
        "areReferencesIncluded",
        "filters"
    })
    public CreateExportRequestDetails(
            String bucketName,
            String fileName,
            String objectStorageTenancyId,
            String objectStorageRegion,
            Boolean isObjectOverwriteEnabled,
            java.util.List<String> objectKeys,
            Boolean areReferencesIncluded,
            java.util.List<String> filters) {
        super();
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.objectStorageTenancyId = objectStorageTenancyId;
        this.objectStorageRegion = objectStorageRegion;
        this.isObjectOverwriteEnabled = isObjectOverwriteEnabled;
        this.objectKeys = objectKeys;
        this.areReferencesIncluded = areReferencesIncluded;
        this.filters = filters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the Object Storage bucket where the object will be exported. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Name of the Object Storage bucket where the object will be exported.
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
        /** Field is used to specify which object keys to export */
        @com.fasterxml.jackson.annotation.JsonProperty("objectKeys")
        private java.util.List<String> objectKeys;

        /**
         * Field is used to specify which object keys to export
         *
         * @param objectKeys the value to set
         * @return this builder
         */
        public Builder objectKeys(java.util.List<String> objectKeys) {
            this.objectKeys = objectKeys;
            this.__explicitlySet__.add("objectKeys");
            return this;
        }
        /** This field controls if the references will be exported along with the objects */
        @com.fasterxml.jackson.annotation.JsonProperty("areReferencesIncluded")
        private Boolean areReferencesIncluded;

        /**
         * This field controls if the references will be exported along with the objects
         *
         * @param areReferencesIncluded the value to set
         * @return this builder
         */
        public Builder areReferencesIncluded(Boolean areReferencesIncluded) {
            this.areReferencesIncluded = areReferencesIncluded;
            this.__explicitlySet__.add("areReferencesIncluded");
            return this;
        }
        /** Filters for exported objects */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<String> filters;

        /**
         * Filters for exported objects
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(java.util.List<String> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExportRequestDetails build() {
            CreateExportRequestDetails model =
                    new CreateExportRequestDetails(
                            this.bucketName,
                            this.fileName,
                            this.objectStorageTenancyId,
                            this.objectStorageRegion,
                            this.isObjectOverwriteEnabled,
                            this.objectKeys,
                            this.areReferencesIncluded,
                            this.filters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExportRequestDetails model) {
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
            if (model.wasPropertyExplicitlySet("isObjectOverwriteEnabled")) {
                this.isObjectOverwriteEnabled(model.getIsObjectOverwriteEnabled());
            }
            if (model.wasPropertyExplicitlySet("objectKeys")) {
                this.objectKeys(model.getObjectKeys());
            }
            if (model.wasPropertyExplicitlySet("areReferencesIncluded")) {
                this.areReferencesIncluded(model.getAreReferencesIncluded());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
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

    /** Name of the Object Storage bucket where the object will be exported. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Name of the Object Storage bucket where the object will be exported.
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

    /** Field is used to specify which object keys to export */
    @com.fasterxml.jackson.annotation.JsonProperty("objectKeys")
    private final java.util.List<String> objectKeys;

    /**
     * Field is used to specify which object keys to export
     *
     * @return the value
     */
    public java.util.List<String> getObjectKeys() {
        return objectKeys;
    }

    /** This field controls if the references will be exported along with the objects */
    @com.fasterxml.jackson.annotation.JsonProperty("areReferencesIncluded")
    private final Boolean areReferencesIncluded;

    /**
     * This field controls if the references will be exported along with the objects
     *
     * @return the value
     */
    public Boolean getAreReferencesIncluded() {
        return areReferencesIncluded;
    }

    /** Filters for exported objects */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<String> filters;

    /**
     * Filters for exported objects
     *
     * @return the value
     */
    public java.util.List<String> getFilters() {
        return filters;
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
        sb.append("CreateExportRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", fileName=").append(String.valueOf(this.fileName));
        sb.append(", objectStorageTenancyId=").append(String.valueOf(this.objectStorageTenancyId));
        sb.append(", objectStorageRegion=").append(String.valueOf(this.objectStorageRegion));
        sb.append(", isObjectOverwriteEnabled=")
                .append(String.valueOf(this.isObjectOverwriteEnabled));
        sb.append(", objectKeys=").append(String.valueOf(this.objectKeys));
        sb.append(", areReferencesIncluded=").append(String.valueOf(this.areReferencesIncluded));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExportRequestDetails)) {
            return false;
        }

        CreateExportRequestDetails other = (CreateExportRequestDetails) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.fileName, other.fileName)
                && java.util.Objects.equals(
                        this.objectStorageTenancyId, other.objectStorageTenancyId)
                && java.util.Objects.equals(this.objectStorageRegion, other.objectStorageRegion)
                && java.util.Objects.equals(
                        this.isObjectOverwriteEnabled, other.isObjectOverwriteEnabled)
                && java.util.Objects.equals(this.objectKeys, other.objectKeys)
                && java.util.Objects.equals(this.areReferencesIncluded, other.areReferencesIncluded)
                && java.util.Objects.equals(this.filters, other.filters)
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
                        + (this.isObjectOverwriteEnabled == null
                                ? 43
                                : this.isObjectOverwriteEnabled.hashCode());
        result = (result * PRIME) + (this.objectKeys == null ? 43 : this.objectKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.areReferencesIncluded == null
                                ? 43
                                : this.areReferencesIncluded.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
