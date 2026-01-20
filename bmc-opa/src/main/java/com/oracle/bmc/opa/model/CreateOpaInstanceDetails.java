/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opa.model;

/**
 * The information about new OpaInstance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210621")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOpaInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOpaInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "consumptionModel",
        "shapeName",
        "meteringType",
        "idcsAt",
        "isBreakglassEnabled",
        "freeformTags",
        "definedTags"
    })
    public CreateOpaInstanceDetails(
            String displayName,
            String description,
            String compartmentId,
            OpaInstance.ConsumptionModel consumptionModel,
            OpaInstance.ShapeName shapeName,
            OpaInstance.MeteringType meteringType,
            String idcsAt,
            Boolean isBreakglassEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.consumptionModel = consumptionModel;
        this.shapeName = shapeName;
        this.meteringType = meteringType;
        this.idcsAt = idcsAt;
        this.isBreakglassEnabled = isBreakglassEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OpaInstance Identifier. User-friendly name for the instance. Avoid entering confidential
         * information. You can change this value anytime.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * OpaInstance Identifier. User-friendly name for the instance. Avoid entering confidential
         * information. You can change this value anytime.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the Oracle Process Automation instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Oracle Process Automation instance.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Parameter specifying which entitlement to use for billing purposes */
        @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
        private OpaInstance.ConsumptionModel consumptionModel;

        /**
         * Parameter specifying which entitlement to use for billing purposes
         *
         * @param consumptionModel the value to set
         * @return this builder
         */
        public Builder consumptionModel(OpaInstance.ConsumptionModel consumptionModel) {
            this.consumptionModel = consumptionModel;
            this.__explicitlySet__.add("consumptionModel");
            return this;
        }
        /** Shape of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private OpaInstance.ShapeName shapeName;

        /**
         * Shape of the instance.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(OpaInstance.ShapeName shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /** MeteringType Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("meteringType")
        private OpaInstance.MeteringType meteringType;

        /**
         * MeteringType Identifier
         *
         * @param meteringType the value to set
         * @return this builder
         */
        public Builder meteringType(OpaInstance.MeteringType meteringType) {
            this.meteringType = meteringType;
            this.__explicitlySet__.add("meteringType");
            return this;
        }
        /**
         * IDCS Authentication token. This is required for all realms with IDCS. This property is
         * optional, as it is not required for non-IDCS realms.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAt")
        private String idcsAt;

        /**
         * IDCS Authentication token. This is required for all realms with IDCS. This property is
         * optional, as it is not required for non-IDCS realms.
         *
         * @param idcsAt the value to set
         * @return this builder
         */
        public Builder idcsAt(String idcsAt) {
            this.idcsAt = idcsAt;
            this.__explicitlySet__.add("idcsAt");
            return this;
        }
        /** indicates if breakGlass is enabled for the opa instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBreakglassEnabled")
        private Boolean isBreakglassEnabled;

        /**
         * indicates if breakGlass is enabled for the opa instance.
         *
         * @param isBreakglassEnabled the value to set
         * @return this builder
         */
        public Builder isBreakglassEnabled(Boolean isBreakglassEnabled) {
            this.isBreakglassEnabled = isBreakglassEnabled;
            this.__explicitlySet__.add("isBreakglassEnabled");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOpaInstanceDetails build() {
            CreateOpaInstanceDetails model =
                    new CreateOpaInstanceDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.consumptionModel,
                            this.shapeName,
                            this.meteringType,
                            this.idcsAt,
                            this.isBreakglassEnabled,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOpaInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("consumptionModel")) {
                this.consumptionModel(model.getConsumptionModel());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("meteringType")) {
                this.meteringType(model.getMeteringType());
            }
            if (model.wasPropertyExplicitlySet("idcsAt")) {
                this.idcsAt(model.getIdcsAt());
            }
            if (model.wasPropertyExplicitlySet("isBreakglassEnabled")) {
                this.isBreakglassEnabled(model.getIsBreakglassEnabled());
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

    /**
     * OpaInstance Identifier. User-friendly name for the instance. Avoid entering confidential
     * information. You can change this value anytime.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * OpaInstance Identifier. User-friendly name for the instance. Avoid entering confidential
     * information. You can change this value anytime.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the Oracle Process Automation instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Oracle Process Automation instance.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Parameter specifying which entitlement to use for billing purposes */
    @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
    private final OpaInstance.ConsumptionModel consumptionModel;

    /**
     * Parameter specifying which entitlement to use for billing purposes
     *
     * @return the value
     */
    public OpaInstance.ConsumptionModel getConsumptionModel() {
        return consumptionModel;
    }

    /** Shape of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final OpaInstance.ShapeName shapeName;

    /**
     * Shape of the instance.
     *
     * @return the value
     */
    public OpaInstance.ShapeName getShapeName() {
        return shapeName;
    }

    /** MeteringType Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("meteringType")
    private final OpaInstance.MeteringType meteringType;

    /**
     * MeteringType Identifier
     *
     * @return the value
     */
    public OpaInstance.MeteringType getMeteringType() {
        return meteringType;
    }

    /**
     * IDCS Authentication token. This is required for all realms with IDCS. This property is
     * optional, as it is not required for non-IDCS realms.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAt")
    private final String idcsAt;

    /**
     * IDCS Authentication token. This is required for all realms with IDCS. This property is
     * optional, as it is not required for non-IDCS realms.
     *
     * @return the value
     */
    public String getIdcsAt() {
        return idcsAt;
    }

    /** indicates if breakGlass is enabled for the opa instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBreakglassEnabled")
    private final Boolean isBreakglassEnabled;

    /**
     * indicates if breakGlass is enabled for the opa instance.
     *
     * @return the value
     */
    public Boolean getIsBreakglassEnabled() {
        return isBreakglassEnabled;
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
        sb.append("CreateOpaInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", consumptionModel=").append(String.valueOf(this.consumptionModel));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", meteringType=").append(String.valueOf(this.meteringType));
        sb.append(", idcsAt=").append(String.valueOf(this.idcsAt));
        sb.append(", isBreakglassEnabled=").append(String.valueOf(this.isBreakglassEnabled));
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
        if (!(o instanceof CreateOpaInstanceDetails)) {
            return false;
        }

        CreateOpaInstanceDetails other = (CreateOpaInstanceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.consumptionModel, other.consumptionModel)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.meteringType, other.meteringType)
                && java.util.Objects.equals(this.idcsAt, other.idcsAt)
                && java.util.Objects.equals(this.isBreakglassEnabled, other.isBreakglassEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.consumptionModel == null ? 43 : this.consumptionModel.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.meteringType == null ? 43 : this.meteringType.hashCode());
        result = (result * PRIME) + (this.idcsAt == null ? 43 : this.idcsAt.hashCode());
        result =
                (result * PRIME)
                        + (this.isBreakglassEnabled == null
                                ? 43
                                : this.isBreakglassEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
