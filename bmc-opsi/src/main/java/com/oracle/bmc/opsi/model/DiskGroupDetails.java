/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Information about a diskgroup which includes diskgroup name and ASM name. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiskGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiskGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"diskgroupName", "asmName"})
    public DiskGroupDetails(String diskgroupName, String asmName) {
        super();
        this.diskgroupName = diskgroupName;
        this.asmName = asmName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The diskgroup name. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskgroupName")
        private String diskgroupName;

        /**
         * The diskgroup name.
         *
         * @param diskgroupName the value to set
         * @return this builder
         */
        public Builder diskgroupName(String diskgroupName) {
            this.diskgroupName = diskgroupName;
            this.__explicitlySet__.add("diskgroupName");
            return this;
        }
        /** The ASM name. */
        @com.fasterxml.jackson.annotation.JsonProperty("asmName")
        private String asmName;

        /**
         * The ASM name.
         *
         * @param asmName the value to set
         * @return this builder
         */
        public Builder asmName(String asmName) {
            this.asmName = asmName;
            this.__explicitlySet__.add("asmName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiskGroupDetails build() {
            DiskGroupDetails model = new DiskGroupDetails(this.diskgroupName, this.asmName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiskGroupDetails model) {
            if (model.wasPropertyExplicitlySet("diskgroupName")) {
                this.diskgroupName(model.getDiskgroupName());
            }
            if (model.wasPropertyExplicitlySet("asmName")) {
                this.asmName(model.getAsmName());
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

    /** The diskgroup name. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskgroupName")
    private final String diskgroupName;

    /**
     * The diskgroup name.
     *
     * @return the value
     */
    public String getDiskgroupName() {
        return diskgroupName;
    }

    /** The ASM name. */
    @com.fasterxml.jackson.annotation.JsonProperty("asmName")
    private final String asmName;

    /**
     * The ASM name.
     *
     * @return the value
     */
    public String getAsmName() {
        return asmName;
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
        sb.append("DiskGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("diskgroupName=").append(String.valueOf(this.diskgroupName));
        sb.append(", asmName=").append(String.valueOf(this.asmName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiskGroupDetails)) {
            return false;
        }

        DiskGroupDetails other = (DiskGroupDetails) o;
        return java.util.Objects.equals(this.diskgroupName, other.diskgroupName)
                && java.util.Objects.equals(this.asmName, other.asmName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.diskgroupName == null ? 43 : this.diskgroupName.hashCode());
        result = (result * PRIME) + (this.asmName == null ? 43 : this.asmName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
