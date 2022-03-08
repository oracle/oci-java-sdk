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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateNonADBAutoCreateTablespaceDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "targetType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateNonADBAutoCreateTablespaceDetails extends UpdateTargetTypeTablespaceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        public UpdateNonADBAutoCreateTablespaceDetails build() {
            UpdateNonADBAutoCreateTablespaceDetails __instance__ =
                    new UpdateNonADBAutoCreateTablespaceDetails(
                            isAutoCreate, isBigFile, extendSizeInMBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNonADBAutoCreateTablespaceDetails o) {
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

    @Deprecated
    public UpdateNonADBAutoCreateTablespaceDetails(
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
    Boolean isAutoCreate;

    /**
     * True set tablespace to big file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBigFile")
    Boolean isBigFile;

    /**
     * Size of extend in MB. Can only be specified if 'isBigFile' property is set to true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendSizeInMBs")
    Integer extendSizeInMBs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
