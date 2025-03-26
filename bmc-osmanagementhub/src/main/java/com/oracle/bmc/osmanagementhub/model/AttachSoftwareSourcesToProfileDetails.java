/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to attach software sources to a profile.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttachSoftwareSourcesToProfileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttachSoftwareSourcesToProfileDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"softwareSources"})
    public AttachSoftwareSourcesToProfileDetails(java.util.List<String> softwareSources) {
        super();
        this.softwareSources = softwareSources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of software source [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to attach to the profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<String> softwareSources;

        /**
         * List of software source [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to attach to the profile.
         * @param softwareSources the value to set
         * @return this builder
         **/
        public Builder softwareSources(java.util.List<String> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachSoftwareSourcesToProfileDetails build() {
            AttachSoftwareSourcesToProfileDetails model =
                    new AttachSoftwareSourcesToProfileDetails(this.softwareSources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachSoftwareSourcesToProfileDetails model) {
            if (model.wasPropertyExplicitlySet("softwareSources")) {
                this.softwareSources(model.getSoftwareSources());
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
     * List of software source [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to attach to the profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    private final java.util.List<String> softwareSources;

    /**
     * List of software source [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to attach to the profile.
     * @return the value
     **/
    public java.util.List<String> getSoftwareSources() {
        return softwareSources;
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
        sb.append("AttachSoftwareSourcesToProfileDetails(");
        sb.append("super=").append(super.toString());
        sb.append("softwareSources=").append(String.valueOf(this.softwareSources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachSoftwareSourcesToProfileDetails)) {
            return false;
        }

        AttachSoftwareSourcesToProfileDetails other = (AttachSoftwareSourcesToProfileDetails) o;
        return java.util.Objects.equals(this.softwareSources, other.softwareSources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.softwareSources == null ? 43 : this.softwareSources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
