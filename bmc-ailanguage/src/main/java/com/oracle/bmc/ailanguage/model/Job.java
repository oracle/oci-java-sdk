/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Job details which contain input document details on which prediction need to run, features (which and all language services ) need to run and where to store results
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Job.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Job extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "inputLocation",
        "inputConfiguration",
        "modelMetadataDetails",
        "compartmentId",
        "lifecycleState",
        "lifecycleDetails",
        "percentComplete",
        "totalDocuments",
        "pendingDocuments",
        "completedDocuments",
        "failedDocuments",
        "warningsCount",
        "outputLocation",
        "ttlInDays",
        "createdBy",
        "timeAccepted",
        "timeStarted",
        "timeCompleted"
    })
    public Job(
            String id,
            String displayName,
            String description,
            InputLocation inputLocation,
            InputConfiguration inputConfiguration,
            java.util.List<ModelMetadataDetails> modelMetadataDetails,
            String compartmentId,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Integer percentComplete,
            Integer totalDocuments,
            Integer pendingDocuments,
            Integer completedDocuments,
            Integer failedDocuments,
            Integer warningsCount,
            ObjectPrefixOutputLocation outputLocation,
            Integer ttlInDays,
            String createdBy,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeCompleted) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.inputLocation = inputLocation;
        this.inputConfiguration = inputConfiguration;
        this.modelMetadataDetails = modelMetadataDetails;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.percentComplete = percentComplete;
        this.totalDocuments = totalDocuments;
        this.pendingDocuments = pendingDocuments;
        this.completedDocuments = completedDocuments;
        this.failedDocuments = failedDocuments;
        this.warningsCount = warningsCount;
        this.outputLocation = outputLocation;
        this.ttlInDays = ttlInDays;
        this.createdBy = createdBy;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeCompleted = timeCompleted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly display name for the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the job.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A short description of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the job.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
        private InputLocation inputLocation;

        public Builder inputLocation(InputLocation inputLocation) {
            this.inputLocation = inputLocation;
            this.__explicitlySet__.add("inputLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputConfiguration")
        private InputConfiguration inputConfiguration;

        public Builder inputConfiguration(InputConfiguration inputConfiguration) {
            this.inputConfiguration = inputConfiguration;
            this.__explicitlySet__.add("inputConfiguration");
            return this;
        }
        /**
         * training model details
         * For this release only one model is allowed to be input here.
         * One of the three modelType, ModelId, endpointId should be given other wise error will be thrown from API
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelMetadataDetails")
        private java.util.List<ModelMetadataDetails> modelMetadataDetails;

        /**
         * training model details
         * For this release only one model is allowed to be input here.
         * One of the three modelType, ModelId, endpointId should be given other wise error will be thrown from API
         *
         * @param modelMetadataDetails the value to set
         * @return this builder
         **/
        public Builder modelMetadataDetails(
                java.util.List<ModelMetadataDetails> modelMetadataDetails) {
            this.modelMetadataDetails = modelMetadataDetails;
            this.__explicitlySet__.add("modelMetadataDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The current state of the Job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Job.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * How much progress the operation has made, vs the total amount of work that must be performed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        /**
         * How much progress the operation has made, vs the total amount of work that must be performed.
         * @param percentComplete the value to set
         * @return this builder
         **/
        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * Total number of documents given as input for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalDocuments")
        private Integer totalDocuments;

        /**
         * Total number of documents given as input for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
         * @param totalDocuments the value to set
         * @return this builder
         **/
        public Builder totalDocuments(Integer totalDocuments) {
            this.totalDocuments = totalDocuments;
            this.__explicitlySet__.add("totalDocuments");
            return this;
        }
        /**
         * Number of documents still to process. For CSV this signifies number of rows and for TXT this signifies number of files.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pendingDocuments")
        private Integer pendingDocuments;

        /**
         * Number of documents still to process. For CSV this signifies number of rows and for TXT this signifies number of files.
         * @param pendingDocuments the value to set
         * @return this builder
         **/
        public Builder pendingDocuments(Integer pendingDocuments) {
            this.pendingDocuments = pendingDocuments;
            this.__explicitlySet__.add("pendingDocuments");
            return this;
        }
        /**
         * Number of documents processed for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("completedDocuments")
        private Integer completedDocuments;

        /**
         * Number of documents processed for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
         * @param completedDocuments the value to set
         * @return this builder
         **/
        public Builder completedDocuments(Integer completedDocuments) {
            this.completedDocuments = completedDocuments;
            this.__explicitlySet__.add("completedDocuments");
            return this;
        }
        /**
         * Number of documents failed for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failedDocuments")
        private Integer failedDocuments;

        /**
         * Number of documents failed for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
         * @param failedDocuments the value to set
         * @return this builder
         **/
        public Builder failedDocuments(Integer failedDocuments) {
            this.failedDocuments = failedDocuments;
            this.__explicitlySet__.add("failedDocuments");
            return this;
        }
        /**
         * warnings count
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("warningsCount")
        private Integer warningsCount;

        /**
         * warnings count
         * @param warningsCount the value to set
         * @return this builder
         **/
        public Builder warningsCount(Integer warningsCount) {
            this.warningsCount = warningsCount;
            this.__explicitlySet__.add("warningsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
        private ObjectPrefixOutputLocation outputLocation;

        public Builder outputLocation(ObjectPrefixOutputLocation outputLocation) {
            this.outputLocation = outputLocation;
            this.__explicitlySet__.add("outputLocation");
            return this;
        }
        /**
         * Time to live duration in days for Job. Job will be available till max 90 days.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ttlInDays")
        private Integer ttlInDays;

        /**
         * Time to live duration in days for Job. Job will be available till max 90 days.
         * @param ttlInDays the value to set
         * @return this builder
         **/
        public Builder ttlInDays(Integer ttlInDays) {
            this.ttlInDays = ttlInDays;
            this.__explicitlySet__.add("ttlInDays");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job.
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * Job accepted time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * Job accepted time.
         * @param timeAccepted the value to set
         * @return this builder
         **/
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * Job started time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Job started time.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Job finished time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * Job finished time.
         * @param timeCompleted the value to set
         * @return this builder
         **/
        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Job build() {
            Job model =
                    new Job(
                            this.id,
                            this.displayName,
                            this.description,
                            this.inputLocation,
                            this.inputConfiguration,
                            this.modelMetadataDetails,
                            this.compartmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.percentComplete,
                            this.totalDocuments,
                            this.pendingDocuments,
                            this.completedDocuments,
                            this.failedDocuments,
                            this.warningsCount,
                            this.outputLocation,
                            this.ttlInDays,
                            this.createdBy,
                            this.timeAccepted,
                            this.timeStarted,
                            this.timeCompleted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Job model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("inputLocation")) {
                this.inputLocation(model.getInputLocation());
            }
            if (model.wasPropertyExplicitlySet("inputConfiguration")) {
                this.inputConfiguration(model.getInputConfiguration());
            }
            if (model.wasPropertyExplicitlySet("modelMetadataDetails")) {
                this.modelMetadataDetails(model.getModelMetadataDetails());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("totalDocuments")) {
                this.totalDocuments(model.getTotalDocuments());
            }
            if (model.wasPropertyExplicitlySet("pendingDocuments")) {
                this.pendingDocuments(model.getPendingDocuments());
            }
            if (model.wasPropertyExplicitlySet("completedDocuments")) {
                this.completedDocuments(model.getCompletedDocuments());
            }
            if (model.wasPropertyExplicitlySet("failedDocuments")) {
                this.failedDocuments(model.getFailedDocuments());
            }
            if (model.wasPropertyExplicitlySet("warningsCount")) {
                this.warningsCount(model.getWarningsCount());
            }
            if (model.wasPropertyExplicitlySet("outputLocation")) {
                this.outputLocation(model.getOutputLocation());
            }
            if (model.wasPropertyExplicitlySet("ttlInDays")) {
                this.ttlInDays(model.getTtlInDays());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly display name for the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the job.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A short description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the job.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputLocation")
    private final InputLocation inputLocation;

    public InputLocation getInputLocation() {
        return inputLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputConfiguration")
    private final InputConfiguration inputConfiguration;

    public InputConfiguration getInputConfiguration() {
        return inputConfiguration;
    }

    /**
     * training model details
     * For this release only one model is allowed to be input here.
     * One of the three modelType, ModelId, endpointId should be given other wise error will be thrown from API
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelMetadataDetails")
    private final java.util.List<ModelMetadataDetails> modelMetadataDetails;

    /**
     * training model details
     * For this release only one model is allowed to be input here.
     * One of the three modelType, ModelId, endpointId should be given other wise error will be thrown from API
     *
     * @return the value
     **/
    public java.util.List<ModelMetadataDetails> getModelMetadataDetails() {
        return modelMetadataDetails;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The current state of the Job.
     **/
    public enum LifecycleState {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Job.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * How much progress the operation has made, vs the total amount of work that must be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    /**
     * How much progress the operation has made, vs the total amount of work that must be performed.
     * @return the value
     **/
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /**
     * Total number of documents given as input for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalDocuments")
    private final Integer totalDocuments;

    /**
     * Total number of documents given as input for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
     * @return the value
     **/
    public Integer getTotalDocuments() {
        return totalDocuments;
    }

    /**
     * Number of documents still to process. For CSV this signifies number of rows and for TXT this signifies number of files.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pendingDocuments")
    private final Integer pendingDocuments;

    /**
     * Number of documents still to process. For CSV this signifies number of rows and for TXT this signifies number of files.
     * @return the value
     **/
    public Integer getPendingDocuments() {
        return pendingDocuments;
    }

    /**
     * Number of documents processed for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("completedDocuments")
    private final Integer completedDocuments;

    /**
     * Number of documents processed for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
     * @return the value
     **/
    public Integer getCompletedDocuments() {
        return completedDocuments;
    }

    /**
     * Number of documents failed for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedDocuments")
    private final Integer failedDocuments;

    /**
     * Number of documents failed for prediction. For CSV this signifies number of rows and for TXT this signifies number of files.
     * @return the value
     **/
    public Integer getFailedDocuments() {
        return failedDocuments;
    }

    /**
     * warnings count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningsCount")
    private final Integer warningsCount;

    /**
     * warnings count
     * @return the value
     **/
    public Integer getWarningsCount() {
        return warningsCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputLocation")
    private final ObjectPrefixOutputLocation outputLocation;

    public ObjectPrefixOutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * Time to live duration in days for Job. Job will be available till max 90 days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttlInDays")
    private final Integer ttlInDays;

    /**
     * Time to live duration in days for Job. Job will be available till max 90 days.
     * @return the value
     **/
    public Integer getTtlInDays() {
        return ttlInDays;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job.
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Job accepted time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * Job accepted time.
     * @return the value
     **/
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * Job started time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Job started time.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Job finished time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * Job finished time.
     * @return the value
     **/
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
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
        sb.append("Job(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", inputLocation=").append(String.valueOf(this.inputLocation));
        sb.append(", inputConfiguration=").append(String.valueOf(this.inputConfiguration));
        sb.append(", modelMetadataDetails=").append(String.valueOf(this.modelMetadataDetails));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", totalDocuments=").append(String.valueOf(this.totalDocuments));
        sb.append(", pendingDocuments=").append(String.valueOf(this.pendingDocuments));
        sb.append(", completedDocuments=").append(String.valueOf(this.completedDocuments));
        sb.append(", failedDocuments=").append(String.valueOf(this.failedDocuments));
        sb.append(", warningsCount=").append(String.valueOf(this.warningsCount));
        sb.append(", outputLocation=").append(String.valueOf(this.outputLocation));
        sb.append(", ttlInDays=").append(String.valueOf(this.ttlInDays));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Job)) {
            return false;
        }

        Job other = (Job) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.inputLocation, other.inputLocation)
                && java.util.Objects.equals(this.inputConfiguration, other.inputConfiguration)
                && java.util.Objects.equals(this.modelMetadataDetails, other.modelMetadataDetails)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.totalDocuments, other.totalDocuments)
                && java.util.Objects.equals(this.pendingDocuments, other.pendingDocuments)
                && java.util.Objects.equals(this.completedDocuments, other.completedDocuments)
                && java.util.Objects.equals(this.failedDocuments, other.failedDocuments)
                && java.util.Objects.equals(this.warningsCount, other.warningsCount)
                && java.util.Objects.equals(this.outputLocation, other.outputLocation)
                && java.util.Objects.equals(this.ttlInDays, other.ttlInDays)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.inputLocation == null ? 43 : this.inputLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.inputConfiguration == null
                                ? 43
                                : this.inputConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.modelMetadataDetails == null
                                ? 43
                                : this.modelMetadataDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result =
                (result * PRIME)
                        + (this.totalDocuments == null ? 43 : this.totalDocuments.hashCode());
        result =
                (result * PRIME)
                        + (this.pendingDocuments == null ? 43 : this.pendingDocuments.hashCode());
        result =
                (result * PRIME)
                        + (this.completedDocuments == null
                                ? 43
                                : this.completedDocuments.hashCode());
        result =
                (result * PRIME)
                        + (this.failedDocuments == null ? 43 : this.failedDocuments.hashCode());
        result =
                (result * PRIME)
                        + (this.warningsCount == null ? 43 : this.warningsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.outputLocation == null ? 43 : this.outputLocation.hashCode());
        result = (result * PRIME) + (this.ttlInDays == null ? 43 : this.ttlInDays.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
