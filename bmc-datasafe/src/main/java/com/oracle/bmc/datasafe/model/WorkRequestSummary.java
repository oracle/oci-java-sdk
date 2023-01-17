/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a work request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WorkRequestSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationType",
        "status",
        "id",
        "compartmentId",
        "resources",
        "percentComplete",
        "timeAccepted",
        "timeStarted",
        "timeFinished"
    })
    public WorkRequestSummary(
            OperationType operationType,
            Status status,
            String id,
            String compartmentId,
            java.util.List<WorkRequestResource> resources,
            Float percentComplete,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeFinished) {
        super();
        this.operationType = operationType;
        this.status = status;
        this.id = id;
        this.compartmentId = compartmentId;
        this.resources = resources;
        this.percentComplete = percentComplete;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The asynchronous operation tracked by this work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * The asynchronous operation tracked by this work request.
         *
         * @param operationType the value to set
         * @return this builder
         */
        public Builder operationType(OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /** The current status of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current status of the work request.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The OCID of the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the work request.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment that contains the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the work request.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The resources that are affected by the work request. */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<WorkRequestResource> resources;

        /**
         * The resources that are affected by the work request.
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<WorkRequestResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /** Progress of the work request in percentage. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        /**
         * Progress of the work request in percentage.
         *
         * @param percentComplete the value to set
         * @return this builder
         */
        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * The date and time the work request was accepted, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The date and time the work request was accepted, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeAccepted the value to set
         * @return this builder
         */
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * The date and time the work request transitioned from ACCEPTED to IN_PROGRESS, in the
         * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the work request transitioned from ACCEPTED to IN_PROGRESS, in the
         * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the work request reached a terminal state, either FAILED or SUCCEEDED,
         * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the work request reached a terminal state, either FAILED or SUCCEEDED,
         * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestSummary build() {
            WorkRequestSummary model =
                    new WorkRequestSummary(
                            this.operationType,
                            this.status,
                            this.id,
                            this.compartmentId,
                            this.resources,
                            this.percentComplete,
                            this.timeAccepted,
                            this.timeStarted,
                            this.timeFinished);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestSummary model) {
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
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

    /** The asynchronous operation tracked by this work request. */
    public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
        EnableDataSafeConfiguration("ENABLE_DATA_SAFE_CONFIGURATION"),
        CreatePrivateEndpoint("CREATE_PRIVATE_ENDPOINT"),
        UpdatePrivateEndpoint("UPDATE_PRIVATE_ENDPOINT"),
        DeletePrivateEndpoint("DELETE_PRIVATE_ENDPOINT"),
        ChangePrivateEndpointCompartment("CHANGE_PRIVATE_ENDPOINT_COMPARTMENT"),
        CreateOnpremConnector("CREATE_ONPREM_CONNECTOR"),
        UpdateOnpremConnector("UPDATE_ONPREM_CONNECTOR"),
        DeleteOnpremConnector("DELETE_ONPREM_CONNECTOR"),
        UpdateOnpremConnectorWallet("UPDATE_ONPREM_CONNECTOR_WALLET"),
        ChangeOnpremConnectorCompartment("CHANGE_ONPREM_CONNECTOR_COMPARTMENT"),
        ProvisionPolicy("PROVISION_POLICY"),
        RetrievePolicy("RETRIEVE_POLICY"),
        UpdatePolicy("UPDATE_POLICY"),
        ChangePolicyCompartment("CHANGE_POLICY_COMPARTMENT"),
        CreateTargetDatabase("CREATE_TARGET_DATABASE"),
        UpdateTargetDatabase("UPDATE_TARGET_DATABASE"),
        ActivateTargetDatabase("ACTIVATE_TARGET_DATABASE"),
        DeactivateTargetDatabase("DEACTIVATE_TARGET_DATABASE"),
        DeleteTargetDatabase("DELETE_TARGET_DATABASE"),
        ChangeTargetDatabaseCompartment("CHANGE_TARGET_DATABASE_COMPARTMENT"),
        CreateUserAssessment("CREATE_USER_ASSESSMENT"),
        AssessUserAssessment("ASSESS_USER_ASSESSMENT"),
        CreateSnapshotUserAssessment("CREATE_SNAPSHOT_USER_ASSESSMENT"),
        CreateScheduleUserAssessment("CREATE_SCHEDULE_USER_ASSESSMENT"),
        CompareWithBaselineUserAssessment("COMPARE_WITH_BASELINE_USER_ASSESSMENT"),
        DeleteUserAssessment("DELETE_USER_ASSESSMENT"),
        UpdateUserAssessment("UPDATE_USER_ASSESSMENT"),
        ChangeUserAssessmentCompartment("CHANGE_USER_ASSESSMENT_COMPARTMENT"),
        SetUserAssessmentBaseline("SET_USER_ASSESSMENT_BASELINE"),
        UnsetUserAssessmentBaseline("UNSET_USER_ASSESSMENT_BASELINE"),
        GenerateUserAssessmentReport("GENERATE_USER_ASSESSMENT_REPORT"),
        CreateSecurityAssessment("CREATE_SECURITY_ASSESSMENT"),
        CreateSecurityAssessmentNow("CREATE_SECURITY_ASSESSMENT_NOW"),
        AssessSecurityAssessment("ASSESS_SECURITY_ASSESSMENT"),
        CreateSnapshotSecurityAssessment("CREATE_SNAPSHOT_SECURITY_ASSESSMENT"),
        CreateScheduleSecurityAssessment("CREATE_SCHEDULE_SECURITY_ASSESSMENT"),
        CompareWithBaselineSecurityAssessment("COMPARE_WITH_BASELINE_SECURITY_ASSESSMENT"),
        DeleteSecurityAssessment("DELETE_SECURITY_ASSESSMENT"),
        UpdateSecurityAssessment("UPDATE_SECURITY_ASSESSMENT"),
        ChangeSecurityAssessmentCompartment("CHANGE_SECURITY_ASSESSMENT_COMPARTMENT"),
        SetSecurityAssessmentBaseline("SET_SECURITY_ASSESSMENT_BASELINE"),
        UnsetSecurityAssessmentBaseline("UNSET_SECURITY_ASSESSMENT_BASELINE"),
        GenerateSecurityAssessmentReport("GENERATE_SECURITY_ASSESSMENT_REPORT"),
        CalculateVolume("CALCULATE_VOLUME"),
        CalculateCollectedVolume("CALCULATE_COLLECTED_VOLUME"),
        AuditTrail("AUDIT_TRAIL"),
        DeleteAuditTrail("DELETE_AUDIT_TRAIL"),
        DiscoverAuditTrails("DISCOVER_AUDIT_TRAILS"),
        UpdateAuditTrail("UPDATE_AUDIT_TRAIL"),
        UpdateAuditProfile("UPDATE_AUDIT_PROFILE"),
        AuditChangeCompartment("AUDIT_CHANGE_COMPARTMENT"),
        CreateReportDefinition("CREATE_REPORT_DEFINITION"),
        UpdateReportDefinition("UPDATE_REPORT_DEFINITION"),
        ChangeReportDefinitionCompartment("CHANGE_REPORT_DEFINITION_COMPARTMENT"),
        DeleteReportDefinition("DELETE_REPORT_DEFINITION"),
        GenerateReport("GENERATE_REPORT"),
        ChangeReportCompartment("CHANGE_REPORT_COMPARTMENT"),
        DeleteArchiveRetrieval("DELETE_ARCHIVE_RETRIEVAL"),
        CreateArchiveRetrieval("CREATE_ARCHIVE_RETRIEVAL"),
        UpdateArchiveRetrieval("UPDATE_ARCHIVE_RETRIEVAL"),
        ChangeArchiveRetrievalCompartment("CHANGE_ARCHIVE_RETRIEVAL_COMPARTMENT"),
        UpdateAlert("UPDATE_ALERT"),
        TargetAlertPolicyAssociation("TARGET_ALERT_POLICY_ASSOCIATION"),
        CreateSensitiveDataModel("CREATE_SENSITIVE_DATA_MODEL"),
        UpdateSensitiveDataModel("UPDATE_SENSITIVE_DATA_MODEL"),
        DeleteSensitiveDataModel("DELETE_SENSITIVE_DATA_MODEL"),
        UploadSensitiveDataModel("UPLOAD_SENSITIVE_DATA_MODEL"),
        GenerateSensitiveDataModelForDownload("GENERATE_SENSITIVE_DATA_MODEL_FOR_DOWNLOAD"),
        CreateSensitiveColumn("CREATE_SENSITIVE_COLUMN"),
        UpdateSensitiveColumn("UPDATE_SENSITIVE_COLUMN"),
        PatchSensitiveColumns("PATCH_SENSITIVE_COLUMNS"),
        CreateDiscoveryJob("CREATE_DISCOVERY_JOB"),
        DeleteDiscoveryJob("DELETE_DISCOVERY_JOB"),
        PatchDiscoveryJobResult("PATCH_DISCOVERY_JOB_RESULT"),
        ApplyDiscoveryJobResult("APPLY_DISCOVERY_JOB_RESULT"),
        GenerateDiscoveryReport("GENERATE_DISCOVERY_REPORT"),
        CreateSensitiveType("CREATE_SENSITIVE_TYPE"),
        UpdateSensitiveType("UPDATE_SENSITIVE_TYPE"),
        CreateMaskingPolicy("CREATE_MASKING_POLICY"),
        UpdateMaskingPolicy("UPDATE_MASKING_POLICY"),
        DeleteMaskingPolicy("DELETE_MASKING_POLICY"),
        UploadMaskingPolicy("UPLOAD_MASKING_POLICY"),
        GenerateMaskingPolicyForDownload("GENERATE_MASKING_POLICY_FOR_DOWNLOAD"),
        CreateMaskingColumn("CREATE_MASKING_COLUMN"),
        UpdateMaskingColumn("UPDATE_MASKING_COLUMN"),
        PatchMaskingColumns("PATCH_MASKING_COLUMNS"),
        GenerateMaskingReport("GENERATE_MASKING_REPORT"),
        CreateLibraryMaskingFormat("CREATE_LIBRARY_MASKING_FORMAT"),
        UpdateLibraryMaskingFormat("UPDATE_LIBRARY_MASKING_FORMAT"),
        AddColumnsFromSdm("ADD_COLUMNS_FROM_SDM"),
        MaskingJob("MASKING_JOB"),
        CreateSchedule("CREATE_SCHEDULE"),
        RemoveScheduleReport("REMOVE_SCHEDULE_REPORT"),
        UpdateAllAlert("UPDATE_ALL_ALERT"),
        PatchTargetAlertPolicyAssociation("PATCH_TARGET_ALERT_POLICY_ASSOCIATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationType.class);

        private final String value;
        private static java.util.Map<String, OperationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationType v : OperationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The asynchronous operation tracked by this work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * The asynchronous operation tracked by this work request.
     *
     * @return the value
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /** The current status of the work request. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),
        Suspending("SUSPENDING"),
        Suspended("SUSPENDED"),

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
    /** The current status of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status of the work request.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The OCID of the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the work request.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment that contains the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the work request.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The resources that are affected by the work request. */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<WorkRequestResource> resources;

    /**
     * The resources that are affected by the work request.
     *
     * @return the value
     */
    public java.util.List<WorkRequestResource> getResources() {
        return resources;
    }

    /** Progress of the work request in percentage. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Float percentComplete;

    /**
     * Progress of the work request in percentage.
     *
     * @return the value
     */
    public Float getPercentComplete() {
        return percentComplete;
    }

    /**
     * The date and time the work request was accepted, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The date and time the work request was accepted, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * The date and time the work request transitioned from ACCEPTED to IN_PROGRESS, in the format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the work request transitioned from ACCEPTED to IN_PROGRESS, in the format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the work request reached a terminal state, either FAILED or SUCCEEDED, in
     * the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the work request reached a terminal state, either FAILED or SUCCEEDED, in
     * the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
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
        sb.append("WorkRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("operationType=").append(String.valueOf(this.operationType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestSummary)) {
            return false;
        }

        WorkRequestSummary other = (WorkRequestSummary) o;
        return java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
