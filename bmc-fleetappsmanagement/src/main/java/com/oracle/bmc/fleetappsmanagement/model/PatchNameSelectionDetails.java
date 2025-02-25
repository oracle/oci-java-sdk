/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Patch Name Details.
 * If you set the policy rule by selecting this option, provide a specific patch name.
 *
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
    builder = PatchNameSelectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "selectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchNameSelectionDetails extends PatchSelectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Patch Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchName")
        private String patchName;

        /**
         * Patch Name.
         * @param patchName the value to set
         * @return this builder
         **/
        public Builder patchName(String patchName) {
            this.patchName = patchName;
            this.__explicitlySet__.add("patchName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchNameSelectionDetails build() {
            PatchNameSelectionDetails model = new PatchNameSelectionDetails(this.patchName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchNameSelectionDetails model) {
            if (model.wasPropertyExplicitlySet("patchName")) {
                this.patchName(model.getPatchName());
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

    @Deprecated
    public PatchNameSelectionDetails(String patchName) {
        super();
        this.patchName = patchName;
    }

    /**
     * Patch Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchName")
    private final String patchName;

    /**
     * Patch Name.
     * @return the value
     **/
    public String getPatchName() {
        return patchName;
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
        sb.append("PatchNameSelectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", patchName=").append(String.valueOf(this.patchName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchNameSelectionDetails)) {
            return false;
        }

        PatchNameSelectionDetails other = (PatchNameSelectionDetails) o;
        return java.util.Objects.equals(this.patchName, other.patchName) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.patchName == null ? 43 : this.patchName.hashCode());
        return result;
    }
}
