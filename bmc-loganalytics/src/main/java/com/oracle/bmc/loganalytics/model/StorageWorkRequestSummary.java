/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the summary of a storage work request.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StorageWorkRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StorageWorkRequestSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkRequestStatus status;

        public Builder status(WorkRequestStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("purgeQueryString")
        private String purgeQueryString;

        public Builder purgeQueryString(String purgeQueryString) {
            this.purgeQueryString = purgeQueryString;
            this.__explicitlySet__.add("purgeQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private StorageDataType dataType;

        public Builder dataType(StorageDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
        private String statusDetails;

        public Builder statusDetails(String statusDetails) {
            this.statusDetails = statusDetails;
            this.__explicitlySet__.add("statusDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationDetails")
        private String operationDetails;

        public Builder operationDetails(String operationDetails) {
            this.operationDetails = operationDetails;
            this.__explicitlySet__.add("operationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyName")
        private String policyName;

        public Builder policyName(String policyName) {
            this.policyName = policyName;
            this.__explicitlySet__.add("policyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyId")
        private String policyId;

        public Builder policyId(String policyId) {
            this.policyId = policyId;
            this.__explicitlySet__.add("policyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageUsageInBytes")
        private Long storageUsageInBytes;

        public Builder storageUsageInBytes(Long storageUsageInBytes) {
            this.storageUsageInBytes = storageUsageInBytes;
            this.__explicitlySet__.add("storageUsageInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private StorageOperationType operationType;

        public Builder operationType(StorageOperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StorageWorkRequestSummary build() {
            StorageWorkRequestSummary __instance__ =
                    new StorageWorkRequestSummary(
                            id,
                            compartmentId,
                            timeStarted,
                            timeAccepted,
                            timeFinished,
                            timeExpires,
                            percentComplete,
                            status,
                            timeDataStarted,
                            timeDataEnded,
                            purgeQueryString,
                            dataType,
                            statusDetails,
                            operationDetails,
                            policyName,
                            policyId,
                            storageUsageInBytes,
                            compartmentIdInSubtree,
                            operationType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StorageWorkRequestSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .timeStarted(o.getTimeStarted())
                            .timeAccepted(o.getTimeAccepted())
                            .timeFinished(o.getTimeFinished())
                            .timeExpires(o.getTimeExpires())
                            .percentComplete(o.getPercentComplete())
                            .status(o.getStatus())
                            .timeDataStarted(o.getTimeDataStarted())
                            .timeDataEnded(o.getTimeDataEnded())
                            .purgeQueryString(o.getPurgeQueryString())
                            .dataType(o.getDataType())
                            .statusDetails(o.getStatusDetails())
                            .operationDetails(o.getOperationDetails())
                            .policyName(o.getPolicyName())
                            .policyId(o.getPolicyId())
                            .storageUsageInBytes(o.getStorageUsageInBytes())
                            .compartmentIdInSubtree(o.getCompartmentIdInSubtree())
                            .operationType(o.getOperationType());

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
     * This is the OCID of the storage work Request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * When the work request started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * When the work request was accepted. Should match timeStarted in all cases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    java.util.Date timeAccepted;

    /**
     * When the work request finished execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    /**
     * When the work request will expire.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    java.util.Date timeExpires;

    /**
     * Percentage progress completion of the work request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    Integer percentComplete;

    /**
     * This is the work request status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    WorkRequestStatus status;

    /**
     * This is the start of the time interval
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    java.util.Date timeDataStarted;

    /**
     * This is the end of the time interval
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    java.util.Date timeDataEnded;

    /**
     * This is the solr query used to filter data for purge, '*' means all
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeQueryString")
    String purgeQueryString;

    /**
     * Thie is the type of data to be purged
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    StorageDataType dataType;

    /**
     * This provides more detailed status if applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    String statusDetails;

    /**
     * This provides more detailed info about the work request if applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationDetails")
    String operationDetails;

    /**
     * This is the policy name if applicable (e.g. purge policy)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyName")
    String policyName;

    /**
     * This is the purge policy ID if applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyId")
    String policyId;

    /**
     * This is the data usage in bytes if applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsageInBytes")
    Long storageUsageInBytes;

    /**
     * If true, purge child compartments data, only applicable to purge request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    Boolean compartmentIdInSubtree;

    /**
     * This is the type of the work request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    StorageOperationType operationType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
