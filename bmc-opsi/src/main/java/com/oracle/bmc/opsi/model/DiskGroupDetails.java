/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Information about a diskgroup which includes diskgroup name and ASM name.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiskGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DiskGroupDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"diskgroupName", "asmName"})
    public DiskGroupDetails(String diskgroupName, String asmName) {
        super();
        this.diskgroupName = diskgroupName;
        this.asmName = asmName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("diskgroupName")
        private String diskgroupName;

        public Builder diskgroupName(String diskgroupName) {
            this.diskgroupName = diskgroupName;
            this.__explicitlySet__.add("diskgroupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("asmName")
        private String asmName;

        public Builder asmName(String asmName) {
            this.asmName = asmName;
            this.__explicitlySet__.add("asmName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiskGroupDetails build() {
            DiskGroupDetails __instance__ = new DiskGroupDetails(diskgroupName, asmName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiskGroupDetails o) {
            Builder copiedBuilder = diskgroupName(o.getDiskgroupName()).asmName(o.getAsmName());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The diskgroup name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskgroupName")
    private final String diskgroupName;

    public String getDiskgroupName() {
        return diskgroupName;
    }

    /**
     * The ASM name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asmName")
    private final String asmName;

    public String getAsmName() {
        return asmName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DiskGroupDetails(");
        sb.append("diskgroupName=").append(String.valueOf(this.diskgroupName));
        sb.append(", asmName=").append(String.valueOf(this.asmName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.diskgroupName == null ? 43 : this.diskgroupName.hashCode());
        result = (result * PRIME) + (this.asmName == null ? 43 : this.asmName.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
