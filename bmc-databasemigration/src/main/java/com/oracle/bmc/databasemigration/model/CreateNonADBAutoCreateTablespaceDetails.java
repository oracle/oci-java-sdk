/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration tablespace settings valid for NON-ADB target type using auto create feature.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateNonADBAutoCreateTablespaceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "targetType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateNonADBAutoCreateTablespaceDetails
        extends CreateTargetTypeTablespaceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoCreate")
        private Boolean isAutoCreate;

        public Builder isAutoCreate(Boolean isAutoCreate) {
            this.isAutoCreate = isAutoCreate;
            this.__explicitlySet__.add("isAutoCreate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBigFile")
        private Boolean isBigFile;

        public Builder isBigFile(Boolean isBigFile) {
            this.isBigFile = isBigFile;
            this.__explicitlySet__.add("isBigFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendSizeInMBs")
        private Integer extendSizeInMBs;

        public Builder extendSizeInMBs(Integer extendSizeInMBs) {
            this.extendSizeInMBs = extendSizeInMBs;
            this.__explicitlySet__.add("extendSizeInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNonADBAutoCreateTablespaceDetails build() {
            CreateNonADBAutoCreateTablespaceDetails __instance__ =
                    new CreateNonADBAutoCreateTablespaceDetails(
                            isAutoCreate, isBigFile, extendSizeInMBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNonADBAutoCreateTablespaceDetails o) {
            Builder copiedBuilder =
                    isAutoCreate(o.getIsAutoCreate())
                            .isBigFile(o.getIsBigFile())
                            .extendSizeInMBs(o.getExtendSizeInMBs());

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

    @Deprecated
    public CreateNonADBAutoCreateTablespaceDetails(
            Boolean isAutoCreate, Boolean isBigFile, Integer extendSizeInMBs) {
        super();
        this.isAutoCreate = isAutoCreate;
        this.isBigFile = isBigFile;
        this.extendSizeInMBs = extendSizeInMBs;
    }

    /**
     * True to auto-create tablespace in the target Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoCreate")
    private final Boolean isAutoCreate;

    public Boolean getIsAutoCreate() {
        return isAutoCreate;
    }

    /**
     * True set tablespace to big file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBigFile")
    private final Boolean isBigFile;

    public Boolean getIsBigFile() {
        return isBigFile;
    }

    /**
     * Size of extend in MB. Can only be specified if 'isBigFile' property is set to true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendSizeInMBs")
    private final Integer extendSizeInMBs;

    public Integer getExtendSizeInMBs() {
        return extendSizeInMBs;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateNonADBAutoCreateTablespaceDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", isAutoCreate=").append(String.valueOf(this.isAutoCreate));
        sb.append(", isBigFile=").append(String.valueOf(this.isBigFile));
        sb.append(", extendSizeInMBs=").append(String.valueOf(this.extendSizeInMBs));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNonADBAutoCreateTablespaceDetails)) {
            return false;
        }

        CreateNonADBAutoCreateTablespaceDetails other = (CreateNonADBAutoCreateTablespaceDetails) o;
        return java.util.Objects.equals(this.isAutoCreate, other.isAutoCreate)
                && java.util.Objects.equals(this.isBigFile, other.isBigFile)
                && java.util.Objects.equals(this.extendSizeInMBs, other.extendSizeInMBs)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.isAutoCreate == null ? 43 : this.isAutoCreate.hashCode());
        result = (result * PRIME) + (this.isBigFile == null ? 43 : this.isBigFile.hashCode());
        result =
                (result * PRIME)
                        + (this.extendSizeInMBs == null ? 43 : this.extendSizeInMBs.hashCode());
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
