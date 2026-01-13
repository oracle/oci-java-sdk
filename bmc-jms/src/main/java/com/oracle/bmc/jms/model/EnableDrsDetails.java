/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Details of the request to enable DRS in active managed instance(s) in a Fleet. When the targets
 * aren't specified, then all active managed instance(s) currently in the Fleet are selected. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EnableDrsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnableDrsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"manageDrsDetails"})
    public EnableDrsDetails(ManageDrsDetails manageDrsDetails) {
        super();
        this.manageDrsDetails = manageDrsDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("manageDrsDetails")
        private ManageDrsDetails manageDrsDetails;

        public Builder manageDrsDetails(ManageDrsDetails manageDrsDetails) {
            this.manageDrsDetails = manageDrsDetails;
            this.__explicitlySet__.add("manageDrsDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableDrsDetails build() {
            EnableDrsDetails model = new EnableDrsDetails(this.manageDrsDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableDrsDetails model) {
            if (model.wasPropertyExplicitlySet("manageDrsDetails")) {
                this.manageDrsDetails(model.getManageDrsDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("manageDrsDetails")
    private final ManageDrsDetails manageDrsDetails;

    public ManageDrsDetails getManageDrsDetails() {
        return manageDrsDetails;
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
        sb.append("EnableDrsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("manageDrsDetails=").append(String.valueOf(this.manageDrsDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableDrsDetails)) {
            return false;
        }

        EnableDrsDetails other = (EnableDrsDetails) o;
        return java.util.Objects.equals(this.manageDrsDetails, other.manageDrsDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.manageDrsDetails == null ? 43 : this.manageDrsDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
