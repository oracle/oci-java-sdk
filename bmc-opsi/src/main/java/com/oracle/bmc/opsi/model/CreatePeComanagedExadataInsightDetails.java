/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information about the Exadata system to be analyzed. <br>
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
        builder = CreatePeComanagedExadataInsightDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePeComanagedExadataInsightDetails extends CreateExadataInsightDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfraId")
        private String exadataInfraId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata Infrastructure.
         *
         * @param exadataInfraId the value to set
         * @return this builder
         */
        public Builder exadataInfraId(String exadataInfraId) {
            this.exadataInfraId = exadataInfraId;
            this.__explicitlySet__.add("exadataInfraId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memberVmClusterDetails")
        private java.util.List<CreatePeComanagedExadataVmclusterDetails> memberVmClusterDetails;

        public Builder memberVmClusterDetails(
                java.util.List<CreatePeComanagedExadataVmclusterDetails> memberVmClusterDetails) {
            this.memberVmClusterDetails = memberVmClusterDetails;
            this.__explicitlySet__.add("memberVmClusterDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePeComanagedExadataInsightDetails build() {
            CreatePeComanagedExadataInsightDetails model =
                    new CreatePeComanagedExadataInsightDetails(
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.exadataInfraId,
                            this.memberVmClusterDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePeComanagedExadataInsightDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("exadataInfraId")) {
                this.exadataInfraId(model.getExadataInfraId());
            }
            if (model.wasPropertyExplicitlySet("memberVmClusterDetails")) {
                this.memberVmClusterDetails(model.getMemberVmClusterDetails());
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
    public CreatePeComanagedExadataInsightDetails(
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String exadataInfraId,
            java.util.List<CreatePeComanagedExadataVmclusterDetails> memberVmClusterDetails) {
        super(compartmentId, freeformTags, definedTags);
        this.exadataInfraId = exadataInfraId;
        this.memberVmClusterDetails = memberVmClusterDetails;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfraId")
    private final String exadataInfraId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Infrastructure.
     *
     * @return the value
     */
    public String getExadataInfraId() {
        return exadataInfraId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memberVmClusterDetails")
    private final java.util.List<CreatePeComanagedExadataVmclusterDetails> memberVmClusterDetails;

    public java.util.List<CreatePeComanagedExadataVmclusterDetails> getMemberVmClusterDetails() {
        return memberVmClusterDetails;
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
        sb.append("CreatePeComanagedExadataInsightDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", exadataInfraId=").append(String.valueOf(this.exadataInfraId));
        sb.append(", memberVmClusterDetails=").append(String.valueOf(this.memberVmClusterDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePeComanagedExadataInsightDetails)) {
            return false;
        }

        CreatePeComanagedExadataInsightDetails other = (CreatePeComanagedExadataInsightDetails) o;
        return java.util.Objects.equals(this.exadataInfraId, other.exadataInfraId)
                && java.util.Objects.equals(
                        this.memberVmClusterDetails, other.memberVmClusterDetails)
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
                        + (this.memberVmClusterDetails == null
                                ? 43
                                : this.memberVmClusterDetails.hashCode());
        return result;
    }
}
