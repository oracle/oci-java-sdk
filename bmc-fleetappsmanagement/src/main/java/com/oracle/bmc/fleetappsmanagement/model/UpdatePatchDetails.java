/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The patch information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdatePatchDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdatePatchDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "patchType",
        "severity",
        "timeReleased",
        "artifactDetails",
        "product",
        "dependentPatches",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public UpdatePatchDetails(
            String description,
            PatchType patchType,
            PatchSeverity severity,
            java.util.Date timeReleased,
            ArtifactDetails artifactDetails,
            PatchProduct product,
            java.util.List<DependentPatchDetails> dependentPatches,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.patchType = patchType;
        this.severity = severity;
        this.timeReleased = timeReleased;
        this.artifactDetails = artifactDetails;
        this.product = product;
        this.dependentPatches = dependentPatches;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchType")
        private PatchType patchType;

        public Builder patchType(PatchType patchType) {
            this.patchType = patchType;
            this.__explicitlySet__.add("patchType");
            return this;
        }
        /**
         * Patch Severity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private PatchSeverity severity;

        /**
         * Patch Severity.
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(PatchSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * Date when the patch was released.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * Date when the patch was released.
         * @param timeReleased the value to set
         * @return this builder
         **/
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("artifactDetails")
        private ArtifactDetails artifactDetails;

        public Builder artifactDetails(ArtifactDetails artifactDetails) {
            this.artifactDetails = artifactDetails;
            this.__explicitlySet__.add("artifactDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private PatchProduct product;

        public Builder product(PatchProduct product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /**
         * Dependent Patches.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dependentPatches")
        private java.util.List<DependentPatchDetails> dependentPatches;

        /**
         * Dependent Patches.
         *
         * @param dependentPatches the value to set
         * @return this builder
         **/
        public Builder dependentPatches(java.util.List<DependentPatchDetails> dependentPatches) {
            this.dependentPatches = dependentPatches;
            this.__explicitlySet__.add("dependentPatches");
            return this;
        }
        /**
         * OCID of the compartment to which the resource belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment to which the resource belongs to.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePatchDetails build() {
            UpdatePatchDetails model =
                    new UpdatePatchDetails(
                            this.description,
                            this.patchType,
                            this.severity,
                            this.timeReleased,
                            this.artifactDetails,
                            this.product,
                            this.dependentPatches,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePatchDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("patchType")) {
                this.patchType(model.getPatchType());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("artifactDetails")) {
                this.artifactDetails(model.getArtifactDetails());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("dependentPatches")) {
                this.dependentPatches(model.getDependentPatches());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patchType")
    private final PatchType patchType;

    public PatchType getPatchType() {
        return patchType;
    }

    /**
     * Patch Severity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final PatchSeverity severity;

    /**
     * Patch Severity.
     * @return the value
     **/
    public PatchSeverity getSeverity() {
        return severity;
    }

    /**
     * Date when the patch was released.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * Date when the patch was released.
     * @return the value
     **/
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("artifactDetails")
    private final ArtifactDetails artifactDetails;

    public ArtifactDetails getArtifactDetails() {
        return artifactDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final PatchProduct product;

    public PatchProduct getProduct() {
        return product;
    }

    /**
     * Dependent Patches.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependentPatches")
    private final java.util.List<DependentPatchDetails> dependentPatches;

    /**
     * Dependent Patches.
     *
     * @return the value
     **/
    public java.util.List<DependentPatchDetails> getDependentPatches() {
        return dependentPatches;
    }

    /**
     * OCID of the compartment to which the resource belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment to which the resource belongs to.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdatePatchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", patchType=").append(String.valueOf(this.patchType));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", artifactDetails=").append(String.valueOf(this.artifactDetails));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", dependentPatches=").append(String.valueOf(this.dependentPatches));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof UpdatePatchDetails)) {
            return false;
        }

        UpdatePatchDetails other = (UpdatePatchDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.patchType, other.patchType)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.artifactDetails, other.artifactDetails)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.dependentPatches, other.dependentPatches)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.patchType == null ? 43 : this.patchType.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactDetails == null ? 43 : this.artifactDetails.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result =
                (result * PRIME)
                        + (this.dependentPatches == null ? 43 : this.dependentPatches.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
