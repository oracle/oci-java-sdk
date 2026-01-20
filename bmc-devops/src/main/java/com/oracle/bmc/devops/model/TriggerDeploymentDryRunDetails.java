/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of a new deployment to be created that will run to get helm diff for a
 * helmDiffArgumentCollection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TriggerDeploymentDryRunDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TriggerDeploymentDryRunDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"helmDiffArguments", "createDeploymentDetails"})
    public TriggerDeploymentDryRunDetails(
            HelmDiffArgumentCollection helmDiffArguments,
            CreateDeploymentDetails createDeploymentDetails) {
        super();
        this.helmDiffArguments = helmDiffArguments;
        this.createDeploymentDetails = createDeploymentDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("helmDiffArguments")
        private HelmDiffArgumentCollection helmDiffArguments;

        public Builder helmDiffArguments(HelmDiffArgumentCollection helmDiffArguments) {
            this.helmDiffArguments = helmDiffArguments;
            this.__explicitlySet__.add("helmDiffArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createDeploymentDetails")
        private CreateDeploymentDetails createDeploymentDetails;

        public Builder createDeploymentDetails(CreateDeploymentDetails createDeploymentDetails) {
            this.createDeploymentDetails = createDeploymentDetails;
            this.__explicitlySet__.add("createDeploymentDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TriggerDeploymentDryRunDetails build() {
            TriggerDeploymentDryRunDetails model =
                    new TriggerDeploymentDryRunDetails(
                            this.helmDiffArguments, this.createDeploymentDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TriggerDeploymentDryRunDetails model) {
            if (model.wasPropertyExplicitlySet("helmDiffArguments")) {
                this.helmDiffArguments(model.getHelmDiffArguments());
            }
            if (model.wasPropertyExplicitlySet("createDeploymentDetails")) {
                this.createDeploymentDetails(model.getCreateDeploymentDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("helmDiffArguments")
    private final HelmDiffArgumentCollection helmDiffArguments;

    public HelmDiffArgumentCollection getHelmDiffArguments() {
        return helmDiffArguments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("createDeploymentDetails")
    private final CreateDeploymentDetails createDeploymentDetails;

    public CreateDeploymentDetails getCreateDeploymentDetails() {
        return createDeploymentDetails;
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
        sb.append("TriggerDeploymentDryRunDetails(");
        sb.append("super=").append(super.toString());
        sb.append("helmDiffArguments=").append(String.valueOf(this.helmDiffArguments));
        sb.append(", createDeploymentDetails=")
                .append(String.valueOf(this.createDeploymentDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TriggerDeploymentDryRunDetails)) {
            return false;
        }

        TriggerDeploymentDryRunDetails other = (TriggerDeploymentDryRunDetails) o;
        return java.util.Objects.equals(this.helmDiffArguments, other.helmDiffArguments)
                && java.util.Objects.equals(
                        this.createDeploymentDetails, other.createDeploymentDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.helmDiffArguments == null ? 43 : this.helmDiffArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.createDeploymentDetails == null
                                ? 43
                                : this.createDeploymentDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
