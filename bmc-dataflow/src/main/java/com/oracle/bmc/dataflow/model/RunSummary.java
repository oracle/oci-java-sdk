/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A summary of the run. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RunSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "applicationId",
        "compartmentId",
        "dataReadInBytes",
        "dataWrittenInBytes",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "language",
        "lifecycleDetails",
        "lifecycleState",
        "opcRequestId",
        "ownerPrincipalId",
        "ownerUserName",
        "poolId",
        "runDurationInMilliseconds",
        "totalOCpu",
        "timeCreated",
        "timeUpdated",
        "type"
    })
    public RunSummary(
            String applicationId,
            String compartmentId,
            Long dataReadInBytes,
            Long dataWrittenInBytes,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            ApplicationLanguage language,
            String lifecycleDetails,
            RunLifecycleState lifecycleState,
            String opcRequestId,
            String ownerPrincipalId,
            String ownerUserName,
            String poolId,
            Long runDurationInMilliseconds,
            Integer totalOCpu,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ApplicationType type) {
        super();
        this.applicationId = applicationId;
        this.compartmentId = compartmentId;
        this.dataReadInBytes = dataReadInBytes;
        this.dataWrittenInBytes = dataWrittenInBytes;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.language = language;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.opcRequestId = opcRequestId;
        this.ownerPrincipalId = ownerPrincipalId;
        this.ownerUserName = ownerUserName;
        this.poolId = poolId;
        this.runDurationInMilliseconds = runDurationInMilliseconds;
        this.totalOCpu = totalOCpu;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The application ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        /**
         * The application ID.
         *
         * @param applicationId the value to set
         * @return this builder
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }
        /** The OCID of a compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of a compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The data read by the run in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataReadInBytes")
        private Long dataReadInBytes;

        /**
         * The data read by the run in bytes.
         *
         * @param dataReadInBytes the value to set
         * @return this builder
         */
        public Builder dataReadInBytes(Long dataReadInBytes) {
            this.dataReadInBytes = dataReadInBytes;
            this.__explicitlySet__.add("dataReadInBytes");
            return this;
        }
        /** The data written by the run in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataWrittenInBytes")
        private Long dataWrittenInBytes;

        /**
         * The data written by the run in bytes.
         *
         * @param dataWrittenInBytes the value to set
         * @return this builder
         */
        public Builder dataWrittenInBytes(Long dataWrittenInBytes) {
            this.dataWrittenInBytes = dataWrittenInBytes;
            this.__explicitlySet__.add("dataWrittenInBytes");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** A user-friendly name. This name is not necessarily unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. This name is not necessarily unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /** The ID of a run. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID of a run.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The Spark language. */
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private ApplicationLanguage language;

        /**
         * The Spark language.
         *
         * @param language the value to set
         * @return this builder
         */
        public Builder language(ApplicationLanguage language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }
        /** The detailed messages about the lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * The detailed messages about the lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The current state of this run. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private RunLifecycleState lifecycleState;

        /**
         * The current state of this run.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(RunLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
        private String opcRequestId;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            this.__explicitlySet__.add("opcRequestId");
            return this;
        }
        /** The OCID of the user who created the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
        private String ownerPrincipalId;

        /**
         * The OCID of the user who created the resource.
         *
         * @param ownerPrincipalId the value to set
         * @return this builder
         */
        public Builder ownerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            this.__explicitlySet__.add("ownerPrincipalId");
            return this;
        }
        /**
         * The username of the user who created the resource. If the username of the owner does not
         * exist, {@code null} will be returned and the caller should refer to the ownerPrincipalId
         * value instead.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ownerUserName")
        private String ownerUserName;

        /**
         * The username of the user who created the resource. If the username of the owner does not
         * exist, {@code null} will be returned and the caller should refer to the ownerPrincipalId
         * value instead.
         *
         * @param ownerUserName the value to set
         * @return this builder
         */
        public Builder ownerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
            this.__explicitlySet__.add("ownerUserName");
            return this;
        }
        /** The OCID of a pool. Unique Id to indentify a dataflow pool resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("poolId")
        private String poolId;

        /**
         * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
         *
         * @param poolId the value to set
         * @return this builder
         */
        public Builder poolId(String poolId) {
            this.poolId = poolId;
            this.__explicitlySet__.add("poolId");
            return this;
        }
        /** The duration of the run in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("runDurationInMilliseconds")
        private Long runDurationInMilliseconds;

        /**
         * The duration of the run in milliseconds.
         *
         * @param runDurationInMilliseconds the value to set
         * @return this builder
         */
        public Builder runDurationInMilliseconds(Long runDurationInMilliseconds) {
            this.runDurationInMilliseconds = runDurationInMilliseconds;
            this.__explicitlySet__.add("runDurationInMilliseconds");
            return this;
        }
        /** The total number of oCPU requested by the run. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalOCpu")
        private Integer totalOCpu;

        /**
         * The total number of oCPU requested by the run.
         *
         * @param totalOCpu the value to set
         * @return this builder
         */
        public Builder totalOCpu(Integer totalOCpu) {
            this.totalOCpu = totalOCpu;
            this.__explicitlySet__.add("totalOCpu");
            return this;
        }
        /**
         * The date and time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-04-03T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-04-03T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The Spark application processing type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private ApplicationType type;

        /**
         * The Spark application processing type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(ApplicationType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunSummary build() {
            RunSummary model =
                    new RunSummary(
                            this.applicationId,
                            this.compartmentId,
                            this.dataReadInBytes,
                            this.dataWrittenInBytes,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.language,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.opcRequestId,
                            this.ownerPrincipalId,
                            this.ownerUserName,
                            this.poolId,
                            this.runDurationInMilliseconds,
                            this.totalOCpu,
                            this.timeCreated,
                            this.timeUpdated,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunSummary model) {
            if (model.wasPropertyExplicitlySet("applicationId")) {
                this.applicationId(model.getApplicationId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dataReadInBytes")) {
                this.dataReadInBytes(model.getDataReadInBytes());
            }
            if (model.wasPropertyExplicitlySet("dataWrittenInBytes")) {
                this.dataWrittenInBytes(model.getDataWrittenInBytes());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("language")) {
                this.language(model.getLanguage());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("opcRequestId")) {
                this.opcRequestId(model.getOpcRequestId());
            }
            if (model.wasPropertyExplicitlySet("ownerPrincipalId")) {
                this.ownerPrincipalId(model.getOwnerPrincipalId());
            }
            if (model.wasPropertyExplicitlySet("ownerUserName")) {
                this.ownerUserName(model.getOwnerUserName());
            }
            if (model.wasPropertyExplicitlySet("poolId")) {
                this.poolId(model.getPoolId());
            }
            if (model.wasPropertyExplicitlySet("runDurationInMilliseconds")) {
                this.runDurationInMilliseconds(model.getRunDurationInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("totalOCpu")) {
                this.totalOCpu(model.getTotalOCpu());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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

    /** The application ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    private final String applicationId;

    /**
     * The application ID.
     *
     * @return the value
     */
    public String getApplicationId() {
        return applicationId;
    }

    /** The OCID of a compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of a compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The data read by the run in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataReadInBytes")
    private final Long dataReadInBytes;

    /**
     * The data read by the run in bytes.
     *
     * @return the value
     */
    public Long getDataReadInBytes() {
        return dataReadInBytes;
    }

    /** The data written by the run in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataWrittenInBytes")
    private final Long dataWrittenInBytes;

    /**
     * The data written by the run in bytes.
     *
     * @return the value
     */
    public Long getDataWrittenInBytes() {
        return dataWrittenInBytes;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** A user-friendly name. This name is not necessarily unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. This name is not necessarily unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /** The ID of a run. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID of a run.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The Spark language. */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final ApplicationLanguage language;

    /**
     * The Spark language.
     *
     * @return the value
     */
    public ApplicationLanguage getLanguage() {
        return language;
    }

    /** The detailed messages about the lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * The detailed messages about the lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The current state of this run. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final RunLifecycleState lifecycleState;

    /**
     * The current state of this run.
     *
     * @return the value
     */
    public RunLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    private final String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The OCID of the user who created the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
    private final String ownerPrincipalId;

    /**
     * The OCID of the user who created the resource.
     *
     * @return the value
     */
    public String getOwnerPrincipalId() {
        return ownerPrincipalId;
    }

    /**
     * The username of the user who created the resource. If the username of the owner does not
     * exist, {@code null} will be returned and the caller should refer to the ownerPrincipalId
     * value instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ownerUserName")
    private final String ownerUserName;

    /**
     * The username of the user who created the resource. If the username of the owner does not
     * exist, {@code null} will be returned and the caller should refer to the ownerPrincipalId
     * value instead.
     *
     * @return the value
     */
    public String getOwnerUserName() {
        return ownerUserName;
    }

    /** The OCID of a pool. Unique Id to indentify a dataflow pool resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("poolId")
    private final String poolId;

    /**
     * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
     *
     * @return the value
     */
    public String getPoolId() {
        return poolId;
    }

    /** The duration of the run in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("runDurationInMilliseconds")
    private final Long runDurationInMilliseconds;

    /**
     * The duration of the run in milliseconds.
     *
     * @return the value
     */
    public Long getRunDurationInMilliseconds() {
        return runDurationInMilliseconds;
    }

    /** The total number of oCPU requested by the run. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalOCpu")
    private final Integer totalOCpu;

    /**
     * The total number of oCPU requested by the run.
     *
     * @return the value
     */
    public Integer getTotalOCpu() {
        return totalOCpu;
    }

    /**
     * The date and time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The Spark application processing type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final ApplicationType type;

    /**
     * The Spark application processing type.
     *
     * @return the value
     */
    public ApplicationType getType() {
        return type;
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
        sb.append("RunSummary(");
        sb.append("super=").append(super.toString());
        sb.append("applicationId=").append(String.valueOf(this.applicationId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dataReadInBytes=").append(String.valueOf(this.dataReadInBytes));
        sb.append(", dataWrittenInBytes=").append(String.valueOf(this.dataWrittenInBytes));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(", ownerPrincipalId=").append(String.valueOf(this.ownerPrincipalId));
        sb.append(", ownerUserName=").append(String.valueOf(this.ownerUserName));
        sb.append(", poolId=").append(String.valueOf(this.poolId));
        sb.append(", runDurationInMilliseconds=")
                .append(String.valueOf(this.runDurationInMilliseconds));
        sb.append(", totalOCpu=").append(String.valueOf(this.totalOCpu));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunSummary)) {
            return false;
        }

        RunSummary other = (RunSummary) o;
        return java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dataReadInBytes, other.dataReadInBytes)
                && java.util.Objects.equals(this.dataWrittenInBytes, other.dataWrittenInBytes)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.language, other.language)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ownerPrincipalId, other.ownerPrincipalId)
                && java.util.Objects.equals(this.ownerUserName, other.ownerUserName)
                && java.util.Objects.equals(this.poolId, other.poolId)
                && java.util.Objects.equals(
                        this.runDurationInMilliseconds, other.runDurationInMilliseconds)
                && java.util.Objects.equals(this.totalOCpu, other.totalOCpu)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataReadInBytes == null ? 43 : this.dataReadInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.dataWrittenInBytes == null
                                ? 43
                                : this.dataWrittenInBytes.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerPrincipalId == null ? 43 : this.ownerPrincipalId.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerUserName == null ? 43 : this.ownerUserName.hashCode());
        result = (result * PRIME) + (this.poolId == null ? 43 : this.poolId.hashCode());
        result =
                (result * PRIME)
                        + (this.runDurationInMilliseconds == null
                                ? 43
                                : this.runDurationInMilliseconds.hashCode());
        result = (result * PRIME) + (this.totalOCpu == null ? 43 : this.totalOCpu.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
