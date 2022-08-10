/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration tablespace settings valid for ADB-D target type using auto create feature.
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
    builder = UpdateADBDedicatedAutoCreateTablespaceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "targetType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateADBDedicatedAutoCreateTablespaceDetails
        extends UpdateTargetTypeTablespaceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * True to auto-create tablespace in the target Database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoCreate")
        private Boolean isAutoCreate;

        /**
         * True to auto-create tablespace in the target Database.
         *
         * @param isAutoCreate the value to set
         * @return this builder
         **/
        public Builder isAutoCreate(Boolean isAutoCreate) {
            this.isAutoCreate = isAutoCreate;
            this.__explicitlySet__.add("isAutoCreate");
            return this;
        }
        /**
         * True set tablespace to big file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBigFile")
        private Boolean isBigFile;

        /**
         * True set tablespace to big file.
         *
         * @param isBigFile the value to set
         * @return this builder
         **/
        public Builder isBigFile(Boolean isBigFile) {
            this.isBigFile = isBigFile;
            this.__explicitlySet__.add("isBigFile");
            return this;
        }
        /**
         * Size of extend in MB. Can only be specified if 'isBigFile' property is set to true.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("extendSizeInMBs")
        private Integer extendSizeInMBs;

        /**
         * Size of extend in MB. Can only be specified if 'isBigFile' property is set to true.
         *
         * @param extendSizeInMBs the value to set
         * @return this builder
         **/
        public Builder extendSizeInMBs(Integer extendSizeInMBs) {
            this.extendSizeInMBs = extendSizeInMBs;
            this.__explicitlySet__.add("extendSizeInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateADBDedicatedAutoCreateTablespaceDetails build() {
            UpdateADBDedicatedAutoCreateTablespaceDetails model =
                    new UpdateADBDedicatedAutoCreateTablespaceDetails(
                            this.isAutoCreate, this.isBigFile, this.extendSizeInMBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateADBDedicatedAutoCreateTablespaceDetails model) {
            if (model.wasPropertyExplicitlySet("isAutoCreate")) {
                this.isAutoCreate(model.getIsAutoCreate());
            }
            if (model.wasPropertyExplicitlySet("isBigFile")) {
                this.isBigFile(model.getIsBigFile());
            }
            if (model.wasPropertyExplicitlySet("extendSizeInMBs")) {
                this.extendSizeInMBs(model.getExtendSizeInMBs());
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
    public UpdateADBDedicatedAutoCreateTablespaceDetails(
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

    /**
     * True to auto-create tablespace in the target Database.
     *
     * @return the value
     **/
    public Boolean getIsAutoCreate() {
        return isAutoCreate;
    }

    /**
     * True set tablespace to big file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBigFile")
    private final Boolean isBigFile;

    /**
     * True set tablespace to big file.
     *
     * @return the value
     **/
    public Boolean getIsBigFile() {
        return isBigFile;
    }

    /**
     * Size of extend in MB. Can only be specified if 'isBigFile' property is set to true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendSizeInMBs")
    private final Integer extendSizeInMBs;

    /**
     * Size of extend in MB. Can only be specified if 'isBigFile' property is set to true.
     *
     * @return the value
     **/
    public Integer getExtendSizeInMBs() {
        return extendSizeInMBs;
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
        sb.append("UpdateADBDedicatedAutoCreateTablespaceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isAutoCreate=").append(String.valueOf(this.isAutoCreate));
        sb.append(", isBigFile=").append(String.valueOf(this.isBigFile));
        sb.append(", extendSizeInMBs=").append(String.valueOf(this.extendSizeInMBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateADBDedicatedAutoCreateTablespaceDetails)) {
            return false;
        }

        UpdateADBDedicatedAutoCreateTablespaceDetails other =
                (UpdateADBDedicatedAutoCreateTablespaceDetails) o;
        return java.util.Objects.equals(this.isAutoCreate, other.isAutoCreate)
                && java.util.Objects.equals(this.isBigFile, other.isBigFile)
                && java.util.Objects.equals(this.extendSizeInMBs, other.extendSizeInMBs)
                && super.equals(other);
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
        return result;
    }
}
