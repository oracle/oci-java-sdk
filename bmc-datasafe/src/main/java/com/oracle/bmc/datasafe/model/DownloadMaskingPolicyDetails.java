/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to download a masking policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DownloadMaskingPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DownloadMaskingPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"policyFormat"})
    public DownloadMaskingPolicyDetails(PolicyFormat policyFormat) {
        super();
        this.policyFormat = policyFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The format of the masking policy file. */
        @com.fasterxml.jackson.annotation.JsonProperty("policyFormat")
        private PolicyFormat policyFormat;

        /**
         * The format of the masking policy file.
         *
         * @param policyFormat the value to set
         * @return this builder
         */
        public Builder policyFormat(PolicyFormat policyFormat) {
            this.policyFormat = policyFormat;
            this.__explicitlySet__.add("policyFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DownloadMaskingPolicyDetails build() {
            DownloadMaskingPolicyDetails model =
                    new DownloadMaskingPolicyDetails(this.policyFormat);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DownloadMaskingPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("policyFormat")) {
                this.policyFormat(model.getPolicyFormat());
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

    /** The format of the masking policy file. */
    @com.fasterxml.jackson.annotation.JsonProperty("policyFormat")
    private final PolicyFormat policyFormat;

    /**
     * The format of the masking policy file.
     *
     * @return the value
     */
    public PolicyFormat getPolicyFormat() {
        return policyFormat;
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
        sb.append("DownloadMaskingPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("policyFormat=").append(String.valueOf(this.policyFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadMaskingPolicyDetails)) {
            return false;
        }

        DownloadMaskingPolicyDetails other = (DownloadMaskingPolicyDetails) o;
        return java.util.Objects.equals(this.policyFormat, other.policyFormat)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.policyFormat == null ? 43 : this.policyFormat.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
