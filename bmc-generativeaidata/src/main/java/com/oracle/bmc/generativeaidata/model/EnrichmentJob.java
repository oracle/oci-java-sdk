/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaidata.model;

/**
 * Object representing to EnrichmentJob. ocidEntityType: generativeaiEnrichmentJob adLocality:
 * regional <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EnrichmentJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnrichmentJob extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "description",
        "semanticStoreId",
        "displayName",
        "enrichmentJobType",
        "enrichmentJobConfiguration",
        "timeAccepted",
        "timeStarted",
        "timeFinished",
        "lifecycleDetails",
        "percentComplete",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public EnrichmentJob(
            String id,
            String description,
            String semanticStoreId,
            String displayName,
            EnrichmentJobType enrichmentJobType,
            EnrichmentJobConfiguration enrichmentJobConfiguration,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            String lifecycleDetails,
            Float percentComplete,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.description = description;
        this.semanticStoreId = semanticStoreId;
        this.displayName = displayName;
        this.enrichmentJobType = enrichmentJobType;
        this.enrichmentJobConfiguration = enrichmentJobConfiguration;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.lifecycleDetails = lifecycleDetails;
        this.percentComplete = percentComplete;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** An optional description of the EnrichmentJob. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of the EnrichmentJob.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Owning SemanticStore
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for an
         * EnrichmentJob.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("semanticStoreId")
        private String semanticStoreId;

        /**
         * Owning SemanticStore
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for an
         * EnrichmentJob.
         *
         * @param semanticStoreId the value to set
         * @return this builder
         */
        public Builder semanticStoreId(String semanticStoreId) {
            this.semanticStoreId = semanticStoreId;
            this.__explicitlySet__.add("semanticStoreId");
            return this;
        }
        /**
         * A user-friendly display name. It does not have to be unique and can be modified. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. It does not have to be unique and can be modified. Avoid
         * entering confidential information.
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
         * Enrichment job type. Currently supported Full Build (All supported objects in a given
         * schema) and Partial Build (Selected tables and/or supported objects in a given schema).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enrichmentJobType")
        private EnrichmentJobType enrichmentJobType;

        /**
         * Enrichment job type. Currently supported Full Build (All supported objects in a given
         * schema) and Partial Build (Selected tables and/or supported objects in a given schema).
         *
         * @param enrichmentJobType the value to set
         * @return this builder
         */
        public Builder enrichmentJobType(EnrichmentJobType enrichmentJobType) {
            this.enrichmentJobType = enrichmentJobType;
            this.__explicitlySet__.add("enrichmentJobType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enrichmentJobConfiguration")
        private EnrichmentJobConfiguration enrichmentJobConfiguration;

        public Builder enrichmentJobConfiguration(
                EnrichmentJobConfiguration enrichmentJobConfiguration) {
            this.enrichmentJobConfiguration = enrichmentJobConfiguration;
            this.__explicitlySet__.add("enrichmentJobConfiguration");
            return this;
        }
        /**
         * The date and time that the enrichment job was accepted in the format of an RFC3339
         * datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The date and time that the enrichment job was accepted in the format of an RFC3339
         * datetime string.
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
         * The date and time that the enrichment job was started in the format of an RFC3339
         * datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time that the enrichment job was started in the format of an RFC3339
         * datetime string.
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
         * The date and time that the enrichment job was finished in the format of an RFC3339
         * datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time that the enrichment job was finished in the format of an RFC3339
         * datetime string.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * A message describing the current state in more detail that can provide actionable
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail that can provide actionable
         * information.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The percentage of the enrichment job that has been completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        /**
         * The percentage of the enrichment job that has been completed.
         *
         * @param percentComplete the value to set
         * @return this builder
         */
        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /** The lifecycleState of GenerateSqlJob. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The lifecycleState of GenerateSqlJob.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnrichmentJob build() {
            EnrichmentJob model =
                    new EnrichmentJob(
                            this.id,
                            this.description,
                            this.semanticStoreId,
                            this.displayName,
                            this.enrichmentJobType,
                            this.enrichmentJobConfiguration,
                            this.timeAccepted,
                            this.timeStarted,
                            this.timeFinished,
                            this.lifecycleDetails,
                            this.percentComplete,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnrichmentJob model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("semanticStoreId")) {
                this.semanticStoreId(model.getSemanticStoreId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("enrichmentJobType")) {
                this.enrichmentJobType(model.getEnrichmentJobType());
            }
            if (model.wasPropertyExplicitlySet("enrichmentJobConfiguration")) {
                this.enrichmentJobConfiguration(model.getEnrichmentJobConfiguration());
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
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Unique identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** An optional description of the EnrichmentJob. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of the EnrichmentJob.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Owning SemanticStore
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for an
     * EnrichmentJob.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("semanticStoreId")
    private final String semanticStoreId;

    /**
     * Owning SemanticStore
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for an
     * EnrichmentJob.
     *
     * @return the value
     */
    public String getSemanticStoreId() {
        return semanticStoreId;
    }

    /**
     * A user-friendly display name. It does not have to be unique and can be modified. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. It does not have to be unique and can be modified. Avoid
     * entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Enrichment job type. Currently supported Full Build (All supported objects in a given schema)
     * and Partial Build (Selected tables and/or supported objects in a given schema).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enrichmentJobType")
    private final EnrichmentJobType enrichmentJobType;

    /**
     * Enrichment job type. Currently supported Full Build (All supported objects in a given schema)
     * and Partial Build (Selected tables and/or supported objects in a given schema).
     *
     * @return the value
     */
    public EnrichmentJobType getEnrichmentJobType() {
        return enrichmentJobType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("enrichmentJobConfiguration")
    private final EnrichmentJobConfiguration enrichmentJobConfiguration;

    public EnrichmentJobConfiguration getEnrichmentJobConfiguration() {
        return enrichmentJobConfiguration;
    }

    /**
     * The date and time that the enrichment job was accepted in the format of an RFC3339 datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The date and time that the enrichment job was accepted in the format of an RFC3339 datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * The date and time that the enrichment job was started in the format of an RFC3339 datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time that the enrichment job was started in the format of an RFC3339 datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time that the enrichment job was finished in the format of an RFC3339 datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time that the enrichment job was finished in the format of an RFC3339 datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * A message describing the current state in more detail that can provide actionable
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail that can provide actionable
     * information.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The percentage of the enrichment job that has been completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Float percentComplete;

    /**
     * The percentage of the enrichment job that has been completed.
     *
     * @return the value
     */
    public Float getPercentComplete() {
        return percentComplete;
    }

    /** The lifecycleState of GenerateSqlJob. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycleState of GenerateSqlJob.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("EnrichmentJob(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", semanticStoreId=").append(String.valueOf(this.semanticStoreId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", enrichmentJobType=").append(String.valueOf(this.enrichmentJobType));
        sb.append(", enrichmentJobConfiguration=")
                .append(String.valueOf(this.enrichmentJobConfiguration));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnrichmentJob)) {
            return false;
        }

        EnrichmentJob other = (EnrichmentJob) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.semanticStoreId, other.semanticStoreId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.enrichmentJobType, other.enrichmentJobType)
                && java.util.Objects.equals(
                        this.enrichmentJobConfiguration, other.enrichmentJobConfiguration)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.semanticStoreId == null ? 43 : this.semanticStoreId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.enrichmentJobType == null ? 43 : this.enrichmentJobType.hashCode());
        result =
                (result * PRIME)
                        + (this.enrichmentJobConfiguration == null
                                ? 43
                                : this.enrichmentJobConfiguration.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
