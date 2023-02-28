/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Summary of the OperatorControl. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OperatorControlSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OperatorControlSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "operatorControlName",
        "compartmentId",
        "isFullyPreApproved",
        "resourceType",
        "timeOfCreation",
        "timeOfModification",
        "timeOfDeletion",
        "lifecycleState",
        "freeformTags",
        "definedTags"
    })
    public OperatorControlSummary(
            String id,
            String operatorControlName,
            String compartmentId,
            Boolean isFullyPreApproved,
            ResourceTypes resourceType,
            java.util.Date timeOfCreation,
            java.util.Date timeOfModification,
            java.util.Date timeOfDeletion,
            OperatorControlLifecycleStates lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.operatorControlName = operatorControlName;
        this.compartmentId = compartmentId;
        this.isFullyPreApproved = isFullyPreApproved;
        this.resourceType = resourceType;
        this.timeOfCreation = timeOfCreation;
        this.timeOfModification = timeOfModification;
        this.timeOfDeletion = timeOfDeletion;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the operator control. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the operator control.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Name of the operator control. */
        @com.fasterxml.jackson.annotation.JsonProperty("operatorControlName")
        private String operatorControlName;

        /**
         * Name of the operator control.
         *
         * @param operatorControlName the value to set
         * @return this builder
         */
        public Builder operatorControlName(String operatorControlName) {
            this.operatorControlName = operatorControlName;
            this.__explicitlySet__.add("operatorControlName");
            return this;
        }
        /** The OCID of the compartment that contains the operator control. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the operator control.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Whether all operator actions are pre-approved. If yes, an access request associated with
         * a resource governed by the operator control will be automatically approved by the system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFullyPreApproved")
        private Boolean isFullyPreApproved;

        /**
         * Whether all operator actions are pre-approved. If yes, an access request associated with
         * a resource governed by the operator control will be automatically approved by the system.
         *
         * @param isFullyPreApproved the value to set
         * @return this builder
         */
        public Builder isFullyPreApproved(Boolean isFullyPreApproved) {
            this.isFullyPreApproved = isFullyPreApproved;
            this.__explicitlySet__.add("isFullyPreApproved");
            return this;
        }
        /** resourceType for which the OperatorControl is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        /**
         * resourceType for which the OperatorControl is applicable
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Time when the operator control was created, expressed in [RFC 3339]
         * (https://tools.ietf.org/html/rfc3339) timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
        private java.util.Date timeOfCreation;

        /**
         * Time when the operator control was created, expressed in [RFC 3339]
         * (https://tools.ietf.org/html/rfc3339) timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfCreation the value to set
         * @return this builder
         */
        public Builder timeOfCreation(java.util.Date timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            this.__explicitlySet__.add("timeOfCreation");
            return this;
        }
        /**
         * Time when the operator control was last modified, expressed in [RFC 3339]
         * (https://tools.ietf.org/html/rfc3339) timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
        private java.util.Date timeOfModification;

        /**
         * Time when the operator control was last modified, expressed in [RFC 3339]
         * (https://tools.ietf.org/html/rfc3339) timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfModification the value to set
         * @return this builder
         */
        public Builder timeOfModification(java.util.Date timeOfModification) {
            this.timeOfModification = timeOfModification;
            this.__explicitlySet__.add("timeOfModification");
            return this;
        }
        /**
         * Time when the operator control was deleted, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * Time when the operator control was deleted, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         */
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /** The current lifecycle state of the operator control. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperatorControlLifecycleStates lifecycleState;

        /**
         * The current lifecycle state of the operator control.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OperatorControlLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only.
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /** Defined tags for this resource. Each key is predefined and scoped to a namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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

        public OperatorControlSummary build() {
            OperatorControlSummary model =
                    new OperatorControlSummary(
                            this.id,
                            this.operatorControlName,
                            this.compartmentId,
                            this.isFullyPreApproved,
                            this.resourceType,
                            this.timeOfCreation,
                            this.timeOfModification,
                            this.timeOfDeletion,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorControlSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("operatorControlName")) {
                this.operatorControlName(model.getOperatorControlName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isFullyPreApproved")) {
                this.isFullyPreApproved(model.getIsFullyPreApproved());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("timeOfCreation")) {
                this.timeOfCreation(model.getTimeOfCreation());
            }
            if (model.wasPropertyExplicitlySet("timeOfModification")) {
                this.timeOfModification(model.getTimeOfModification());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
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

    /** The OCID of the operator control. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the operator control.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Name of the operator control. */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorControlName")
    private final String operatorControlName;

    /**
     * Name of the operator control.
     *
     * @return the value
     */
    public String getOperatorControlName() {
        return operatorControlName;
    }

    /** The OCID of the compartment that contains the operator control. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the operator control.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Whether all operator actions are pre-approved. If yes, an access request associated with a
     * resource governed by the operator control will be automatically approved by the system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFullyPreApproved")
    private final Boolean isFullyPreApproved;

    /**
     * Whether all operator actions are pre-approved. If yes, an access request associated with a
     * resource governed by the operator control will be automatically approved by the system.
     *
     * @return the value
     */
    public Boolean getIsFullyPreApproved() {
        return isFullyPreApproved;
    }

    /** resourceType for which the OperatorControl is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceTypes resourceType;

    /**
     * resourceType for which the OperatorControl is applicable
     *
     * @return the value
     */
    public ResourceTypes getResourceType() {
        return resourceType;
    }

    /**
     * Time when the operator control was created, expressed in [RFC 3339]
     * (https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
    private final java.util.Date timeOfCreation;

    /**
     * Time when the operator control was created, expressed in [RFC 3339]
     * (https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeOfCreation() {
        return timeOfCreation;
    }

    /**
     * Time when the operator control was last modified, expressed in [RFC 3339]
     * (https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
    private final java.util.Date timeOfModification;

    /**
     * Time when the operator control was last modified, expressed in [RFC 3339]
     * (https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeOfModification() {
        return timeOfModification;
    }

    /**
     * Time when the operator control was deleted, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * Time when the operator control was deleted, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /** The current lifecycle state of the operator control. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OperatorControlLifecycleStates lifecycleState;

    /**
     * The current lifecycle state of the operator control.
     *
     * @return the value
     */
    public OperatorControlLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /** Defined tags for this resource. Each key is predefined and scoped to a namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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
        sb.append("OperatorControlSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", operatorControlName=").append(String.valueOf(this.operatorControlName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isFullyPreApproved=").append(String.valueOf(this.isFullyPreApproved));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", timeOfCreation=").append(String.valueOf(this.timeOfCreation));
        sb.append(", timeOfModification=").append(String.valueOf(this.timeOfModification));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof OperatorControlSummary)) {
            return false;
        }

        OperatorControlSummary other = (OperatorControlSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.operatorControlName, other.operatorControlName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isFullyPreApproved, other.isFullyPreApproved)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.timeOfCreation, other.timeOfCreation)
                && java.util.Objects.equals(this.timeOfModification, other.timeOfModification)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.operatorControlName == null
                                ? 43
                                : this.operatorControlName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isFullyPreApproved == null
                                ? 43
                                : this.isFullyPreApproved.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfCreation == null ? 43 : this.timeOfCreation.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfModification == null
                                ? 43
                                : this.timeOfModification.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
