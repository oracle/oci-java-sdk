/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to apply the SDM masking policy difference to a masking policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApplySdmMaskingPolicyDifferenceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApplySdmMaskingPolicyDifferenceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sdmMaskingPolicyDifferenceId"})
    public ApplySdmMaskingPolicyDifferenceDetails(String sdmMaskingPolicyDifferenceId) {
        super();
        this.sdmMaskingPolicyDifferenceId = sdmMaskingPolicyDifferenceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the SDM masking policy difference. */
        @com.fasterxml.jackson.annotation.JsonProperty("sdmMaskingPolicyDifferenceId")
        private String sdmMaskingPolicyDifferenceId;

        /**
         * The OCID of the SDM masking policy difference.
         *
         * @param sdmMaskingPolicyDifferenceId the value to set
         * @return this builder
         */
        public Builder sdmMaskingPolicyDifferenceId(String sdmMaskingPolicyDifferenceId) {
            this.sdmMaskingPolicyDifferenceId = sdmMaskingPolicyDifferenceId;
            this.__explicitlySet__.add("sdmMaskingPolicyDifferenceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplySdmMaskingPolicyDifferenceDetails build() {
            ApplySdmMaskingPolicyDifferenceDetails model =
                    new ApplySdmMaskingPolicyDifferenceDetails(this.sdmMaskingPolicyDifferenceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplySdmMaskingPolicyDifferenceDetails model) {
            if (model.wasPropertyExplicitlySet("sdmMaskingPolicyDifferenceId")) {
                this.sdmMaskingPolicyDifferenceId(model.getSdmMaskingPolicyDifferenceId());
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

    /** The OCID of the SDM masking policy difference. */
    @com.fasterxml.jackson.annotation.JsonProperty("sdmMaskingPolicyDifferenceId")
    private final String sdmMaskingPolicyDifferenceId;

    /**
     * The OCID of the SDM masking policy difference.
     *
     * @return the value
     */
    public String getSdmMaskingPolicyDifferenceId() {
        return sdmMaskingPolicyDifferenceId;
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
        sb.append("ApplySdmMaskingPolicyDifferenceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sdmMaskingPolicyDifferenceId=")
                .append(String.valueOf(this.sdmMaskingPolicyDifferenceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplySdmMaskingPolicyDifferenceDetails)) {
            return false;
        }

        ApplySdmMaskingPolicyDifferenceDetails other = (ApplySdmMaskingPolicyDifferenceDetails) o;
        return java.util.Objects.equals(
                        this.sdmMaskingPolicyDifferenceId, other.sdmMaskingPolicyDifferenceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sdmMaskingPolicyDifferenceId == null
                                ? 43
                                : this.sdmMaskingPolicyDifferenceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
