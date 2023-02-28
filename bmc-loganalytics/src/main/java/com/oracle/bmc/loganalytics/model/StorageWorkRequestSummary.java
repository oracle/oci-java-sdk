/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the summary of a storage work request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StorageWorkRequestSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class StorageWorkRequestSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "timeStarted",
        "timeAccepted",
        "timeFinished",
        "timeExpires",
        "percentComplete",
        "status",
        "timeDataStarted",
        "timeDataEnded",
        "purgeQueryString",
        "dataType",
        "statusDetails",
        "operationDetails",
        "policyName",
        "policyId",
        "storageUsageInBytes",
        "compartmentIdInSubtree",
        "operationType",
        "keyId",
        "keyType"
    })
    public StorageWorkRequestSummary(
            String id,
            String compartmentId,
            java.util.Date timeStarted,
            java.util.Date timeAccepted,
            java.util.Date timeFinished,
            java.util.Date timeExpires,
            Integer percentComplete,
            WorkRequestStatus status,
            java.util.Date timeDataStarted,
            java.util.Date timeDataEnded,
            String purgeQueryString,
            StorageDataType dataType,
            String statusDetails,
            String operationDetails,
            String policyName,
            String policyId,
            Long storageUsageInBytes,
            Boolean compartmentIdInSubtree,
            StorageOperationType operationType,
            String keyId,
            EncryptionKeyType keyType) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.timeStarted = timeStarted;
        this.timeAccepted = timeAccepted;
        this.timeFinished = timeFinished;
        this.timeExpires = timeExpires;
        this.percentComplete = percentComplete;
        this.status = status;
        this.timeDataStarted = timeDataStarted;
        this.timeDataEnded = timeDataEnded;
        this.purgeQueryString = purgeQueryString;
        this.dataType = dataType;
        this.statusDetails = statusDetails;
        this.operationDetails = operationDetails;
        this.policyName = policyName;
        this.policyId = policyId;
        this.storageUsageInBytes = storageUsageInBytes;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.operationType = operationType;
        this.keyId = keyId;
        this.keyType = keyType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the OCID of the storage work Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * This is the OCID of the storage work Request.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** When the work request started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * When the work request started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** When the work request was accepted. Should match timeStarted in all cases. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * When the work request was accepted. Should match timeStarted in all cases.
         *
         * @param timeAccepted the value to set
         * @return this builder
         */
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /** When the work request finished execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * When the work request finished execution.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** When the work request will expire. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * When the work request will expire.
         *
         * @param timeExpires the value to set
         * @return this builder
         */
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /** Percentage progress completion of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        /**
         * Percentage progress completion of the work request.
         *
         * @param percentComplete the value to set
         * @return this builder
         */
        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /** This is the work request status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkRequestStatus status;

        /**
         * This is the work request status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(WorkRequestStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** This is the start of the time interval */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        /**
         * This is the start of the time interval
         *
         * @param timeDataStarted the value to set
         * @return this builder
         */
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }
        /** This is the end of the time interval */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the end of the time interval
         *
         * @param timeDataEnded the value to set
         * @return this builder
         */
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }
        /** This is the solr query used to filter data for purge, '*' means all */
        @com.fasterxml.jackson.annotation.JsonProperty("purgeQueryString")
        private String purgeQueryString;

        /**
         * This is the solr query used to filter data for purge, '*' means all
         *
         * @param purgeQueryString the value to set
         * @return this builder
         */
        public Builder purgeQueryString(String purgeQueryString) {
            this.purgeQueryString = purgeQueryString;
            this.__explicitlySet__.add("purgeQueryString");
            return this;
        }
        /** Thie is the type of data to be purged */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private StorageDataType dataType;

        /**
         * Thie is the type of data to be purged
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(StorageDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** This provides more detailed status if applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
        private String statusDetails;

        /**
         * This provides more detailed status if applicable
         *
         * @param statusDetails the value to set
         * @return this builder
         */
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = statusDetails;
            this.__explicitlySet__.add("statusDetails");
            return this;
        }
        /** This provides more detailed info about the work request if applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("operationDetails")
        private String operationDetails;

        /**
         * This provides more detailed info about the work request if applicable
         *
         * @param operationDetails the value to set
         * @return this builder
         */
        public Builder operationDetails(String operationDetails) {
            this.operationDetails = operationDetails;
            this.__explicitlySet__.add("operationDetails");
            return this;
        }
        /** This is the policy name if applicable (e.g. purge policy) */
        @com.fasterxml.jackson.annotation.JsonProperty("policyName")
        private String policyName;

        /**
         * This is the policy name if applicable (e.g. purge policy)
         *
         * @param policyName the value to set
         * @return this builder
         */
        public Builder policyName(String policyName) {
            this.policyName = policyName;
            this.__explicitlySet__.add("policyName");
            return this;
        }
        /** This is the purge policy ID if applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("policyId")
        private String policyId;

        /**
         * This is the purge policy ID if applicable
         *
         * @param policyId the value to set
         * @return this builder
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            this.__explicitlySet__.add("policyId");
            return this;
        }
        /** This is the data usage in bytes if applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("storageUsageInBytes")
        private Long storageUsageInBytes;

        /**
         * This is the data usage in bytes if applicable
         *
         * @param storageUsageInBytes the value to set
         * @return this builder
         */
        public Builder storageUsageInBytes(Long storageUsageInBytes) {
            this.storageUsageInBytes = storageUsageInBytes;
            this.__explicitlySet__.add("storageUsageInBytes");
            return this;
        }
        /** If true, purge child compartments data, only applicable to purge request */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        /**
         * If true, purge child compartments data, only applicable to purge request
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }
        /** This is the type of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private StorageOperationType operationType;

        /**
         * This is the type of the work request.
         *
         * @param operationType the value to set
         * @return this builder
         */
        public Builder operationType(StorageOperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /** This is the key ID for encryption key. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * This is the key ID for encryption key.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** The type of customer encryption key. It can be archival, active or all. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyType")
        private EncryptionKeyType keyType;

        /**
         * The type of customer encryption key. It can be archival, active or all.
         *
         * @param keyType the value to set
         * @return this builder
         */
        public Builder keyType(EncryptionKeyType keyType) {
            this.keyType = keyType;
            this.__explicitlySet__.add("keyType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StorageWorkRequestSummary build() {
            StorageWorkRequestSummary model =
                    new StorageWorkRequestSummary(
                            this.id,
                            this.compartmentId,
                            this.timeStarted,
                            this.timeAccepted,
                            this.timeFinished,
                            this.timeExpires,
                            this.percentComplete,
                            this.status,
                            this.timeDataStarted,
                            this.timeDataEnded,
                            this.purgeQueryString,
                            this.dataType,
                            this.statusDetails,
                            this.operationDetails,
                            this.policyName,
                            this.policyId,
                            this.storageUsageInBytes,
                            this.compartmentIdInSubtree,
                            this.operationType,
                            this.keyId,
                            this.keyType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StorageWorkRequestSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeDataStarted")) {
                this.timeDataStarted(model.getTimeDataStarted());
            }
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
            }
            if (model.wasPropertyExplicitlySet("purgeQueryString")) {
                this.purgeQueryString(model.getPurgeQueryString());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("statusDetails")) {
                this.statusDetails(model.getStatusDetails());
            }
            if (model.wasPropertyExplicitlySet("operationDetails")) {
                this.operationDetails(model.getOperationDetails());
            }
            if (model.wasPropertyExplicitlySet("policyName")) {
                this.policyName(model.getPolicyName());
            }
            if (model.wasPropertyExplicitlySet("policyId")) {
                this.policyId(model.getPolicyId());
            }
            if (model.wasPropertyExplicitlySet("storageUsageInBytes")) {
                this.storageUsageInBytes(model.getStorageUsageInBytes());
            }
            if (model.wasPropertyExplicitlySet("compartmentIdInSubtree")) {
                this.compartmentIdInSubtree(model.getCompartmentIdInSubtree());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyType")) {
                this.keyType(model.getKeyType());
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

    /** This is the OCID of the storage work Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * This is the OCID of the storage work Request.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** When the work request started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * When the work request started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** When the work request was accepted. Should match timeStarted in all cases. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * When the work request was accepted. Should match timeStarted in all cases.
     *
     * @return the value
     */
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /** When the work request finished execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * When the work request finished execution.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** When the work request will expire. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * When the work request will expire.
     *
     * @return the value
     */
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /** Percentage progress completion of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    /**
     * Percentage progress completion of the work request.
     *
     * @return the value
     */
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /** This is the work request status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final WorkRequestStatus status;

    /**
     * This is the work request status.
     *
     * @return the value
     */
    public WorkRequestStatus getStatus() {
        return status;
    }

    /** This is the start of the time interval */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    private final java.util.Date timeDataStarted;

    /**
     * This is the start of the time interval
     *
     * @return the value
     */
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }

    /** This is the end of the time interval */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the end of the time interval
     *
     * @return the value
     */
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    /** This is the solr query used to filter data for purge, '*' means all */
    @com.fasterxml.jackson.annotation.JsonProperty("purgeQueryString")
    private final String purgeQueryString;

    /**
     * This is the solr query used to filter data for purge, '*' means all
     *
     * @return the value
     */
    public String getPurgeQueryString() {
        return purgeQueryString;
    }

    /** Thie is the type of data to be purged */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final StorageDataType dataType;

    /**
     * Thie is the type of data to be purged
     *
     * @return the value
     */
    public StorageDataType getDataType() {
        return dataType;
    }

    /** This provides more detailed status if applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    private final String statusDetails;

    /**
     * This provides more detailed status if applicable
     *
     * @return the value
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /** This provides more detailed info about the work request if applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("operationDetails")
    private final String operationDetails;

    /**
     * This provides more detailed info about the work request if applicable
     *
     * @return the value
     */
    public String getOperationDetails() {
        return operationDetails;
    }

    /** This is the policy name if applicable (e.g. purge policy) */
    @com.fasterxml.jackson.annotation.JsonProperty("policyName")
    private final String policyName;

    /**
     * This is the policy name if applicable (e.g. purge policy)
     *
     * @return the value
     */
    public String getPolicyName() {
        return policyName;
    }

    /** This is the purge policy ID if applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("policyId")
    private final String policyId;

    /**
     * This is the purge policy ID if applicable
     *
     * @return the value
     */
    public String getPolicyId() {
        return policyId;
    }

    /** This is the data usage in bytes if applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsageInBytes")
    private final Long storageUsageInBytes;

    /**
     * This is the data usage in bytes if applicable
     *
     * @return the value
     */
    public Long getStorageUsageInBytes() {
        return storageUsageInBytes;
    }

    /** If true, purge child compartments data, only applicable to purge request */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    /**
     * If true, purge child compartments data, only applicable to purge request
     *
     * @return the value
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    /** This is the type of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final StorageOperationType operationType;

    /**
     * This is the type of the work request.
     *
     * @return the value
     */
    public StorageOperationType getOperationType() {
        return operationType;
    }

    /** This is the key ID for encryption key. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * This is the key ID for encryption key.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** The type of customer encryption key. It can be archival, active or all. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyType")
    private final EncryptionKeyType keyType;

    /**
     * The type of customer encryption key. It can be archival, active or all.
     *
     * @return the value
     */
    public EncryptionKeyType getKeyType() {
        return keyType;
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
        sb.append("StorageWorkRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", purgeQueryString=").append(String.valueOf(this.purgeQueryString));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", statusDetails=").append(String.valueOf(this.statusDetails));
        sb.append(", operationDetails=").append(String.valueOf(this.operationDetails));
        sb.append(", policyName=").append(String.valueOf(this.policyName));
        sb.append(", policyId=").append(String.valueOf(this.policyId));
        sb.append(", storageUsageInBytes=").append(String.valueOf(this.storageUsageInBytes));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyType=").append(String.valueOf(this.keyType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StorageWorkRequestSummary)) {
            return false;
        }

        StorageWorkRequestSummary other = (StorageWorkRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && java.util.Objects.equals(this.purgeQueryString, other.purgeQueryString)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.statusDetails, other.statusDetails)
                && java.util.Objects.equals(this.operationDetails, other.operationDetails)
                && java.util.Objects.equals(this.policyName, other.policyName)
                && java.util.Objects.equals(this.policyId, other.policyId)
                && java.util.Objects.equals(this.storageUsageInBytes, other.storageUsageInBytes)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyType, other.keyType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataStarted == null ? 43 : this.timeDataStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.purgeQueryString == null ? 43 : this.purgeQueryString.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDetails == null ? 43 : this.statusDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.operationDetails == null ? 43 : this.operationDetails.hashCode());
        result = (result * PRIME) + (this.policyName == null ? 43 : this.policyName.hashCode());
        result = (result * PRIME) + (this.policyId == null ? 43 : this.policyId.hashCode());
        result =
                (result * PRIME)
                        + (this.storageUsageInBytes == null
                                ? 43
                                : this.storageUsageInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.keyType == null ? 43 : this.keyType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
