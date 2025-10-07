/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * The digital twin adapter maps incoming data from IoT device into the corresponding digital twin
 * instance. It defines the envelope structure, reference payload, routing and transformation rules
 * using JSON Path and JQ to normalize the raw device data within the IoT domain.
 *
 * <p>To use any API operations, you must be authorized in an IAM policy. If you are not authorized,
 * contact an administrator. If you are an administrator who needs to create policies to grant users
 * access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DigitalTwinAdapter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DigitalTwinAdapter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "iotDomainId",
        "digitalTwinModelId",
        "digitalTwinModelSpecUri",
        "displayName",
        "description",
        "inboundEnvelope",
        "inboundRoutes",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags",
        "timeCreated",
        "timeUpdated"
    })
    public DigitalTwinAdapter(
            String id,
            String iotDomainId,
            String digitalTwinModelId,
            String digitalTwinModelSpecUri,
            String displayName,
            String description,
            DigitalTwinAdapterInboundEnvelope inboundEnvelope,
            java.util.List<DigitalTwinAdapterInboundRoute> inboundRoutes,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.iotDomainId = iotDomainId;
        this.digitalTwinModelId = digitalTwinModelId;
        this.digitalTwinModelSpecUri = digitalTwinModelSpecUri;
        this.displayName = displayName;
        this.description = description;
        this.inboundEnvelope = inboundEnvelope;
        this.inboundRoutes = inboundRoutes;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IoT domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("iotDomainId")
        private String iotDomainId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IoT domain.
         *
         * @param iotDomainId the value to set
         * @return this builder
         */
        public Builder iotDomainId(String iotDomainId) {
            this.iotDomainId = iotDomainId;
            this.__explicitlySet__.add("iotDomainId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * digital twin model.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("digitalTwinModelId")
        private String digitalTwinModelId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * digital twin model.
         *
         * @param digitalTwinModelId the value to set
         * @return this builder
         */
        public Builder digitalTwinModelId(String digitalTwinModelId) {
            this.digitalTwinModelId = digitalTwinModelId;
            this.__explicitlySet__.add("digitalTwinModelId");
            return this;
        }
        /** The URI of the digital twin model specification. */
        @com.fasterxml.jackson.annotation.JsonProperty("digitalTwinModelSpecUri")
        private String digitalTwinModelSpecUri;

        /**
         * The URI of the digital twin model specification.
         *
         * @param digitalTwinModelSpecUri the value to set
         * @return this builder
         */
        public Builder digitalTwinModelSpecUri(String digitalTwinModelSpecUri) {
            this.digitalTwinModelSpecUri = digitalTwinModelSpecUri;
            this.__explicitlySet__.add("digitalTwinModelSpecUri");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A short description of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the resource.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inboundEnvelope")
        private DigitalTwinAdapterInboundEnvelope inboundEnvelope;

        public Builder inboundEnvelope(DigitalTwinAdapterInboundEnvelope inboundEnvelope) {
            this.inboundEnvelope = inboundEnvelope;
            this.__explicitlySet__.add("inboundEnvelope");
            return this;
        }
        /** list of routes */
        @com.fasterxml.jackson.annotation.JsonProperty("inboundRoutes")
        private java.util.List<DigitalTwinAdapterInboundRoute> inboundRoutes;

        /**
         * list of routes
         *
         * @param inboundRoutes the value to set
         * @return this builder
         */
        public Builder inboundRoutes(java.util.List<DigitalTwinAdapterInboundRoute> inboundRoutes) {
            this.inboundRoutes = inboundRoutes;
            this.__explicitlySet__.add("inboundRoutes");
            return this;
        }
        /** The current state of the digital twin adapter. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the digital twin adapter.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The date and time when the resource was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the resource was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The date and time when the resource was last updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time when the resource was last updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DigitalTwinAdapter build() {
            DigitalTwinAdapter model =
                    new DigitalTwinAdapter(
                            this.id,
                            this.iotDomainId,
                            this.digitalTwinModelId,
                            this.digitalTwinModelSpecUri,
                            this.displayName,
                            this.description,
                            this.inboundEnvelope,
                            this.inboundRoutes,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DigitalTwinAdapter model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("iotDomainId")) {
                this.iotDomainId(model.getIotDomainId());
            }
            if (model.wasPropertyExplicitlySet("digitalTwinModelId")) {
                this.digitalTwinModelId(model.getDigitalTwinModelId());
            }
            if (model.wasPropertyExplicitlySet("digitalTwinModelSpecUri")) {
                this.digitalTwinModelSpecUri(model.getDigitalTwinModelSpecUri());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("inboundEnvelope")) {
                this.inboundEnvelope(model.getInboundEnvelope());
            }
            if (model.wasPropertyExplicitlySet("inboundRoutes")) {
                this.inboundRoutes(model.getInboundRoutes());
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IoT
     * domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iotDomainId")
    private final String iotDomainId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IoT
     * domain.
     *
     * @return the value
     */
    public String getIotDomainId() {
        return iotDomainId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * digital twin model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("digitalTwinModelId")
    private final String digitalTwinModelId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * digital twin model.
     *
     * @return the value
     */
    public String getDigitalTwinModelId() {
        return digitalTwinModelId;
    }

    /** The URI of the digital twin model specification. */
    @com.fasterxml.jackson.annotation.JsonProperty("digitalTwinModelSpecUri")
    private final String digitalTwinModelSpecUri;

    /**
     * The URI of the digital twin model specification.
     *
     * @return the value
     */
    public String getDigitalTwinModelSpecUri() {
        return digitalTwinModelSpecUri;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A short description of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the resource.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inboundEnvelope")
    private final DigitalTwinAdapterInboundEnvelope inboundEnvelope;

    public DigitalTwinAdapterInboundEnvelope getInboundEnvelope() {
        return inboundEnvelope;
    }

    /** list of routes */
    @com.fasterxml.jackson.annotation.JsonProperty("inboundRoutes")
    private final java.util.List<DigitalTwinAdapterInboundRoute> inboundRoutes;

    /**
     * list of routes
     *
     * @return the value
     */
    public java.util.List<DigitalTwinAdapterInboundRoute> getInboundRoutes() {
        return inboundRoutes;
    }

    /** The current state of the digital twin adapter. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the digital twin adapter.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The date and time when the resource was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the resource was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when the resource was last updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time when the resource was last updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("DigitalTwinAdapter(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", iotDomainId=").append(String.valueOf(this.iotDomainId));
        sb.append(", digitalTwinModelId=").append(String.valueOf(this.digitalTwinModelId));
        sb.append(", digitalTwinModelSpecUri=")
                .append(String.valueOf(this.digitalTwinModelSpecUri));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", inboundEnvelope=").append(String.valueOf(this.inboundEnvelope));
        sb.append(", inboundRoutes=").append(String.valueOf(this.inboundRoutes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DigitalTwinAdapter)) {
            return false;
        }

        DigitalTwinAdapter other = (DigitalTwinAdapter) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.iotDomainId, other.iotDomainId)
                && java.util.Objects.equals(this.digitalTwinModelId, other.digitalTwinModelId)
                && java.util.Objects.equals(
                        this.digitalTwinModelSpecUri, other.digitalTwinModelSpecUri)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.inboundEnvelope, other.inboundEnvelope)
                && java.util.Objects.equals(this.inboundRoutes, other.inboundRoutes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.iotDomainId == null ? 43 : this.iotDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.digitalTwinModelId == null
                                ? 43
                                : this.digitalTwinModelId.hashCode());
        result =
                (result * PRIME)
                        + (this.digitalTwinModelSpecUri == null
                                ? 43
                                : this.digitalTwinModelSpecUri.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.inboundEnvelope == null ? 43 : this.inboundEnvelope.hashCode());
        result =
                (result * PRIME)
                        + (this.inboundRoutes == null ? 43 : this.inboundRoutes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
