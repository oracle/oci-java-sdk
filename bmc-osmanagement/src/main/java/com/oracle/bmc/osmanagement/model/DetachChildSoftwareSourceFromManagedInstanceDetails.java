/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Information for detaching a software source from a managed instance <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DetachChildSoftwareSourceFromManagedInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DetachChildSoftwareSourceFromManagedInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"softwareSourceId"})
    public DetachChildSoftwareSourceFromManagedInstanceDetails(String softwareSourceId) {
        super();
        this.softwareSourceId = softwareSourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID for the Software Source */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private String softwareSourceId;

        /**
         * OCID for the Software Source
         *
         * @param softwareSourceId the value to set
         * @return this builder
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            this.__explicitlySet__.add("softwareSourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetachChildSoftwareSourceFromManagedInstanceDetails build() {
            DetachChildSoftwareSourceFromManagedInstanceDetails model =
                    new DetachChildSoftwareSourceFromManagedInstanceDetails(this.softwareSourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachChildSoftwareSourceFromManagedInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("softwareSourceId")) {
                this.softwareSourceId(model.getSoftwareSourceId());
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

    /** OCID for the Software Source */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    private final String softwareSourceId;

    /**
     * OCID for the Software Source
     *
     * @return the value
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
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
        sb.append("DetachChildSoftwareSourceFromManagedInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachChildSoftwareSourceFromManagedInstanceDetails)) {
            return false;
        }

        DetachChildSoftwareSourceFromManagedInstanceDetails other =
                (DetachChildSoftwareSourceFromManagedInstanceDetails) o;
        return java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
