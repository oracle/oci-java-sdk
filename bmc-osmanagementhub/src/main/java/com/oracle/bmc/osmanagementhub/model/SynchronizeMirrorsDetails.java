/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Detailed information about software source mirrors to be synced. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SynchronizeMirrorsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SynchronizeMirrorsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"softwareSourceList"})
    public SynchronizeMirrorsDetails(java.util.List<String> softwareSourceList) {
        super();
        this.softwareSourceList = softwareSourceList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of software source
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to
         * synchronize.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceList")
        private java.util.List<String> softwareSourceList;

        /**
         * List of software source
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to
         * synchronize.
         *
         * @param softwareSourceList the value to set
         * @return this builder
         */
        public Builder softwareSourceList(java.util.List<String> softwareSourceList) {
            this.softwareSourceList = softwareSourceList;
            this.__explicitlySet__.add("softwareSourceList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SynchronizeMirrorsDetails build() {
            SynchronizeMirrorsDetails model =
                    new SynchronizeMirrorsDetails(this.softwareSourceList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SynchronizeMirrorsDetails model) {
            if (model.wasPropertyExplicitlySet("softwareSourceList")) {
                this.softwareSourceList(model.getSoftwareSourceList());
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
     * List of software source
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to
     * synchronize.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceList")
    private final java.util.List<String> softwareSourceList;

    /**
     * List of software source
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to
     * synchronize.
     *
     * @return the value
     */
    public java.util.List<String> getSoftwareSourceList() {
        return softwareSourceList;
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
        sb.append("SynchronizeMirrorsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("softwareSourceList=").append(String.valueOf(this.softwareSourceList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SynchronizeMirrorsDetails)) {
            return false;
        }

        SynchronizeMirrorsDetails other = (SynchronizeMirrorsDetails) o;
        return java.util.Objects.equals(this.softwareSourceList, other.softwareSourceList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.softwareSourceList == null
                                ? 43
                                : this.softwareSourceList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
