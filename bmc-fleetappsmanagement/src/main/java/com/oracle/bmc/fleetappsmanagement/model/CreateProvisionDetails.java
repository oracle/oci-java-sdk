/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The data to create a FamProvision. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateProvisionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateProvisionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "provisionDescription",
        "compartmentId",
        "packageCatalogItemId",
        "configCatalogItemId",
        "fleetId",
        "tfVariableTenancyId",
        "tfVariableRegionId",
        "tfVariableCurrentUserId",
        "tfVariableCompartmentId",
        "freeformTags",
        "definedTags"
    })
    public CreateProvisionDetails(
            String displayName,
            String provisionDescription,
            String compartmentId,
            String packageCatalogItemId,
            String configCatalogItemId,
            String fleetId,
            String tfVariableTenancyId,
            String tfVariableRegionId,
            String tfVariableCurrentUserId,
            String tfVariableCompartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.provisionDescription = provisionDescription;
        this.compartmentId = compartmentId;
        this.packageCatalogItemId = packageCatalogItemId;
        this.configCatalogItemId = configCatalogItemId;
        this.fleetId = fleetId;
        this.tfVariableTenancyId = tfVariableTenancyId;
        this.tfVariableRegionId = tfVariableRegionId;
        this.tfVariableCurrentUserId = tfVariableCurrentUserId;
        this.tfVariableCompartmentId = tfVariableCompartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** A description of the provision. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionDescription")
        private String provisionDescription;

        /**
         * A description of the provision.
         *
         * @param provisionDescription the value to set
         * @return this builder
         */
        public Builder provisionDescription(String provisionDescription) {
            this.provisionDescription = provisionDescription;
            this.__explicitlySet__.add("provisionDescription");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to create the FamProvision in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to create the FamProvision in.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Catalog Item.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemId")
        private String packageCatalogItemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Catalog Item.
         *
         * @param packageCatalogItemId the value to set
         * @return this builder
         */
        public Builder packageCatalogItemId(String packageCatalogItemId) {
            this.packageCatalogItemId = packageCatalogItemId;
            this.__explicitlySet__.add("packageCatalogItemId");
            return this;
        }
        /**
         * A [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Catalog Item to a file with key/value pairs to set up variables for createStack API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemId")
        private String configCatalogItemId;

        /**
         * A [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Catalog Item to a file with key/value pairs to set up variables for createStack API.
         *
         * @param configCatalogItemId the value to set
         * @return this builder
         */
        public Builder configCatalogItemId(String configCatalogItemId) {
            this.configCatalogItemId = configCatalogItemId;
            this.__explicitlySet__.add("configCatalogItemId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /**
         * A mandatory variable added to a list of RMS variables for createStack API. Overrides the
         * one supplied in configuration file.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tfVariableTenancyId")
        private String tfVariableTenancyId;

        /**
         * A mandatory variable added to a list of RMS variables for createStack API. Overrides the
         * one supplied in configuration file.
         *
         * @param tfVariableTenancyId the value to set
         * @return this builder
         */
        public Builder tfVariableTenancyId(String tfVariableTenancyId) {
            this.tfVariableTenancyId = tfVariableTenancyId;
            this.__explicitlySet__.add("tfVariableTenancyId");
            return this;
        }
        /**
         * A mandatory variable added to a list of RMS variables for createStack API. Overrides the
         * one supplied in configuration file.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tfVariableRegionId")
        private String tfVariableRegionId;

        /**
         * A mandatory variable added to a list of RMS variables for createStack API. Overrides the
         * one supplied in configuration file.
         *
         * @param tfVariableRegionId the value to set
         * @return this builder
         */
        public Builder tfVariableRegionId(String tfVariableRegionId) {
            this.tfVariableRegionId = tfVariableRegionId;
            this.__explicitlySet__.add("tfVariableRegionId");
            return this;
        }
        /**
         * An optional variable added to a list of RMS variables for createStack API. Overrides the
         * one supplied in configuration file.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tfVariableCurrentUserId")
        private String tfVariableCurrentUserId;

        /**
         * An optional variable added to a list of RMS variables for createStack API. Overrides the
         * one supplied in configuration file.
         *
         * @param tfVariableCurrentUserId the value to set
         * @return this builder
         */
        public Builder tfVariableCurrentUserId(String tfVariableCurrentUserId) {
            this.tfVariableCurrentUserId = tfVariableCurrentUserId;
            this.__explicitlySet__.add("tfVariableCurrentUserId");
            return this;
        }
        /**
         * An optional variable added to a list of RMS variables for createStack API. Overrides the
         * one supplied in configuration file.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tfVariableCompartmentId")
        private String tfVariableCompartmentId;

        /**
         * An optional variable added to a list of RMS variables for createStack API. Overrides the
         * one supplied in configuration file.
         *
         * @param tfVariableCompartmentId the value to set
         * @return this builder
         */
        public Builder tfVariableCompartmentId(String tfVariableCompartmentId) {
            this.tfVariableCompartmentId = tfVariableCompartmentId;
            this.__explicitlySet__.add("tfVariableCompartmentId");
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

        public CreateProvisionDetails build() {
            CreateProvisionDetails model =
                    new CreateProvisionDetails(
                            this.displayName,
                            this.provisionDescription,
                            this.compartmentId,
                            this.packageCatalogItemId,
                            this.configCatalogItemId,
                            this.fleetId,
                            this.tfVariableTenancyId,
                            this.tfVariableRegionId,
                            this.tfVariableCurrentUserId,
                            this.tfVariableCompartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateProvisionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("provisionDescription")) {
                this.provisionDescription(model.getProvisionDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("packageCatalogItemId")) {
                this.packageCatalogItemId(model.getPackageCatalogItemId());
            }
            if (model.wasPropertyExplicitlySet("configCatalogItemId")) {
                this.configCatalogItemId(model.getConfigCatalogItemId());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("tfVariableTenancyId")) {
                this.tfVariableTenancyId(model.getTfVariableTenancyId());
            }
            if (model.wasPropertyExplicitlySet("tfVariableRegionId")) {
                this.tfVariableRegionId(model.getTfVariableRegionId());
            }
            if (model.wasPropertyExplicitlySet("tfVariableCurrentUserId")) {
                this.tfVariableCurrentUserId(model.getTfVariableCurrentUserId());
            }
            if (model.wasPropertyExplicitlySet("tfVariableCompartmentId")) {
                this.tfVariableCompartmentId(model.getTfVariableCompartmentId());
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

    /** A description of the provision. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionDescription")
    private final String provisionDescription;

    /**
     * A description of the provision.
     *
     * @return the value
     */
    public String getProvisionDescription() {
        return provisionDescription;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to create the FamProvision in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to create the FamProvision in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Catalog Item.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemId")
    private final String packageCatalogItemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Catalog Item.
     *
     * @return the value
     */
    public String getPackageCatalogItemId() {
        return packageCatalogItemId;
    }

    /**
     * A [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Catalog Item to a file with key/value pairs to set up variables for createStack API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemId")
    private final String configCatalogItemId;

    /**
     * A [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Catalog Item to a file with key/value pairs to set up variables for createStack API.
     *
     * @return the value
     */
    public String getConfigCatalogItemId() {
        return configCatalogItemId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
    }

    /**
     * A mandatory variable added to a list of RMS variables for createStack API. Overrides the one
     * supplied in configuration file.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tfVariableTenancyId")
    private final String tfVariableTenancyId;

    /**
     * A mandatory variable added to a list of RMS variables for createStack API. Overrides the one
     * supplied in configuration file.
     *
     * @return the value
     */
    public String getTfVariableTenancyId() {
        return tfVariableTenancyId;
    }

    /**
     * A mandatory variable added to a list of RMS variables for createStack API. Overrides the one
     * supplied in configuration file.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tfVariableRegionId")
    private final String tfVariableRegionId;

    /**
     * A mandatory variable added to a list of RMS variables for createStack API. Overrides the one
     * supplied in configuration file.
     *
     * @return the value
     */
    public String getTfVariableRegionId() {
        return tfVariableRegionId;
    }

    /**
     * An optional variable added to a list of RMS variables for createStack API. Overrides the one
     * supplied in configuration file.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tfVariableCurrentUserId")
    private final String tfVariableCurrentUserId;

    /**
     * An optional variable added to a list of RMS variables for createStack API. Overrides the one
     * supplied in configuration file.
     *
     * @return the value
     */
    public String getTfVariableCurrentUserId() {
        return tfVariableCurrentUserId;
    }

    /**
     * An optional variable added to a list of RMS variables for createStack API. Overrides the one
     * supplied in configuration file.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tfVariableCompartmentId")
    private final String tfVariableCompartmentId;

    /**
     * An optional variable added to a list of RMS variables for createStack API. Overrides the one
     * supplied in configuration file.
     *
     * @return the value
     */
    public String getTfVariableCompartmentId() {
        return tfVariableCompartmentId;
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
        sb.append("CreateProvisionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", provisionDescription=").append(String.valueOf(this.provisionDescription));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", packageCatalogItemId=").append(String.valueOf(this.packageCatalogItemId));
        sb.append(", configCatalogItemId=").append(String.valueOf(this.configCatalogItemId));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", tfVariableTenancyId=").append(String.valueOf(this.tfVariableTenancyId));
        sb.append(", tfVariableRegionId=").append(String.valueOf(this.tfVariableRegionId));
        sb.append(", tfVariableCurrentUserId=")
                .append(String.valueOf(this.tfVariableCurrentUserId));
        sb.append(", tfVariableCompartmentId=")
                .append(String.valueOf(this.tfVariableCompartmentId));
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
        if (!(o instanceof CreateProvisionDetails)) {
            return false;
        }

        CreateProvisionDetails other = (CreateProvisionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.provisionDescription, other.provisionDescription)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.packageCatalogItemId, other.packageCatalogItemId)
                && java.util.Objects.equals(this.configCatalogItemId, other.configCatalogItemId)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.tfVariableTenancyId, other.tfVariableTenancyId)
                && java.util.Objects.equals(this.tfVariableRegionId, other.tfVariableRegionId)
                && java.util.Objects.equals(
                        this.tfVariableCurrentUserId, other.tfVariableCurrentUserId)
                && java.util.Objects.equals(
                        this.tfVariableCompartmentId, other.tfVariableCompartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionDescription == null
                                ? 43
                                : this.provisionDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageCatalogItemId == null
                                ? 43
                                : this.packageCatalogItemId.hashCode());
        result =
                (result * PRIME)
                        + (this.configCatalogItemId == null
                                ? 43
                                : this.configCatalogItemId.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.tfVariableTenancyId == null
                                ? 43
                                : this.tfVariableTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.tfVariableRegionId == null
                                ? 43
                                : this.tfVariableRegionId.hashCode());
        result =
                (result * PRIME)
                        + (this.tfVariableCurrentUserId == null
                                ? 43
                                : this.tfVariableCurrentUserId.hashCode());
        result =
                (result * PRIME)
                        + (this.tfVariableCompartmentId == null
                                ? 43
                                : this.tfVariableCompartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
