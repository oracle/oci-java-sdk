/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * The information about new digital twin adapter to be created. <br>
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
        builder = CreateDigitalTwinAdapterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDigitalTwinAdapterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "iotDomainId",
        "digitalTwinModelId",
        "digitalTwinModelSpecUri",
        "displayName",
        "description",
        "inboundEnvelope",
        "inboundRoutes",
        "freeformTags",
        "definedTags"
    })
    public CreateDigitalTwinAdapterDetails(
            String iotDomainId,
            String digitalTwinModelId,
            String digitalTwinModelSpecUri,
            String displayName,
            String description,
            DigitalTwinAdapterInboundEnvelope inboundEnvelope,
            java.util.List<DigitalTwinAdapterInboundRoute> inboundRoutes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.iotDomainId = iotDomainId;
        this.digitalTwinModelId = digitalTwinModelId;
        this.digitalTwinModelSpecUri = digitalTwinModelSpecUri;
        this.displayName = displayName;
        this.description = description;
        this.inboundEnvelope = inboundEnvelope;
        this.inboundRoutes = inboundRoutes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** list of inbound routes */
        @com.fasterxml.jackson.annotation.JsonProperty("inboundRoutes")
        private java.util.List<DigitalTwinAdapterInboundRoute> inboundRoutes;

        /**
         * list of inbound routes
         *
         * @param inboundRoutes the value to set
         * @return this builder
         */
        public Builder inboundRoutes(java.util.List<DigitalTwinAdapterInboundRoute> inboundRoutes) {
            this.inboundRoutes = inboundRoutes;
            this.__explicitlySet__.add("inboundRoutes");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDigitalTwinAdapterDetails build() {
            CreateDigitalTwinAdapterDetails model =
                    new CreateDigitalTwinAdapterDetails(
                            this.iotDomainId,
                            this.digitalTwinModelId,
                            this.digitalTwinModelSpecUri,
                            this.displayName,
                            this.description,
                            this.inboundEnvelope,
                            this.inboundRoutes,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDigitalTwinAdapterDetails model) {
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

    /** list of inbound routes */
    @com.fasterxml.jackson.annotation.JsonProperty("inboundRoutes")
    private final java.util.List<DigitalTwinAdapterInboundRoute> inboundRoutes;

    /**
     * list of inbound routes
     *
     * @return the value
     */
    public java.util.List<DigitalTwinAdapterInboundRoute> getInboundRoutes() {
        return inboundRoutes;
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
        sb.append("CreateDigitalTwinAdapterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("iotDomainId=").append(String.valueOf(this.iotDomainId));
        sb.append(", digitalTwinModelId=").append(String.valueOf(this.digitalTwinModelId));
        sb.append(", digitalTwinModelSpecUri=")
                .append(String.valueOf(this.digitalTwinModelSpecUri));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", inboundEnvelope=").append(String.valueOf(this.inboundEnvelope));
        sb.append(", inboundRoutes=").append(String.valueOf(this.inboundRoutes));
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
        if (!(o instanceof CreateDigitalTwinAdapterDetails)) {
            return false;
        }

        CreateDigitalTwinAdapterDetails other = (CreateDigitalTwinAdapterDetails) o;
        return java.util.Objects.equals(this.iotDomainId, other.iotDomainId)
                && java.util.Objects.equals(this.digitalTwinModelId, other.digitalTwinModelId)
                && java.util.Objects.equals(
                        this.digitalTwinModelSpecUri, other.digitalTwinModelSpecUri)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.inboundEnvelope, other.inboundEnvelope)
                && java.util.Objects.equals(this.inboundRoutes, other.inboundRoutes)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
