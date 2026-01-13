/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * OCI DevOps configuration extends a Verify Configuration with necessary data to reach and use the
 * OCI DevOps Build Service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OciDevOpsBuildConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "buildServiceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciDevOpsBuildConfiguration extends VerifyConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * user's DevOps Build Pipeline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pipelineId")
        private String pipelineId;

        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * user's DevOps Build Pipeline.
         *
         * @param pipelineId the value to set
         * @return this builder
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            this.__explicitlySet__.add("pipelineId");
            return this;
        }
        /**
         * Additional key-value pairs passed as parameters to the build service when running an
         * experiment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalParameters")
        private java.util.Map<String, String> additionalParameters;

        /**
         * Additional key-value pairs passed as parameters to the build service when running an
         * experiment.
         *
         * @param additionalParameters the value to set
         * @return this builder
         */
        public Builder additionalParameters(java.util.Map<String, String> additionalParameters) {
            this.additionalParameters = additionalParameters;
            this.__explicitlySet__.add("additionalParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciDevOpsBuildConfiguration build() {
            OciDevOpsBuildConfiguration model =
                    new OciDevOpsBuildConfiguration(this.pipelineId, this.additionalParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciDevOpsBuildConfiguration model) {
            if (model.wasPropertyExplicitlySet("pipelineId")) {
                this.pipelineId(model.getPipelineId());
            }
            if (model.wasPropertyExplicitlySet("additionalParameters")) {
                this.additionalParameters(model.getAdditionalParameters());
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
    public OciDevOpsBuildConfiguration(
            String pipelineId, java.util.Map<String, String> additionalParameters) {
        super();
        this.pipelineId = pipelineId;
        this.additionalParameters = additionalParameters;
    }

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the user's
     * DevOps Build Pipeline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pipelineId")
    private final String pipelineId;

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the user's
     * DevOps Build Pipeline.
     *
     * @return the value
     */
    public String getPipelineId() {
        return pipelineId;
    }

    /**
     * Additional key-value pairs passed as parameters to the build service when running an
     * experiment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalParameters")
    private final java.util.Map<String, String> additionalParameters;

    /**
     * Additional key-value pairs passed as parameters to the build service when running an
     * experiment.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalParameters() {
        return additionalParameters;
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
        sb.append("OciDevOpsBuildConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pipelineId=").append(String.valueOf(this.pipelineId));
        sb.append(", additionalParameters=").append(String.valueOf(this.additionalParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciDevOpsBuildConfiguration)) {
            return false;
        }

        OciDevOpsBuildConfiguration other = (OciDevOpsBuildConfiguration) o;
        return java.util.Objects.equals(this.pipelineId, other.pipelineId)
                && java.util.Objects.equals(this.additionalParameters, other.additionalParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pipelineId == null ? 43 : this.pipelineId.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalParameters == null
                                ? 43
                                : this.additionalParameters.hashCode());
        return result;
    }
}
