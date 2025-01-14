/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Private endpoint managed Exadata insight resource (ExaCS). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PeComanagedExadataInsight.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PeComanagedExadataInsight extends ExadataInsight {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("exadataName")
        private String exadataName;

        public Builder exadataName(String exadataName) {
            this.exadataName = exadataName;
            this.__explicitlySet__.add("exadataName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
        private String exadataDisplayName;

        public Builder exadataDisplayName(String exadataDisplayName) {
            this.exadataDisplayName = exadataDisplayName;
            this.__explicitlySet__.add("exadataDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataType")
        private ExadataType exadataType;

        public Builder exadataType(ExadataType exadataType) {
            this.exadataType = exadataType;
            this.__explicitlySet__.add("exadataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataRackType")
        private ExadataRackType exadataRackType;

        public Builder exadataRackType(ExadataRackType exadataRackType) {
            this.exadataRackType = exadataRackType;
            this.__explicitlySet__.add("exadataRackType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVirtualizedExadata")
        private Boolean isVirtualizedExadata;

        public Builder isVirtualizedExadata(Boolean isVirtualizedExadata) {
            this.isVirtualizedExadata = isVirtualizedExadata;
            this.__explicitlySet__.add("isVirtualizedExadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ExadataInsightLifecycleState lifecycleState;

        public Builder lifecycleState(ExadataInsightLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Exadata Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfraId")
        private String exadataInfraId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Exadata Infrastructure.
         *
         * @param exadataInfraId the value to set
         * @return this builder
         */
        public Builder exadataInfraId(String exadataInfraId) {
            this.exadataInfraId = exadataInfraId;
            this.__explicitlySet__.add("exadataInfraId");
            return this;
        }
        /** OCI exadata infrastructure resource type */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfraResourceType")
        private ExadataResourceType exadataInfraResourceType;

        /**
         * OCI exadata infrastructure resource type
         *
         * @param exadataInfraResourceType the value to set
         * @return this builder
         */
        public Builder exadataInfraResourceType(ExadataResourceType exadataInfraResourceType) {
            this.exadataInfraResourceType = exadataInfraResourceType;
            this.__explicitlySet__.add("exadataInfraResourceType");
            return this;
        }
        /** The shape of the Exadata Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataShape")
        private String exadataShape;

        /**
         * The shape of the Exadata Infrastructure.
         *
         * @param exadataShape the value to set
         * @return this builder
         */
        public Builder exadataShape(String exadataShape) {
            this.exadataShape = exadataShape;
            this.__explicitlySet__.add("exadataShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeComanagedExadataInsight build() {
            PeComanagedExadataInsight model =
                    new PeComanagedExadataInsight(
                            this.id,
                            this.compartmentId,
                            this.exadataName,
                            this.exadataDisplayName,
                            this.exadataType,
                            this.exadataRackType,
                            this.isVirtualizedExadata,
                            this.status,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.exadataInfraId,
                            this.exadataInfraResourceType,
                            this.exadataShape);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeComanagedExadataInsight model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("exadataName")) {
                this.exadataName(model.getExadataName());
            }
            if (model.wasPropertyExplicitlySet("exadataDisplayName")) {
                this.exadataDisplayName(model.getExadataDisplayName());
            }
            if (model.wasPropertyExplicitlySet("exadataType")) {
                this.exadataType(model.getExadataType());
            }
            if (model.wasPropertyExplicitlySet("exadataRackType")) {
                this.exadataRackType(model.getExadataRackType());
            }
            if (model.wasPropertyExplicitlySet("isVirtualizedExadata")) {
                this.isVirtualizedExadata(model.getIsVirtualizedExadata());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("exadataInfraId")) {
                this.exadataInfraId(model.getExadataInfraId());
            }
            if (model.wasPropertyExplicitlySet("exadataInfraResourceType")) {
                this.exadataInfraResourceType(model.getExadataInfraResourceType());
            }
            if (model.wasPropertyExplicitlySet("exadataShape")) {
                this.exadataShape(model.getExadataShape());
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

    @Deprecated
    public PeComanagedExadataInsight(
            String id,
            String compartmentId,
            String exadataName,
            String exadataDisplayName,
            ExadataType exadataType,
            ExadataRackType exadataRackType,
            Boolean isVirtualizedExadata,
            ResourceStatus status,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ExadataInsightLifecycleState lifecycleState,
            String lifecycleDetails,
            String exadataInfraId,
            ExadataResourceType exadataInfraResourceType,
            String exadataShape) {
        super(
                id,
                compartmentId,
                exadataName,
                exadataDisplayName,
                exadataType,
                exadataRackType,
                isVirtualizedExadata,
                status,
                freeformTags,
                definedTags,
                systemTags,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails);
        this.exadataInfraId = exadataInfraId;
        this.exadataInfraResourceType = exadataInfraResourceType;
        this.exadataShape = exadataShape;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Exadata Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfraId")
    private final String exadataInfraId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Exadata Infrastructure.
     *
     * @return the value
     */
    public String getExadataInfraId() {
        return exadataInfraId;
    }

    /** OCI exadata infrastructure resource type */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfraResourceType")
    private final ExadataResourceType exadataInfraResourceType;

    /**
     * OCI exadata infrastructure resource type
     *
     * @return the value
     */
    public ExadataResourceType getExadataInfraResourceType() {
        return exadataInfraResourceType;
    }

    /** The shape of the Exadata Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataShape")
    private final String exadataShape;

    /**
     * The shape of the Exadata Infrastructure.
     *
     * @return the value
     */
    public String getExadataShape() {
        return exadataShape;
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
        sb.append("PeComanagedExadataInsight(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", exadataInfraId=").append(String.valueOf(this.exadataInfraId));
        sb.append(", exadataInfraResourceType=")
                .append(String.valueOf(this.exadataInfraResourceType));
        sb.append(", exadataShape=").append(String.valueOf(this.exadataShape));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeComanagedExadataInsight)) {
            return false;
        }

        PeComanagedExadataInsight other = (PeComanagedExadataInsight) o;
        return java.util.Objects.equals(this.exadataInfraId, other.exadataInfraId)
                && java.util.Objects.equals(
                        this.exadataInfraResourceType, other.exadataInfraResourceType)
                && java.util.Objects.equals(this.exadataShape, other.exadataShape)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exadataInfraId == null ? 43 : this.exadataInfraId.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInfraResourceType == null
                                ? 43
                                : this.exadataInfraResourceType.hashCode());
        result = (result * PRIME) + (this.exadataShape == null ? 43 : this.exadataShape.hashCode());
        return result;
    }
}
