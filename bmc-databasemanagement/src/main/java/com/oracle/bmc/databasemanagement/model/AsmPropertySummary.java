/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of ASM properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AsmPropertySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AsmPropertySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"diskGroup"})
    public AsmPropertySummary(String diskGroup) {
        super();
        this.diskGroup = diskGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the disk group. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskGroup")
        private String diskGroup;

        /**
         * The name of the disk group.
         *
         * @param diskGroup the value to set
         * @return this builder
         */
        public Builder diskGroup(String diskGroup) {
            this.diskGroup = diskGroup;
            this.__explicitlySet__.add("diskGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AsmPropertySummary build() {
            AsmPropertySummary model = new AsmPropertySummary(this.diskGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AsmPropertySummary model) {
            if (model.wasPropertyExplicitlySet("diskGroup")) {
                this.diskGroup(model.getDiskGroup());
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

    /** The name of the disk group. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskGroup")
    private final String diskGroup;

    /**
     * The name of the disk group.
     *
     * @return the value
     */
    public String getDiskGroup() {
        return diskGroup;
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
        sb.append("AsmPropertySummary(");
        sb.append("super=").append(super.toString());
        sb.append("diskGroup=").append(String.valueOf(this.diskGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AsmPropertySummary)) {
            return false;
        }

        AsmPropertySummary other = (AsmPropertySummary) o;
        return java.util.Objects.equals(this.diskGroup, other.diskGroup) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.diskGroup == null ? 43 : this.diskGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
