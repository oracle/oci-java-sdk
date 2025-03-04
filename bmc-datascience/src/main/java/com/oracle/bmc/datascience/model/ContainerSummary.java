/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Summary representation of a container <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ContainerSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "containerName",
        "displayName",
        "familyName",
        "description",
        "isLatest",
        "targetWorkloads",
        "usages",
        "tag",
        "lifecycleState",
        "workloadConfigurationDetailsList",
        "tagConfigurationList",
        "freeformTags",
        "definedTags"
    })
    public ContainerSummary(
            String containerName,
            String displayName,
            String familyName,
            String description,
            Boolean isLatest,
            java.util.List<TargetWorkloads> targetWorkloads,
            java.util.List<Usages> usages,
            String tag,
            ContainerVersionLifecycleState lifecycleState,
            java.util.List<WorkloadConfigurationDetails> workloadConfigurationDetailsList,
            java.util.List<TagConfiguration> tagConfigurationList,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.containerName = containerName;
        this.displayName = displayName;
        this.familyName = familyName;
        this.description = description;
        this.isLatest = isLatest;
        this.targetWorkloads = targetWorkloads;
        this.usages = usages;
        this.tag = tag;
        this.lifecycleState = lifecycleState;
        this.workloadConfigurationDetailsList = workloadConfigurationDetailsList;
        this.tagConfigurationList = tagConfigurationList;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the container. This can be same for different tags */
        @com.fasterxml.jackson.annotation.JsonProperty("containerName")
        private String containerName;

        /**
         * The name of the container. This can be same for different tags
         *
         * @param containerName the value to set
         * @return this builder
         */
        public Builder containerName(String containerName) {
            this.containerName = containerName;
            this.__explicitlySet__.add("containerName");
            return this;
        }
        /** The display name of the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the container.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The family name of the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("familyName")
        private String familyName;

        /**
         * The family name of the container.
         *
         * @param familyName the value to set
         * @return this builder
         */
        public Builder familyName(String familyName) {
            this.familyName = familyName;
            this.__explicitlySet__.add("familyName");
            return this;
        }
        /** Description of the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the container.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The latest tag of the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLatest")
        private Boolean isLatest;

        /**
         * The latest tag of the container.
         *
         * @param isLatest the value to set
         * @return this builder
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            this.__explicitlySet__.add("isLatest");
            return this;
        }
        /**
         * The list of target workload. This Container can be used with given data science
         * resources.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetWorkloads")
        private java.util.List<TargetWorkloads> targetWorkloads;

        /**
         * The list of target workload. This Container can be used with given data science
         * resources.
         *
         * @param targetWorkloads the value to set
         * @return this builder
         */
        public Builder targetWorkloads(java.util.List<TargetWorkloads> targetWorkloads) {
            this.targetWorkloads = targetWorkloads;
            this.__explicitlySet__.add("targetWorkloads");
            return this;
        }
        /** The list of usages of this container. This Container can be used for given use-cases. */
        @com.fasterxml.jackson.annotation.JsonProperty("usages")
        private java.util.List<Usages> usages;

        /**
         * The list of usages of this container. This Container can be used for given use-cases.
         *
         * @param usages the value to set
         * @return this builder
         */
        public Builder usages(java.util.List<Usages> usages) {
            this.usages = usages;
            this.__explicitlySet__.add("usages");
            return this;
        }
        /** Container Tag. */
        @com.fasterxml.jackson.annotation.JsonProperty("tag")
        private String tag;

        /**
         * Container Tag.
         *
         * @param tag the value to set
         * @return this builder
         */
        public Builder tag(String tag) {
            this.tag = tag;
            this.__explicitlySet__.add("tag");
            return this;
        }
        /** Container Version LifecycleState. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ContainerVersionLifecycleState lifecycleState;

        /**
         * Container Version LifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ContainerVersionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** workload configuration of the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("workloadConfigurationDetailsList")
        private java.util.List<WorkloadConfigurationDetails> workloadConfigurationDetailsList;

        /**
         * workload configuration of the container.
         *
         * @param workloadConfigurationDetailsList the value to set
         * @return this builder
         */
        public Builder workloadConfigurationDetailsList(
                java.util.List<WorkloadConfigurationDetails> workloadConfigurationDetailsList) {
            this.workloadConfigurationDetailsList = workloadConfigurationDetailsList;
            this.__explicitlySet__.add("workloadConfigurationDetailsList");
            return this;
        }
        /** An array of defined metadata details for the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagConfigurationList")
        private java.util.List<TagConfiguration> tagConfigurationList;

        /**
         * An array of defined metadata details for the model.
         *
         * @param tagConfigurationList the value to set
         * @return this builder
         */
        public Builder tagConfigurationList(java.util.List<TagConfiguration> tagConfigurationList) {
            this.tagConfigurationList = tagConfigurationList;
            this.__explicitlySet__.add("tagConfigurationList");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
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
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerSummary build() {
            ContainerSummary model =
                    new ContainerSummary(
                            this.containerName,
                            this.displayName,
                            this.familyName,
                            this.description,
                            this.isLatest,
                            this.targetWorkloads,
                            this.usages,
                            this.tag,
                            this.lifecycleState,
                            this.workloadConfigurationDetailsList,
                            this.tagConfigurationList,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerSummary model) {
            if (model.wasPropertyExplicitlySet("containerName")) {
                this.containerName(model.getContainerName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("familyName")) {
                this.familyName(model.getFamilyName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isLatest")) {
                this.isLatest(model.getIsLatest());
            }
            if (model.wasPropertyExplicitlySet("targetWorkloads")) {
                this.targetWorkloads(model.getTargetWorkloads());
            }
            if (model.wasPropertyExplicitlySet("usages")) {
                this.usages(model.getUsages());
            }
            if (model.wasPropertyExplicitlySet("tag")) {
                this.tag(model.getTag());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("workloadConfigurationDetailsList")) {
                this.workloadConfigurationDetailsList(model.getWorkloadConfigurationDetailsList());
            }
            if (model.wasPropertyExplicitlySet("tagConfigurationList")) {
                this.tagConfigurationList(model.getTagConfigurationList());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The name of the container. This can be same for different tags */
    @com.fasterxml.jackson.annotation.JsonProperty("containerName")
    private final String containerName;

    /**
     * The name of the container. This can be same for different tags
     *
     * @return the value
     */
    public String getContainerName() {
        return containerName;
    }

    /** The display name of the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the container.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The family name of the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("familyName")
    private final String familyName;

    /**
     * The family name of the container.
     *
     * @return the value
     */
    public String getFamilyName() {
        return familyName;
    }

    /** Description of the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the container.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The latest tag of the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLatest")
    private final Boolean isLatest;

    /**
     * The latest tag of the container.
     *
     * @return the value
     */
    public Boolean getIsLatest() {
        return isLatest;
    }

    /** */
    public enum TargetWorkloads implements com.oracle.bmc.http.internal.BmcEnum {
        ModelDeployment("MODEL_DEPLOYMENT"),
        JobRun("JOB_RUN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TargetWorkloads.class);

        private final String value;
        private static java.util.Map<String, TargetWorkloads> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetWorkloads v : TargetWorkloads.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetWorkloads(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetWorkloads create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetWorkloads', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The list of target workload. This Container can be used with given data science resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetWorkloads")
    private final java.util.List<TargetWorkloads> targetWorkloads;

    /**
     * The list of target workload. This Container can be used with given data science resources.
     *
     * @return the value
     */
    public java.util.List<TargetWorkloads> getTargetWorkloads() {
        return targetWorkloads;
    }

    /** */
    public enum Usages implements com.oracle.bmc.http.internal.BmcEnum {
        Inference("INFERENCE"),
        FineTune("FINE_TUNE"),
        Evaluation("EVALUATION"),
        BatchInference("BATCH_INFERENCE"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Usages.class);

        private final String value;
        private static java.util.Map<String, Usages> map;

        static {
            map = new java.util.HashMap<>();
            for (Usages v : Usages.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Usages(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Usages create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Usages', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The list of usages of this container. This Container can be used for given use-cases. */
    @com.fasterxml.jackson.annotation.JsonProperty("usages")
    private final java.util.List<Usages> usages;

    /**
     * The list of usages of this container. This Container can be used for given use-cases.
     *
     * @return the value
     */
    public java.util.List<Usages> getUsages() {
        return usages;
    }

    /** Container Tag. */
    @com.fasterxml.jackson.annotation.JsonProperty("tag")
    private final String tag;

    /**
     * Container Tag.
     *
     * @return the value
     */
    public String getTag() {
        return tag;
    }

    /** Container Version LifecycleState. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ContainerVersionLifecycleState lifecycleState;

    /**
     * Container Version LifecycleState.
     *
     * @return the value
     */
    public ContainerVersionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** workload configuration of the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadConfigurationDetailsList")
    private final java.util.List<WorkloadConfigurationDetails> workloadConfigurationDetailsList;

    /**
     * workload configuration of the container.
     *
     * @return the value
     */
    public java.util.List<WorkloadConfigurationDetails> getWorkloadConfigurationDetailsList() {
        return workloadConfigurationDetailsList;
    }

    /** An array of defined metadata details for the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagConfigurationList")
    private final java.util.List<TagConfiguration> tagConfigurationList;

    /**
     * An array of defined metadata details for the model.
     *
     * @return the value
     */
    public java.util.List<TagConfiguration> getTagConfigurationList() {
        return tagConfigurationList;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("ContainerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("containerName=").append(String.valueOf(this.containerName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", familyName=").append(String.valueOf(this.familyName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isLatest=").append(String.valueOf(this.isLatest));
        sb.append(", targetWorkloads=").append(String.valueOf(this.targetWorkloads));
        sb.append(", usages=").append(String.valueOf(this.usages));
        sb.append(", tag=").append(String.valueOf(this.tag));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", workloadConfigurationDetailsList=")
                .append(String.valueOf(this.workloadConfigurationDetailsList));
        sb.append(", tagConfigurationList=").append(String.valueOf(this.tagConfigurationList));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerSummary)) {
            return false;
        }

        ContainerSummary other = (ContainerSummary) o;
        return java.util.Objects.equals(this.containerName, other.containerName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.familyName, other.familyName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isLatest, other.isLatest)
                && java.util.Objects.equals(this.targetWorkloads, other.targetWorkloads)
                && java.util.Objects.equals(this.usages, other.usages)
                && java.util.Objects.equals(this.tag, other.tag)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.workloadConfigurationDetailsList,
                        other.workloadConfigurationDetailsList)
                && java.util.Objects.equals(this.tagConfigurationList, other.tagConfigurationList)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.containerName == null ? 43 : this.containerName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.familyName == null ? 43 : this.familyName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isLatest == null ? 43 : this.isLatest.hashCode());
        result =
                (result * PRIME)
                        + (this.targetWorkloads == null ? 43 : this.targetWorkloads.hashCode());
        result = (result * PRIME) + (this.usages == null ? 43 : this.usages.hashCode());
        result = (result * PRIME) + (this.tag == null ? 43 : this.tag.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.workloadConfigurationDetailsList == null
                                ? 43
                                : this.workloadConfigurationDetailsList.hashCode());
        result =
                (result * PRIME)
                        + (this.tagConfigurationList == null
                                ? 43
                                : this.tagConfigurationList.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
